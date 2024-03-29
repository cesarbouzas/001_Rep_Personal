
package modelo.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.*;
/**
 *
 * @author Usuario
 */
@Data
@Entity
@Table(name = "departamentos")

public class Departamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dept_no")
    private Short deptNo;
    @Column(name = "dnombre")
    private String dnombre;
    @Column(name = "loc")
    private String loc;
    @OneToMany( mappedBy = "departamentos")
    private List<Empleados> empleadosList;

    public Departamentos() {
    }

    public Departamentos(Short deptNo) {
        this.deptNo = deptNo;
    }

 
    
}
