package es.cesar.Dao;

public class Persona {
	private String name;
	private String firsName;
	private String lastName;
	private String dni;
	private String bornYear;
	
	
	public Persona(String name, String firsName, String lastName, String dni, String bornYear) {
	
		this.name = name;
		this.firsName = firsName;
		this.lastName = lastName;
		this.dni = dni;
		this.bornYear = bornYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getBornYear() {
		return bornYear;
	}
	public void setBornYear(String bornYear) {
		this.bornYear = bornYear;
	}
	
	

}