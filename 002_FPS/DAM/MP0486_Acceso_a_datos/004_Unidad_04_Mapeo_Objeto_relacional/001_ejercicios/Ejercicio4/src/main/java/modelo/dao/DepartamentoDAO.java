
package modelo.dao;


import javax.persistence.NoResultException;
import modelo.vo.Departamentos;
import modelo.vo.Empleados;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {

    public Departamentos buscarDepartamento(Session session, int dep_no) throws NoResultException{
        Departamentos d;
        String Sql="select d from Departamentos d where dept_no=:dep_no";
        Query q=session.createQuery(Sql);
        q.setParameter("dep_no", dep_no);
        d=((Departamentos)q.getSingleResult());
        return d;
    }

    public int insertarDepartamento(Session session, int dep_no, String dep_nombre, String dep_loc) throws HibernateException{
        try{
        session.save(new Departamentos(dep_no, dep_nombre, dep_loc));
        return 1;
        }catch(Exception e){
            return 0;
        }
        }

    public void borrarDepartamento(Session session, int dep_no) throws ConstraintViolationException{
      Departamentos d;  
      d=this.buscarDepartamento(session, dep_no);
      session.delete(d);
    }
    public void borrarDepartamentoEmpleados(Session session , int dep_no)throws ConstraintViolationException{
    Departamentos d=this.buscarDepartamento(session, dep_no);
    if(!d.getEmpleadosList().isEmpty()){
        int i=1;
    for(Empleados e:d.getEmpleadosList()){
        session.delete(e);
        System.out.println("Borrado el empleado nº "+i+" del departamento "+d.getDnombre());
    }
    }else{
        System.out.println("El departamento "+d.getDnombre()+"no tiene empleados");
    }
    session.delete(d);
    }
}
