/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.controladorFactory;
import javax.swing.DefaultComboBoxModel;
import vista.ProyectoBase;

/**
 *
 * @author acceso a datos
 */
public class controladorProyectoBase {
    
    //Declaramos los dao
    public static ProyectoBase ventana = new ProyectoBase();
 

    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);      
    }
    
    public static void iniciaBD() {
      
        controladorFactory.abrirBD();
        //instanciar los dao
       // depDAO=controladorFactory.getDepartamentoDAO();
    }
    public static void cerrarBD() {
        controladorFactory.cerrarBD();
    }
}
