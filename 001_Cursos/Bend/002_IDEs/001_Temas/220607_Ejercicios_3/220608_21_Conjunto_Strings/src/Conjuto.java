
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Conjuto {
	
	public static void main (String args[]) {
		
		HashSet <String> palabras=new HashSet<>();
		palabras.add("Cesar");
		palabras.add("Pedro");
		palabras.add("Mateo");
		palabras.add("Manuel");
		palabras.add("Natividad");
		palabras.add("Raquel");
		System.out.println(palabras.add("Cesar"));//devuleve false ya existe Cesar
		System.out.println( palabras.contains("Cesar"));//devuleve true ya que contiene cesar
		System.out.println(palabras.add("Avion"));//devuleve true pues añade Avion
		palabras.add("Tractor");
		
		for(String s:palabras) {
			System.out.println(s+"hascode()->"+s.hashCode()+",");
			
		}
		
		
		
		ArrayList <String> listaPalabras=new ArrayList<>(palabras);
		Collections.sort(listaPalabras);
		System.out.println(listaPalabras);
		
		 
		palabras.clear();		//lo vacio
		System.out.println(palabras);//lo impimo vaion
		palabras.addAll(listaPalabras);//le meto todos las palabras ordenadas
		System.out.println(palabras);//NO las muestra ordenada por el calculo del hash de cada string vuelve a ser el mismo
		System.out.print("Mateo".hashCode());
	}
	
	
	
	
	

}
