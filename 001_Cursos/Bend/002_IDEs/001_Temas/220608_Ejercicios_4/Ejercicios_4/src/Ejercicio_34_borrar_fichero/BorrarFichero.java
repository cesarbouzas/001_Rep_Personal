package Ejercicio_34_borrar_fichero;
import java.io.File;
public class BorrarFichero {

	
	
	public static void main(String[] args) {
		File f=new File("agenda.txt");
		if(f.exists()) {
			f.delete();
			System.out.println("fichero borrado");
			
		}else {
		System.out.println("fichero no existe");
		}
	}
}
