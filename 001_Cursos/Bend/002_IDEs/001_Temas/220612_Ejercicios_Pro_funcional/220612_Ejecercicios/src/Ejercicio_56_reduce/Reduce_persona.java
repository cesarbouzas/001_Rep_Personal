package Ejercicio_56_reduce;

import java.util.stream.Stream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce_persona {
	
	public static void main(String args[]) {
	
		Stream<String> nombresPersona=Stream.of("cesar","natividad","pedro","manuel","cesar","pedro","mateo" , "mateo");
		String texto=nombresPersona
		.distinct()
		.reduce("",(s,a)->{
		s+=a.substring(0,1).toUpperCase()+a.substring(1);
		s+="--->Longitud de :"+a.length()+"\n";
		return s;})
		;
		System.out.println(texto);

		
	}

}
