package Ejercicio_48_Funciones;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Funciones {

	public static void main(String[] args) {
	
		
		Function<Integer,Integer> numAleatroio=(numero)->{return (int)Math.round(Math.random()*(numero-1))+1;};
		Function<String,String> ponerMayusculas=(cadena)->{return cadena.toUpperCase();};
		BiFunction<Integer,Integer,Integer> numAleatroio2=(n1,n2)->
			{
				int max=(Integer.compareUnsigned(n1, n2)>0?n1:n2);
				int min=(Integer.compareUnsigned(n1, n2)<0?n1:n2);
				System.out.print("El máximo es :"+max+" ; El numero aleatorio entre "+max+ " y "+min+" es :");
				return(int)Math.round(Math.random()*(max-min))+min;};
				
				
	int n1=1;	
	int n2=10;
	String txt=("\n*******************************numero aleatorio "+n1+" a "+n2+"************************************\n\n");
	System.out.println(ponerMayusculas.apply(txt));
	for(int i=1;i<=300;i++) {
			System.out.print(numAleatroio.apply(n2)+",");
	if(i%50==0) {System.out.println();}
	}
	
	

	for(int i=0;i<10;i++) {   	
	n1=numAleatroio.apply(100);
	n2=numAleatroio.apply(100);
	 txt=("\n*******************************numero aleatorio "+n1+" a "+n2+"************************************\n");
    System.out.println(ponerMayusculas.apply(txt));		
	System.out.println(numAleatroio2.apply(n2,n1)+".");
	///n1 simpre mayor que n2 ????????? raro raro
	}
	}
		
		
	}


