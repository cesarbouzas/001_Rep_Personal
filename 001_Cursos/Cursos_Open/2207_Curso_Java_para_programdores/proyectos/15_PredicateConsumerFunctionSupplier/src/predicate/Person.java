package predicate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public Person() {
	};

	public Person(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getEdad() {
		return -Period.between(LocalDate.now(), fechaNacimiento).getYears();	
		}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int hashCode() {
		int prime=31;
		int result=1;
		result=prime*result+((dni==null)?0:dni.hashCode());
		result=prime*result+((nombre==null)?0:nombre.hashCode());
		result=prime*result+((apellidos==null)?0:apellidos.hashCode());
		result=prime*result+((fechaNacimiento==null)?0:fechaNacimiento.hashCode());
		return result;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(apellidos, other.apellidos) 
				&& Objects.equals(dni, other.dni)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre);
	}
	public String  toString() {
		return"[dni ="+dni+",Nombre ="+nombre+",Apellidos ="+apellidos+",Fecha Nacimiento ="+fechaNacimiento+",edad ="+getEdad()+"]";
	}

	

}
