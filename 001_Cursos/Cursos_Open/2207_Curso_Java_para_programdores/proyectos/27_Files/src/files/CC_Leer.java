package files;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class CC_Leer {

	public static void main(String[] args) {
	
		Path p=Paths.get("FilesBB", "cesarcopia.txt");
		
		try {
			if(Files.exists(p)) {
			List<String> contenido=Files.readAllLines(p);
			Files.writeString(Paths.get("lecturaEscritura.txt"),contenido.stream().map(String::toUpperCase).collect(Collectors.joining()),StandardOpenOption.CREATE);
			System.out.println(contenido.stream().collect(Collectors.joining()));
			}else {
				System.out.println("El fichero no existe");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
