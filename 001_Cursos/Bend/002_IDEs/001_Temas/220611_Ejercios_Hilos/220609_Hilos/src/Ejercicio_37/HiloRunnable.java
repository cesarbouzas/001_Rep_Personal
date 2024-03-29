
package Ejercicio_37;
import tools.*;
public class HiloRunnable implements Runnable{

	
	public void run() {
		
		for(int i=0;i<5;i++) {
		if(Thread.currentThread().getName().equals(Integer.toString(i,0))) {
			System.out.println(Thread.currentThread().getName()+
			" dice :Como la iteraccion " +i+
			" coincide con el nombre del hilo los tractores vuelan");
			Hilo.imprimir(this);
		}else if(i%2==0){
			
			System.out.println(Thread.currentThread().getName()+
					" dice :Carlos odia java pero Cesar solo los Hilos");
		}else {
			System.out.println(Thread.currentThread().getName()+
					" dice Tomar cafe es bueno para descansar del Telegram");
		}
		}
		}
		
	
	
	
	
public static void main(String[] args) throws Exception {
	
	Thread principal=Thread.currentThread();
	principal.setName("principal");
	Thread hilo1=new Thread(new HiloRunnable(),"1");
	Thread hilo2=new Thread(new HiloRunnable(),"2");
	Thread hilo3=new Thread(new HiloRunnable(),"3");
	Hilo.imprimir(principal);
	hilo1.setPriority(1);
	hilo2.setPriority(2);
	hilo3.setPriority(10);
	hilo3.start();
	hilo2.start();
	hilo1.start();
	


	
	
	
}
}
