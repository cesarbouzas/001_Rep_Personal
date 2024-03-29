
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class EmpleadoDAO {

    public void mostrarEmpleados(Connection conn, int dept_no, JTextArea txtArea) throws SQLException {
        int i=0;
        String sql="Select * from empleados where dept_no= ? ";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, dept_no);
        ResultSet rs =ps.executeQuery();
        txtArea.setText("");
        while (rs.next()){
            i++;
            txtArea.append(i+")"+rs.getInt(1)+"-->"+rs.getString(2)+"\n");
        }
        if(i>0){
        txtArea.append("Total empleados: "+i);
        }else{
        txtArea.append("El departamento no tiene  empleados");
        }
        
        
        
       
    }
    
}
