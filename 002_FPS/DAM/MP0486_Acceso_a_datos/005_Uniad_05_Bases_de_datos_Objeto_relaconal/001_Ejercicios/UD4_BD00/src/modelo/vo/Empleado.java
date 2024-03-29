/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;
/**
 *
 * @author acceso a datos
 */
@Data
@Entity
@Table (name = "empleados")
public class Empleado implements Serializable{
    @Id
    @Column (name ="emp_no")
    private int id;
    @Column (name ="apellido")
    private String apellido;
    @Column (name ="oficio")
    private String oficio;
    @Column (name ="dir")
    private Integer director; //como puede ser null no puede ser int, debe ser Integer
    @Column (name ="salario")
    private double salario;
    @Column (name ="fecha_alt")
    private Date fechaalta;
    @Column (name ="comision")
    private Double comision;
    @JoinColumn(name = "dept_no",referencedColumnName = "dept_no")
    @ManyToOne(fetch = FetchType.EAGER)
    private Departamento departamento;
    
    public Empleado() {
    }

    public Empleado(int id, String apellido, String oficio,Integer dir,double sal,Departamento departamento) {
        this.id = id;
        this.apellido = apellido;
        this.oficio=oficio;
        this.director=dir;
        this.fechaalta=Date.valueOf(LocalDate.now());
        this.salario=sal;
        this.comision=null;
        this.departamento = departamento;
    }

    
}
