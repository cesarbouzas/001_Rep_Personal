package es.cesar.service;

import java.util.Collection;

import es.cesar.model.Film;

public interface FilmQueryService {
	
	//patron builder
	
	public Collection<Film> exec();
	public FilmQueryService anyGenre(String... genres);
	public FilmQueryService allGenres(String... genres);
	public FilmQueryService year(String year);
	public FilmQueryService betweenYear(String from,String to);
	public FilmQueryService titleContains(String title);
	

}
