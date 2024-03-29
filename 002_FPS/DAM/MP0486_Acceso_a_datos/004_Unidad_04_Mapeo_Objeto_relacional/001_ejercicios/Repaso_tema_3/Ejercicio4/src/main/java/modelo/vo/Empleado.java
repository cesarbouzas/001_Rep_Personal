
package modelo.vo;

import java.sql.Date;

public class Empleado {
private int emp_no;  
private String apellido;
private String oficio ; 
private int dir;
private Date fecha_alt;
private float salario; 
private float acomision; 
private int dept_no;

    public Empleado(int emp_no, String apellido, String oficio, int dir, Date fecha_alt, float salario, float acomision, int dept_no) {
        this.emp_no = emp_no;
        this.apellido = apellido;
        this.oficio = oficio;
        this.dir = dir;
        this.fecha_alt = fecha_alt;
        this.salario = salario;
        this.acomision = acomision;
        this.dept_no = dept_no;
    }




    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public Date getFecha_alt() {
        return fecha_alt;
    }

    public void setFecha_alt(Date fecha_alt) {
        this.fecha_alt = fecha_alt;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getAcomision() {
        return acomision;
    }

    public void setAcomision(float acomision) {
        this.acomision = acomision;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }
    
}
