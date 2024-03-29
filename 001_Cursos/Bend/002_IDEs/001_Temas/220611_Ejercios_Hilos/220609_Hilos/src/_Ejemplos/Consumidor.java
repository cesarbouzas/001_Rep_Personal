package _Ejemplos;

public class Consumidor extends Thread{
	
	private Contador contador;


	Consumidor(String nombre,Contador c){
			this.setName(nombre);	
			this.contador=c;
	}
	
	public void run() {
		synchronized (contador) {
		for (int i=0;i<300;i++) {
	contador.decrementarContador();
	}
		System.out.println(getName()+": El contador vale :"+ contador.mostarContador());
}
}}
