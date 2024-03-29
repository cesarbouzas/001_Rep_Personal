
package controlador.factory;

import controlador.pool.BasicConnectionPool;
import java.sql.Connection;
import modelo.dao.DepartamentoDAO;



public class MySQLDAOFactory extends DaoFactory{
    final static String USER="cesar";
    final static String PASSWORD="cesar";
    final static String BD="ejemplo";
    final static String IP="217.160.229.64";
    final static String URL="jdbc::mysql://"+IP+":3306/"+BD;
    
    static BasicConnectionPool BCP;
    
    public MySQLDAOFactory(){
        BCP=BasicConnectionPool.create(URL,USER,PASSWORD);
    }

    @Override
    public Connection getConenction() {
        return BCP.getConnection();

    @Override
    public DepartamentoDAO getDepartamentoDao() {
       return new DepartamentoDAO;
    }

    @Override
    public void shutDown() {
       BCP.shutDown();
    }
}
