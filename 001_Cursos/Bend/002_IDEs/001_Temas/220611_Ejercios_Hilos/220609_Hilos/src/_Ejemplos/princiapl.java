package _Ejemplos;

public class princiapl {

	public static void main(String[] args) {
	Contador contador=new Contador(100);
	Consumidor consumidor1= new Consumidor("Consumidor1",contador);
	Fabricante fabrica1=new Fabricante("Fabrica 1",contador);
	fabrica1.start();
	consumidor1.start();
	

		
		

	}

}
