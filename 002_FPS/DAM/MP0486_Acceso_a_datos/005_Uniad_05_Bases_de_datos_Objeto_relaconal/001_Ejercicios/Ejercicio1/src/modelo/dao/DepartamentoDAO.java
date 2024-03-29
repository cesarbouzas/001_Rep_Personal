
package modelo.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import controlador.factory.controladorFactory;
import modelo.vo.Departamento;

public class DepartamentoDAO {

    public Departamento existeDepartamentoQBE(Departamento d) {
        ObjectSet result = controladorFactory.getBD().queryByExample(d);
        
        if (result.hasNext()) {
            return (Departamento)result.next();
        } else {
            return null;
        }
    }
    public String insertarDepartamento(Departamento d){
     if(existeDepartamentoQBE(d)==null){
         controladorFactory.getBD().store(d);
         return "Departamento "+ d.getNombre()+ " guardado";
     }else{
         return "no guardado";
     }   
    }     

    public ObjectSet<Departamento> listaTodosLosDepartamentos() {
        Query query= controladorFactory.getBD().query();
       query.constrain(Departamento.class);
       ObjectSet result=query.execute();
     return result;
    }

    public void modificarDepartamento(Departamento d) {
    controladorFactory.getBD().delete(d);
    }
        
    }
    
    
    
    
    

