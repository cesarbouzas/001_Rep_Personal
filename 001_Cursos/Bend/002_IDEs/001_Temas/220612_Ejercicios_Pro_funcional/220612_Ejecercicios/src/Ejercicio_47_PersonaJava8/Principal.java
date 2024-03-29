package Ejercicio_47_PersonaJava8;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;
public class Principal {

	public static void main(String[] args) {
		PersonaJava8 p1=new PersonaJava8("Cesar","Bouzas Soto");
		PersonaJava8 p2=new PersonaJava8("Natividad","Nuñez Conde");
		PersonaJava8 p3=new PersonaJava8("Manuel","Bouzas Nuñez");
		PersonaJava8 p4=new PersonaJava8("Mateo","Bouzas Nuñez");
		PersonaJava8 p5=new PersonaJava8("Pedro","Flying Tractor");
		ArrayList<PersonaJava8> personas=new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		System.out.println("****************Cambiamos nombre Consumer<String,String>******************");
		BiConsumer<PersonaJava8,String> cambiarNombre=(persona,nombre)->{
			System.out.println("Cambiamos el nombre.....");
			persona.setNombre(nombre);
			};
		
			
		Consumer<PersonaJava8> imprimirNombre=persona->System.out.println("El nombre de la persona es "+persona.getNombre()+".");
		imprimirNombre.accept(p5);
		cambiarNombre.accept(p5, "IceMan");
		imprimirNombre.accept(p5);
		System.out.println("****************Imprimir String Consumer******************");
		Consumer <String> imprimir=palabra->System.out.println(palabra);		
		for(PersonaJava8 p:personas) {
			 imprimirNombre.accept(p);
			 imprimir.accept(p.getApellidos());
		 }	
		System.out.println("****************Aleatorio BiFuction<min,max,result>******************");
		BiFunction<Integer,Integer,Integer> numAletorio=(min,max)->{return(int)(Math.round(Math.random()*(max-min))+min);};
		int suma=0;
		for(int i=0;i<1000;i++) {
			int num=numAletorio.apply(10, 9);
			suma+=num;
			System.out.print(num+",");
			if(i%40==0 && i!=0) {System.out.print("\n");}
		}
		System.out.println("\nEl promedio de todos estos numeros es "+suma/(1000));
		
		System.out.println("****************SUPPLIER salida Persaonajava8******************");
		Supplier<PersonaJava8> crearPerosna=()->{return new PersonaJava8();};
		PersonaJava8 p6=crearPerosna.get();
		imprimirNombre.accept(p6);
		imprimir.accept(p6.getApellidos());
	}
}
