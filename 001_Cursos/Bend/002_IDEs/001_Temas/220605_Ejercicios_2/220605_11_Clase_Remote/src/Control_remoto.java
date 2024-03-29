public class Control_remoto {
	private final static int VOL_MAX=5;
	private final static int NCH_MAX=10;
	private int canal;
	private int volumen;
	private boolean isEncendido;
	
	Control_remoto(){
		this.canal=0;
		this.volumen=0;
		this.isEncendido=false;
	}
	
	Control_remoto(int canal,int volumen,boolean isEncendido){
		if(canal>NCH_MAX) {canal=NCH_MAX;}
		if(volumen>VOL_MAX) {volumen=VOL_MAX;}
		this.canal=canal;
		this.volumen=volumen;
		this.isEncendido=isEncendido;
	}
	
	
	public void subirVolumen() {
		if(isEncendido) {
			if(this.volumen<VOL_MAX) {
				System.out.println("Vol :"+ ++this.volumen);
		
			}else {
				System.out.println("Volumen máximo alcanzado: "+this.volumen);
			}
		}else {
			System.out.println("Encienda primero.");
		}
	}
	
	public void  bajarVolumen() {
		if(isEncendido) {	
			if(this.volumen>0) {
				System.out.println("Vol :"+ --this.volumen);
			}else {
				System.out.println("Volumen mìnimo alcanzado: "+ this.volumen);
			}	
		}else {
			System.out.println("Encienda primero.");
		}
	}
	
	public void subirCanal() {
		if(isEncendido) {	
			if(this.canal<NCH_MAX) {
				System.out.println("CH :"+ ++this.canal);
			}else {
			System.out.println("Canal máximo alcanzado :"+this.canal);
			}
		}else {
		System.out.println("Encienda primero.");
		}
	}
	
	public void bajarCanal() {
		if(isEncendido) {
			if(this.canal>0) {
				System.out.println("CH :"+ --this.canal);
			}else {
				System.out.println("Canal mínimo alcanzado "+this.canal);
			}
	
		}else {
			System.out.println("Encienda primero.");
		}
	}
	public void pulsarBotonEncendido() {
		String txt= (isEncendido)?"Apagando...":"Encendiendo..";
		isEncendido=!isEncendido;
		System.out.println(txt);
	}

	public static void main(String[] args) {
	Control_remoto r1=new Control_remoto();
	r1.pulsarBotonEncendido();
	for(int i=0;i<11;i++) {
		r1.subirCanal();
		r1.subirVolumen();	
	}
	r1.pulsarBotonEncendido();
	r1.bajarCanal();
	r1.bajarVolumen();
	r1.pulsarBotonEncendido();
	for(int i=0;i<11;i++) {
		r1.bajarCanal();
		r1.bajarVolumen();	
	}
}

}
