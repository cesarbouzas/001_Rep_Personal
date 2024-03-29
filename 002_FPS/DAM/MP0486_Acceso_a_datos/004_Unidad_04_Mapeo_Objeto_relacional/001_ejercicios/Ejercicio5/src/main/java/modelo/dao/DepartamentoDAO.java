/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;


import java.util.List;
import modelo.vo.Departamentos;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {

    public List<Departamentos> buscarTodosDepartamentos(Session session) {
       String sql="from Departamentos d";
       Query q=session.createQuery(sql);
       return q.list();
    }
    
}
