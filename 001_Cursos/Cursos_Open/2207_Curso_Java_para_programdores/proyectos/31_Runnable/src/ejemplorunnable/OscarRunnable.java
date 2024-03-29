package ejemplorunnable;

public class OscarRunnable implements Runnable {
private Long minimo;
	
	public  OscarRunnable() {
	}
	public OscarRunnable(Long minimo) {
		this.minimo=minimo;
	}
	public void run(){
		Long numeroPrimo=minimo;
		
		
		while(!isPrimo(numeroPrimo)) {
		System.out.printf("[minimo %d]:número %d no es primo %n",minimo,numeroPrimo);
		numeroPrimo++;
		}
		System.out.printf("[minimo %d]:número %d ES PRIMO %n.",minimo,numeroPrimo);
		
	}
	public static boolean isPrimo(Long n) {
		Long i;
		if(n<=1 | n==null){
			System.out.println("numero no válido");
				return false;
			}
		
		for(i =2L;i<=(n/2);i++) {
			System.out.printf("Estudiando %d....%n",i);
			if((n%i)==0) {
				System.out.printf("Es divisible entre %d",i);
				return false;
			}
		}
		
		return true;
	}

}

	
	
	


