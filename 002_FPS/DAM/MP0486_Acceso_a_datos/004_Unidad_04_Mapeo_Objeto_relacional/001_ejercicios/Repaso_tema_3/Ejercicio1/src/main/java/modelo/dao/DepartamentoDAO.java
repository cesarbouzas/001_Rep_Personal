/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {

    public void cargarDatos(Connection conn, JTextArea jTextArea1) throws SQLException{
    String sql="Select * from departamentos";     
    Statement sentencia=conn.createStatement();
    ResultSet rS=sentencia.executeQuery(sql);
    while(rS.next()){
        jTextArea1.append(rS.getInt(1)+" "+rS.getString(2)+" "+rS.getString(3)+"\n");
    }    
      
    }
    
    
    
}
