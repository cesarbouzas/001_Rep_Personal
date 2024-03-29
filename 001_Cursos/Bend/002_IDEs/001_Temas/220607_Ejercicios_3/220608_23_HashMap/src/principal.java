import java.time.LocalDate;
import java.util.HashMap;


public class principal {

	public static HashMap pasarArrayHasMap(Object[] arr) {
		HashMap<Integer,Object> has=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
		has.put(i, arr[i]);
		}
		return has;
	} 
	
	
	public static void main(String[] args) {
		HashMap<Integer,Persona> personas=new HashMap<>(); 
		HashMap<String,String> capitales=new HashMap<>();
		//Creamos las Personas
		Persona p0=new Persona(32828547,"Natividad","Nunez","Conde",LocalDate.of(1974,5,18));
		Persona p1=new Persona(34896415,"Cesar","Bouzas","Soto",LocalDate.of(1977, 7, 4));
		Persona p2=new Persona(34896414,"Raquel","Bouzas","Soto",LocalDate.of(1976, 6, 2));
		Persona p3=new Persona(0001,"Manuel","Bouzas","nunez",LocalDate.of(2011, 12, 10));
		Persona p4=new Persona(0002,"Mateo","Bouzas","nunez",LocalDate.of(2017, 11, 02));
		//Las añadimos al HashMap
		
		Persona[] aux= {p0,p1,p3,p4};
		personas=pasarArrayHasMap(aux);
		System.out.print(personas);
		System.out.println("**********************borramos a Cesar y Raquel**************************");
		personas.remove(1);
		personas.remove(2,p2);
		System.out.println(personas);
	
	}
	}


