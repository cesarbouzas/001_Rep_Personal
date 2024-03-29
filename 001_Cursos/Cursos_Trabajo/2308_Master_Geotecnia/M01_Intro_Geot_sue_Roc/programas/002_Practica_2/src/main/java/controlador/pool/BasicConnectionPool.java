
package controlador.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Usuario
 */
public class BasicConnectionPool {
    
    private static final int MAX_POOL_SIZE=10;
    private static final int MAX_TIMEOUT=100;
    private String url;
    private String user;
    private String password;
    private List<Connection> connectionPool;
    private List<Connection> usedConnections=new ArrayList<>();
    private static int INITIAL_POOL_SIZE=10;
    private BasicConnectionPool bcp=null;
    
    private BasicConnectionPool(String url,String user,String password,List<Connection> pool){
    this.url=url;
    this.user=user;
    this.password=password;
    this.connectionPool=pool;
    }
    
    public static BasicConnectionPool create(String url,String user,String password){
        List<Connection> pool=new ArrayList<>(INITIAL_POOL_SIZE);
        for(Connection c:pool){
            pool.add(createConnection(url, user, password));
        }
         return BasicConnectionPool.create(url, user, password);
    }
    public Connection getConnection() {
        if(connectionPool.isEmpty() || usedConnections.size()<MAX_POOL_SIZE){
            connectionPool.add(createConnection(url, user, password));
        }else{
            throw new RuntimeException("Maximo numero de conexiones alcanzado");
        }
        Connection connection=connectionPool.remove(connectionPool.size()-1);
        try {
            connection.setAutoCommit(false);
        
        if(!connection.isValid(MAX_TIMEOUT)){
            connection=createConnection(url, user, password);
            
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        usedConnections.add(connection);
        return connection;
    }

    public static Connection createConnection(String url,String user,String password){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return null;
    }
    public int getSize(){
            return this.connectionPool.size()+this.usedConnections.size();
    }
    public void shutDown(List<Connection> pool){
        for (Connection c:pool){
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            connectionPool.clear();
        }
    }
    
}
