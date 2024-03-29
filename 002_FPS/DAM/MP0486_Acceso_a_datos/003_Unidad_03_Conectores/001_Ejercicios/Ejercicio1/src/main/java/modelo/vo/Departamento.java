
package modelo.vo;

/**
 *
 * @author Usuario
 */
public class Departamento {

    private int id;
    private String dname;
    private String loc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", dname=" + dname + ", loc=" + loc + '}';
    }

}
