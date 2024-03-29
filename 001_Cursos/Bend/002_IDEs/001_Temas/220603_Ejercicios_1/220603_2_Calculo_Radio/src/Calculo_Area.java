import java.math.*;
public class Calculo_Area {

	public static float calculoArea(float r) {
		return (float) (Math.PI*Math.sqrt(r));
	} 
	public static float formatearDecimales(float numeroFloat,int nDecimales) {
		return (float) (Math.round(numeroFloat*Math.pow(10,nDecimales))/Math.pow(10,nDecimales));
	}
	public static void main(String[] args) {
		
		System.out.println("El area es= "+calculoArea(15));
		System.out.println("Redondeando a 2 decimales = "+formatearDecimales(calculoArea(15),2));
	
		
		

	}

}
