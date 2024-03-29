package nuevos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persona  {
	int altura;
	int peso;
	String nombre;
	
	Persona(int altura,int peso,String nombre ){
		this.altura=altura;
		this.peso=peso;
		this.nombre=nombre;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public static void main(String[] args) {
		List <Persona> personas = new ArrayList<>() ;
		personas.add(new Persona(180,80,"Cesar"));
		personas.add(new Persona(150,50,"Nati"));
		personas.add(new Persona(140, 30, "Manuel"));
		personas.add(new Persona(100, 19, "Mateo"));
		
		Comparator ordenPersonas=new Comparator<Persona>(){
			public int compare(Persona p1,Persona p2) {
				return p2.altura-p1.altura;
			}
		};
		Comparator ordenPersonasNombre=new Comparator<Persona>(){
			public int compare(Persona p1,Persona p2) {
				return p1.getNombre().compareTo(p2.getNombre());
			}
		};
		personas.sort(ordenPersonas);
		personas.forEach(x->System.out.print(x.getNombre()+" "));
		personas.sort(ordenPersonas.reversed());
		System.out.println("\n\n");
		personas.forEach(x->System.out.print(x.getNombre()+" "));
		System.out.println("\n\n");
		personas.sort(ordenPersonasNombre);
		personas.forEach(x->System.out.print(x.getNombre()+" "));
		personas.sort(ordenPersonasNombre.reversed());
		System.out.println("\n\n");
		personas.forEach(x->System.out.print(x.getNombre()+" "));
	}



	
	

}
