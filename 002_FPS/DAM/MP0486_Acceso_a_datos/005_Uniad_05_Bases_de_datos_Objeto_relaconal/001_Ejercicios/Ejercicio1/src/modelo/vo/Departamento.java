
package modelo.vo;


import java.util.ArrayList;
import lombok.*;

/**
 *
 * @author Usuario
 */

@Data
public class Departamento {
    
    private String nombre;
    private String loc;
    private int id;
    private ArrayList<Empleado> listaEmpleados=new ArrayList<>();


    public Departamento(){};
    
    public Departamento(int dept_no){
        this.id=dept_no;
       
    }
    
    public Departamento(int dept_no,String dnombre,String loc){
    this.id=dept_no;
    this.nombre=dnombre;
    this.loc=loc;
    }
    public void insertarEmpleadoDepartamento(Empleado e){
        
      if(!listaEmpleados.contains(e)){
          listaEmpleados.add(e);
          
      }
        
    }
    public void borrarEmpleadoDepartamento(Empleado e){
        if(listaEmpleados.contains(e)){
            listaEmpleados.remove(e);
            System.out.println("Empleado borrado del departamento "+this.nombre);
        }else{
            System.out.println("Empleado no borrado");
        }
    }
    @Override
    public String toString(){
        return this.id+" : "+this.nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    

    
            
                    
    
}
