
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**n
 *
 * @author Usuario
 */


public class Conexion {
    private final String DRIVER="com.mysql.cj.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/";
    private final String DB="dbsistema";
    private final String USER="root";
    private final String PASSWORD="";

    public Connection cadena;
    public static Conexion instancia;
    
    //Constructor privado
    private Conexion(){
    this.cadena =null;
    }
    
    
    
    /**
     *
     * @return
     */
    public Connection conectar(){
        try {
            Class.forName(DRIVER);//Se obtine la clase que especifica driver
            this.cadena=DriverManager.getConnection(URL+DB,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    return this.cadena;
    }
    public void desconcectar(){
    try{
        this.cadena.close();
    }catch(SQLException e){
        e.printStackTrace();
    };    

}
    public static Conexion getInstancia(){
    if(instancia==null){
        instancia=new Conexion();
    } 
    return instancia;
}
}