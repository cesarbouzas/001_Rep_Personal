
package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dao.DepartamentoDao;
import vista.Ejercicio1;

/**
 *
 * @author AD
 */
public class controladorEjercicio1 {
     static DAOFactory mysqlFactory;
     static DepartamentoDao depDao;
     static Ejercicio1 ventana=new Ejercicio1();
     
    
    public static void iniciar() {   
      ventana.setVisible(true);
      ventana.setLocationRelativeTo(null);
    }
    public static void iniciarFactory(){
        mysqlFactory=MySQLDAOFactory.getDAOFactory(DAOFactory.MYSQL);
        depDao=mysqlFactory.getDepartamentoDao();
    
    }
     public static void listarDepartamentos() {
         Connection con;
         try {
             con = mysqlFactory.getConnection();
              depDao.listarTodo(con,ventana.getTextArea());
         } catch (Exception ex) {
             Logger.getLogger(controladorEjercicio1.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         
    
    
    }

    public static void cerrarFactory()  {
         try {
             mysqlFactory.shutdown();
         } catch (Exception ex) {
             Logger.getLogger(controladorEjercicio1.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
}
