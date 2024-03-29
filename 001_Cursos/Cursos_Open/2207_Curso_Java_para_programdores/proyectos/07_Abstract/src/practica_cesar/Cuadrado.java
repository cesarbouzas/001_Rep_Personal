package practica_cesar;

import java.math.*;

public class Cuadrado extends Grafico{
	private float lado;
	
	

	public Cuadrado(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Cuadrado(float lado) {
		super();
		this.lado=lado;
		
	}
	
	@Override
	public String getPosicion() {
		
		return "("+x+","+y+","+z+")";
	}

	@Override
	public void imprimirCaracteristicasPrincipales() {
		System.out.println("El perimetro es :"+4*lado);
		System.out.println("El area es "+Math.sqrt(lado));
		System.out.println("El centro de gravedad es :"+"("+(x+lado/2)+","+(y+lado/2)+")");
		
		
	}

	@Override
	public void girar(int grados) {
		System.out.println("el cuadrado ha sido girado "+grados);
		
	}

	@Override
	public void setZ(int z) {
		this.z=z;
		
	}

}
