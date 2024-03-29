package files;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BB_CopyMoveDelete {

	public static void main(String[] args) {
		// Creamos una ruta para crear el fichero
		Path p = Paths.get("FilesBB");
		Path p2 = Paths.get("FilesBB", "cesar.txt");
		// Creamos el fichero
		if (Files.notExists(p)) {
			try {
				Files.createDirectories(p);
				Files.createFile(p2);
			} catch (IOException e) {
				System.out.println("Error de creaccion de fichero");
				e.printStackTrace();
			}
		}

		// abrimos un flujo para escribir
		try {
			BufferedWriter bw = Files.newBufferedWriter(p2);
			bw.write("este es un fichero creado por cesar desde Java");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Copiamos el fichero
		Path copia = Paths.get("files", "cesarcopia.txt");
		try {
			Files.copy(p2, copia, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Movemos el fichero
		try {
		Files.move(copia, Paths.get("FilesBB", "cesarcopia.txt"),StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e) {
		e.printStackTrace();}
		//Borramos el fichero
//		try {
//			Files.delete(Paths.get("FilesBB","cesarcopia.txt"));
//		}catch(IOException e){
//			e.printStackTrace();
//		}
	}
	}


