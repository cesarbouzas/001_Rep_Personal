package Ejercicio_57_Sumar_valores;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import Ejercicio_00.Aleatorios;

public class Sumar_valores {
	
	BinaryOperator <Integer>sumar=(a,b)->a+b;
	
	public static void main(String args[]) {
		//*********************IntStream**************************//
		IntStream flujoEnteros1=IntStream.of(1,2,3,4,5);
		System.out.println("La suma mendiante IntStream es :"+flujoEnteros1.sum());
		
		//*******************Stream Normal************************//
		Stream<Integer> flujoEnteros0=Stream.of(1,2,3,4,5);
		int resultado=flujoEnteros0
		.reduce(0,(a,b)->a+b);///Como se pude hacer mediante referecnia a metodos???????
		System.out.println("La suma mediante un flujo normal es : "+resultado);
		
		//*******************Crear un Stream del 0 al 50************************//
		List<Integer> lista=IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
		
		String txt="{";
		for(int i=0;i<lista.size();i++) {
			txt+=lista.get(i)+ ((i<lista.size()-1)?",":"}");
		}
		System.out.println(txt);
	
		List<Integer> enteros=lista.stream().mapToInt(x->x)
				.map(x->(int)((Math.random()*(50-x))+x)).boxed().collect(Collectors.toList());
		
		enteros.stream().mapToInt(x->x).forEach(x->
			System.out.print(x+",")
		);
		int suma=enteros.stream().mapToInt(x->x).sum();
		Double avg=enteros.stream().mapToInt(x->x).average().getAsDouble();
		int max=enteros.stream().mapToInt(x->x).max().getAsInt();
		long contar=enteros.stream().mapToInt(x->x).count();
		OptionalInt min=enteros.stream().mapToInt(x->x).min();
		System.out.print("\nLa suma es :"+suma);
		System.out.print("\nEl máximo es :"+max);
		System.out.print("\nEl mínimo es :"+min);
		System.out.print("\nLa promedio es :"+avg);
		System.out.print("\nEl numero es :"+contar); 
		System.out.print("\nEl promedio x el numero :"+(avg*contar));				

}
}
