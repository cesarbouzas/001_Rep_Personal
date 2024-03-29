package es.cesar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.cesar.model.Film;
import es.cesar.service.FilmQueryService;
import es.cesar.service.FilmService;

@Component
public class MovieAdvisorRunApp {
	
	@Autowired
	private FilmService filmService;
	@Autowired
	private FilmQueryService filmQueryService;
	@Autowired
	private MovieAdvisorHelp help;
	
	public void run(String[] args) {
		
		if(args.length < 1) {
			System.out.println("error de Sintaxis");
			System.out.println(help.getHelp());
		}else if(args.length==1){
			switch(args[0].toLowerCase()){
				case "-lg":
					System.out.println("Seleccionado todos los generos");
					filmService.findAllGenres().forEach(System.out::println);
					break;
				case "-h":
					System.out.println(help.getHelp());
					break;
				default:
					System.out.println("Error de sintaxis");
					System.out.println(help.getHelp());
				
			}
		}else if(args.length % 2  != 0) {
			System.out.println("Error de sintaxis");
			System.out.println(help.getHelp());
		}else if(args.length>8) {
			System.out.println("Error de sintaxis");
			System.out.println(help.getHelp());
		}else {
			List<String[]> argumentos=new ArrayList<>();
			for(int i=0;i<args.length;i+=2) {
				argumentos.add(new String[] {args[i],args[i+1]});
			}
			boolean error = false;

			for (String[] argumento : argumentos) {
				switch (argumento[0].toLowerCase()) {
				case "-ag":
					filmQueryService.anyGenre(argumento[1].split(","));
					break;
				case "-tg":
					filmQueryService.allGenres(argumento[1].split(","));
					break;
				case "-y":
					filmQueryService.year(argumento[1]);
					break;
				case "-b":
					String[] years = argumento[1].split(",");
					filmQueryService.betweenYear(years[0], years[1]);
					break;
				case "-t":
					filmQueryService.titleContains(argumento[1]);
					break;
				default: error = true;
						 System.out.println("Error de sintaxis");
						 System.out.println(help.getHelp());
				}

			}
			if(!error) {
				Collection<Film> result=filmQueryService.exec();
				System.out.printf("%s\t%-50s\t%s\t%s\n","ID","Titulo","Año","Géneros");
				if(result!=null) {
					result.forEach(f->System.out.printf("%s\t%-50s\t%s\t%s\n",
							f.getId(),f.getTitle(),f.getYear(),f.getGenres().stream().collect(Collectors.joining(","))
							));
				}else {
					System.out.println("no tenemos peliculas con los criterios buscados");
				}
			}
			
		}
			
			
		}
	
	}

