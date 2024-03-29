
package Ejercicio_36;

import  tools.*;

public class HiloExtends extends Thread {

HiloExtends(String nombre){
	super(nombre);
}	
	
public void run() {
	
	for(int i=0;i<4;i++) {
		Hilo.imprimir(this);
		if(i%2==0) {
			try {
				long milAle=(Hilo.miliAle(5, 10));
				System.out.println("El hilo "+getName()+" por ser salida par duerme :"+milAle/1000+" sg.");
				this.sleep(milAle);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		Thread principal=Thread.currentThread();
		principal.setName("Principal");
		HiloExtends hilo1=new HiloExtends("Hilo1");
		
		Hilo.imprimir(principal);
		
		long milAle=Hilo.miliAle(5, 10);
		System.out.println("El hilo "+principal.getName()+" duerme :"+milAle/1000+" sg.");
		
		principal.sleep(milAle);
		
		Hilo.imprimir(principal);
		Hilo.imprimir(hilo1);
		hilo1.start();
		
		
		
		
		
		
		
		
	}

}	
	