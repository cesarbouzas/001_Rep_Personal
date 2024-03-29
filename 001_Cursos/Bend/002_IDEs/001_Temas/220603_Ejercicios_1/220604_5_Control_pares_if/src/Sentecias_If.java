import java.util.Scanner;

public class Sentecias_If {

public static int leerEteroTeclado() {
	Scanner teclado=new Scanner(System.in);
	System.out.print("Introduce un número:");
	//teclado.close();
	return teclado.nextInt();
}  
public static void isPositivo(int n){
	String txt=((n>0)?"El número "+n+" es positivo":"El número "+n+" es negativo");
	System.out.println(txt);
}
public static void isMultiplo(int n1, int n2) {
	String txt=((n1%n2==0)?"Los números son multiplos":"Los números no son multiplos");
	System.out.println(txt);
}
public static void isMenor(int n1, int n2) {
	String txt=((n1<n2)?"El numero "+n1+" es menor que "+n2:"El numero "+n2+" es menor que "+n1);
	System.out.print(txt);
}

public static void main(String args[]) {
	int numero1=leerEteroTeclado();
	int numero2=leerEteroTeclado();
	isPositivo(numero1);
	isPositivo(numero2);
	isMultiplo(numero1, numero2);
	isMenor(numero1, numero2);
 }
}
