
package controlador;


import controlador.factory.DAOFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import vista.Vejercicio_2;

/**
 *
 * @author AD
 */
public class controladorEjercicio2 {
    
    public static Vejercicio_2 ventana=new Vejercicio_2();
    public static DAOFactory mysqlFactory;
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;
    
    public static void iniciar(){
    ventana.setVisible(true);
    ventana.setLocationRelativeTo(null);
    
    }
    
    public static void iniciarFactory(){
    mysqlFactory=mysqlFactory.getDAOFactory(DAOFactory.MYSQL);
    depDAO=mysqlFactory.getDepartamentoDAO();
    empDAO=mysqlFactory.getEmpleadoDAO();
    }
    public static void cerrarFactory(){
    try{
        mysqlFactory.shutdown();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    public static void cargarComboDepartamentos(){
        Connection conn;
        try{
        conn=mysqlFactory.getConnection();
        depDAO.cargarDepartamentos(conn,ventana.getComboBoxDepartamento());
       mysqlFactory.releaseConnection(conn);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void listarEmplados() {
       Connection conn;
       try{
        conn=mysqlFactory.getConnection();
        empDAO.ListarEmpleados(conn,ventana.getTextArea(),ventana.getComboBoxDepartamento().getSelectedItem(),ventana.getLEmpleados());
      mysqlFactory.releaseConnection(conn);
       }catch(Exception e){
       e.printStackTrace();
       
      
        }
       
    }
}
