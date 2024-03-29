
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
public class DepartamentoDAO {

    public void cargarDepartamentos(Connection conn, JComboBox<Departamento> comboBoxDepartamentos) throws SQLException {
        
        String sql="Select * from departamentos";
        Statement sentencia=conn.createStatement();
        ResultSet rs=sentencia.executeQuery(sql);
        while(rs.next()){ 
        comboBoxDepartamentos.addItem(new Departamento(rs.getInt(1),rs.getString(2),rs.getString(3)));
        }
        
    }
    
}
