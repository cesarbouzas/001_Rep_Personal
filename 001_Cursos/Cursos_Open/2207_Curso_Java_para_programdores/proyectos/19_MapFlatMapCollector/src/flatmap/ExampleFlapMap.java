package flatmap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleFlapMap {
	
	public static void main(String[] args) {
		List<String> viajes= new ArrayList<String>(){
			{
			add("Portugal");
			add("Francia");
		}
		};
		
		Viajero v1=new Viajero("34896415x","Cesar","Bouzas Soto",LocalDate.of(1977,07,04),viajes);
		Viajero v2=new Viajero("99999999x","Natividad","nuñez conde",LocalDate.of(1974, 5, 18),viajes);
		Viajero v3=new Viajero("99999991x","Manuel","Bouzas Nuñez",LocalDate.of(2011,12,11),viajes);
		Viajero v4=new Viajero("99999992x","Mateo","Bouzas Nuñez",LocalDate.of(2017,11,02),viajes);
		
		
		
		
		List<Viajero> viajeros=new ArrayList<Viajero>() {
			{
				add(v1);
				add(v2);
				add(v3);
				add(v4);
				add(new Viajero("99999992x","anonimo","desconocido",LocalDate.of(1946,11,01)));
		}
		};
		
		v1.setViaje("Inglaterra");
		v2.setViaje("Inglaterra");
		v1.setViaje("Italia");
		v2.setViaje("Italia");

		viajeros.get(3).setDni("00000000000");
		v4.setDni("99999990x");
		
		for(int i=0;i<viajeros.size();i++) {
			System.out.println("El viajero "+viajeros.get(i).getNombre()+" ha viajado a :");
			for(int j=0;j<viajeros.get(i).getViajes().size();j++) {
				System.out.print(viajeros.get(i).getViajes().get(j)+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Entre todos los de la casa los pasises visitados son :");
		viajeros
		.stream()
		.map((Viajero v)->v.getViajes())
		.flatMap(x->x.stream())
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("Las personas que han visitado todos los paises son :");
		
		ArrayList<String> paisesVisitados=new ArrayList<String>(
		viajeros
		.stream()
		.map((Viajero v)->v.getViajes())
		.flatMap(x->x.stream())
		.distinct().toList()
		);
		
	
		viajeros
		.stream()
		.filter(v->v.getViajes().containsAll(paisesVisitados))
		.map(v->v.getNombre())
		.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
	}

}
