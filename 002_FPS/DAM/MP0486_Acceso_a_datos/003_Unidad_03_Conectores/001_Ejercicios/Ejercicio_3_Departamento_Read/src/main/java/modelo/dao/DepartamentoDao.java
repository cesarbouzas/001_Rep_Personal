
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.vo.Departamento;

/**
 *
 * @author Usuario
 */
public class DepartamentoDao {

    public Departamento listarDepartamento(Connection con, int num) throws SQLException {
        Departamento dep=null;
        String sql="Select * from departamentos where dept_no="+num;
        Statement statement= con.createStatement();
        ResultSet rS= statement.executeQuery(sql);
        if(!rS.next()){
            return dep;
        }else{
            dep=new Departamento(rS.getInt("dept_no"),rS.getString("dnombre"),rS.getString("loc"));
            return dep;
        }
     
    }
    
    
    
}
