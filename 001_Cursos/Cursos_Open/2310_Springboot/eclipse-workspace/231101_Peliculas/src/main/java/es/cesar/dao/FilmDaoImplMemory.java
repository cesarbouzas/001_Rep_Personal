package es.cesar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.cesar.config.AppConfig;
import es.cesar.model.Film;


@Repository
public class FilmDaoImplMemory implements FilmDao {
	
	public List<Film> peliculas=new ArrayList<>();

	@Autowired
	private AppConfig configuracion;
	
	@PostConstruct
	public void init() {	
		peliculas=UtilFilmReader.fileReader(configuracion.getFile(),configuracion.getCsvSeparador(), configuracion.getListSeparador());
	}
	@Override
	public Film findByid(Long id) {
		// @formatter:off
		Optional<Film> result=peliculas
		.stream()
		.filter(film->film.getId()==id)
		.findFirst();
		return result.orElse(null);
		// @formatter:on
	}

	@Override
	public Collection<Film> findAll() {

		return peliculas;
	}

	@Override
	public void insertarFilm(Film film) {
		if(this.findByid(film.getId())==null) {
		peliculas.add(film)	;
		}else {
		System.out.println("Pelicula con Id repetido");	
		}

	}
	
	private int indexOf(Film film) {
		int index;
		Film filmEncontrada=this.findByid(film.getId());
		if(filmEncontrada!=null &&filmEncontrada.getTitle()==film.getTitle()) {
			index=peliculas.indexOf(film);
		}else {
			index=-1;
		}
		
		return index;
	}
	private int indexOf(long id) {
		int index=0;
		boolean find=false;
		while(!find && peliculas.size()>index) {
			if(peliculas.get(index).getId()==id) {
				find=true;
			}else {
				index++;
			}
		}
		return (find) ? index:-1;
	}

	@Override
	public void editarFil(Film film) {
		int index=peliculas.indexOf(film);
		if(index!=-1) {
			peliculas.set(index, film);
		}

	}

	@Override
	public void borrar(long id) {
		int index=peliculas.indexOf(id);
		if(index != -1) {
			peliculas.remove(index);
		};

	}

}
