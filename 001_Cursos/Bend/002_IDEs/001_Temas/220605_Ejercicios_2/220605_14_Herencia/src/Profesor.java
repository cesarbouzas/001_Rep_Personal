import java.time.LocalDate;

public class Profesor extends Persona {
	private String colegio;
	private String materia;
	private final static  int NOMINA=1999;
	
	

	public Profesor(int dni, String nombre, String apellido1, String apellido2, LocalDate fNac,String colegio,String materia) {
		super(dni, nombre, apellido1, apellido2, fNac);
		this.colegio=colegio;
		this.materia=materia;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public static int getNomina() {
		return NOMINA;
	}
	

}
