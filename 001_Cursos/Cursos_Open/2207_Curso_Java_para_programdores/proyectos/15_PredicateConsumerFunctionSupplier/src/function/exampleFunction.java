package function;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class exampleFunction {

	public static void main(String[] args) {
	
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("12345678A", "Pepe", "P�rez P�rez", LocalDate.of(1990, 1, 1)));
		personas.add(new Persona("12345678A", "Mar�a", "L�pez Almagro", LocalDate.of(1996, 4, 21)));
		personas.add(new Persona("12345678A", "Mart�n", "Casillas Cuenca", LocalDate.of(1991, 12, 12)));
		personas.add(new Persona("sssssssssa", "Pepe", "P�rez suarez", LocalDate.of(1990, 1, 1)));
	
	Function<Persona,String> mapeo1=(Persona)->Persona.getNombre();
	Function<String,Integer> mapeo2=(String)->String.hashCode();

	
	personas.stream().map(mapeo1.andThen(mapeo2)).forEach(System.out::println);
	
	
	System.out.println("\n\n*************************");
	List<String> listadoNombres=new ArrayList<>();
	for(Persona p:personas) {
		listadoNombres.add(mapeo1.apply(p));
	}
	for(String s:listadoNombres) {
		System.out.println(s);
	}
	}
	

}
