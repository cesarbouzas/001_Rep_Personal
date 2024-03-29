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


public class DepartamentoDAO {

    public ArrayList<Departamentos> listarAllDepartamentos(Session session) {
        ArrayList<Departamentos> departamentos = new ArrayList<Departamentos>();
        Departamentos d;
        String Sql="from Departamentos d";
        Query q=session.createQuery(Sql);
        
        Iterator it=q.list().iterator();
        
        while(it.hasNext()){
            departamentos.add((Departamentos)it.next());
        }
        return departamentos;
    }
    
}
