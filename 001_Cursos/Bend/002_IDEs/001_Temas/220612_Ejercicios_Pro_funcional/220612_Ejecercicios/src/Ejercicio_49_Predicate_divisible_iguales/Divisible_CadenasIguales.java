package Ejercicio_49_Predicate_divisible_iguales;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class Divisible_CadenasIguales {

	
	public static void main(String[] args) {
		System.out.println("\n*********************Predicate Par*****************************" );
		Predicate<Integer> esPar=numero->numero%2==0;
		String txt;
		for(int i=0;i<20;i++) {
			txt=(esPar.test(i))?" es par":" es impar";
		System.out.println("El numero "+i+txt);
		}
		System.out.println("\n********** BiPredicate Comparar dos Strings Equals ignorando maysculas****************\n" );
		BiPredicate<String,String> sonIguales=(cadena1,cadena2)->{return cadena1.equalsIgnoreCase(cadena2);};
		 System.out.println("¿Es lo mismo Tuberculo que ver tu Culo? " +sonIguales.test("tuberculo","vertuculo"));
		 System.out.println("¿Es lo mismo Mar flores que Flores en el Mar?  "+sonIguales.test("Mar flores","Flores en el mar"));
		 System.out.println("¿Es lo mimsmo cesar bouzas soto que Cesar Bouzas Soto?  "+sonIguales.test("cesar bouzas soto","Cesar Bouzas Soto"));
		 String nombre=new String("Cesar");
		 String nombre1=new String("Cesar");
		

}}
	
