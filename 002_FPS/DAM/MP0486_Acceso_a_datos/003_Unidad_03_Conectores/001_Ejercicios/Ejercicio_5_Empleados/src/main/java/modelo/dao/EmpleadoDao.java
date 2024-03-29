
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.vo.Empleado;

/**
 *
 * @author Usuario
 */

public class EmpleadoDao{

    public boolean existeEmpleado(Connection con, int num) throws SQLException {
        String sql="select * from empleados where emp_no=?";
        PreparedStatement pre =con.prepareStatement(sql);
        pre.setInt(1, num);
        return pre.executeQuery().next();
        
    }

    public int insertarEmpleado(Connection con,Empleado e ) throws SQLException {
        String sql="insert into empleados (emp_no,apellido,oficio,dir,fecha_alt,salario,comision,dept_no) values(?,?,?,?,?,?,?,?)";
        PreparedStatement pre=con.prepareStatement(sql);
        pre.setInt(1, e.getEmp_no());
        pre.setString(2, e.getApellido());
        pre.setString(3, e.getOficio());
        pre.setInt(4, e.getDir());
        pre.setDate(5, e.getFecha_alt());
        pre.setDouble(6, e.getSalario());
        pre.setDouble(7, e.getComision());
        pre.setInt(8, e.getDept_no());
        return pre.executeUpdate();
    }

}