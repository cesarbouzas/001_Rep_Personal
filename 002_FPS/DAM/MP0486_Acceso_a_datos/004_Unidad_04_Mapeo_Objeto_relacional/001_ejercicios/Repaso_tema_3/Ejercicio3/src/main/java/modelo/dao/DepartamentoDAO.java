/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.vo.Departamento;

/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {

    public Departamento buscarDepartamento(Connection conn, JTextField deptText) throws SQLException {
        int dept_no=Integer.parseInt(deptText.getText());
        Departamento dept;
        String sql="Select * from departamentos where dept_no="+dept_no;
        Statement st=conn.createStatement();
        ResultSet rs= st.executeQuery(sql);
        if(rs.next()){
            dept=new Departamento(rs.getInt(1),rs.getString(2),rs.getString(3));
            return dept;
        }else{
            
            JOptionPane.showMessageDialog(null,"El departamento no esta en la Bd");
          
        }
        return null;
    }
    
    
}
