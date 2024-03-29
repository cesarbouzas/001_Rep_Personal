package curso.clases;

public class UsuarioXML {
	
	private String nif;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String asignatura;
	
	public UsuarioXML() {}
	
	public UsuarioXML(String nif,String nombre,String apellidos,String fechaNacimiento,String asignatura) {
		this.nif=nif;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.asignatura=asignatura;
	}
	public String getNif() {
		return this.nif;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public String getAsignatura() {
		return this.asignatura;
	}
	
	public void setNif(String nif) {
		this.nif=nif;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura=asignatura;
	}
	

}
