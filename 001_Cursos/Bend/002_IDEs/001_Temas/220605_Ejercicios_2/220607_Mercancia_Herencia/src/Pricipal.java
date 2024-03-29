
public class Pricipal {

	public static void main(String[] args) {
	
		Mercancia producto1=new Mercancia(001,"Galletas","Cesar",15179,1,1000);
		MercanciaPerecedera fresco1=new MercanciaPerecedera(002,"Pollo","Raquel", 15179, 11, 20,"Carnes" );
		System.out.println(producto1);
		System.out.println(fresco1);
		MercanciaPerecedera fresco2=new MercanciaPerecedera(003,"Rape","Raquel", 15179,12, 20, "Pescaderia");
		//MercanciaPerecedera fresco3=(MercanciaPerecedera) producto1;no se puede
		Mercancia producto2=fresco2;//Sobre producto estoy creando un puntero al objeto fresco ,que accede a su metodo ToSring
									//Si se da este caso se accede a los metodos de la clase hija sobreescritos o a los de la clase padre.
		System.out.println(producto2);
		System.out.println((producto2.equals(fresco2))?"son iguales":"no son iguaes");
		System.out.println(producto2.getClass());
		Mercancia producto3=fresco2;
		producto3.setCantidad(25660);
		System.out.println(fresco2);
		System.out.println(producto2);
		System.out.println(producto2);
		System.out.println(((MercanciaPerecedera)(producto2)).getCaducidad());
		

	}

}
