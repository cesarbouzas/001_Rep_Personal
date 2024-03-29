package Ejercicio_00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ciudades_empieza_por_C {

	public static void main(String[] args) {
	
	long ultimo;	
	List<String> ciudades=Arrays.asList("Coruña","Lugo","Vigo","cadiz","Cordoba");
	//Scream cuya letra empieza por C
	Stream<String> stream=ciudades.stream().filter(s->s.charAt(0)=='C').peek(
			s->{
				System.out.print(s+" ");
				System.out.println(s.length());
			}
			
			);
			
	
	List<String>resultado=stream.collect(Collectors.toList());
	System.out.println("\n"+resultado);
	

	}

}
