public class Fuel {	
private int actualFuel;
Fuel(int actualFuel){
	if(actualFuel>=0) {
			this.actualFuel=actualFuel;
	}else {
			this.actualFuel=0;}
			}			
public void showDetails() {
	System.out.println("La capacidad actual es de " +this.actualFuel + " litros.");
}
public void rellenar_actual_Fuel(int cantidad) {
	if((this.actualFuel+cantidad)>=0) {
		this.actualFuel=cantidad;
	}else {
		this.actualFuel=0;
	}
}		
public static void main(String[] args) {
			
			 Fuel deposito = new Fuel(7);
			 deposito.showDetails();
			 Fuel deposito2=new Fuel(-9);
			 deposito2.showDetails();
			 //Sacar el nombre de la instancia??? sin poner un atributo nombre dentro de la clase.
			 deposito.rellenar_actual_Fuel(-8);
			 deposito.showDetails();
			 deposito.actualFuel=-100;
			 deposito.showDetails();
	}
}


	


