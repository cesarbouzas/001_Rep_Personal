
package modelo.dao;


import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.vo.Empleados;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Usuario
 */
public class EmpleadoDAO {
    
    public List<Empleados> buscarAllEmpleados(Session session ){
    return session.createQuery("select e from Empleados e").list(); 
    }
    

    public Empleados buscarEmpleado(Session session, int nEmp) {
     Empleados e=null;
     String c="select e from Empleados e where emp_no=:nEmp";
     Query q=session.createQuery(c);
     q.setParameter("nEmp", nEmp);
     return ((Empleados)q.uniqueResult());
    }
    public void insertarEmpleado(Session session,Empleados e) throws NonUniqueObjectException,SQLException{
        session.save(e);
    }
    public void borrarEmpleado(Session session, Empleados emp) {
      if(!isDirector(session, emp)){  
       session.delete(emp);
    }else{
          JOptionPane.showMessageDialog(null,"El empleado es director no se puede eliminar");
      }
    }
    public void modificarEmpleado(Session session, Empleados emp) {
       session.save(emp);
    }
    public boolean isDirector(Session session, Empleados emp){
    String sql="select e from Empleados e where dir=:emp_no";
    Query q=session.createSQLQuery(sql);
    q.setParameter("emp_no", emp.getDir());
    if(!q.getResultList().isEmpty()){
        return true;
    }else{
    return false;
    }
    } 
}
