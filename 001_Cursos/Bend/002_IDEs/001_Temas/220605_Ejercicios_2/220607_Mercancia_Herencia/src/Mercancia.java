
public class Mercancia {

	private static String EMPRESA="Cesar.sl";
	private int id;
	private String nombre;
	private String responsable;
	private int zona;
	private int estanteria;
	private int cantidad;
	/**
	 * @param id
	 * @param nombre
	 * @param responsable
	 * @param zona
	 * @param estanteria
	 * @param cantidad
	 */
	public Mercancia(int id, String nombre, String responsable, int zona, int estanteria, int cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.responsable = responsable;
		this.zona = zona;
		this.estanteria = estanteria;
		this.cantidad = cantidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getEstanteria() {
		return estanteria;
	}
	public void setEstanteria(int estanteria) {
		this.estanteria = estanteria;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
	
	public static String getEMPRESA() {
		return EMPRESA;
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
		txt+="*******"+Mercancia.getEMPRESA()+"*********";
		return txt;
	}
}
