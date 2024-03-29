package Ejercicio_40;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
public class Distribuidor {
	
	private String nombre;
	private int tamano;
	private ArrayList<Coche> almacen=new ArrayList<>();
	
	Distribuidor(String nombre,int tamano){
		this.nombre=nombre;
		this.tamano=tamano;	 
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public int getTamano() {
		return this.tamano;
	}
	public synchronized void  recibirCoche(Coche c)  {
	
		if(tamano>almacen.size()) {	
			almacen.add(c);
			System.out.println("Recibido coche"+c+" a "+ this.getNombre());
			System.out.println(this);
			
		}else {
			System.out.println("Almacen del distribuidor"+this.getNombre() + " esta lleno");
		}
		this.notify();
		
		
		
	}
	public synchronized Coche venderCoche(Coche c) {
//		try {
//			this.wait();
//		} catch (InterruptedException e1) {
//			
//			e1.printStackTrace();
//		}
		
		if(isStock(c)){
				System.out.println("Vendido el coche "+c);
				System.out.println(this);
				return this.sacarCocheAlmacen(c);
				
		}else{
			System.out.println("Sin stock");
		
			return null;
		}
		
	}
	
	public boolean isStock (Coche c) {
		for(Coche cocheAlmacen:this.almacen) {
			if (cocheAlmacen.equals(c)) {
				return true;	
			}
			}
		return false;
		}
	private Coche sacarCocheAlmacen(Coche c) {
		Coche aux=new Coche("tututu","tututu");
		for (int i=0;i<=0;i++) {
			if(this.almacen.get(i).equals(c)) {
				aux=this.almacen.get(i);
				System.out.println("Borrado"+almacen.get(i));
				this.almacen.remove(i);
				}
			}
		return aux;
	}
		
	public String toString(){
		String txt="*****El estado del Almacen es*****\n";
		for(int i=0;i<almacen.size();i++) {
			txt+="Coche ["+(i+1)+"]="+almacen.get(i)+".\n";
		}
	return txt;
	}
	Timer t=new Timer();
public void run() {
			
				TimerTask tarea=new TimerTask(){
					public void run() {
					System.out.println("El distribuidor descarta por falta de venta elimina el coche lleva mas timepo");
					almacen.remove(0);
					};
				};
				t.schedule(tarea,5000,5000);
				
	}
}