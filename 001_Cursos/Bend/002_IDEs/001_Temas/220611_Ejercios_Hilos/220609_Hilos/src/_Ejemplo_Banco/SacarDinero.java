package _Ejemplo_Banco;

public class SacarDinero extends Thread {
	private Cuenta c;
	private String nom;
	
	public SacarDinero(String nom, Cuenta c) {
		super(nom);
		this.c=c;
	}
	public void run() {
		for (int x=1;x<4;x++) {
		c.retirarDinero(10, getName());
	}
		

}
}