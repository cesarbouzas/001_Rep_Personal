package es.cesar.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cesar.dao.FilmDao;
import es.cesar.model.Film;
@Service
public class FilmQueryServiceImpl implements FilmQueryService {
	@Autowired
	private FilmDao dao;
	
	private Predicate<Film> predicate;
	
	@PostConstruct
	public void init() {
		predicate=null;
	}
	
	@Override
	public Collection<Film> exec() {
		return dao.findAll()
				.stream()
				.filter(predicate)
				.collect(Collectors.toList());
	}

	@Override
	public FilmQueryService anyGenre(String... genres) {
		Predicate<Film> pAnyGenre=
		(film->Arrays.stream(genres).anyMatch(film.getGenres()::contains));
		predicate=(predicate==null) ?pAnyGenre:predicate.and(pAnyGenre);
		return this;
	}

	@Override
	public FilmQueryService allGenres(String... genres) {
	Predicate<Film> pAllGenres=
			(film->Arrays.stream(genres).allMatch(film.getGenres()::contains));
	
	predicate=(predicate==null) ? pAllGenres: predicate.and(pAllGenres);
	return this;
	}
	@Override
	public FilmQueryService year(String year) {
		Predicate<Film> pYear=
				(film->film.getYear().equalsIgnoreCase(year));
		predicate=(predicate==null)?pYear:predicate.and(pYear);
		return this;
	}

	@Override
	public FilmQueryService betweenYear(String from, String to) {
		int toInt=Integer.valueOf(to);
		int fromInt=Integer.valueOf(from);
		Predicate<Film> pBetweenYear=
				(film->Integer.valueOf(film.getYear())>=fromInt&&Integer.valueOf(film.getYear())<=toInt); 
		predicate=(predicate==null)?pBetweenYear:predicate.and(pBetweenYear);
		return this;
	}

	@Override
	public FilmQueryService titleContains(String title) {
		Predicate<Film> ptitlecontains=
				(film->film.getTitle().toLowerCase().contains(title.toLowerCase()));
				predicate=(predicate==null) ?ptitlecontains:predicate.and(ptitlecontains);
				return this;
	}

}