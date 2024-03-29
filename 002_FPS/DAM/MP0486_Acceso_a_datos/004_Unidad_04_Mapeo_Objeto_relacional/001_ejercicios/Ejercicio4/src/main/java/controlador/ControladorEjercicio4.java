/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import java.sql.SQLException;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamentos;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import vista.Vejercicio4;

public class ControladorEjercicio4 {

    
    private static final String CAMPOVACIO="El campo está vacio.";
    private static final String FORMATOINVALIDO="El formato introducido no es válido.";
    private static final String ERRORGENRICO="Error generico";
    private static final String DEPARTAMENTONOEXISTE="El departamento no existe";
    private static final String ERRORDECONSULTA="Error en la consulta";
    private static final String ERRORDELLAVEFORANEA="Error Campo de key foraneo sin borrar";
    private static final String CAMPOBORRADO="El Campo ha sido borrado";
    
    
    
    public static Vejercicio4 ventana = new Vejercicio4();
    public static Session session;
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;

    public static void inicio() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    public static void iniciarSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        depDAO = HibernateUtil.getDepartamentoDAO();
        empDAO = HibernateUtil.getEmpleadoDAO();
    }

    public static void finalizarSession() {
        session.close();
    }
    public static void rellenarCampos(){
        if(ventana.getTxtDep_No().getText().isEmpty()){
            mostrarMsg(CAMPOVACIO);
        }else{
            try{
             HibernateUtil.beginTx(session);
            Departamentos d= depDAO.buscarDepartamento(session,Integer.parseInt(ventana.getTxtDep_No().getText()));
            HibernateUtil.commitTx(session);
            ventana.getTxtDep_Nombre().setText(d.getDnombre());
                ventana.getTxtDep_Loca().setText(d.getLoc());
            }catch(NoResultException eH){
                mostrarMsg(DEPARTAMENTONOEXISTE);
              
            }
            catch (NumberFormatException nF) {
                mostrarMsg(FORMATOINVALIDO);
                session.getTransaction().rollback();
            } catch (Exception e) {
                mostrarMsg(ERRORGENRICO);
                session.getTransaction().rollback();
                e.printStackTrace();
            }
            
        }
    
    }
    
    public static void insertarDepartamento(){
    if(!isCamposOk()){
        mostrarMsg(CAMPOVACIO);
    }else{
        try{
            HibernateUtil.beginTx(session);
            int dep_no=Integer.parseInt(ventana.getTxtDep_No().getText());
            String dep_nombre=ventana.getTxtDep_Nombre().getText();
            String dep_loc=ventana.getTxtDep_Loca().getText();
            mostrarMsg(depDAO.insertarDepartamento(session,dep_no,dep_nombre,dep_loc)+" campo insertado");
           HibernateUtil.commitTx(session);
        
        }catch(HibernateException eH){
            mostrarMsg(ERRORDECONSULTA);
            HibernateUtil.rollbackTx(session);
        }catch(Exception e){
            mostrarMsg(ERRORGENRICO);
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
 
    }
    public static  void borrarDepartamento(){
        if(ventana.getTxtDep_No().getText().isEmpty()){
            mostrarMsg(CAMPOVACIO);
        }else{
        try{
            HibernateUtil.beginTx(session);
            depDAO.borrarDepartamento(session,Integer.parseInt(ventana.getTxtDep_No().getText()));
            HibernateUtil.commitTx(session);
            mostrarMsg(CAMPOBORRADO);
        }catch(ConstraintViolationException eC){
            mostrarMsg(ERRORDELLAVEFORANEA);
            session.getTransaction().rollback();
        }catch(NoResultException nR){
            mostrarMsg(DEPARTAMENTONOEXISTE);
            session.getTransaction().rollback();
        }catch(NumberFormatException nf){
            mostrarMsg(FORMATOINVALIDO);
            session.getTransaction().rollback();
        }catch( Exception e){
        e.printStackTrace();
        session.getTransaction().rollback();
        }
        }
    
    
    }
    
    public static void borrarDepartamentoConEmpleados(){
        if(ventana.getTxtDep_No().getText().isEmpty()){
            mostrarMsg(CAMPOVACIO);
        }else{
            try{
                HibernateUtil.beginTx(session);
                depDAO.borrarDepartamentoEmpleados(session,Integer.parseInt(ventana.getTxtDep_No().getText()));
                   mostrarMsg(CAMPOBORRADO);
                HibernateUtil.commitTx(session);
            }catch(ConstraintViolationException eC){
                mostrarMsg(ERRORDELLAVEFORANEA);
        session.getTransaction().rollback();
            }catch(HibernateException eH){
                mostrarMsg(ERRORDECONSULTA);
           session.getTransaction().rollback();
        }
    }
    }
 
    public static boolean isCamposOk(){
    if(ventana.getTxtDep_No().getText().isEmpty()&&ventana.getTxtDep_Nombre().getText().isEmpty()&& ventana.getTxtDep_Loca().getText().isEmpty()){
        return false;
    }else{
        return true;
    }
    }

    public static void limpiarCampos(){
        
        ventana.getTxtDep_Nombre().setText("");
        ventana.getTxtDep_Loca().setText("");
    }
    public static void mostrarMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
        if(msg==DEPARTAMENTONOEXISTE){
            limpiarCampos();
        }else{
        ventana.getTxtDep_No().setText("");
        limpiarCampos();
        }
    }
    
}
