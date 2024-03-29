import java.time.LocalDate;
public class Policia extends Persona  {
	private String comisaria;
	private int distrito;
	private final static int NOMINA=2200; 
	
	Policia(int dni, String nombre, String apellido1, String apellido2, LocalDate fNac,String comisaria,int distrito) {
		super(dni, nombre, apellido1, apellido2, fNac);
		this.comisaria=comisaria;
		this.distrito=distrito;
	}
	public String getComisaria() {
		return comisaria;
	}
	public void setComisaria(String comisaria) {
		this.comisaria = comisaria;
	}
	public int getDistrito() {
		return distrito;
	}
	public void setDistrito(int distrito) {
		this.distrito = distrito;
	}
	public static int getNomina() {
		return NOMINA;
	}
	public String toString() {
		String txt="******************\n";
		txt+="Dni:"+this.getDni()+"\n";
		txt+=("Nombre :"+this.getNombre()+"\n");
		txt+=("Apellidos :")+this.getApellido1()+" "+this.getApellido2()+"\n";
		txt+=(this.getFechaNac()+"\n");
		txt+=("Trabaja en la comisaria :"+this.getComisaria()+"\n");
		txt+=("En el distrito "+this.getDistrito()+"\n");
		txt+=("Cobra un sueldo de "+Policia.getNomina());
		return txt;
		
	}
}
