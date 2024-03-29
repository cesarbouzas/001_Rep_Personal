
package es.cesar.primeraconexion;

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
public class R_Read_BD_SQL {

    static Connection crearConnection(String user, String ip, String password) throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://" + ip + ":3306/ejemplo", user, password);

    }

    public static void main(String[] args) {

        try {
            Connection conenction = crearConnection("cesar", "217.160.229.64", "cesar");
            System.out.println("Conexion creada");
            Statement sentencia = conenction.createStatement();
            String sql = "SELECT * FROM departamentos ";
            ResultSet resultado = sentencia.executeQuery(sql);
            ResultSetMetaData metadata = resultado.getMetaData();
            System.out.printf("%-10s%-30s%-10s\n", metadata.getColumnName(1), metadata.getColumnName(2), metadata.getColumnName(3));
            while (resultado.next()) {

                System.out.printf("%-10d%-30s%-10s\n", resultado.getInt(1), resultado.getString(2), resultado.getString(3));
            }
            resultado.close();
            sentencia.close();
            conenction.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
