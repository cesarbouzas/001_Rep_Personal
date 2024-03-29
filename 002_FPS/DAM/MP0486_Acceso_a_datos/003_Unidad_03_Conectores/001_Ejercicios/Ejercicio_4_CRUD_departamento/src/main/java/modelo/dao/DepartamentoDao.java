package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.vo.Departamento;


public class DepartamentoDao {
    
private static boolean buscarDep(Connection con,Departamento d) throws SQLException{
        boolean b=false;
       
        String sql = "select * from departamentos where dept_no=? or (dnombre=? and loc=?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1,d.getDept_no());
        statement.setString(2,d.getDnombre());
        statement.setString(3,d.getLoc());
        ResultSet rs = statement.executeQuery();
        b=rs.next();
        while(rs.next()){
            System.out.println(
            rs.getInt("dept_no")+
            rs.getString("dname")+
            rs.getString("loc"));
        }
        return b;
}
    public static Departamento buscarPorKey(Connection con ,int num) throws SQLException {
        Departamento d=null;
        String sql="select * from departamentos where dept_no = ?" ;
        PreparedStatement preparedStatement=con.prepareStatement(sql);
        preparedStatement.setInt(1, num);
        ResultSet rs= preparedStatement.executeQuery();
        while(rs.next()){
            d=new Departamento(rs.getInt(1), rs.getString(2),rs.getString(3));
        }
       return d;
    }
    
    public static boolean insertarDepartamento(Connection con, Departamento d) throws SQLException {
        boolean insertado =false;
        
        if (!buscarDep(con,d)) {
            System.out.println("Deatamneto no encontrado");
          String sql = "insert into departamentos(dept_no, dnombre, loc) values (?, ?, ?)";
                   PreparedStatement statement = con.prepareStatement(sql);
                    statement.setInt(1, d.getDept_no());
                    statement.setString(2,d.getDnombre());
                    statement.setString(3,d.getLoc());
                    statement.executeUpdate();  
                    insertado=true;
                
            }else{
                JOptionPane.showMessageDialog(null,"Nº deprtamento ya existe o nombre con misma loclaizacion ");
        }
        return insertado;
    }

    public static int borrarDepartamento(Connection con, Departamento d) throws SQLException {
        String sql="Delete from departamentos where (dept_no=?) and (dnombre=?) and (loc=?)";
        PreparedStatement preparedStatement=con.prepareStatement(sql);
        preparedStatement.setInt(1, d.getDept_no());
        preparedStatement.setString(2, d.getDnombre());
        preparedStatement.setString(3, d.getLoc());
         return preparedStatement.executeUpdate();
    }

public static  int modificarDepartamento(Connection con ,Departamento d,Departamento n) throws SQLException{
        String sql="update departamentos set dnombre=? , loc= ? where dept_no= ?";
        PreparedStatement preparedStatement=con.prepareStatement(sql);
        preparedStatement.setString(1, n.getDnombre());
        preparedStatement.setString(2, n.getLoc());
        preparedStatement.setInt(3, d.getDept_no());
         return preparedStatement.executeUpdate();
    }

}
