
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextArea;

import modelo.vo.Departamento;

/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {

    public Departamento buscarDepartamento(Connection conn, int dept_no) throws SQLException {
    Departamento dep=null;
        String sql="Select * from departamentos where dept_no="+dept_no;
    Statement st=conn.prepareStatement(sql);
    ResultSet tablaResultado=st.executeQuery(sql);
    while(tablaResultado.next()){
        dep=new Departamento(tablaResultado.getInt(1), tablaResultado.getString(2), tablaResultado.getString(3));
    }
    return dep;
    }

    public int InsertarDepartamento(Connection conn,Departamento dept) throws SQLException {
        String sql="Insert Into departamentos (dept_no,dnombre,loc) values(?,?,?)";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setInt(1, dept.getDept_no());
        ps.setString(2,dept.getDnombre());
        ps.setString(3, dept.getLoc());
       return  ps.executeUpdate();
        
    }

    public int borrarDepartamento(Connection conn, int numDept) throws SQLException {
    String sql="Delete from departamentos where dept_no=?";
    PreparedStatement ps=conn.prepareStatement(sql);
    ps.setInt(1, numDept);
     return ps.executeUpdate();
    }
    public int contarEmplados(Connection conn , int numDept) throws SQLException {
     String sql="Select count(*) from empleados where dept_no=?";
     PreparedStatement ps=conn.prepareStatement(sql);
     ps.setInt(1, numDept);
     ResultSet rs=ps.executeQuery();
     while(rs.next()){
     return  rs.getInt(1);
     }
     return 0;
     }

    public void listarTodosDepartamentos(Connection conn, JTextArea textAreaDepartamentos) throws SQLException {
        String Sql="Select * from departamentos";
        Statement s=conn.createStatement();
        ResultSet rS=s.executeQuery(Sql);
        textAreaDepartamentos.setText("");
        while(rS.next()){
                textAreaDepartamentos.append(rS.getInt(1)+"-->"+rS.getString(2)+"-->"+this.contarEmplados(conn,rS.getInt(1))+"\n");
            
        }}

    public int actualizarDepartamento(Connection conn, Departamento dep) throws SQLException {
        String sql="update departamentos set dnombre=?, loc=? where dept_no=?";
        PreparedStatement pS=conn.prepareStatement(sql);
        pS.setString(1, dep.getDnombre());
        pS.setString(2, dep.getLoc());
        pS.setInt(3, dep.getDept_no());
        return pS.executeUpdate();
    }
}
