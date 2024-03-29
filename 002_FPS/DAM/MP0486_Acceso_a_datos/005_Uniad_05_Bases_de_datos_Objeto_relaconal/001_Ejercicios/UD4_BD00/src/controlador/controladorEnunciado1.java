/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.controladorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamento;
import modelo.vo.Empleado;
import vista.Enunciado1;

/**
 *
 * @author acceso a datos
 */

public class controladorEnunciado1 {
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;
    public static Enunciado1 ventana = new Enunciado1();
    static DefaultComboBoxModel modelocombo = new DefaultComboBoxModel();

    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.getCmbDepartamentos().setModel(modelocombo);
    }
    
    public static void iniciaBD() {
        controladorFactory.abrirBD();
        depDAO=controladorFactory.getDepartamentoDAO();
        empDAO=controladorFactory.getEmpleadoDAO();
    }
    public static void cerrarBD() {
        controladorFactory.cerrarBD();
    }
    public static void cargardatosenBD() {
          
        try {

            /**
             * Vamos a insertar 3 departamentos (10,20,40).El departamento 40 no
             * tendrá inicialmente empleados. Como no hay ningún tipo de
             * restricción, como el primary key, el las BDOO comprobamos
             * nosotros que el dato no existe. Si no hicieramos la comprobación
             * también lo haría, podrias comprobarlo sin hacer las
             * comprobaciones de existe. pero recuerda que NO NOS INTERESA.
             */
            /**
             * Iniciamos los departamentos con el hashset de los empleados
             * vacio*
             */
            //Para realizar búsquedas qbe (query by example) se le pasa el patrón 
            //del objeto a buscar. Indicamos diferentes patrones.
            //1.- Completo con datos; 2.-Completo con solo clave; 3.- Solo clave
            //Podría ponerse también algo como (null,null, "A Coruña"); 
            //Buscando todos los que sean de coruña
            Departamento d10 =depDAO.existeDepartamentoQBE(new Departamento(10,"Contabilidad", "A Coruña"));
            Departamento d20 =depDAO.existeDepartamentoQBE(new Departamento(20,null,null));
            Departamento d40 = depDAO.existeDepartamentoQBE(new Departamento(40));
            
            //Departamento d20 = new Departamento(20, "I+D", "Santiago");
            //Departamento d40 = new Departamento(40, "Produccion", "As pontes");

            /**
             * Para buscar el objeto utilizamos el QBE (Query by example). Como
             * funciona: Se le indica el objeto y lo busca. Se puede indicar
             * todos los campos como el caso del 20 o un constructor más simple
             * como en el 40. Los datos que no se buscan si son enteros se
             * sustituyen por 0, en otro caso null. Por eso aqui indicamos null
             * en todo para el ejemplo de buscar el 20.
             */
           
            if (d10 == null) 
                depDAO.insertar(new Departamento(10,"Contabilidad", "A Coruña"));
            if (d20 == null) 
                depDAO.insertar(new Departamento(20, "I+D", "Santiago"));
            if (d40 == null) 
                depDAO.insertar(new Departamento(40, "Produccion", "As pontes"));
            
            //A continuación queremos insertar dos empleados en el departamento de contabilidad
            //Necesitamos el objeto del departamento de contabilidad que no lo tenemos.
            d10=depDAO.existeDepartamentoQBE(new Departamento(10));  
     
            //creamos los 2 objetos empleados
            Empleado e1=new Empleado(7396, "Garcia","Vendedor",7902, 800.0f,d10);
            Empleado e2=new Empleado(7566, "Nuñez", "Director",7839,1975.0f,d10);
            
            //Creamos una lista para añadir los empleados en el objeto del departamento.
            //Fijarse como en el modelo el departamento tiene la lista de empleados.
            
            List <Empleado> listaEmpleados=new ArrayList<>();
            
            listaEmpleados.addAll(d10.getListaEmpleados()); //Primero insertamos la lista que ya contiene.
            
            if (!listaEmpleados.contains(e1)) 
                listaEmpleados.add(e1);
            
            if (!listaEmpleados.contains(e2)) 
                listaEmpleados.add(e2);
            
             d10.setListaEmpleados(listaEmpleados);
             depDAO.modificar(d10);          
             depDAO.cargarCombo(modelocombo);
                  
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato incorrecto en la entrada de datos");
        } catch (Exception ex1) {
            if (ex1.getMessage().contains("ejemplo.db4o")) {
                JOptionPane.showMessageDialog(null, "Cierra el ObjectManager");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error");
            }
            Logger.getLogger(controladorEnunciado1.class.getName()).log(Level.SEVERE, null, ex1);
        }
        
    }

    public static void cargarCombo() {
        try {
           depDAO.cargarCombo(modelocombo);
        } catch (Exception ex) {
            Logger.getLogger(controladorEnunciado1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
