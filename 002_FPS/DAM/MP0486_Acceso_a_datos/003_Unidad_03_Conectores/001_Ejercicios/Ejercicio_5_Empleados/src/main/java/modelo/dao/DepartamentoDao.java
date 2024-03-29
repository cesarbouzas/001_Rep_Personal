
package modelo.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import modelo.vo.Departamento;

/**
 *
 * @author Usuario
 */
public class DepartamentoDao {
    
   public static void listarDepartamentos(Connection con,JComboBox<Departamento> combo) throws SQLException{
        String sql="select * from departamentos";
        Statement statement=con.createStatement();
        ResultSet Rs=statement.executeQuery(sql) ;
        while(Rs.next()){
            Departamento d=new Departamento(Rs.getInt("dept_no"),Rs.getString("dnombre"),Rs.getString("loc"));
         combo.addItem(d);
            System.out.println(d);
        }
    }
}
