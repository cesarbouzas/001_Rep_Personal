package Ejercicio_50;

 class Arithmetic{
	
	 public int sumar(int a,int b) {return a+b;}
	 public int restar(int a,int b) {return a-b;}
	 public int multiplicar(int a,int b) {return a*b;}
	 public int dividir(int a,int b) {return a/b;}
}

public class Calculadora {
	
	
	public void sumar(int a, int b,Arithmetic arit) {
		System.out.println("La suma aritmetica de a= "+a+" y b= "+b+" es "+arit.sumar(a, b));	
	}
	public void restar(int a, int b,Arithmetic arit) {
		System.out.println("La resta aritmetica de a= "+a+" y b= "+b+" es "+arit.restar(a, b));	
	}
	
	
	public void multiplicar(int a, int b,Arithmetic arit) {
		System.out.println("La multiplicacion Aritmetica de a= "+a+" y b= "+b+" es "+arit.multiplicar(a, b));	
	}
	public void dividir(int a, int b,Arithmetic arit) {
		System.out.println("La division Aritmetica de a= "+a+" y b= "+b+" es "+arit.dividir(a, b));	
	}
	public void sumar(int a, int b) {
		InterfaceCalculadora sumar = (n1,n2)->n1+n2;
		System.out.println("La suma de a= "+a+" y b= "+b+" es "+sumar.operacion(a, b));	
	}
	public void restar(int a, int b) {
		InterfaceCalculadora restar = (n1,n2)->n1-n2;
		 System.out.println("La resta de a= "+a+" y b= "+b+" es "+restar.operacion(a, b));	
	}
	 public void multiplicar(int a,int b) {
		 InterfaceCalculadora multiplicar=(n1,n2)->n1*n2;
		 System.out.println("La multiplicacion de "+a+" y "+b +" es "+multiplicar.operacion(a, b));
		 
	 }
	 public void dividir(int a,int b) {
		 InterfaceCalculadora dividir=(n1,n2)->n1/n2;
		 System.out.println("La division de "+a+" y "+b +" es "+dividir.operacion(a, b));
		 
	 }
	
	public static void main (String args[]) {
		
		Arithmetic ar=new Arithmetic();
		Calculadora casio=new Calculadora();
		casio.sumar(10, 20, ar);
		casio.restar(10, 20, ar);
		casio.multiplicar(10, 20,ar);
		casio.dividir(10,20,ar);
		
		casio.sumar(10, 20);
		casio.restar(10, 20);
		casio.multiplicar(10,20 );
		casio.dividir(10,20 );
	}

}
