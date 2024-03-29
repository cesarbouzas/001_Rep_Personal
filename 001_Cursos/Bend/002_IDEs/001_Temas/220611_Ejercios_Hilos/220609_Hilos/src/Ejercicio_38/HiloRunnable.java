package Ejercicio_38;

import tools.Hilo;

public class HiloRunnable implements Runnable{
	public void run() {
		for(int i=0 ;i<3;i++) {
		Hilo.imprimir(Thread.currentThread());

		}			
	}

	public static void main(String[] args) throws Exception {
		Thread hilo1=new Thread(new HiloRunnable(),"1");
		Thread hilo2=new Thread(new HiloRunnable(),"2");
		Thread hilo3=new Thread(new HiloRunnable(),"3");
		hilo3.setPriority(6);
		Thread principal=Thread.currentThread();
		principal.setName("principal");

		hilo1.start();
		hilo1.join();
		hilo2.start();
		//hilo2.join();
		hilo3.start();
		Hilo.imprimir(principal);

	}


}

