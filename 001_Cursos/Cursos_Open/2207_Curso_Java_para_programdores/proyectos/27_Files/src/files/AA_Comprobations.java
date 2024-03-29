package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AA_Comprobations extends A_Comprobaciones {

	public static void main(String[] args) {
	
		Path p=Paths.get("file.txt");
		System.out.println(p.toAbsolutePath());
		
		if(Files.notExists(p)) {
			System.out.println("La ruta no existe");
			try {
			Files.createFile(p);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else if(Files.exists(p)){
			System.out.println("La ruta si existe");
		} 
		
		if(Files.isRegularFile(p)) {
			System.out.println("El fichero"+p.toAbsolutePath()+" es un fichero regular");
		}
		Path p2=Paths.get("file.txt");
		try {
		if(Files.isSameFile(p, p2)) {
			System.out.println("Si , son el mismo archivo");
		}else {
			System.out.println("No son el mismo archivo");
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
