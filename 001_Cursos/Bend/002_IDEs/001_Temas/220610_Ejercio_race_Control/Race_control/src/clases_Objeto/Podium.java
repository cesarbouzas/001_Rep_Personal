package clases_Objeto;

import java.util.ArrayList;
import java.util.Collections;


public class Podium {
	private ArrayList<Coche> resultados;
	
	public Podium(ArrayList <Coche> r) {
		resultados=r;
	}	
		
	public void mostrar() {
	Collections.sort(resultados);
	System.out.println(resultados.subList(0,3));
	
	}
}
	

