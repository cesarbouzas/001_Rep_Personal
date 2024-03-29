package clases_Objeto;

import java.util.ArrayList;

import Servicios.GarajesService;
import Servicios.TecladoService;

public class CarreraEstandar extends Carrera{
	private  static  int duracion=180;

	
	public CarreraEstandar(ArrayList<Garaje> garajes) {
		
		super(garajes);
	}
	public CarreraEstandar(ArrayList<Garaje> garajes,int duracion) {
		super(garajes);
		this.duracion=duracion;
	}
	
	
	
	public void correrCoches() {
		for(int i=0;i<this.cochesInscritos.size();i++) {
			cochesInscritos.get(i).correrSimple(duracion);
		}
		
	}
	
	public void entreCochesDeUnGaraje() {
		System.out.println("****carrera entre cocoches*****");
		Garaje garaje=this.garajesInscritos.get(0);
		for(int i=0;i<garaje.cantidadCoches();i++) {
			this.cochesInscritos.add(garaje.getCoche(i));
		}
		this.correrCoches();
		
		System.out.println("+++++++carrera terminada+++++++++");
		for(int j=0;j<this.cochesInscritos.size();j++) {
			Coche coche=cochesInscritos.get(j);
			System.out.println(coche.getMarcaModelo()+" "+coche.getTacometro());
			
		}
		Podium p=new Podium(this.cochesInscritos);
		p.mostrar();
		
	}
	

}
