package clases;

public class Usuario {
	private String nombre;
	private String email;
	private String fechaNacimiento;
	private String pais;
	private String notificaciones;
	
	public Usuario(String nombre, String email, String fechaNacimiento, String pais, String notificaciones) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.pais = pais;
		this.notificaciones = notificaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNotificaciones() {
		return notificaciones;
	}
	public void setNotificaciones(String notificaciones) {
		this.notificaciones = notificaciones;
	}
}
