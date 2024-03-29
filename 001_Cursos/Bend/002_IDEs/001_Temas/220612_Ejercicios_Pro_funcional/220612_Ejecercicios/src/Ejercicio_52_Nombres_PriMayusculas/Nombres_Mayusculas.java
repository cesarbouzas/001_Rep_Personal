package Ejercicio_52_Nombres_PriMayusculas;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;

public class Nombres_Mayusculas {
	public static void main(String[] args) {
		AtomicInteger contador=new AtomicInteger();
		
		List<String> nombres= Arrays.asList("MANUEL","CESAR","MATEO","NATIVIDAD");
		int  tam=nombres.toArray().length;
		
		
		Stream<String> stream=nombres.stream().map(s->{
				s=s.toLowerCase();
				s=s.substring(0, 1).toUpperCase()+ s.substring(1);
						return s;
		}).peek(s->{
			
			if(contador.get()==0) {
				s="["+s+", ";
			}else if(contador.get()==tam-1) {
				s=s+"]";
			}else {
				s=s+", ";
			}
			System.out.print(s);
			contador.set(contador.get()+1);
			
		});
		List <String> resultado=stream.collect(Collectors.toList());
		System.out.println("\n"+resultado);
	}
}
