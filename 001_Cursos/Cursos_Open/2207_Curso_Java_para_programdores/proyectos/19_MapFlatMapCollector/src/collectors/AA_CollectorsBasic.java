package collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AA_CollectorsBasic {

	public static void main (String args[]) {
		
		Random r=new Random();
		List<Integer> numeros= r.ints(1, 1000).limit(20).boxed().toList();
		
		System.out.println("*************Mostrar los numeros*************\n" 
		+ numeros.toString());

		System.out.println("*************Contar los numeros*************\n" 
		+ numeros
		.stream()
		.collect(Collectors.counting()));

		System.out.println("*************Sumar los numeros*************\n"
		+ numeros
		.stream()
		.collect(Collectors.summingInt(x -> x.intValue())));
		System.out.println("*************Calular el maximo los numeros*************\n"+
				numeros
				.stream()
				.collect(Collectors.maxBy(Comparator.naturalOrder())));
		System.out.println("*************Calular el mínimo los números*************\n"+
				numeros
				.stream()
				.collect(Collectors.minBy(Comparator.naturalOrder())));
		System.out.println("*************Calular el media los números*************\n"+
				numeros
				.stream()
				.collect(Collectors.averagingInt(x -> x.intValue())));
		System.out.println("*************Calular el resumen*************\n"+
				numeros
				.stream()
				.collect(Collectors.summarizingInt(x->x.intValue())));
		System.out.println("*************String de los numeros*************\n"+
				numeros
				.stream()
				.sorted()
				.map(x->x+"")
				.collect(Collectors.joining(",")));
		
	}
	
	
}
