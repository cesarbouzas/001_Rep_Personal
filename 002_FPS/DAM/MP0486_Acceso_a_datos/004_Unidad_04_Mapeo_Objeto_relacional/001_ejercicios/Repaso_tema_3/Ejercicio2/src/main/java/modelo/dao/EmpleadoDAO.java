/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import modelo.vo.Departamento;

/**
 *
 * @author Usuario
 */
public class EmpleadoDAO {

    public void ListarEmpleados(Connection conn, JTextArea textArea, Object selectedItem,JLabel nEmpleadoslabel) throws SQLException {
        String dname=((Departamento)selectedItem).getDnombre();
        int nEmpleados=0;
        String sql="Select *"
            + " from empleados"
            +" join departamentos on empleados.dept_no=departamentos.dept_no" 
            +" where departamentos.dnombre='"+dname+"'";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        textArea.setText("");
        while(rs.next()){
             nEmpleados++;
            textArea.append(nEmpleados+"--"+"Emp nº->  "+rs.getInt("emp_no")+"------- Apellido:  "+rs.getString("apellido")+"\n");
           
                    
        }
        if(nEmpleados==0){ 
            textArea.setText("El departamento no tiene empleados");
        }
        nEmpleadoslabel.setText("El departamento tiene "+nEmpleados+" empleados.");
        
    }
}
