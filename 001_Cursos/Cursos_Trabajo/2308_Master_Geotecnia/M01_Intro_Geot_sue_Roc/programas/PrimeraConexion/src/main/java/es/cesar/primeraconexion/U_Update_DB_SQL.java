
package es.cesar.primeraconexion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Usuario
 */
public class U_Update_DB_SQL {



    static Connection crearConnection(String user, String ip, String password){
       try{ 
        String url="jdbc:mysql://"+ip+":3306/ejemplo";
        Connection connection= DriverManager.getConnection(url, user, password);
         System.out.println("Conexion creada correectamente con: "+url);
        return connection;
       }catch(SQLException ex){
           ex.printStackTrace();
       }
       return null;
    }

    static String tablaToStrig(Statement statement, String table) {
        // La interfaz Statement proporciona métodos para ejecutar instrucciones SQL y obtener resultados. 
        String contenidoTabla = "";
        String sql = "SELECT * FROM " + table;
        try (
                ResultSet resultSet = statement.executeQuery(sql);) {
            ResultSetMetaData metadat = resultSet.getMetaData();

            contenidoTabla += String.format("%-10s%-30s%-10s\n",
                    metadat.getColumnName(1), metadat.getColumnName(2), metadat.getColumnName(3));
            while (resultSet.next()) {
                contenidoTabla += String.format("%-10d%-30s%-10s\n",
                        resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.print(contenidoTabla);
        return contenidoTabla;
    }

    public static void escribirStringEnFichero(String str, File f) {
        try {
            if (!f.exists()) {
                f.getParentFile().mkdirs();
                f.createNewFile();
            } 
            try (
                    OutputStreamWriter oSW = new FileWriter(f); 
                    BufferedWriter bW = new BufferedWriter(oSW);) {
                    bW.write(str);
                    bW.close();
                    oSW.close();
                    System.out.println("Escritura en fichero correcta");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                } catch (IOException ex) {
                    ex.getStackTrace();
        }
        
    }
    public static void introducirDepartamneto(Statement statement, String nombre,String localizacion){
        int filasAfectadas;
        try{
        filasAfectadas=statement.executeUpdate("INSERT INTO departamentos(dep_nombre,dep_localizacion) values('"+nombre+"','"+localizacion+"')");
        if(filasAfectadas==1){
            System.out.println("Registro guardado");
        }else{
            System.out.println("Error de guardado");
        }    
        }catch(SQLException ex){
        ex.printStackTrace();
        }
    }
    public static void main(String args[]) {
        File f = new File("./src/main/resources/departamentos.txt");
        String tabla="";
        try (
            Connection conexion = crearConnection("cesar", "217.160.229.64", "cesar"); 
            Statement sentencia = conexion.createStatement();
            ) {
            tabla=tablaToStrig(sentencia,"departamentos");
            escribirStringEnFichero(tabla, f);
            introducirDepartamneto(sentencia,"Topografia64","DTG");
          
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
