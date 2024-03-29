
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import modelo.vo.Departamento;


public class DepartamentoDao implements Dao{

    public void listarTodo(Connection con, JTextArea textArea) throws SQLException {
      
        String sql="Select * from departamentos";
        String resultado="";
        Statement statemen= con.createStatement();
        ResultSet resultSet=statemen.executeQuery(sql);
        while (resultSet.next()){
          resultado+=String.format("%-4d%-20s%-20s\n",
                  resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
        }
        textArea.setText(resultado);
    }
    public void listarNombres(Connection con, JComboBox<Departamento> opciones) throws SQLException{
       
        String sql="select * from departamentos ";
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
        opciones.addItem(new Departamento(resultSet.getInt("dept_no"),resultSet.getString("dnombre"),resultSet.getString("loc")));
        
        }
    
          
    }
    
}
