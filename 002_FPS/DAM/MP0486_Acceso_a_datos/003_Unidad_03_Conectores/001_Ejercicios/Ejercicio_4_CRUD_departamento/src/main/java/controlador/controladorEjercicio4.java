package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDao;
import modelo.vo.Departamento;
import vista.Ventana4;

public class controladorEjercicio4 {

    static Ventana4 ventana = new Ventana4();
    static DAOFactory mySQLDAOFactory;

    public static void Iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    public static void inciarFactory() {
        mySQLDAOFactory = MySQLDAOFactory.getDAOFactory(MySQLDAOFactory.MYSQL);

    }

    public static void cerrarFactory() {
        try {
            mySQLDAOFactory.shutdown();
        } catch (Exception ex) {
        }
    }

    static boolean isAllfieldsCovered() {
        if (ventana.getTf_Dep_no().getText().isEmpty()
                || ventana.getTf_Dnombre().getText().isEmpty()
                || ventana.getTf_Loc().getText().isEmpty()) {

            return false;
        }
        return true;
    }

    public static void rellenarDatos() {
        Connection con=null;
        if (!ventana.getTf_Dep_no().getText().isEmpty()) {

            try {
                con = mySQLDAOFactory.getConnection();
                int num = Integer.parseInt(ventana.getTf_Dep_no().getText());
                System.out.println(num);
                Departamento d = DepartamentoDao.buscarPorKey(con, num);
                System.out.println(d);
                if (d != null) {
                    ventana.getTf_Dnombre().setText(d.getDnombre());
                    ventana.getTf_Loc().setText(d.getLoc());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "formato invalido");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(ventana, "error en la conexion");
            }finally{
            mySQLDAOFactory.releaseConnection(con);
            }

        }
    }

    public static void InsertarDepartamento() {
        Connection con = null;
        int num;
        if (!isAllfieldsCovered()) {
            JOptionPane.showMessageDialog(ventana, "Introduce todos los datos necesarios");
        } else {
            try {
                con = mySQLDAOFactory.getConnection();
                num = Integer.parseInt(ventana.getTf_Dep_no().getText());
                System.out.println(num);
                Departamento d = new Departamento(num, ventana.getTf_Dnombre().getText(), ventana.getTf_Loc().getText());

                if (DepartamentoDao.insertarDepartamento(con, d)) {
                    JOptionPane.showMessageDialog(ventana, "Departamento Insertado");
                    con.commit();
                } else {
                    JOptionPane.showMessageDialog(ventana, "Departamento No insertado");
                }

            } catch (Exception ex) {
                try {
                    ex.printStackTrace();
                    con.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace();
                }
            } finally {
                mySQLDAOFactory.releaseConnection(con);
            }

        }

    }

    public static void borrarRegistro() {
        Connection con = null;
        int num;
        if (!isAllfieldsCovered()) {
            JOptionPane.showMessageDialog(ventana, "Introduce todos los datos necesarios");
        } else {
            try {
                con = mySQLDAOFactory.getConnection();
                num = Integer.parseInt(ventana.getTf_Dep_no().getText());
                Departamento d = DepartamentoDao.buscarPorKey(con, num);
                if (DepartamentoDao.borrarDepartamento(con, d) == 1) {
                    con.commit();
                    JOptionPane.showMessageDialog(ventana, "Departamento borrado");
                    rellenarDatos();
                    }
                    
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(ventana, "Departamento no borrado");
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(controladorEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
                }
            }finally{
            mySQLDAOFactory.releaseConnection(con);
            }

        }
    }

    public static void modificarRegistro() {
        if (!isAllfieldsCovered()) {
            JOptionPane.showMessageDialog(ventana, "inserta todos los campos");

        } else {
            Connection con = null;
            try {
                con = mySQLDAOFactory.getConnection();
                Departamento d = DepartamentoDao.buscarPorKey(con, Integer.parseInt(ventana.getTf_Dep_no().getText()));
                if (d != null) {
                    Departamento n = new Departamento(d.getDept_no(), ventana.getTf_Dnombre().getText(), ventana.getTf_Loc().getText());

                    if (DepartamentoDao.modificarDepartamento(con, d, n) == 1) {
                      JOptionPane.showMessageDialog(ventana, "Departamento modificado");
                      con.commit();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "Departamento no modificado");
                    }
                } else {
                    JOptionPane.showMessageDialog(ventana, "Departamento no existe");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                try {
                    con.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace();
                }
            }  finally{
            mySQLDAOFactory.releaseConnection(con);
            }

        }
    }

        

    }



