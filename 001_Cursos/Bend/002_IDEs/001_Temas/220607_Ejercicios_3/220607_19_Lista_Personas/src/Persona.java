import java.time.*;
import java.time.temporal.ChronoUnit;


/**
 * @author cesar
 *
 */
public class Persona {
	
	private int dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private LocalDate fNac;
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param fNac
	 */
	Persona(int dni,String nombre,String apellido1,String apellido2,LocalDate fNac){
		this.dni=dni;
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.fNac=fNac;
	}

	/**
	 * @return el dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni el dni a establecer
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * @param apellido1 el apellido1 a establecer
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * @return el apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @param apellido2 el apellido2 a establecer
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * @return el fNac
	 */
	public LocalDate getfNac() {
		return fNac;
	}

	/**
	 * @param fNac el fNac a establecer
	 */
	public void setfNac(LocalDate fNac) {
		this.fNac = fNac;
	}
	public int edad() {
		int anos;
		LocalDate hoy=LocalDate.now();
		LocalDate cumpleEsteAno=LocalDate.of(hoy.getYear(), this.getfNac().getMonthValue(), this.fNac.getDayOfMonth());
		long diasAlDElCumple=ChronoUnit.DAYS.between(hoy, cumpleEsteAno);
		if(diasAlDElCumple>0) {
			anos=hoy.getYear()-fNac.getYear()-1;
			System.out.println("Faltan "+diasAlDElCumple+" para tu cumple de los " +anos+1+" años");
		}else if(diasAlDElCumple==0){
			anos=hoy.getYear()-fNac.getYear();
			System.out.println ("Felicdades hoy es tu cumple de los "+anos);
		}else {
			anos=hoy.getYear()-fNac.getYear();
			System.out.println ("Han pasado "+Math.abs(diasAlDElCumple)+" desde tu cumple de los " +anos+" años");
		}		
		return anos;
	}
	public  String calcularEdad() {
		int anos;
		LocalDate hoy=LocalDate.now();
		LocalDate cumpleEsteAno=LocalDate.of(hoy.getYear(), this.getfNac().getMonthValue(), this.fNac.getDayOfMonth());
		long diasAlDElCumple=ChronoUnit.DAYS.between(hoy, cumpleEsteAno);
		
		if(diasAlDElCumple>0) {
			anos=hoy.getYear()-fNac.getYear()-1;
			return("Faltan "+diasAlDElCumple+" para tu cumple de los " +anos+1+" años");
		}else if(diasAlDElCumple==0){
			anos=hoy.getYear()-fNac.getYear();
			return ("Felicdades hoy es tu cumple de los "+anos);
		}else {
			anos=hoy.getYear()-fNac.getYear();
			return ("Han pasado "+Math.abs(diasAlDElCumple)+" desde tu cumple de los " +anos+" años");
		}			
		
	}

	
public String toString() {
	String txt="*******"+Object.class+"*******\n";
			txt+="DNI : "+this.getDni()+" .\n";
			txt+="Nombre :"+this.getNombre()+" .\n";
			txt+="Apellido1 :"+this.getApellido1()+" .\n";
			txt+="Apellido2 :"+this.getApellido2()+" .\n";
			txt+="Fecha de nacimiento :"+fNac.toString()+" era un "+fNac.getDayOfWeek()+" .\n";
			txt+="Tu edad es de "+this.edad()+" ";
			//txt+=this.calcularEdad();
			
return txt;
}

}
