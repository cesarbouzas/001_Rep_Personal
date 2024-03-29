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
public class DepartamentoDao implements Dao{


    public void listarTodo(Connection con,JTextArea txtArea) throws SQLException {
        String sql="Select * from departamentos";
        String result="";
        Statement st=con.createStatement();
        ResultSet resultSet= st.executeQuery(sql);
        while(resultSet.next()){
            result+=String.format("%-4d,%-20s%-20s\n",resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
        }
        txtArea.setText(result);
    }

    
}
