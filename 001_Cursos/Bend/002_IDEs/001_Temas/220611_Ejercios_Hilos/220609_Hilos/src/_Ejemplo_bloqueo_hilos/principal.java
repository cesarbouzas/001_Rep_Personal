package _Ejemplo_bloqueo_hilos;

public class principal {
	
	
	public static void main(String[] args) {
	Imprimir_Conpartido impresora=new Imprimir_Conpartido();
	HiloCadena h1=new HiloCadena("A",impresora);
	HiloCadena h2=new HiloCadena("B",impresora);
	h1.start();
	h2.start();
	}
	

}
