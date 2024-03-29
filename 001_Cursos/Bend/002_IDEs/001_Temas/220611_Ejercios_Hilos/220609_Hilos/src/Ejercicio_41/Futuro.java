package Ejercicio_41;
import java.util.*;


public class Futuro extends Thread{
	
	String[] frases={"Tio ¿Que pone en el mio?",
			"Mola! ¿Que pone le mio?"};
	
	
public void run() {
	f.notify();
	System.out.println(frases[(int)(Math.random()*frases.length)]);
	
		
		
	}
	
	
	
	
public static void main (String[] args) throws Exception {
Timer t=new Timer();
Futuro f=new Futuro();
f.start();


TimerTask tarea=new TimerTask(){
	public void run() {
f.wait();

		
	
		
	}
};
t.schedule(tarea,2000,1000);

}
}
