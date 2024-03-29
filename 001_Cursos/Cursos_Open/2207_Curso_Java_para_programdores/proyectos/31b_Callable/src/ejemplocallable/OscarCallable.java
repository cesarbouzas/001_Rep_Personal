package ejemplocallable;

import java.util.concurrent.Callable;

public class OscarCallable implements Callable<Long> {
private Long minimo;
	
	public OscarCallable() {}
	public OscarCallable(Long minimo) {
		this.minimo=minimo;
	}
	public Long call() throws Exception{
		Long numeroPrimo=minimo;
		while(!isPrimo(numeroPrimo)) {
		numeroPrimo++;
		}
		return numeroPrimo;
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

