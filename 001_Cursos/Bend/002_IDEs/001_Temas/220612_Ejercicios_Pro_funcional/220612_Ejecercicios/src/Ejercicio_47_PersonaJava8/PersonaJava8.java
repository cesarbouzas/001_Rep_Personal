package Ejercicio_47_PersonaJava8;

public class PersonaJava8 {
	private String nombre;
	private String apellidos;
	
	public PersonaJava8(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	public PersonaJava8() {
		this.nombre="No_definido";
		this.apellidos="No_definido";
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}

}
