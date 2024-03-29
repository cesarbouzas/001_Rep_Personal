

import java.util.*;
import java.util.stream.LongStream;

public class Estructuras {

	
	public static void calcularFactorial() {
		  int n;
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Introduce un número :");
	      n= scan.nextInt();
	      System.out.println("El factorial del numero "+n+" es :"+LongStream.rangeClosed(1,n).reduce(1, (long num1, long num2) -> num1*num2));
	}
	
	
	public static void main(String[] args) {
		System.out.println("La suma de los 5 primeros números es ="+(1+2+3+4+5));
		System.out.println("La suma de los 20 primeros números pares es  ="+((40+2)*40)/4);
		calcularFactorial();

	    }
	}
	

