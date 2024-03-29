package _Ejemplo_bloqueo_hilos;

public class HiloCadena extends Thread {
	String cadena;
	Imprimir_Conpartido imprimir;
	public HiloCadena(String cadena,Imprimir_Conpartido in) {
		this.cadena=cadena;
		this.imprimir=in; 
	}
	
	
	public void run() {
		synchronized(imprimir) {
		for(int i=0;i<5;i++) {
		this.imprimir.Imprimir_Compartido("Pos"+(i+1)+"="+cadena);
		imprimir.notify();//avisa que termina
		
		try {
			imprimir.wait();//se pone en espera
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		}
		imprimir.notifyAll();//avisa que termina
		System.out.println("El hilo " +this.cadena+" su estado es "+this.getState()+" .");
		}
		System.out.println(Thread.currentThread().getState());
	}

}
