package _Ejemplo_Banco;

public class principal {
	public static void main(String[] args) {
		Cuenta c1=new Cuenta(30);
		SacarDinero h1=new SacarDinero("cesar",c1);
		SacarDinero h2=new SacarDinero("elena",c1);
		
		h1.start();
		h2.start();
		
	}

}
