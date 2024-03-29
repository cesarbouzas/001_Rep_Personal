package clases_Objeto;


import java.util.Comparator;

import Servicios.GarajesService;
import Servicios.TecladoService;

public class Coche implements Comparable<Coche> {
	private static final int VEL_MAX=110;
	private static final int ACELERACION=10;
	
	
	private String marca;
	private String modelo;
	private int velocidad;
	private double tacometro=0;
	private String garaje=null;
	
	public Coche (String marca,String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}
	public int getVelocidad() {
		return this.velocidad;
	}
	public String getMarcaModelo() {
		return this.marca+" "+this.modelo;
	}
	
	public double getTacometro() {
		return this.tacometro;
	}
	
	public String getGaraje() {
		return this.garaje;
	}
	

	
	

	

	
	public static void crearCocheTeclado() {
		if(GarajesService.numeroDeGarajes()!=0) {
			int nGaraje;
				do {
					System.out.println("Garajes exixtentes"+ GarajesService.getLista());
					System.out.println("Introduce nº garaje :");
					nGaraje=TecladoService.leerInt();
				}while(nGaraje+1>GarajesService.numeroDeGarajes());
				System.out.print("Introduce marca :");
				String marca=TecladoService.leerString();
				System.out.print("Introduce modelo :");
				String modelo=TecladoService.leerString();
				Coche c=new Coche(marca,modelo);	
				Garaje g= GarajesService.getGaraje(nGaraje);
				g.anadirCoche(c);
					
	}else {
		System.out.println("Añade garaje primero");
	}
	
	}
	
	public void setTacometro() {
		this.tacometro=this.getTacometro()+Math.round(this.velocidad*1000*(1.0/60.0));
	}
	
	
	public void setGaraje(String garaje) {
		if(this.garaje==null) {
			this.garaje=garaje;
		}else {
			System.out.println("no se pude registrar ya esta en el garaje"+this.getGaraje());
		}
	}
	

	
	private void acelerar() {
		if(this.velocidad==Coche.VEL_MAX) {
			this.velocidad=Coche.VEL_MAX;
		}else {
		this.velocidad+=Coche.ACELERACION;
		}
	}
	private void frenar() {
		if(this.velocidad==0) {
			this.velocidad=0;
		}else {
		this.velocidad-=Coche.ACELERACION;
		}
	}
	
	private void decidirAcelerarFrenar() {
		
		int decision=(int)((Math.random()*3));
		switch (decision) {
			case 1:
				this.frenar();
				break;
			case 2:
				this.acelerar();
				break;
			default:
				break;
		}
		this.setTacometro();
	
	}
	
	
	public void correr(int minutos) {
		for(int i=0;i<=minutos;i++) {
			this.decidirAcelerarFrenar();
			if(i%1==0||i==0) {
			System.out.print("\n"+this.getTacometro()+"m ,"+this.getVelocidad()+" km/h");
			}else {
			System.out.print(this.getTacometro()+",");
			}
		}
	}
	public void correrSimple(int minutos) {
		for(int i=0;i<=minutos;i++) {
			this.decidirAcelerarFrenar();
		}
	}
	@Override
	public String toString() {
		String txt="";
		//txt+=this.hashCode();
		txt+="Marca ="+this.marca +" Modelo ="+this.modelo;
		//txt+="\n Velocidad :"+this.velocidad;
		txt+=" Distacia (m) :"+this.getTacometro()+"\n";
		return txt;
	
	}
	
	
	public boolean equals(Coche c) {
	if(this.hashCode()==c.hashCode()) {
		System.out.println("El hascode :"+this.modelo+
			this.hashCode()+" es el mismo que el de "+c.modelo+":"+c.hashCode());
		return true;
	}
	if(this.getMarcaModelo().equalsIgnoreCase(c.getMarcaModelo())) {
		return true;
	};
	return false;
	}

	@Override
	public int compareTo(Coche o) {
		return (int) (o.tacometro-this.tacometro);
		
	}
}
