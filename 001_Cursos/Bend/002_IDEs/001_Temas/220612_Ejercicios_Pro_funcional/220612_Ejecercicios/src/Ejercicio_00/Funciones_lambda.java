package Ejercicio_00;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Funciones_lambda {
	Consumer <String> imprimir=a->System.out.println(a);
	Consumer <String> imprimir2=System.out::println;
	static int restar(int a,int b) {	
		return a-b;
	}
	public static void main(String args[]) {
		
		Funciones_lambda f=new Funciones_lambda(); 
	
	///****** Metodos estaticos *****///	
		BinaryOperator<Integer> sumar1=(a,b)->Integer.sum(a+10, b+30);
		BinaryOperator<Integer> sumar2=Integer::sum;
		long creditCardNMumber=1234_5678_9012_5636L;
		BinaryOperator<Integer> restar=(a,b)->a-b;
		System.out.println(sumar1.apply(2,3));
		System.out.println(sumar2.apply(2,3));
		System.out.println(creditCardNMumber);
		System.out.println(restar(5,3));
		BinaryOperator <Integer> restar3=Funciones_lambda::restar;
		System.out.println(restar3.apply(5,3));
	///******Metodos clase*****///
		f.imprimir.accept("hola");
		f.imprimir2.accept("tengo 45");
		f.imprimir2.accept("a"+3);
	}
}
