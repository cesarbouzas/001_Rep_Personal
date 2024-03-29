package es.cesar.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.ResourceUtils;

import es.cesar.model.Film;

public class UtilFilmReader {
	
	public static List<Film> fileReader(String path,String separadorCSV,String separadorCategorias){
	List<Film> resultado=new ArrayList<>();
	//// @formatter:off
		try {
			resultado=Files.lines(Paths.get(ResourceUtils.getFile( path).toURI()))
			.skip(1)
			.map(line->{ 
				String values[]=line.split(separadorCSV);
				return new Film(Long.parseLong(values[0]),values[1],values[2],
						Arrays.asList(values[3].split(separadorCategorias)));
			})
			.collect(Collectors.toList());
		} catch (IOException e) {
			System.err.println("Error de lectura de fichero datos");
			System.exit(-1);
		}
	// @formatter:on

	
	return resultado;
}
}