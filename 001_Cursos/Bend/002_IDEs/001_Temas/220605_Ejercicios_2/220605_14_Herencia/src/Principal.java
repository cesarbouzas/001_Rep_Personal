import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
	
		Policia madero1=new Policia(34896415,"Cesar","Bouzas","Soto",LocalDate.of(1977, 7, 4),"A coruña",15179);
		System.out.println(madero1.toString());
		Persona persona0=new Persona(34896414,"Manuel","Bouzas","Nuñez",LocalDate.of(2011, 12, 10));
		System.out.println(persona0.toString());
		Persona persona1=(Persona)madero1;//No se pierden datos???????
		System.out.println(persona1.toString());
	}

}
