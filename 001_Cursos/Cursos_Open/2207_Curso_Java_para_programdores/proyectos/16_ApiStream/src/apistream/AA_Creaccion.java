package apistream;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AA_Creaccion {
	
	
	
	
	
//@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Stream <Integer> s1=Stream.of(1,2,3,4,5,6,7,8,9);
		
		IntStream s2=Arrays.stream(new int[] {1,2,3,4,5});
		
		Stream s3=Stream.empty() ;
		
		Stream is2=Stream.iterate(1, x->x+1).limit(20);
		
		Stream is3=Stream.iterate(1,x->x+2).limit(200);
		
		List<String> s=new ArrayList<>();
		s.add("hola");
		s.add("adios");
		s.stream().sorted()
				.forEach(x->System.out.print(x+" "));
		
		System.out.println("\n\n");
		
		Stream<String> s5=Arrays.asList("mi","madre","es","Antonia").stream();
		s5.forEach(t -> System.out.print(t+" "));
		
		System.out.println("\n\nParallel Stream\n\n");
		
		
		Stream<String> s6=Arrays.asList("mi","madre","es","Antonia").parallelStream();
		
		s6.forEach(t -> System.out.print(t+" "));
		
		
	
	}

}
