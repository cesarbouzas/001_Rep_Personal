
package modelo.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.vo.Empleado;

/**
 *
 * @author Usuario
 */
public class EmpleadoDAO {

    public static Empleado buscarEmpleado(Connection conn, int emp_NO) throws SQLException {
        String sql="Select * from empleados where emp_no=?";
        PreparedStatement pS=conn.prepareStatement(sql);
        pS.setInt(1, emp_NO);
        System.out.println(emp_NO);
        ResultSet rS= pS.executeQuery();
        while(rS.next()){
        return new Empleado(emp_NO,rS.getString(2),rS.getString(3),rS.getInt(4),
                rS.getDate(5),rS.getFloat(6),rS.getFloat(7),rS.getInt(8));
        }
        return null;
    }

    public static ArrayList<Empleado> buscarAllEmpleados(Connection conn) throws SQLException{
        ArrayList<Empleado> empleados=new ArrayList<Empleado>();
        String sql="Select * from empleados";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
        empleados.add(new Empleado(rs.getInt(1),
                rs.getString(2),rs.getString(3),rs.getInt(4),
                rs.getDate(5),rs.getFloat(6),rs.getFloat(7),
                rs.getInt(8)));
        }
        return empleados;
    } 

    public static int insertaEmpleado(Connection conn, Empleado emp) throws SQLException {
       String sql="Insert into empleados(emp_no,apellido,oficio,dir,fecha_alt,salario,comision,dept_no) values (?,?,?,?,?,?,?,?) ";
       PreparedStatement ps=conn.prepareStatement(sql);
       ps.setInt(1, emp.getEmp_no());
       ps.setString(2, emp.getApellido());
       ps.setString(3, emp.getOficio());
       ps.setInt(4, emp.getDir());
       ps.setDate(5, emp.getFecha_alt());
       ps.setFloat(6, emp.getSalario());
       ps.setFloat(7, emp.getComision());
       ps.setInt(8, emp.getDept_no());
       return ps.executeUpdate();
    
    
    }

    public static boolean isDirectivo(Connection conn, int emp_no) throws SQLException {
 
       String sql="select * from empleados where dir=?";
       PreparedStatement ps=conn.prepareStatement(sql);
       ps.setInt(1, emp_no);
       ResultSet rs= ps.executeQuery();
       while(rs.next()){
           return true;
       }
        return false;
    }

    public static int borrarEmpleado(Connection conn, int emp_no) throws SQLException {
        String sql="delete from empleados where emp_no=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, emp_no);
        return ps.executeUpdate();
        
    }

    public static int actualizarEmpleado(Connection conn, Empleado emp) throws SQLException {
     String sql="update empleados set apellido=?,oficio=?,dir=?,salario=?,dept_no=? where emp_no=?";
     PreparedStatement ps=conn.prepareStatement(sql);
       ps.setString(1, emp.getApellido());
       ps.setString(2, emp.getOficio());
       ps.setInt(3, emp.getDir());
       ps.setFloat(4, emp.getSalario());
       ps.setInt(5, emp.getDept_no());
       ps.setInt(6, emp.getEmp_no());
       return ps.executeUpdate();
    }
}
