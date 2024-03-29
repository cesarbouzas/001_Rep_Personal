package clases_Objeto;
import java.util.List;

import Servicios.MenuService;
import Servicios.TecladoService;

import java.util.ArrayList;

public class Carrera {
	private String nombre;
	protected ArrayList<Garaje> garajesInscritos=new ArrayList<>();
	protected ArrayList<Coche> cochesInscritos=new ArrayList<>();
	protected ArrayList <Coche> podio=new ArrayList<>(3);
	
	
	
	public Carrera(ArrayList<Garaje> garajes) {
	this.garajesInscritos=garajes;
	};
	
	public String getNombre() {
		return this.nombre;
	} 
	public ArrayList<Garaje> getGarajes(){
		return this.garajesInscritos;
	}
	public ArrayList<Coche> getcochesInscritos(){
		return this.cochesInscritos;
	}
	
	public void setNombre(String n) {
		this.nombre=n;
	}

	
	
}
