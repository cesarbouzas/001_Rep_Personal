/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.vo.Departamento;
import vista.VEjercicio3;

/**
 *
 * @author AD
 */
public class ControladorEjercicio3 {
    
    public static VEjercicio3 ventana=new VEjercicio3();
    public static DAOFactory factDAO;
    public static DepartamentoDAO deptDAO;
  
    
    
    public static void iniciar(){
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
    public static void iniciarFactory(){
        factDAO=MySQLDAOFactory.getDAOFactory(MySQLDAOFactory.MYSQL);
        deptDAO=factDAO.getDepartamentoDAO();
    }
    public static void cerrarFactory(){
        try{
        factDAO.shutdown();
        }catch(Exception e){
        e.printStackTrace();
        }
    }

    public static void buscarDepartamento() {
        Departamento dept;
        try {
            Connection conn=factDAO.getConnection();
            if(isTxtEntero(ventana.getNDeptText().getText())){
                dept = deptDAO.buscarDepartamento(conn, ventana.getNDeptText());
                if (dept != null) {
                    ventana.getDnameText().setText(dept.getDnombre());
                    ventana.getLocText().setText(dept.getLoc());
                } else {
                    ventana.getDnameText().setText("");
                    ventana.getLocText().setText("");
                }
            }else{
                
            ventana.getDnameText().setText("");
            ventana.getLocText().setText("");
            JOptionPane.showMessageDialog(null,"Error con los datos introducidos vacio o no es número");
            }
            factDAO.releaseConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static boolean isTxtEntero(String txt){
        try{
            Integer.parseInt(txt);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
}
