/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.vo.Departamentos;
import org.hibernate.Session;
import vista.Vejercicio3;




public class ControladorEjercicio3 {
    
private static final String CAMPOVACIO="El campo está vacio";
private static final String ERRORGENERAL="Error de tipo general";  
private static final  String ERRORDEFORMATO="El formato no es válido";
private static final String DEPARTAMENTONOENCONTRADO="El departamento no existe";
public static Vejercicio3 ventana=new Vejercicio3();
public static Session session;
public static DepartamentoDAO depDAO;

    public static void inciar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
    public static void inicicarSession(){
    session=HibernateUtil.getSessionFactory().openSession();
    depDAO=HibernateUtil.getDepartamentoDAO();
    
    }
    public static void cerrarSession(){
    session.close();
    }

    public static void cargarDatos() {   
        if (ventana.getTxtDep_no().getText().isEmpty()) {
            mostratMsg(CAMPOVACIO);
        } else {
            try {
                HibernateUtil.beginTx(session);
                Departamentos d = depDAO.buscarDepartamento(session, Integer.parseInt(ventana.getTxtDep_no().getText()));
                if (d == null) {
                    mostratMsg(DEPARTAMENTONOENCONTRADO);

                } else {
                    ventana.getTxtDep_nombre().setText(d.getDnombre());
                    ventana.getTxtDep_Loc().setText(d.getLoc());
                }

            } catch (NumberFormatException nF) {
                mostratMsg(ERRORDEFORMATO);
            } catch (Exception e) {
                mostratMsg(ERRORGENERAL);
                e.printStackTrace();

            }

        }

    }
    public static void mostratMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
        limpiarTextFields();
    }
    public static void limpiarTextFields(){
        ventana.getTxtDep_no().setText("");
        ventana.getTxtDep_nombre().setText("");
        ventana.getTxtDep_Loc().setText("");
    }
    
}
