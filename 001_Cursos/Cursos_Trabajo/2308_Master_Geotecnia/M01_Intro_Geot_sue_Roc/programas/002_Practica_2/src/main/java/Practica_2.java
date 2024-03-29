
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Usuario
 */
public class Practica_2 {

    public static Connection crearConnection(String ip,String user,String password){
        String url;
        Connection connection;
           try{
         url="jdbc:mysql//"+ip+":3306/ejemplo";
         connection=DriverManager.getConnection(url,user,password);
          return connection;
        }catch (SQLException ex){
            ex.printStackTrace();
             return null;
        }
       
}

    public static void main(String[] args) {
        
        Connection c=crearConnection("217.160.229.64","cesar","cesar");
        
        
        try {
            c.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

} 

}