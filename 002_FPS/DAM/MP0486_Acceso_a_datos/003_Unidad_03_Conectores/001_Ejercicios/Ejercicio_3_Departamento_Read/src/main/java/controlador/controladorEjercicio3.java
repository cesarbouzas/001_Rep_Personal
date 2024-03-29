/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.dao.DepartamentoDao;
import modelo.vo.Departamento;
import vista.Ventana_3;

/**
 *
 * @author AD
 */
public class controladorEjercicio3 {
    
    static DAOFactory mySQLDAOFactory;
    static DepartamentoDao depDao=new DepartamentoDao();
    static Ventana_3 ventana=new Ventana_3();
    
    public static void inciar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    
    public static void crearFactory(){
        mySQLDAOFactory=MySQLDAOFactory.getDAOFactory(MySQLDAOFactory.MYSQL);
        
    }
    public static void cerrarFactory(){
        try {
            mySQLDAOFactory.shutdown();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void mostarDatosDepartamneto(JTextField tf_numeroDepartamento, 
            JTextField tf_nombreDepartamento, 
            JTextField tf_locDepartamento) throws Exception {
    Connection con=mySQLDAOFactory.getConnection();
    try{
    int num=Integer.parseInt(tf_numeroDepartamento.getText());
   
    System.out.println(num);
    Departamento dep=depDao.listarDepartamento(con,num);
    
    
    if(dep!=null){
       tf_nombreDepartamento.setText(dep.getDnombre());
       tf_locDepartamento.setText(dep.getLoc());
    }else{
       tf_nombreDepartamento.setText("");
       tf_locDepartamento.setText("");
    }
     }catch(NumberFormatException ex){
        JOptionPane.showConfirmDialog(ventana, "Error de formato");
    }
    }

    
    
}
