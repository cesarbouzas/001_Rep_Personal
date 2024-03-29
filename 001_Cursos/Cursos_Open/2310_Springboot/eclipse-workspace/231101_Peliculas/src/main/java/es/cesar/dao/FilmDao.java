package es.cesar.dao;

import java.util.Collection;

import es.cesar.model.Film;

public interface FilmDao {
	
	
	public Film findByid(Long id);
	public Collection<Film> findAll();
	public void insertarFilm(Film film);
	public void editarFil(Film film);
	public void borrar(long id);
	
	

}
