
import java.time.*;
public class Dia_noche {
	
	public static void calcularDiaNoche(LocalTime h) {
		int hora=h.getHour();
		switch (hora) {
		case 22:case 23:case 0:case  1:case  2:case  3:case  4:case  5:case  6:case  7:
			System.out.println("Para la hora "+ h+" es de noche.");
			break;
		case 8:case 9:case 10:case 11:case 12:case 13:case 14:
			System.out.println("Para la hora "+ h+" es por la mañana.");
			break;
		default:
			System.out.println("Para la hora "+h+" es por la tarde.");
			
		}
		
	}
	
	public static void main(String[] args) {
		LocalTime ahora=LocalTime.now();
		calcularDiaNoche(ahora);
		ahora=ahora.plusHours(6);
		calcularDiaNoche(ahora);
		ahora=ahora.plusMinutes(-3600);
		calcularDiaNoche(ahora);
	}

}
