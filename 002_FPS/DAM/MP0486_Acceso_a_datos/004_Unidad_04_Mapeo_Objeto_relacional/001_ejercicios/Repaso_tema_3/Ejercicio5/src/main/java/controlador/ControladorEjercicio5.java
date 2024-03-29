package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamento;
import modelo.vo.Empleado;
import vista.VEjercicio5;

public class ControladorEjercicio5 {

    public static VEjercicio5 ventana = new VEjercicio5();
    public static DAOFactory daoFactory;
    public static EmpleadoDAO daoEmpleado;
    private static final String CAMPOSVACIOS = "Campos sin rellenar.";
    private static final String CAMPOEMPLEADO = "Debe introducir numero de empleado";
    private static final String FORMATOINVALIDO = "Formato invalido";
    private static final String ERRORSQL = "Consulta erronea";
    private static final String ERROR="Error generico";
    private static final String NONEGATIVOS="El numero de empleado o jefe no pueden ser negativos";
    private static final String DIRECTORNOVALIDO="El numero de director no es un empleado ";
    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    public static void iniciarFactory() {
        daoFactory = DAOFactory.getDAOFactory(MySQLDAOFactory.MYSQL);

    }

    public static void apagarFactory() {
        try {
            daoFactory.shutdown();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void rellenarCampos() {
        Connection conn = null;
        
        if (ventana.getTxtEmpNo().getText().isEmpty()) {
            mostrarMsg(CAMPOEMPLEADO);
        } else {
            try {
                conn = daoFactory.getConnection();
                int emp_NO = Integer.parseInt(ventana.getTxtEmpNo().getText());
                if (emp_NO < 0) {
                    throw new NumberFormatException();
                }
                Empleado emp = EmpleadoDAO.buscarEmpleado(conn, emp_NO);
                if (emp != null) {
                    Departamento dept = DepartamentoDAO.buscarDepartamento(conn, emp.getDept_no());
                    ventana.getTxtEmpApellido().setText(emp.getApellido());
                    ventana.getTxtEmpDirector().setText(emp.getDir() + "");
                    ventana.getTxtEmpOficio().setText(emp.getOficio());
                    ventana.getTxtEmpSalario().setText(emp.getSalario() + "");
                    ventana.getComboDepartamentos().setSelectedItem(dept);
                } else {
                    limpiarCampos();
                }
            } catch (NumberFormatException eNF) {
                mostrarMsg(FORMATOINVALIDO);
                ventana.getTxtEmpNo().setText("");
            } catch (SQLException eSQL) {
                mostrarMsg(ERRORSQL);
                eSQL.printStackTrace();
            } catch (Exception e) {
                mostrarMsg(ERROR);
            }

        }

        daoFactory.releaseConnection(conn);
    }
    public static void rellenarTxtAreaEmpleados(){
    Connection conn=null;
    try{
    conn=daoFactory.getConnection();
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    empleados=EmpleadoDAO.buscarAllEmpleados(conn);
     ventana.getTxtAreaEmpleados().setText("");
        for (Empleado empleado : empleados) {
            ventana.getTxtAreaEmpleados().append(empleado.toString()+"\n");
        }
    }catch(SQLException eSQL){
        mostrarMsg(ERRORSQL);
    }catch(Exception e){
        mostrarMsg(ERROR);
    }
    daoFactory.releaseConnection(conn);
    }
    
    
    

    public static void rellenarComboDepartamentos() {
        Connection conn = null;
        try {
            conn = daoFactory.getConnection();
            ArrayList<Departamento> departamentos = DepartamentoDAO.obtenerAllDepartamentos(conn);
            for (int i = 0; i < departamentos.size(); i++) {
                ventana.getComboDepartamentos().addItem(departamentos.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        daoFactory.releaseConnection(conn);

    }

    public static void limpiarCampos() {
        ventana.getTxtEmpApellido().setText("");
        ventana.getTxtEmpDirector().setText("");
        ventana.getTxtEmpOficio().setText("");
        ventana.getTxtEmpSalario().setText("");
        ventana.getComboDepartamentos().setSelectedIndex(0);

    }

    private static boolean isSomeFieldsEmpyEmpleado() {

        return (ventana.getTxtEmpNo().getText().isEmpty()
                || ventana.getTxtEmpApellido().getText().isEmpty()
                || ventana.getTxtEmpDirector().getText().isEmpty()
                || ventana.getTxtEmpOficio().getText().isEmpty()
                || ventana.getTxtEmpSalario().getText().isEmpty());
    }

    private static void mostrarMsg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }

    public static void insertarEmpleado() {
        Connection conn = null;
        Empleado emp;
        try {
            conn = daoFactory.getConnection();
            if (isSomeFieldsEmpyEmpleado()) {
                mostrarMsg(CAMPOSVACIOS);
            } else  {
                emp = recogerCamposEmpleado();
                if(emp!=null) {
                    EmpleadoDAO.insertaEmpleado(conn, emp);
                    conn.commit();//Hago comit pero no se actualiza la txt area????
                    mostrarMsg("Empleado introducido.");
                    
                }else{
                    mostrarMsg("Error al recoger los datos de los campos");
                }
            }
        } catch (SQLException eSQL) {
            mostrarMsg(ERRORSQL);
            eSQL.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        } catch (Exception e) {
            mostrarMsg(ERROR);

        }
        daoFactory.releaseConnection(conn);
                limpiarCampos();
                    rellenarTxtAreaEmpleados();
    }

    public static Empleado recogerCamposEmpleado() {
        Connection conn = null;
        Empleado emp = null;
        try {
            conn = daoFactory.getConnection();
            if (!isSomeFieldsEmpyEmpleado()) {
                int emp_no = Integer.parseInt(ventana.getTxtEmpNo().getText());
                int dir_no = Integer.parseInt(ventana.getTxtEmpDirector().getText());
                if (emp_no < 0 || dir_no < 0) {
                    mostrarMsg(ControladorEjercicio5.NONEGATIVOS);
                } else if (EmpleadoDAO.buscarEmpleado(conn, dir_no) != null) {
                    System.out.println("Comprobado el jefe, ok");
                    emp = new Empleado(emp_no, ventana.getTxtEmpApellido().getText(),
                        ventana.getTxtEmpOficio().getText(), dir_no, Date.valueOf(LocalDate.now()),
                        Float.parseFloat(ventana.getTxtEmpSalario().getText()),
                        0, ((Departamento) (ventana.getComboDepartamentos().getSelectedItem())).getDept_no());
                } else {
                    mostrarMsg(DIRECTORNOVALIDO+"casca 2 vuelta");
                }
                
                
            } else {
                mostrarMsg(CAMPOSVACIOS);
            }
        } catch (Exception e) {
            mostrarMsg(ERROR);
        }
        daoFactory.releaseConnection(conn);
        return emp;
    }
    
    public static void comprobarDirectivo() {
        Connection conn=null;
        try {
            conn=daoFactory.getConnection();
            int dir=Integer.parseInt(ventana.getTxtEmpDirector().getText());
            if(dir>0&&  EmpleadoDAO.buscarEmpleado(conn,dir )!=null){
                System.out.println("Director ok");
            }else if(dir<0){
                mostrarMsg(NONEGATIVOS);
                ventana.getTxtEmpDirector().setText("");
            }else{
                mostrarMsg(DIRECTORNOVALIDO);
                ventana.getTxtEmpDirector().setText("");
            }
        }catch(NumberFormatException eNF){
            mostrarMsg(FORMATOINVALIDO);
              ventana.getTxtEmpDirector().setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        daoFactory.releaseConnection(conn);
    }

    public static void comprobarSalarioNegativo() {
        try{
        float sal=Float.parseFloat(ventana.getTxtEmpSalario().getText());
        if(sal<0||(sal+"").length()>6){
            mostrarMsg(" Error , el rango de valores tiene que ser positivo y 6 digitos max");
            ventana.getTxtEmpSalario().setText("");
        }
        }catch(NumberFormatException eNf){
            mostrarMsg(FORMATOINVALIDO);
            eNf.printStackTrace();
        }
    }

    public static void borrarEmpleado() {
    Connection conn=null;
    Empleado emp=null;
    try{
      int emp_no=Integer.parseInt(ventana.getTxtEmpNo().getText());
      conn=daoFactory.getConnection();
      emp=EmpleadoDAO.buscarEmpleado(conn, emp_no);
      if(emp==null){
          mostrarMsg("Empleado no existe");
      }else{
         if(EmpleadoDAO.isDirectivo(conn,emp.getEmp_no())){
             mostrarMsg("El empleado es directivo no puede ser eliminado");
             
         }else{
             mostrarMsg("ha sido borrado "+EmpleadoDAO.borrarEmpleado(conn,emp.getEmp_no())+" registro."); 
             conn.commit();
         }
      }
      
    }catch(NumberFormatException eNF){
        mostrarMsg(FORMATOINVALIDO);
    }catch(SQLException eSql){
        mostrarMsg(ERRORSQL);
        eSql.printStackTrace();
        try {
            conn.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEjercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }catch(Exception e){
        mostrarMsg(ERROR);
    }
    daoFactory.releaseConnection(conn);
    limpiarCampos();
                    rellenarTxtAreaEmpleados();
    }
    
    
    public static void modificarEmpleado(){
    Connection conn=null;
    Empleado emp=null;
    
    try{
      int emp_no=Integer.parseInt(ventana.getTxtEmpNo().getText());
      conn=daoFactory.getConnection();
      emp=EmpleadoDAO.buscarEmpleado(conn, emp_no);
      if(emp==null){
          mostrarMsg("Empleado no existe");
      }else{
        emp= recogerCamposEmpleado();
         mostrarMsg("ha sido actualizado "+EmpleadoDAO.actualizarEmpleado(conn,emp)+" registro."); 
         conn.commit();
      }
      
    }catch(NumberFormatException eNF){
        mostrarMsg(FORMATOINVALIDO);
    }catch(SQLException eSql){
        mostrarMsg(ERRORSQL);
        eSql.printStackTrace();
        try {
            conn.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEjercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }catch(Exception e){
        mostrarMsg(ERROR);
    }
    daoFactory.releaseConnection(conn);
    limpiarCampos();
                    rellenarTxtAreaEmpleados();
    }
    
    
    } 
    
    
    
     
    
    

