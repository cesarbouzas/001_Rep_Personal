package Ejercicio_39;

import tools.Hilo;

public class Coche implements Runnable{
	private String marca;
	private String modelo;
	
	Coche(String marca,String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public void run() {
		try {
			Thread.currentThread().sleep(2000);
			System.out.print("{"+this.marca+",");
			Thread.currentThread().sleep(1000);
			System.out.println(this.modelo+"}");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		};
		
	}
public static void main(String[] args) throws Exception {
	
	Coche c1=new Coche("Nissan","Xtrial");
	Coche c2=new Coche("Renault","Amorticed 2.0dci");
	Coche c3=new Coche("Tractor","Tornado");
	Thread hilo1=new Thread(c1,"1");
	Thread hilo2=new Thread(c2,"2");
	Thread hilo3=new Thread(c3,"3");
	
	hilo1.start();
	hilo1.join();
	hilo2.start();
	hilo2.join();
	hilo3.start();
	
}	

}
