/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import com.db4o.ObjectSet;
import controlador.factory.controladorFactory;
import modelo.vo.Empleado;


public class EmpleadoDAO {
    
    
    
    public  void insertarEmpleadoBD(Empleado e){
    controladorFactory.getBD().store(e);
        System.out.println("Empleado insertado en la BD");
    }

    public Empleado buscarEmpleado(int id) {
        Empleado e=new Empleado(id);
        ObjectSet<Empleado>  objetSet=controladorFactory.getBD().queryByExample(e);
        if(objetSet.hasNext()){
            return objetSet.next();
            
        }else{
            return null;
        }
    }

    public void borrarEmpleadoBd(Empleado emp) {
   controladorFactory.getBD().delete(emp);
        System.out.println("Empleado borrado de la BD");
    }

    public void modificarEmpleado(Empleado old,Empleado nuevo) {
      
        old.getD().getListaEmpleados().remove(old);
        nuevo.getD().getListaEmpleados().add(old);
        controladorFactory.getBD().delete(old);
        controladorFactory.getBD().store(nuevo);
        
    }
    
    
}
