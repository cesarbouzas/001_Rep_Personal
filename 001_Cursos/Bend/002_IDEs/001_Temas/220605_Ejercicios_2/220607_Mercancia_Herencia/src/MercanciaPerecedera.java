
import java.time.LocalDate;
import java.time.LocalTime;
public class MercanciaPerecedera extends Mercancia {

	private LocalDate caducidad;
	private String seccion;
	
	
	
	MercanciaPerecedera(int id, String nombre, String responsable, int zona, int estanteria, int cantidad,String seccion) {
		super(id, nombre, responsable, zona, estanteria, cantidad);
		this.caducidad=LocalDate.now().plusDays(15);//fecha de hoy mas 15 dias.
		this.seccion=seccion;
	}
	
	public LocalDate getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String toString() {
		String txt="";
		txt="**************\n";
		txt+="Id :"+this.getId()+".\n";
		txt+="Nombre: "+this.getNombre()+".\n";
		txt+="Responsable : "+this.getResponsable()+".\n";
		txt+="Zona : "+this.getZona()+".\n";
		txt+="Estanteria : "+this.getEstanteria()+".\n";
		txt+="Cantidad :"+this.getCantidad()+".\n";
		txt+="Caducidad :"+this.getCaducidad().getDayOfMonth()+
			"/"+this.getCaducidad().getMonthValue()+"/"+this.getCaducidad().getYear()+".\n";
		txt+="Seccion : "+this.getSeccion()+"\n";
		txt+="*******"+Mercancia.getEMPRESA()+"*********";
		return txt;
	}
	

}
