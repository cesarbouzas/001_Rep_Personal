package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDao;
import modelo.dao.EmpleadoDao;
import modelo.vo.Departamento;
import modelo.vo.Empleado;
import vista.Ventana5;

public class ControladorEjercicio5 {

    static Ventana5 v = new Ventana5();
    static DAOFactory mySQLDAOFactory;
    static DepartamentoDao depDao;
    static EmpleadoDao empDao;

    public static void iniciar() {
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }

    public static void IniciarFactory() {
        mySQLDAOFactory = MySQLDAOFactory.getDAOFactory(MySQLDAOFactory.MYSQL);
        depDao = mySQLDAOFactory.getDepartamentoDao();
        empDao = mySQLDAOFactory.getEmpleadoDao();
    }

    public static void cerrarFactory() {
        try {
            mySQLDAOFactory.shutdown();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void cargarComboDepartamentos() {
        Connection con = null;
        try {
            con = mySQLDAOFactory.getConnection();
            DepartamentoDao.listarDepartamentos(con, v.getCbDepartamento());
            mySQLDAOFactory.releaseConnection(con);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySQLDAOFactory.releaseConnection(con);
        }
    }

    public static boolean comprobarTodosDatos() {
        Connection con = null;
        boolean resul = true;
        if (v.getTfDirector().getText().isEmpty()
                || v.getTfApellido().getText().isEmpty()
                || v.getTfNumero().getText().isEmpty()
                || v.getTfSalario().getText().isEmpty()
                || v.getTfOficio().getText().isEmpty()) {
            JOptionPane.showMessageDialog(v, "Deben estar todos los campos rellenos.");
            resul = false;
        } else {
            if (Double.parseDouble(v.getTfSalario().getText()) < 0) {
                JOptionPane.showMessageDialog(v, "El salario no puede ser negativo");
                v.getTfSalario().setText("");
                resul = false;
            }
            try {
                con = mySQLDAOFactory.getConnection();
                if (!empDao.existeEmpleado(con, Integer.parseInt(v.getTfDirector().getText()))) {
                    JOptionPane.showMessageDialog(v, "El director no es un empleado registrado");
                    v.getTfDirector().setText("");
                    resul = false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                mySQLDAOFactory.releaseConnection(con);
            }

        }
        return resul;
    }

    public static void InsertarEmpleado() {
        Connection con=null;
        if(comprobarTodosDatos()){
           try{ 
            con=mySQLDAOFactory.getConnection();
            int no_emp=Integer.parseInt(v.getTfNumero().getText());
            String apellido=v.getTfApellido().getText();
            String oficio=v.getTfOficio().getText();
            int dir=Integer.parseInt(v.getTfDirector().getText());
            double salario=Double.parseDouble(v.getTfSalario().getText());
            Departamento d=(Departamento)(v.getCbDepartamento().getSelectedItem());
            if(!empDao.existeEmpleado(con, Integer.parseInt(v.getTfNumero().getText()))){
                Empleado e=new Empleado(no_emp,apellido,oficio,dir,salario,0,d.getDept_no());
                if(empDao.insertarEmpleado(con ,e)==1){
                    JOptionPane.showMessageDialog(v,"Empleado Insertado");
                }
                con.commit();
            }
           }catch(Exception e){
                e.printStackTrace();
                
               try {
                   con.rollback();
               } catch (SQLException ex) {
                   e.printStackTrace();
               }
           }finally{
                   mySQLDAOFactory.releaseConnection(con);
           }
        
        }
    }
    
    

    
}
