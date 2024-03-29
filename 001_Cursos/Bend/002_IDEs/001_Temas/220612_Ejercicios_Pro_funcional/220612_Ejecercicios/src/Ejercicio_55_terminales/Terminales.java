package Ejercicio_55_terminales;

import java.util.List;
import java.util.stream.Stream;

public class Terminales {

	public static void main(String[] args) {

		
		Stream <String> nombres=Stream.of("CESAR","MANUEL","LOLO","LOLQ");
		
//		boolean  empeizanporM=nombres
//		.map(s->s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase())
//		.anyMatch(s->s.startsWith("M"));
		
//		System.out.println("Alguna de los nombres empieza por L ? "+empeizanporM);
		
		boolean  masde5Letras=nombres
		.peek(s->System.out.println(s+"  "))
		.map(s->s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase()).peek(System.out::println)
		.allMatch(s->s.length()>=4);
		
	
		System.out.println("Todos los nombres son mayores o iguales a 4 letras ? "+ masde5Letras);
	}

}
