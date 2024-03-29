
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class EmpleadoDao implements Dao{
    
public void listarPorDepartamneto(Connection con, String dname,JTextArea txtArea,JLabel label ) throws SQLException{
       int i=0;
    String resultado="";
    if(dname!=null){    
    String sql="Select apellido"
            + " from empleados"
            +" join departamentos on empleados.dept_no=departamentos.dept_no" 
            +" where departamentos.dnombre='"+dname+"'";
   
    Statement statement= con.createStatement();
    ResultSet resultSet=statement.executeQuery(sql);
 
    if(!resultSet.next()){
    resultado="Departamento Vacio";
    }
    while(resultSet.next()){
//        resultado+=String.format("%-3d%-5s%-5s%-5s%-5s%-5f%-5f%-3d\n", 
//                   resultSet.getInt("emp_no"),resultSet.getString("apellido"),resultSet.getString("oficio"),
//                   resultSet.getInt("dir"),resultSet.getDate("fecha_alt"),resultSet.getFloat("salario"),
//                   resultSet.getFloat("comision"),resultSet.getInt("dept_no")
//                );
    resultado+=resultSet.getString("apellido")+"\n";
    i++;
    }
        
    }else{
    resultado="Selecciona una opcion del selector";
    }
    txtArea.setText(resultado);
   label.setText(i+" empleados en el departamento");
}
    
    
}
