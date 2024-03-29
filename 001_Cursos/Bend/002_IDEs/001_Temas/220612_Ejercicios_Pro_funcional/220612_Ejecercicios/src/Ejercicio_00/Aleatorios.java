package Ejercicio_00;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Aleatorios {
	
	public void ale1(int veces,int n) {
		int max=0;
		int pos=0;
	ArrayList <Integer> enteros=new ArrayList<Integer>();
	for(int i=0;i<=n;i++) {
		enteros.add(0);
	}
	
	for(int i=0;i<veces;i++) {
	int ale1= 1+(int)(Math.random()*n);
	enteros.set(ale1, (enteros.get(ale1)+1));
	System.out.print(ale1+",");
	if(i%50==0&& i!=0) {System.out.println();}
	}

    for(int i=0;i<=n;i++) {
    	if(enteros.get(i)>max) {
    		max=enteros.get(i);
    		System.out.println(max);
    		
    		
    	}
    	System.out.println("\nEl numero de "+i+" es de "+enteros.get(i));
    	
    }
    System.out.print("\nEl numero que mas se repite es "+pos);
	
	
	
	}
	public static void main(String[] args) {
	Aleatorios a=new Aleatorios();
		a.ale1(100000000,100);
		
	}
}
