/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamentos;
import modelo.vo.Empleados;
import org.hibernate.Session;
import vista.VEjercicio2;

/**
 *
 * @author acceso a datos
 */
public class ControladorEjercicio2 {
    
public static VEjercicio2 ventana=new VEjercicio2();
public static DepartamentoDAO depDAO;
public static EmpleadoDAO empDAO;
public static Session session;

public static void iniciar(){
    ventana.setVisible(true);
    ventana.setLocationRelativeTo(null);
    depDAO=  HibernateUtil.getDepartamentoDAO();
empDAO=HibernateUtil.getEmpleadoDAO();
}

public static void iniciarSession(){
    session=HibernateUtil.getSessionFactory().openSession();
    HibernateUtil.beginTx(session);
}
public static void cerrarSession(){
    session.close();
}
public static void cargarComboDepartemantos(){
    for(Departamentos item:depDAO.listarDepartamentos(session)){
        ventana.getComboDepartemntos().addItem(item);
    }
}
public static void cargarTextAreaEmpleados(){
  Departamentos d=((Departamentos)ventana.getComboDepartemntos().getSelectedItem());
    ventana.getTxtAreaEmpleados().setText("");
  if(empDAO.listarEmpleadosDepartemnto(session, d).isEmpty()){
      ventana.getTxtAreaEmpleados().setText("El departamento no tiene empleados");
  }else{
    int i=0;
      for(Empleados emp:empDAO.listarEmpleadosDepartemnto(session,d)){
        ventana.getTxtAreaEmpleados().append(emp+"\n");
        i++;
      }
      ventana.getTxtAreaEmpleados().append("El total de empleados es de " +i+" empleados");
}
}
public static void cargarTablaEmpleados(){
Departamentos d=((Departamentos)ventana.getComboDepartemntos().getSelectedItem());
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("Apellido");
    modelo.addColumn("Oficio");
    for(Empleados e: d.getEmpleadosList()){
    modelo.addRow(new Object[]{e.getEmpNo(),e.getApellido(),e.getOficio()});
    }
    JTable tabla=ventana.getTablaEmpleados();
    tabla.setModel(modelo);
}



}
