package Ejercicio_33_escribir_fichero;
import java.io.*;
import java.util.*;
public class Escribirfichero {
	
public static void main(String [] args) {
	String nombre;
	Scanner sc=new Scanner(System.in);
	try {
		FileWriter flujoEscritura=new FileWriter("agenda.txt");	
		BufferedWriter filtro=new BufferedWriter(flujoEscritura);
		do {
			System.out.println("Introduce un nombre (intro para terminar):<<");
			nombre=sc.nextLine();
			if(nombre.length()>0) {
				System.out.println("Telefono :");
				String telefono=sc.nextLine();
				filtro.write(nombre+","+telefono);
				filtro.newLine();
			}
		}while(nombre.length()>0);
		filtro.close();
	}catch (IOException e) {
		System.out.println("Error de fichero");
	}

}
}
