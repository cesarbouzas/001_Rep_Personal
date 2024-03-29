/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.vo.Departamentos;
import modelo.vo.Empleados;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class EmpleadoDAO {

    public List<Empleados> listarEmpleadosDepartemnto(Session session, Departamentos d) {
        
    
        return d.getEmpleadosList();
    }
    
}
