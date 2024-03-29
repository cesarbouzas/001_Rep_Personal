import java.util.Scanner;
public class Estructuras_Control {
	
public static void sumarNprimeros(int n) {	
	String txt="";
	int resultado=0;
	System.out.println("Suma de los n numeros inciales ");
	for(int i=1;i<=n;i++) {
		resultado+=i;
		if(i<n) {
			txt=txt.concat(Integer.toString(i)+"+");
		}else if(i==n){
			txt=txt.concat(Integer.toString(i)+"=");
		}
	}
	System.out.println("La suma de los "+n+" números primeros es "+txt+resultado);	
}
	public static int leerPorEnteroTeclado() 
	{	
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un número entero :");
		int n=teclado.nextInt();
		teclado.close();
		return n;
	}
	public static void sumarNprimeroPares(int n) {
		String txt="";
		int contador=0;
		int i=0;
		int resultado=0;
		while (contador<=n) {
					if(i%2==0) {
						resultado+=i;							
						if(contador<n) {
									txt=txt.concat(Integer.toString(i)+"+");
						}else if(contador==n) {
									txt=txt.concat(Integer.toString(i)+"=");
						}
						i++;
						contador++;
					}else {
						i++;
						continue;
					}
		}
		System.out.println("La suma de los "+n+" nùmeros paresi es :"+txt+resultado);	
		}
	
	
	public static void factorialN(int n) {
		double resultado=1;//muy facil pasarse de rango
		String txt="";
		for(int i=n;i>0;i--) {
			resultado*=i;
			if(i>1) {
				txt=txt.concat(Integer.toString(i)+"X");
				
			}else if(i==1) {
				txt=txt.concat(Integer.toString(i)+"=");
			}
		}
		System.out.println("El factorial de "+n+" es :"+txt+resultado);	
	}
	
	public static void main(String args[]) {
	int numero=leerPorEnteroTeclado();
	sumarNprimeros(numero);
	sumarNprimeroPares(numero);
	factorialN(numero);
	}

}
