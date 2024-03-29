/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import modelo.vo.Departamentos;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {

    public Departamentos buscarDepartamento(Session s, int dep_no) {
       Departamentos d=null;
        String sql="select d from Departamentos d where dept_no=:dep_no";
        Query q=s.createQuery(sql);
        q.setParameter("dep_no", dep_no);
        d=((Departamentos)q.uniqueResult());
        return d;
    }
    
}
