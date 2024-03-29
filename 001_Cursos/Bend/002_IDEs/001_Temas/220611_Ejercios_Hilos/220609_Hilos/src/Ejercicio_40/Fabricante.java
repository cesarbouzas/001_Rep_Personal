package Ejercicio_40;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
public class Fabricante extends Thread {
	
	private String marca;
	private ArrayList<String> modelos=new ArrayList<>();
	private Distribuidor distribuidor;
	public Fabricante(String marca, Distribuidor d) {
		this.marca=marca;
		this.distribuidor=d;
		this.setModelos();
		
		
	}
	public void setModelos() {
		this.modelos.add("Ibiza"); 
		this.modelos.add("malaga");
		this.modelos.add("Toledo");
		this.modelos.add("Turquia");
		this.modelos.add("Vigo No");
		this.modelos.add("malaga");
	}
	public String getModelo(int n) {
		return modelos.get(n);
		
	}
	public String getMarca() {
		return this.marca;
	}
	public Coche fabricarCoche() {
		int numAleatorio=(int)(Math.random()*modelos.size());
		//System.out.println(numAleatorio);
		return new Coche(this.getMarca(),this.getModelo(numAleatorio));
		
	}
	Timer t=new Timer();
	public void run() {
	
		TimerTask tarea=new TimerTask() {
			public void run() {
				distribuidor.recibirCoche(fabricarCoche());
			}
		};
			t.schedule(tarea,0,2000);
			
		}
		
		
		
	
		
		
	}
	
	

