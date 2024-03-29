
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;


public class Tractor implements Maquina {

	private LocalDate fechaUltimoMantenimeinto;
	private boolean isEncendido;
	private boolean isArando;
	
	Tractor(LocalDate fechaUltimoManteniemito,boolean isEncendido,boolean isArando){
		this.fechaUltimoMantenimeinto=fechaUltimoManteniemito;
		this.isEncendido=isEncendido;
		this.isArando=isArando;
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
	public void arar() {
		if(isArando) {
			System.out.println("Ya está Arando");
		}else {
			this.isEncendido=!this.isEncendido;
		}
		
	}
	public void dejarArar() {
		if(!isArando) {
			System.out.println("No está arando");
		}else {
			this.isEncendido=!this.isEncendido;
		}
		
	}
	public long mantenimiento() {
		return ChronoUnit.DAYS.between(LocalDate.now(), fechaUltimoMantenimeinto.plusYears(2));
	}

	public String toString() {
	
		String txt="";
		txt+="**********"+this.getClass()+"********\n";
		txt+="Motor :"+this.isEncendido+"\n";
		txt+="Estado :"+this.isArando+"\n";
		if(mantenimiento()>=0) {
			txt+="Matenimiento= OK faltan :"+this.mantenimiento()+"dias\n";
		}else {
			txt+="Mantenimiento= No Ok! Se pasan:"+this.mantenimiento()+"dias\n";
		}
		return txt;	
	}

}
