package clases;

public class UsuarioXML {
	private String nif;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String asignatura;
	
	//Constructor vacío para la clase UsuarioXML
	public UsuarioXML() {
		
	}
	
	//Constructor para la clase UsuarioXML
	public UsuarioXML(String nif, String nombre, String apellidos, String fechaNacimiento, String asignatura) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.asignatura = asignatura;
	}
	
	//Metodos getters y setters
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
}
