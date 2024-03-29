/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

/**
 *
 * @author Usuario
 */
public class Departamento {
    private int dep_id;
    private String dep_nombre;
    private String dep_location;

    @Override
    public String toString() {
        return "Departamento{" + "dep_id=" + dep_id + ", dep_nombre=" + dep_nombre + ", dep_location=" + dep_location + '}';
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_nombre() {
        return dep_nombre;
    }

    public void setDep_nombre(String dep_nombre) {
        this.dep_nombre = dep_nombre;
    }

    public String getDep_location() {
        return dep_location;
    }

    public void setDep_location(String dep_location) {
        this.dep_location = dep_location;
    }
    
    
}
