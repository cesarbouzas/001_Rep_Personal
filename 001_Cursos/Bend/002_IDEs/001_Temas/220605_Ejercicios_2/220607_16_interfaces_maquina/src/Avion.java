import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Avion implements Maquina{
	
	private LocalDate fechaUltiMante;
	private boolean isEncendido; 
	private boolean isVolando;
	
	Avion(LocalDate fechaUltimoMante,boolean isEncendido, boolean isVolando){
		this.fechaUltiMante=fechaUltimoMante;
		this.isEncendido=isEncendido;
		this.isVolando=isVolando;
	}
	
	public void encender() {
		if(isEncendido) {
			System.out.println("Ya está encendido");
		}else {
			this.isEncendido=!this.isEncendido;
		}
		
	}
	public void apagar() {
		if(!isEncendido) {
			System.out.println("Ya está apagado");
		}else {
			this.isEncendido=!this.isEncendido;
		}
	}
	
	public long mantenimiento() {
		LocalDate ahora=LocalDate.now();
		return ChronoUnit.DAYS.between(ahora, getFechaMantenimiento());
	}
	public void despegar() {
		if(isVolando) {
			System.out.println("No puedes depegar ya estas volando");
		}else {
			isVolando=!isVolando;
		}
		
	}
	public void aterreizar() {
		if(!isVolando) {
			System.out.println("No puedes aterrizar ya estas en el suelo");
		}else {
			isVolando=!isVolando;
		}
		
	}
	
	public LocalDate getFechaMantenimiento() {
		return fechaUltiMante.plusYears(2);
			
	}
	public String toString() {
		String txt="";
		txt+="**********"+this.getClass()+"********\n";
		txt+="Motor :"+this.isEncendido+"\n";
		txt+="Estado :"+this.isVolando+"\n";
		if(mantenimiento()>=0) {
			txt+="Matenimiento= OK faltan :"+this.mantenimiento()+" dias\n";
		}else {
			txt+="Mantenimiento= No Ok! Se pasan:"+this.mantenimiento()+"dias\n";
		}
		return txt;
	}
	
	
}
