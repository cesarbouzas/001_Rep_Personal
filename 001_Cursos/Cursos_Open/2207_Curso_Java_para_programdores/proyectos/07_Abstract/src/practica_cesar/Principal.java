package practica_cesar;

public class Principal {

	public static void main(String[] args) {
	
		Cuadrado c=new Cuadrado(10.1f);
		System.out.println(c.getPosicion());
		c.imprimirCaracteristicasPrincipales();
		c.mover(10, 10);
		c.setZ(100);
		System.out.println("Lo hemos desplazado");
		System.out.println(c.getPosicion());
		c.imprimirCaracteristicasPrincipales();

	}

}
