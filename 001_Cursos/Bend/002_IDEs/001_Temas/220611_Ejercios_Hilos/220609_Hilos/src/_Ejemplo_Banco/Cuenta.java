package _Ejemplo_Banco;

public class Cuenta {
	private int saldo;
	
	Cuenta (int s){
		this.saldo=s;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	void restar(int cantidad) {
		this.saldo-=cantidad;
	}
	
	synchronized void  retirarDinero(int cant , String nom) {
		if(this.getSaldo()>=cant) {
			System.out.println(nom+" va a retirar "+cant+
					" El saldo antes de retirar es "+this.getSaldo()
			);
			try {
				Thread.sleep(500);
			}catch(Exception e) {};
			restar(cant);
			System.out.println(nom+" retira :"+cant+" el saldo es "+getSaldo());
		}else {
			System.out.println("No hay saldo suficente");
		}
		if(getSaldo()<0) {
		 	System.out.println("saldo negativo :"+getSaldo());
		}
	}}


