package Ejercicio_51_Stream;
import java.util.stream.Stream;
public class CrearStram {

	public static void main(String[] args) {

		Stream<String> nombres= Stream.of("Cesar","Nati","mateo","manuel");
		nombres.forEach(n->System.out.println(n));
		
		//nombres.forEach(System.out::println);
	}

}
