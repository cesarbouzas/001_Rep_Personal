import java.util.LinkedList;
import java.util.Collections;
public class Principal {
	
	public static void main(String[] args) {	
		LinkedList <String> palabras=new LinkedList<>();
		palabras.add("hola");
		palabras.add("buenos");
		palabras.add("dias");
		palabras.add("Hola");
		palabras.add("dias");
		palabras.add("Buenos");
		System.out.println(palabras);
		Collections.sort(palabras);//primero las maysculas
		System.out.println(palabras);
		palabras.addFirst("primero");
		palabras.addLast("ultimo");
		System.out.println(palabras);
		palabras.removeFirst();
		palabras.removeLast();
		System.out.println(palabras);
			}
	}
	
