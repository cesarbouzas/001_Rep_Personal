package flatmap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viajero extends Person {

	private List<String> viajes=new ArrayList<>();
	
	Viajero(){}
	
	Viajero(String dni,String nombre,String apellidos, LocalDate fechaNac){
		super(dni,nombre,apellidos,fechaNac);
	}
	Viajero(String dni,String nombre,String apellidos, LocalDate fechaNac,List<String> viajes){
		this(dni,nombre,apellidos,fechaNac);
		this.viajes.addAll(viajes);
	}
	public void setViaje(String viaje) {
		this.viajes.add(viaje);
	}
	public List<String> getViajes(){
		return viajes;
	}
	
}
