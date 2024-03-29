import java.time.LocalDate;

public class Doctor extends Persona {
	private String especialidad;
	private String hospital;
	private static int NOMINA=3500;
	
	Doctor(int dni, String nombre, String apellido1, String apellido2, LocalDate fNac,String especialidad,String hospital) {
		super(dni, nombre, apellido1, apellido2, fNac);
		this.especialidad=especialidad;
		this.hospital=hospital;
		
	}
	
	

}
