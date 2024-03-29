/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.*;

/**
 *
 * @author Usuario
 */
@Data
@Entity
@Table(name = "empleados")
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_no")
    private Short empNo;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "oficio")
    private String oficio;
    @Column(name = "dir")
    private Short dir;
    @Column(name = "fecha_alt")
    @Temporal(TemporalType.DATE)
    private Date fechaAlt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salario")
    private Float salario;
    @Column(name = "comision")
    private Float comision;
    @JoinColumn(name = "dept_no", referencedColumnName = "dept_no")
    @ManyToOne(optional = false)
    private Departamentos departamentos;

    public Empleados() {
    }

    public Empleados(Short empNo) {
        this.empNo = empNo;
    }

   
    
}
