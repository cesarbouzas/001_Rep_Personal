package Servicios;

import java.util.ArrayList;

import clases_Objeto.Garaje;


public abstract class GarajesService {

private static ArrayList<Garaje> listaGarajes=new ArrayList<>();
		
public static void addGaraje(Garaje g) {
	 listaGarajes.add(g);
}
public static void removeGaraje(int g) {
	 listaGarajes.remove(g);
}
public static Garaje getGaraje(int i) {
	return listaGarajes.get(i);
}
public static boolean isGaraje(Garaje g) {
	for(Garaje ga:listaGarajes) {
		if(ga.compareTo(g)) {
			return true;
		}
	}
	return false;
}

public static String getLista(){
	String txt="{";
	for(int i=0;i<listaGarajes.size();i++) { 
		
		if(i<(listaGarajes.size()-1)){
			txt+="["+i+"]"+listaGarajes.get(i).getNombre()+",";
		}else {
				txt+="["+i+"]"+listaGarajes.get(i).getNombre();
			}
		}
	return txt+"}";
}
public static int numeroDeGarajes() {
	return listaGarajes.size();
}
public static Garaje elegirGaraje() {
int nGaraje;
	System.out.println(getLista());
	do {
		System.out.println("Introduce numero de Garaje :");
		nGaraje=TecladoService.leerInt();
	}while(nGaraje+1>GarajesService.getLista().length());
	return GarajesService.getGaraje(nGaraje);

}
public static ArrayList<Garaje> unGaraje(){
	Garaje garaje=GarajesService.elegirGaraje();
	ArrayList<Garaje> listaGarajes=new ArrayList<>();
	listaGarajes.add(garaje);
	return listaGarajes;
}

}
