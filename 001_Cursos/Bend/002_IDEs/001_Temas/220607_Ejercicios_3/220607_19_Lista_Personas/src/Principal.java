import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author cesar
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p0=new Persona(32828547,"Natividad","Nunez","Conde",LocalDate.of(1974,5,18));
		Persona p1=new Persona(34896415,"Cesar","Bouzas","Soto",LocalDate.of(1977, 7, 4));
		Persona p2=new Persona(34896414,"Raquel","Bouzas","Soto",LocalDate.of(1976, 6, 2));
		Persona p3=new Persona(0001,"Manuel","Bouzas","nunez",LocalDate.of(2011, 12, 10));
		Persona p4=new Persona(0002,"Mateo","Bouzas","nunez",LocalDate.of(2017, 11, 02));
		
		//creacionde una lista

		ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
		listaPersonas.add(p0);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		
		for(Persona p:listaPersonas) {
			System.out.println(p);
		}
		
		
	}

}
