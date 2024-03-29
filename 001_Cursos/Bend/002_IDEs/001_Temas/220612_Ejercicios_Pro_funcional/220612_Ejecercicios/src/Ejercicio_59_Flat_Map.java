import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio_59_Flat_Map {

	public static void main(String[] args) {
	
		
		
		List<String> nombres=new ArrayList<String>();
		String nom[]={"Alfonso","Cesar","Tomas","Alejandro","Manuel","mateo"};
		for(String nombre:nom) {
			nombres.add(nombre);
		}
		System.out.println(nombres);
		
System.out.println("\n");//***************************FlatMap************************************//
		nombres.stream()
		.flatMap(x->{	
		if(x.startsWith("A")) {
			return Stream.of(x.toLowerCase());
		}else if(x.startsWith("T")) {
			return Stream.of(x.toUpperCase());
		}
		return Stream.of(x);
		//return null;
		})
		.forEach(s->System.out.print(s+" "));
		
System.out.println("\n");System.out.println("\n");//***************************Map************************************//
	
	nombres.stream().map(x->{	
	if(x.startsWith("A")) {
		return (x.toLowerCase());
	}else if(x.startsWith("T")) {
		return (x.toUpperCase());
	}
	return x;
	//return "";
	})
	.forEach(s->System.out.print(s+" "));

}

}
