package Ejercicio_40;

public class Principal {
	
	
	public static void main(String[] args) throws InterruptedException {
		Distribuidor d1=new Distribuidor("CesarCars.sl", 10);
		Fabricante fabrica=new Fabricante("Seat",d1);
		Comprador pardillo1=new Comprador(d1,"Pardillo1");
		fabrica.start();

		pardillo1.start();
		d1.run();
	}
 
}
