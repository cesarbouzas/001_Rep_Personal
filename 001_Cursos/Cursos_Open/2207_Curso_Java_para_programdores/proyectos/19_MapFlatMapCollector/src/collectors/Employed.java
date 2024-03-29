package collectors;

public class Employed {
	
	private String nombre;
	private double sueldo;
	private String departamento;
	
	
	public Employed(){}

	public Employed(String nombre,double sueldo,String departamento) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.departamento=departamento;
	}

	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public String getDepartamento() {
		return departamento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	



}
