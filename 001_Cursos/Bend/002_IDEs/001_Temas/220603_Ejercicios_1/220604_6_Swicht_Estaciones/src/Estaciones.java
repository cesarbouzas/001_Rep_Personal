import java.time.*;
public class Estaciones {

public static void calcularEstacion(LocalDateTime t) {
	int mes=t.getMonthValue();
	String estaciones[]={"Invierno","Primavera","Verano","Otono"}; 
	String estacion="no definido";
	switch (mes){	
	case 1:case 2:case 3:
			estacion=estaciones[0];
			break;
	case 4:case 5:case 6:
			estacion=estaciones[1];
			break;
	case 7:case 8:case 9:
			estacion=estaciones[2];
			break;
	default:	
			estacion=estaciones[3];
			break;
	}
	System.out.println("Estas en "+estacion);
}
	public static void main(String[] args) {
LocalDateTime hoy=LocalDateTime.now();	
System.out.println("La fecha actual es "+LocalDate.now());
calcularEstacion(hoy);
LocalDateTime fecha=LocalDateTime.of(2022, 03, 31, 23, 59);
System.out.println("Para la fecha "+fecha.toString());
calcularEstacion(fecha);
fecha=fecha.plusMinutes(2);
System.out.println("Para la fecha "+fecha.toString());
calcularEstacion(fecha);
fecha=fecha.plusMonths(3);
System.out.println("Para la fecha "+fecha.toString());
calcularEstacion(fecha);
fecha=fecha.plusMonths(3);
System.out.println("Para la fecha "+fecha.toString());
calcularEstacion(fecha);





//System.out.println("La hora actual es "+LocalTime.now());
//System.out.println("La fecha y hora actual es "+LocalDateTime.now());
//System.out.println("El instante actual es "+Instant.now());
//System.out.println("La fecha y la hora en nuestra zona horaria es "+ZonedDateTime.now());
//System.out.println("El tiempo transcurrido desde la primera impresion es "+(Period.between(comienzo, LocalDate.now())));
//System.out.println("Las horas de duracion del proceso es de "+(Duration.between(comienzo.s, LocalDate.EPOCH)));







		
	}

}
