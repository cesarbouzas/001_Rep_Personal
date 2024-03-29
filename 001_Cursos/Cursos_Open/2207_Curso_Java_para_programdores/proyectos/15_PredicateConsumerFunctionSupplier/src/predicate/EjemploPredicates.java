package predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EjemploPredicates {

	public static void main(String[] args) {
		List<Person> personas=new ArrayList<>();
		personas.add(new Person("34896415x","Cesar","Bouzas Soto",LocalDate.of(1977,7,27).plusDays(30)));
		personas.add(new Person("34896416y","Raquel","Bouzas Soto",LocalDate.of(1976,06,02)));
		personas.add(new Person("99999999z","Mateo","Bouzas Nunez",LocalDate.of(2017,11,02)));
		personas.add(new Person("99999999z","Manuel","Bouzas Nunez",LocalDate.of(2011,12,10)));
		
		
		personas.stream().forEach(x->System.out.println(x+" y naciste un "+x.getFechaNacimiento().getDayOfWeek()));
		
		personas.stream().filter(x->x.getEdad()>1).forEach(x->System.out.println(x.getNombre()));
		
		Predicate<Person> edad=(p)->p.getEdad()>5;
		Predicate<Person> nombre=(p)->p.getNombre().contains("e");
		Predicate<Person> complejo=edad.or(nombre);
		
		personas.stream().filter(complejo).forEach(x->System.out.println(x.getNombre()+" hashcode "+x.hashCode()));
		
		
		
	}

}
