
package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import modelo.dao.DepartamentoDao;
import modelo.dao.EmpleadoDao;
import vista.VentanaEjercicio2;

public class ControladorEjercicio2 {
    
    static VentanaEjercicio2 ventana=new VentanaEjercicio2();
    static DAOFactory mysqlFactory;
    static DepartamentoDao depDao;
    static EmpleadoDao empDao;
    
    
    public static void iniciar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void iniciarFactory(){
     mysqlFactory=MySQLDAOFactory.getDAOFactory(DAOFactory.MYSQL);
     depDao=mysqlFactory.getDepartamentosDao();
     empDao=mysqlFactory.getEmpleadosDao();
    }
    public static void cerrarFactory(){
        try {
            mysqlFactory.shutdown();
        } catch (Exception ex) {
            Logger.getLogger(ControladorEjercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listarTodosDepartamentos(){
        try{
        Connection con=mysqlFactory.getConnection();
        depDao.listarTodo(con,ventana.getTextArea());
        mysqlFactory.releaseConnection(con);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    public static void listarEmpleadosPorDepartamento(){
        
    try{
        Connection con=mysqlFactory.getConnection();
        empDao.listarPorDepartamneto(con, ventana.getComboBox().getSelectedItem().toString(), ventana.getTextArea(),ventana.getLbNumEmpleados());
        mysqlFactory.releaseConnection(con);
    }catch(Exception e){
    e.printStackTrace();}
    }
      public static void cargarListaDepartamentos(){
        try{
        Connection con=mysqlFactory.getConnection();
        depDao.listarNombres(con,ventana.getComboBox());
        mysqlFactory.releaseConnection(con);
        }catch(Exception e){
            e.printStackTrace();
        }
        
     }
      public static String EnviarValorSeleccionado(JComboBox<String> comboBox){
          return (String)comboBox.getSelectedItem();
      }
    
}
