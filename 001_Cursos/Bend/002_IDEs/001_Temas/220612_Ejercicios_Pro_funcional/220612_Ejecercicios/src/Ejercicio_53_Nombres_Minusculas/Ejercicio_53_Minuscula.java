package Ejercicio_53_Nombres_Minusculas;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio_53_Minuscula {

	public static void main(String[] args) {
		
		Stream <String> nombres=Stream.of("cesar","manuel","mateo","nati");
		List<String> resultado=nombres
		.map(s->{s=s.substring(0, 1)+s.substring(1).toUpperCase();
		return s;
		}).
		peek(System.out::println)
		.map(s->{
			s=s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
			return s;
		})
//		.peek(System.out::println)
		.collect(Collectors.toList());
		
		
		System.out.println(resultado);
	
		

		
		
//		
//		List<String> lista=nombres
//		.map(s->
//		//{
//		s=s.substring(0, 1)+s.substring(1).toUpperCase()//;
//		//return s;
//		//}
//		)
//		.peek(System.out::println)
//		.map(s->
//		//{
//			s=s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase()//;
//		//return s;
//		//}
//		)
//		.peek(System.out::println).collect(Collectors.toList());
//		lista.forEach(s->System.out.println("***"+s));
		
	}

}
