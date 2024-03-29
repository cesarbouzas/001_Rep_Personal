/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;


import java.util.ArrayList;
import java.util.Iterator;
import modelo.vo.Departamentos;
import org.hibernate.Session;
import org.hibernate.query.Query;


/**
 *
 * @author Usuario
 */
public class DepartamentoDAO {

    public ArrayList<Departamentos> listarDepartamentos(Session s) {
        ArrayList<Departamentos> lista=new ArrayList<>();
        Departamentos d;
        String sql="from Departamentos d";
        Query q=s.createQuery(sql);
        Iterator it= q.list().iterator();
        while(it.hasNext()){
            lista.add((Departamentos)it.next());
        }
        return lista;
    }
    
}
