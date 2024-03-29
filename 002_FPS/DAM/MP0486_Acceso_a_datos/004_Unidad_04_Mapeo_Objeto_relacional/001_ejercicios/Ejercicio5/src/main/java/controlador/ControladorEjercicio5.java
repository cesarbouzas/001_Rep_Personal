
package controlador;

import controlador.factory.HibernateUtil;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamentos;
import modelo.vo.Empleados;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;
import vista.Vejercicio5;

/**
 *
 * @author acceso a datos
 */
public class ControladorEjercicio5 {
    
    private static final String ERRORCOMBO="Error al cagar el combo departamentos";
    private static final String CAMPONOVALIDO="El campo no es válido";
    private static final String ERRORGENERICO="Error genérico";
    private static final String EMPLEADONOEXISTE="El empleado no existe";
    
    private static Vejercicio5 ventana=new Vejercicio5();
    private static Session session;
    private static DepartamentoDAO depDAO;
    private static EmpleadoDAO empDAO;
    private static JTextField fieldEmpleado=ventana.getTxtEmp_no();
    private static JTextField fielDirector=ventana.getTxtEmp_Director();
    
    
    
    
    public static void iniciar(){
    ventana.setVisible(true);
    ventana.setLocationRelativeTo(null);
    
    }
    
    public static void iniciarConession(){
    session=HibernateUtil.getSessionFactory().openSession();
    depDAO=HibernateUtil.getDepartamentoDAO();
    empDAO=HibernateUtil.getEmpleadoDAO();
    };
    
    public static void finalizarConession(){
    session.close();
    };

    public static void cargarComboDepartamentos() {
        try{
            HibernateUtil.beginTx(session);
           for(Departamentos d:depDAO.buscarTodosDepartamentos(session)){
               ventana.getCBdepartamento().addItem(d);
           }
            HibernateUtil.commitTx(session);
        }catch(Exception e){
        mostrarMsg(ERRORCOMBO);    
        HibernateUtil.rollbackTx(session);
        }   
    }
    public static void rellenarCampos() {
        if (!isValidNEmpleado()) {
            mostrarMsg(CAMPONOVALIDO);
        } else {
            Empleados e;
            try {
                HibernateUtil.beginTx(session);   
                System.out.println(txtToNum(fieldEmpleado));
                e=empDAO.buscarEmpleado(session,txtToNum(fieldEmpleado));
                if(e==null){
                    System.out.println(EMPLEADONOEXISTE); 
                }else{
                  rellenarDatosEmpleado(e);  
                }
                HibernateUtil.commitTx(session);
            } catch (Exception ex) {
                session.getTransaction().rollback();
                mostrarMsg(ERRORGENERICO);
                ex.printStackTrace();
            }

        }

    }
    
    public static void insertarEmpleado() {
        try {            
            HibernateUtil.beginTx(session);
            Empleados emp = new Empleados(
                    Integer.parseInt(ventana.getTxtEmp_no().getText()),
                    ventana.getTxtEmp_apellido().getText(),
                    ventana.getTxtEmp_oficio().getText(),
                    Integer.parseInt(ventana.getTxtEmp_Director().getText()),
                    Float.valueOf(ventana.getTxtEmp_Salario().getText()),
                    (Departamentos) ventana.getCBdepartamento().getSelectedItem()
            );
            empDAO.insertarEmpleado(session, emp);
            HibernateUtil.commitTx(session);
            mostrarMsg("Empleado guardado");
            vaciarCampos();
            rellenarTabla();
        }catch(SQLException eSQL){
            if(eSQL.getErrorCode()==1062){
            mostrarMsg("El numero de empleado existente erro 1062");
            session.getTransaction().rollback();}
        } catch (NonUniqueObjectException n) {
            mostrarMsg("El numero de empleado existente hibernate");
            session.getTransaction().rollback();
        } catch (Exception e) {
            mostrarMsg("Error de inserccion exception ");
             session.getTransaction().rollback();
        }
    }
    public static void borrarEmpleado(){
    try{
    HibernateUtil.beginTx(session);
    Empleados emp=empDAO.buscarEmpleado(session,txtToNum(fieldEmpleado));
    if(emp==null){
        mostrarMsg(EMPLEADONOEXISTE);
        session.getTransaction().rollback();
    }else{
        empDAO.borrarEmpleado(session,emp);
        HibernateUtil.commitTx(session);
        mostrarMsg("Empleado "+emp.getEmpNo()+"->"+emp.getApellido()+ " borrado");
        vaciarCampos();
        rellenarTabla();
    }
    
    }catch(Exception e){
        mostrarMsg(ERRORGENERICO);
    e.printStackTrace();
    }
        
    }
    
    
    public static void modificarEmpleado() {
        try {
            HibernateUtil.beginTx(session);
            
             Empleados emp=new Empleados(
                Integer.parseInt(ventana.getTxtEmp_no().getText()),
               ventana.getTxtEmp_apellido().getText(),
                ventana.getTxtEmp_oficio().getText(),
                Integer.parseInt(ventana.getTxtEmp_Director().getText()),
               Float.valueOf(ventana.getTxtEmp_Salario().getText()),
              (Departamentos)ventana.getCBdepartamento().getSelectedItem()
        );
            empDAO.modificarEmpleado(session, emp);
            HibernateUtil.commitTx(session);
            mostrarMsg("Empleado guardado");
        } catch (Exception e) {
            mostrarMsg(ERRORGENERICO);
            session.getTransaction().rollback();
        }
    }
    
    
    
    
    
    
public static void rellenarTabla(){
    
    DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("Numero");
    tabla.addColumn("Apellido");
    tabla.addColumn("Oficio");
    tabla.addColumn("Dir");
    tabla.addColumn("fecha alt");
    tabla.addColumn("salario");
    tabla.addColumn("Comision");
    
    ventana.getJtableEmpleados().setModel(tabla);
    tabla.setRowCount(0);
    for(Empleados e:empDAO.buscarAllEmpleados(session)){
        tabla.addRow(new Object[]{e.getEmpNo(),e.getApellido(),e.getOficio()
                ,e.getDir(),e.getFechaAlt(),e.getSalario(),e.getComision()});
    }
}
    
    
    
    
    private static void mostrarMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    } 
    
    private static int txtToNum(JTextField j){
        try{
          return Integer.parseInt(j.getText());
        }catch (NumberFormatException e){
                return 0;
        }
    }
    

    private static boolean isEmpy(JTextField j) {
        return j.getText().isEmpty();
    }
  private static boolean isValidNEmpleado(){
        return !(isEmpy(fieldEmpleado)||txtToNum(fieldEmpleado)==0);
  }

    private static void rellenarDatosEmpleado(Empleados e) {
        ventana.getTxtEmp_apellido().setText(e.getApellido());
        ventana.getTxtEmp_oficio().setText(e.getOficio());
        ventana.getTxtEmp_Salario().setText(e.getSalario().toString());
        ventana.getTxtEmp_Director().setText(e.getDir().toString());
        ventana.getCBdepartamento().setSelectedItem(e.getDepartamento());
    }
    private static void vaciarCampos(){
    ventana.getTxtEmp_no().setText("");
     ventana.getTxtEmp_Director().setText("");
     ventana.getTxtEmp_Salario().setText("");
      ventana.getTxtEmp_apellido().setText("");
       ventana.getTxtEmp_oficio().setText("");
       ventana.getCBdepartamento().setSelectedIndex(0);
       
    }
    
    
    
    public static void comprobarCampoTxt(JTextField c){
        if(isEmpy(c)){
            mostrarMsg(CAMPONOVALIDO);
            c.setText("");
        }
    }
    public static void comprobarCampoNumero(JTextField c){
        if(isEmpy(c)||txtToNum(c)==0){
            mostrarMsg(CAMPONOVALIDO);
            c.setText("");
        }}

    public static void comprobarDirector() {
      if(fielDirector.getText().isBlank()){
          mostrarMsg(CAMPONOVALIDO);
      }else{
         if(empDAO.buscarEmpleado(session, txtToNum(fielDirector))!=null){
             System.out.println("Director Ok");
         }else{
             mostrarMsg(EMPLEADONOEXISTE);
             fielDirector.setText("");
         }
      }
    }

    public static void comprobarCampoDecimal(JTextField d) {
       if(isEmpy(d)){
           mostrarMsg(CAMPONOVALIDO);
       }else{
           try{
             if(Float.parseFloat(d.getText())>=0){
                 System.out.println("salario oj"); 
             }else{
                 mostrarMsg(CAMPONOVALIDO);
                 d.setText("");
             }
             
           }catch(NumberFormatException e){
               mostrarMsg(CAMPONOVALIDO);
               d.setText("");
           }
       
       }
    }

    }
