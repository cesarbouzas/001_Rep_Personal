
public class Coche {

	private String marca;
	private String modelo;
	private int vMax;
	private int rvMax;
	private String tipocombustible;
	private int velocimetro;
	private int tacometro;
	private boolean isEncendido;
	private boolean isMarchaAtras;
	private int anguloVolante;
	
	
	Coche(String marca,String modelo,int vMax,String tipoCombustible)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.vMax=vMax;
		this.tipocombustible=tipoCombustible;
		this.velocimetro=0;
		this.tacometro=0;
		this.isEncendido=false;
		this.isMarchaAtras=false;
		this.rvMax=40;
	}
	public void pulsarBotonStartStop() {
		if(this.velocimetro==0) {
			this.isEncendido=(this.isEncendido)?false:true;
		}else {
			System.out.println("Paré el coche primero");
		}
	}
	public void estado() {
		System.out.println((this.isEncendido)?"Encendido":"Apagado");
		System.out.println("V="+this.velocimetro);
		System.out.println("Sentido "+ ((this.isMarchaAtras)?"Reverse":"Directo"));
		
	}
	
	public void acelerar() {
		if(isEncendido) {
			if(!isMarchaAtras) {
				if(this.velocimetro<=(this.vMax-10)) {
					this.velocimetro+=10;
					System.out.println("Acelerando 10 km/h.");
				}else {
					System.out.println("Imposible acelerar la Velocidad actual es :"+this.velocimetro+" igual que la máxima del vehiculo("+this.vMax+")");
				}
			}else if(isMarchaAtras){
				if(this.velocimetro<=(this.rvMax-10)) {
					this.velocimetro+=10;
					System.out.println("Acelerando 10 km/h.");
				}else {
					System.out.println("Imposible acelerar la Velocidad actual(reverser) es :" +this.velocimetro);
				}
			}
		}else {
					System.out.println("Debe encender el vehiulo primero");
		}
	};
	public void frenar() {
		if(isEncendido) {
			if(!isMarchaAtras) {
				if(this.velocimetro>=(0+10)) {
					this.velocimetro-=10;
					System.out.println("Frenando 10 km/h.");
				}else {
					System.out.println("Imposible frenar mas la velocidad es: "+this.velocimetro);
				}
			}else if(isMarchaAtras){
				if(this.velocimetro>=(0+10)) {
					this.velocimetro-=10;
					System.out.println("Frenando 10 km/h.");
				}else {
					System.out.println("Imposible frenar mas la velocidad es: "+this.velocimetro);
				}
			}
		}else {
					System.out.println("Debe encender el vehiulo primero");
		}
	};
	public void girarVolante(int angulo) {
		if(angulo<0) {
			if((this.anguloVolante+angulo)>=-540) {
				this.anguloVolante+=angulo;
				System.out.println("girando para la izquierda....");
			}else {
				this.anguloVolante=-540;
				System.out.println("No se pude girar mas para la izquierda");
			}
		}
		if(angulo>0) {
			if((this.anguloVolante+angulo)<=+540) {
				this.anguloVolante+=angulo;
				System.out.println("girando para la derecha....");
			}else {
				this.anguloVolante=540;
				System.out.println("No se pude girar mas para la derecha");
			}
			
		}
		System.out.println((this.anguloVolante<=0)?"Direccion "+Math.abs(this.anguloVolante)/18+" º a la izquierda":"Direccion "+Math.abs(this.anguloVolante)/18+"º a la derecha");
	};
	
	public void darMarchaAtars() {
		if(this.velocimetro==0) {
			this.isMarchaAtras=true;
		}else {
			System.out.println("Debe parar el vehiculo primero");
		}
		
	};
	public void darMarchaAdelante() {
		if(this.velocimetro==0) {
			this.isMarchaAtras=false;
		}else {
			System.out.println("Debe parar el vehiculo primero");
		}
		
	};
	
	
	public static void main(String[] args) {
	Coche c1=new Coche("Nissan","Xtrail",200,"Diesel");
	c1.acelerar();
	c1.pulsarBotonStartStop();
	c1.estado();
	c1.acelerar();
	c1.darMarchaAtars();
	c1.estado();
	c1.pulsarBotonStartStop();
	for(int i=0;i<=19;i++) {
		c1.acelerar();
		c1.estado();
	}
	c1.pulsarBotonStartStop();
	c1.frenar();
	c1.estado();
	for(int i=0;i<=19;i++) {
		c1.frenar();
		c1.estado();
	}
	c1.estado();
	c1.darMarchaAtars();
	c1.estado();
	c1.acelerar();
	c1.acelerar();
	c1.acelerar();
	c1.estado();
	c1.acelerar();
	c1.acelerar();
	c1.pulsarBotonStartStop();
	c1.girarVolante(-510);
	c1.girarVolante(-200);
	c1.girarVolante(2000);
	c1.girarVolante(-541);
	c1.estado();
	c1.frenar();
	c1.frenar();
	c1.frenar();
	c1.frenar();
	c1.frenar();
	c1.estado();
	c1.darMarchaAdelante();
	c1.estado();
	c1.acelerar();
	c1.frenar();
	c1.estado();
	c1.pulsarBotonStartStop();
	c1.estado();
	
	
	}

}
