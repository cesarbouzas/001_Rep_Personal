/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;
/**
 *
 * @author acceso a datos
 */
@Data
@Entity
@Table (name = "departamentos")
public class Departamento implements Serializable{
    
    @Id
    @Column (name ="dept_no")
    private int id;
    @Column (name ="dnombre")
    private String nombre;
    @Column (name ="loc")
    private String loc;
    @OneToMany(mappedBy = "departamento",fetch=FetchType.LAZY)
    private List<Empleado> listaEmpleados=new ArrayList<>();

    public Departamento() {
    }

    public Departamento(int id, String nombre, String loc) {
        this.id = id;
        this.nombre = nombre;
        this.loc = loc;
    }

    public Departamento(int id) {
        this.id = id;
    }

    
    @Override 
    public String toString(){
         return this.nombre;
     }

    
}
