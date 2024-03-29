
package modelo.vo;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import lombok.*;

/**
 *
 * @author Usuario
 */

@Data
public class Empleado {
    public int emp_no;
    public String apellido;
    public String oficio;
    public int dir;
    public Date fecha;
    public Departamento d;
    public float salario;
    public float comision;

    public Empleado() {
    }

    public Empleado(int emp_no) {
        this.emp_no = emp_no;
    }

    public Empleado(int emp_no, String apellido, String oficio, int dir, Departamento d, float salario) {
        this.emp_no = emp_no;
        this.apellido = apellido;
        this.oficio = oficio;
        this.dir = dir;
        this.d = d;
        this.salario = salario;
        this.fecha=Date.from(Instant.now());
        System.out.println(this.fecha);
        this.comision=0F;
        
    }
    
    
}
