package Ejercicio_42;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Pantalla extends Thread {
	
	Thread hilo=new Thread();
	 public void run() {
		 for(int i=0;i<numeroAtomico)
		System.out.println("hola"+numeroAtomico);
	 }

	
	
	
	
	
	
	
	public static void main(String[] args) {
		AtomicInteger numeroAtomico=new AtomicInteger(0);
		Pantalla p=new Pantalla();
		Timer timier=new Timer();
		 TimerTask Tarea=new TimerTask() {
			 public void run() { 
				 p.run(numeroAtomico);
				 
			 }
		 	};

}
}