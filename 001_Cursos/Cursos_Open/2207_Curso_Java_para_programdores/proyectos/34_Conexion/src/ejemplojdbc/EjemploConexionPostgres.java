package ejemplojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EjemploConexionPostgres {
	
	public static void main(String args[]) {
		Connection con=null;
		Properties props=new Properties();
		props.put("user", "Backend_2022_G3");
		props.put("password", "quei1Okai3eeGieboo");
		//ip 45.84.210.174 port 65432
		
		try {
			con = DriverManager.getConnection("jdbc:postgresql://45.84.210.174:65432/Backend_2022_G3",props);
		
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("show tables");
			boolean hayFilas=false;
				while(rs.next()) {
					hayFilas=true;
					System.out.println(rs.getInt(1));
				}
			if(!hayFilas) {
				System.out.println("no hay resultados para mostrar");
			}
			rs.close();
			st.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
