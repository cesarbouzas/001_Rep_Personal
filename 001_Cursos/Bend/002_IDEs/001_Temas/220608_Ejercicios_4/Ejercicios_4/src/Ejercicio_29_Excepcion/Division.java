package Ejercicio_29_Excepcion;

public class Division {
	private int numero;
	
	public Division(int n) {
		this.numero=n;
	}
	
	public void division()  { 
	int resultado;
		try{
			resultado=this.numero/0;
			System.out.println(resultado);
		}catch(ArithmeticException e) {
			System.out.println("no se puede dividir entre 0");
	}

}
	}
