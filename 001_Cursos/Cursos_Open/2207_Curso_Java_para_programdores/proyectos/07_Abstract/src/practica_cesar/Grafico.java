package practica_cesar;

public abstract class Grafico implements Operaciones2d {
	
	protected int x;
	protected int y;
	protected int z;
	
	protected Grafico(){
		this.x=0;
		this.y=0;
		this.z=0;
	}
	
	
	public void mover(int x,int y) {
		this.x+=x;
		this.y+=y;
	}
	
	public abstract String getPosicion();
	public abstract void imprimirCaracteristicasPrincipales();

}
