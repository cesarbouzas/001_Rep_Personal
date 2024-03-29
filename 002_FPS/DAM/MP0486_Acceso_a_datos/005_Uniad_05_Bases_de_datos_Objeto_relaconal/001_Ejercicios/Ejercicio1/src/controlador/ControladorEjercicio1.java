/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.db4o.ObjectSet;
import java.lang.Object;
import controlador.factory.controladorFactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamento;
import modelo.vo.Empleado;
import vista.Vejercicio1;

/**
 *
 * @author acceso a datos
 */
public class ControladorEjercicio1 {
    
   
    public static Vejercicio1 ventana = new Vejercicio1();
    public static DepartamentoDAO depDAO; 
    public static EmpleadoDAO empDAO;

    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);      
    }
    
    public static void iniciaBD() {
      
        controladorFactory.abrirBD();
        depDAO=controladorFactory.getDepartamentoDAO();
        empDAO=controladorFactory.getEmpleadoDAO();
    }
    public static void cerrarBD() {
        controladorFactory.cerrarBD();
    }
    

    public static void cargarDatosDB() {
       try{
           
       //Existen 10 , 20 y 40    
       Departamento d10=new Departamento(10, "Contabilidad", "A Coruña");
       Departamento d20=new Departamento(20,null,null);
       Departamento d30=new Departamento(30,"Topografia" ,"Oleiros");
       Departamento d40=new Departamento(40);
       Departamento d50=new Departamento(50,"Contabilidad", "Culleredo");
       d10=depDAO.existeDepartamentoQBE(d10); //resultado el departamento id 10   
      d20=depDAO.existeDepartamentoQBE(d20);//
      d30=depDAO.existeDepartamentoQBE(d30);
      d40=depDAO.existeDepartamentoQBE(d40);
       d50=depDAO.existeDepartamentoQBE(d50);
       System.out.println(d10);
       System.out.println(d20);
       System.out.println(d30);
       System.out.println(d40);
       System.out.println(d50);
       
       if (d10 == null) {
               insertarDepartamento(new Departamento(10, "Contabilidad", "A Coruña"));
           }
           if (d20 == null) {
               insertarDepartamento(new Departamento(20,null,null));
           }
           if (d30 == null) {
               insertarDepartamento(new Departamento(30,"Topografia" ,"Oleiros"));
           }
           if (d40 == null) {
               insertarDepartamento(new Departamento(40,"Economistas","Culleredo"));
           }
           if (d50 == null) {
               insertarDepartamento(new Departamento(50,"Contabilidad", "el burgo"));
           }
           
           d30 = depDAO.existeDepartamentoQBE(new Departamento(30));///para que no sea null
           Empleado e1=new Empleado(1, "Bouzas", "Topografo",0,d30,1890.23F);
           Empleado e2=new Empleado(2, "Antelo", "Ayudante",1, d30, 1290.89F);
           
           e1.getD().insertarEmpleadoDepartamento(e1);
           e2.getD().insertarEmpleadoDepartamento(e2);
           empDAO.insertarEmpleadoBD(e1);
           empDAO.insertarEmpleadoBD(e2);
           ArrayList<Empleado> listaNueva=new ArrayList<>();
           listaNueva.addAll(d30.getListaEmpleados());
           depDAO.modificarDepartamento(d30);
           
           
       }catch(Exception e){
        e.printStackTrace();
       }
    }
    public static void insertarDepartamento(Departamento d){
        mostrarMsg(depDAO.insertarDepartamento(d));
    }
    public static void cargarComboDepartamentos(){
        ventana.getCbDepartamento().removeAllItems();//borrar combo
        ObjectSet<Departamento> listaDept =depDAO.listaTodosLosDepartamentos();
        for(Departamento d:listaDept){
            ventana.getCbDepartamento().addItem(d);
        }
    }
    
    private static void mostrarMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
    } 

    public static void cargarTxtFields() {
        String campoIdEmpleado=ventana.getTxt_nEmpleado().getText();
        if(campoIdEmpleado.isEmpty()){
            mostrarMsg("El campo empleado está vacio");
        }else{
            try{
            int id=Integer.parseInt(campoIdEmpleado);
            Empleado emp=empDAO.buscarEmpleado(id);        
            if(emp==null){
                mostrarMsg("El empleado no existe");
                limpiarCampos();
            }else{
                rellenarCampos(emp);
            }
            }catch(NumberFormatException nf){
                        mostrarMsg("Error de formato");
            }
            
        }
    }
    public static void insertarEmpleado(){
       String campoIdEmpleado=ventana.getTxt_nEmpleado().getText();
       String apellido=ventana.getTxt_apellido().getText();
       float salario=Float.valueOf(ventana.getTxt_salario().getText());
        if(campoIdEmpleado.isEmpty()){
            mostrarMsg("El campo empleado está vacio");
        }else{
            try{
            int id=Integer.parseInt(campoIdEmpleado);
            Empleado emp=empDAO.buscarEmpleado(id);        
            if(emp==null){
                emp=new Empleado(id,apellido,null,0,(Departamento)(ventana.getCbDepartamento().getSelectedItem()),salario);
                empDAO.insertarEmpleadoBD(emp);
                emp.getD().insertarEmpleadoDepartamento(emp);
                mostrarMsg("Empleado :"+emp.getApellido()+" insertado con exito");
            }else{
                mostrarMsg("El empleado existe no se pude insertar");
            }
            }catch(NumberFormatException nf){
                        mostrarMsg("Error de formato");
            }catch(Exception e){
                    mostrarMsg("Error genral");
                e.printStackTrace();
            }}
    
    
    }
    
    public static void borrarEmpleado(){
    JTextField idEmpleado=ventana.getTxt_nEmpleado();
    
    if(idEmpleado.getText().isEmpty()){
        mostrarMsg("El campo no puede estar en blanco");
    }else{
        try{
            Empleado emp=empDAO.buscarEmpleado(Integer.parseInt(idEmpleado.getText()));
            if(emp==null){
                mostrarMsg("Empleado no existe no se puede borrar");
            }else{
                  emp.getD().borrarEmpleadoDepartamento(emp);
                empDAO.borrarEmpleadoBd(emp);
               ventana.getTxt_nEmpleado().setText("");
                limpiarCampos();
            }
        }catch(NumberFormatException nf){
            mostrarMsg("formato invalido");
        }
                
    }
            
    }
    public static void modificarEmpleado(){
    JTextField idEmpleado=ventana.getTxt_nEmpleado();
    if(idEmpleado.getText().isEmpty()){
        mostrarMsg("El numero de empleado no puede estar vacio");
    }else{
        try{
          Empleado empbuscado= empDAO.buscarEmpleado(Integer.parseInt(idEmpleado.getText()));
          if(empbuscado==null){
              mostrarMsg("El empleado no existe");
          }else{
       String apellido=ventana.getTxt_apellido().getText();
       float salario=Float.valueOf(ventana.getTxt_salario().getText());
       Departamento d=(Departamento)ventana.getCbDepartamento().getSelectedItem();
            empDAO.modificarEmpleado(empbuscado,new Empleado(empbuscado.getEmp_no(),apellido,null,0,d,salario));
          }  
        }catch(NumberFormatException nf){
            mostrarMsg("formato de empleado invalido");
        
        }
    }
    
    
    } 
    
    
    
    
    
    
    
    private static void limpiarCampos(){
            ventana.getTxt_apellido().setText("");
            ventana.getTxt_salario().setText("");
            ventana.getCbDepartamento().setSelectedIndex(0);
    
    }
    
    
    private static void rellenarCampos(Empleado emp) {
            ventana.getTxt_apellido().setText(emp.apellido);
            ventana.getTxt_salario().setText(emp.getSalario()+"");
            ventana.getCbDepartamento().setSelectedItem(emp.getD());
            
    }

    public static void comprobarTextFieldApellido() {
       String apellido=ventana.getTxt_apellido().getText();
        if(apellido.isEmpty()|| apellido.length()>6){
            ventana.getTxt_apellido().setText("");
            mostrarMsg("El formota es invalido");
        }else{
            System.out.println("formato apellido ok");
        }
    }
       public static void comprobarTextFieldSalario() {
       String salario=ventana.getTxt_salario().getText();
        if(salario.isEmpty()|| salario.length()>7){
            ventana.getTxt_salario().setText("");
            mostrarMsg("campo vacio/muy largo/número invalido");
        }else{
            try{
                Float.valueOf(salario);
            }catch(NumberFormatException nf){
                mostrarMsg("Formato de número incorrecto");
            }
           ;
        }
    }
    
}
