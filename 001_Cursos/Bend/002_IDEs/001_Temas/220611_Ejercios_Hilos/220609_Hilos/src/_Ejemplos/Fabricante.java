package _Ejemplos;

public class Fabricante extends Thread{

	private Contador contador;


	Fabricante(String nombre,Contador c){
			this.setName(nombre);	
			this.contador=c;
	}
	
	public void run() {
		synchronized (contador) {
		for (int i=0;i<300;i++) {
		contador.incrementarContador();
		}

		System.out.println(getName()+": El contador vale :"+ contador.mostarContador());
}
}
	}

