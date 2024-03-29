package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExampleConusmer {

	
	static List<Integer> lista=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	static void imprimirLista (List<Integer> lista,Consumer<Integer> consumer) {
		lista.stream().forEach(consumer);
	}
	public static void main(String[] args) {
	
		
		Consumer<Integer> consumer=(x)->System.out.print(x);
//		lista.stream().forEach(consumer);
//		System.out.println("\n\n");
		Consumer<Integer> consumer2=consumer.andThen((x)->System.out.print("--> Hemos imprimido "+x));
//		lista.stream().forEach(consumer2);
//		System.out.println("\n\n");
		Consumer<Integer> consumer3=consumer2.andThen((x)->System.out.println("->increible estamos en la posicio "+(x-1)));
//		lista.stream().forEach(consumer3);
		
		imprimirLista(lista,consumer3);

	}
	
	

}
