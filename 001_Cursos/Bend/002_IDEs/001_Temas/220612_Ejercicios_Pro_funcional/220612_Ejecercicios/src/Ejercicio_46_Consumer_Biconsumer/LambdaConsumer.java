package Ejercicio_46_Consumer_Biconsumer;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.*;

public class LambdaConsumer {
	


public static void main (String[] args) {
	System.out.println("*****************************CONSUMER********************************");
	
	Consumer <String> imprimirNombre =(nombre)->System.out.println("Tu nombre es :"+nombre);	
	Consumer <LocalDate> imprimirEdad=fecha->{
		LocalDate hoy=LocalDate.now();
		LocalDate aux=LocalDate.of(hoy.getYear() ,fecha.getMonthValue(), fecha.getDayOfMonth());
		if(aux.compareTo(hoy)<0) {
			System.out.println("Este ano "+aux.getYear()+" ya has cumplido años tienes "+Period.between(fecha, LocalDate.now()).getYears());
		}else if(Period.between(aux,LocalDate.now()).getDays()==0) {
			System.out.println("Felicidades es tu cumpleaños de los "+Period.between(fecha, LocalDate.now()).getYears());
			
		}else {
			
			System.out.println("Este ano "+aux.getYear()+" aun no has cumplido años tienes "+Period.between(fecha, LocalDate.now()).getYears());
		}
		};
		
		imprimirNombre.accept("cesar");
		imprimirEdad.accept(LocalDate.of(1977, 1, 1));		
		imprimirEdad.accept(LocalDate.of(1977, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth()));
		imprimirEdad.accept(LocalDate.of(1977, 7, 4));
		imprimirEdad.accept(LocalDate.of(1977, 12, 31));

		System.out.println("****************************BiCONSUMER*******************************");
		
		BiConsumer <String,String> imprimirNombreApellidos=(nombre,apellidos)->System.out.println("Tu nombre es "+apellidos+","+nombre);
		
		BiConsumer<String,LocalDate> imprimirNombreDiaNac=(nombre,fNac)->System.out.println(nombre+" nacieste del dia de la semana "+fNac.getDayOfWeek());
		imprimirNombreApellidos.accept("Cesar","Bouzas Soto");
		imprimirNombreDiaNac.accept("Cesar",LocalDate.of(1977, 7, 4));
}
}