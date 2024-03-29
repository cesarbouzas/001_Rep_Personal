
package modelo;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Persona implements Serializable{
    private static int ID=0;
    private int id;
    private String nombre;
    private int edad;
    private double sueldo;

    public Persona(String nombre, int edad, double sueldo) {
        this.id=Persona.ID;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        Persona.ID++;
    }
      public Persona(int id,String nombre, int edad, double sueldo) {
        this.id=id;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        Persona.ID++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
}
