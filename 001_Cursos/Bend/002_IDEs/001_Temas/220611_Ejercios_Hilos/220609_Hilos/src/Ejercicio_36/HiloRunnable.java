
package Ejercicio_36;

import tools.*;

public class HiloRunnable implements Runnable{
	


public void run() {
		
	for(int i=0;i<4;i++) {
		Hilo.imprimir(this);
		if(i%2==0) {
			try {
				long milAle=(Hilo.miliAle(5, 10));
				System.out.println("El hilo "+Thread.currentThread().getName() +
						" por ser salida par  duerme :"+milAle/1000+" sg.");
				Thread.currentThread().sleep(milAle);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}	
public static void main(String args[]) {
		Thread principal=Thread.currentThread();
		principal.setName("Principal");
		Hilo.imprimir(principal);
		Thread hilo1=new Thread(new HiloRunnable(),"1");
		Hilo.imprimir(hilo1);
		hilo1.start();
		Hilo.imprimir(principal);
	
	
}

}
		
		
	


