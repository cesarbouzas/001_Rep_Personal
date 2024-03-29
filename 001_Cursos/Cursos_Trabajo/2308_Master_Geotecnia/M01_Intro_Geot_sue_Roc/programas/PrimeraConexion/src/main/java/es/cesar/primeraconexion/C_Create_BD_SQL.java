package es.cesar.primeraconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class C_Create_BD_SQL {
    
    static Connection crearConnection(String ip, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://" + ip + ":3306/ejemplo", user, password);
        return connection;
    }
    static boolean crearTabla(String tablaNombre,Connection con,String primaryKey,String ...parametros) throws SQLException{
     boolean isBD=false;
     String columnas=String.join(",", parametros);
     String sql="CREATE TABLE IF NOT EXISTS "+tablaNombre+"("+primaryKey+" AUTO_INCREMENT PRIMARY KEY,"+columnas+")";
        System.out.println(sql);
     Statement statement=con.createStatement();
     if(statement.executeUpdate(sql)==0){
         isBD=false;
         System.out.println("Tabla "+tablaNombre+" ya existe");
     }else if(statement.executeUpdate(sql)!=0){
         isBD=true;
         System.out.println("Tabla "+tablaNombre+ "creada con exito");
     }
     statement.close();
    return isBD;
    }
    public static void main(String args []){
       Connection connection;
        try {
            connection = crearConnection("217.160.229.64", "cesar", "cesar");
            crearTabla("Empleados", connection," emp_id INT(11)","nombre VARCHAR(255)" );
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
