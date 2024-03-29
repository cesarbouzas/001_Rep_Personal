
package controlador.factory;

import java.sql.Connection;
import modelo.dao.DepartamentoDAO;

/**
 *
 * @author Usuario
 */
public abstract class DaoFactory {
    //Lista de DAO types soportados por la factoria
    public static final int MYSQL=1;
    public static final int MARIADB=2;
    
    public static DaoFactory getDAOFactory(int factoryType){
        switch (factoryType) {
            case MYSQL:
                return new MySQLDAOFactory();
               
            case MARIADB:
                return new MARIADbDAOFactory();
               
            default:
                return null;
        }
}
    public abstract Connection  getConenction();
    public  boolean releaseConnection(Connection con){
        return false;
    };
    public int getSize(){
    return 0;
    }
    public abstract void shutDown();
    
    public abstract DepartamentoDAO getDepartamentoDao();
}
