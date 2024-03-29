package Ejercicio_30_Excepcion_fichero;

public class Principal {

	public static void main(String[] args) {
	Fichero f=new Fichero();
	f.accederFichero();
	System.out.println("La longitud del fichero es "+f.lonFichero());
	f.leer();

	}

}
