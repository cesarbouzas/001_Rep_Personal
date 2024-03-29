package ejemplorunnable;

public class PruebaOscarRunnable extends OscarRunnable {
	
	public static void main(String args[]) {
		
		
		
		Thread h1=new Thread(new OscarRunnable(125L));
		h1.start();
//		new Thread(new OscarRunnable(1202L)).start();;
		
		new Thread(()-> System.out.println("Hola desde un metodo Lambda")).start();;
	}

}
