
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.vo.Departamento;

/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {
    
    
    

    public static Departamento buscarDepartamento(Connection conn, int dept_no) throws SQLException {
       String sql="Select * from departamentos where dept_no=?";
        PreparedStatement pS=conn.prepareStatement(sql);
        pS.setInt(1, dept_no);
        ResultSet rS=pS.executeQuery();
        while(rS.next()){
        return new Departamento(dept_no, rS.getString(2), rS.getString(3));
        }
        return null;
    }

    public static ArrayList<Departamento> obtenerAllDepartamentos(Connection conn) throws SQLException {
        
        String sql="Select * from departamentos ";
        Statement sT=conn.createStatement();
        ResultSet rS=sT.executeQuery(sql);
        ArrayList<Departamento> departamentos=new ArrayList<Departamento>();
        while(rS.next()){
            departamentos.add(new Departamento(rS.getInt(1),rS.getString(2),rS.getString(3)));
        }
        return departamentos;
}
}