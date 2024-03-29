package Ejercicio_40;

import java.util.Timer;
import java.util.TimerTask;

public class Comprador extends Thread {
	
	private Distribuidor distribuidor;
	private String nombre;
	private Coche cocheElegido=new Coche("Seat","malaga");
	public Comprador(Distribuidor d,String nombre) {
		this.distribuidor=d;
		this.nombre=nombre;
	}
	public Coche getCocheElegido() {
		return this.cocheElegido;
	} 
	public String getNombre() {	
	return this.nombre;
	}
	public void comprarCoche(Coche c) {
		System.out.println("Comprador "+this.nombre+" quiere un "+c);
		distribuidor.venderCoche(c);
		
	}
	
	
	Timer t=new Timer();
	public void run() {
	
		TimerTask tarea=new TimerTask() {
			public  void  run(){
			comprarCoche(cocheElegido);
		}
	};
	t.schedule(tarea,1000,1000);
	}
	
}