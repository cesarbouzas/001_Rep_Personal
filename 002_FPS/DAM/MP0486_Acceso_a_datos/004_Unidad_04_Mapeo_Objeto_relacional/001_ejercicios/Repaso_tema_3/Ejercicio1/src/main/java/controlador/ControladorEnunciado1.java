package controlador;

import controlador.factory.DAOFactory;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.dao.DepartamentoDAO;
import vista.Enunciado1;




public class ControladorEnunciado1 {
    

public static DAOFactory mySQLFactory;
public static DepartamentoDAO depDAO;
public static Enunciado1 ventana=new Enunciado1();


    public static  void inciciar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
 
    }
    
    public static void iniciarFactory(){
        mySQLFactory=DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        depDAO=mySQLFactory.getDepartamentoDao();
    
    }
    public static void cerrarFactory(){
    try{
        mySQLFactory.shutdown();
    }catch(Exception e){
        e.printStackTrace();
    }
    }

    public static void listarDepartamentos() {
        Connection conn;      
        try{
        conn=mySQLFactory.getConnection();
        depDAO.cargarDatos(conn,ventana.getjTextArea1());
        mySQLFactory.releaseConnection(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
         e.printStackTrace();
        }
        
    }
    
}
