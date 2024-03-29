package Ejercicio_30_Excepcion_fichero;
import java.io.*;
public class Fichero {

	String nombreFichero="hola.txt";
	File f=new File(nombreFichero);
	
	public void accederFichero() {
	System.out.println((f.exists())?"El fichero "+f.getAbsolutePath()+" existe":"El fichero "+f.getAbsolutePath()+ " no existe");
	}
	public long lonFichero() {
		return f.length();
	}
	public void leer() {
		try {
		FileReader flE=new FileReader(nombreFichero);
		BufferedReader fE=new BufferedReader(flE);
		fE.readLine();
		}catch (Exception e) {
			System.out.println("Problemas al leer el fichero");
			e.getMessage();
		}
		
	}
	
	
	
	
}
