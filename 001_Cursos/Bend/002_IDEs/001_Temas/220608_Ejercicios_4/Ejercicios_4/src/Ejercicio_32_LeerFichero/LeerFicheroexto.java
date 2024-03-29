package Ejercicio_32_LeerFichero;
import java.io.*;
public class LeerFicheroexto {



public static void main(String[] args) {
	String contenido="";

	try {
	FileReader flujo =new FileReader("Agenda.txt");
	BufferedReader filtro=new BufferedReader(flujo);
	
	while(contenido!= null) {
		contenido=filtro.readLine();
		if(contenido!=null) {
			int pos=contenido.indexOf(",");
			String nombre=contenido.substring(0, pos);
			String telefono=contenido.substring(pos+1);
			System.out.print("nombre :"+nombre);
			System.out.println(" Telefono: "+telefono);
		
		}
	}
	filtro.close();
	
	}catch (IOException e) {
		System.out.println("error de fichero");
	}
	
	
}




}
