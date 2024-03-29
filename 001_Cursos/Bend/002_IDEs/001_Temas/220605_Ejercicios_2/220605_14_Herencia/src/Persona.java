
import java.time.LocalDate;
public class Persona {
	
	private int dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private LocalDate fechaNac;
	
	Persona(int dni,String nombre,String apellido1,String apellido2,LocalDate fNac){
		this.dni=dni;
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.fechaNac=fNac;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getFechaNac() {
		
		return "Fecha nacimeinto "+fechaNac.toString() +" era el día de la semana "+fechaNac.getDayOfWeek().toString();
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String toString() {
		String txt="++++++++++++++++++++++++\n";
		txt+="Dni:"+this.dni+"\n";
		txt+=("Nombre :"+this.nombre+"\n");
		txt+=("Apellidos :")+this.apellido1+" "+this.apellido2+"\n";
		txt+=(this.getFechaNac());
		return txt;
		
	}
}

