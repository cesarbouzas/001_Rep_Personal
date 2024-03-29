package Ejercicio_54_Nombres_distintos_j;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class Didtintos_J {
	
	
public static void main(String arags[]) {	
Stream<String> personas=Stream.of("PEPE","juAnjo","CESAR","MATEO","MANUEL","JUAN","NATIVIDAD","JAIMOLAS");	
		List<String> personasJ=personas
		.map(s->s=(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase()))
		.filter(s->s.startsWith("J")).collect(Collectors.toList());
		
		System.out.println(personasJ);

}
	
	

}
