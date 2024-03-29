
package modelo.vo;

public class Departamento {
    
    private int id;
    private String dnombre ;
    private String loc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Departamento(int id, String dnombre, String loc) {
        this.id = id;
        this.dnombre = dnombre;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return dnombre;
    }
    
    
    
    
}
