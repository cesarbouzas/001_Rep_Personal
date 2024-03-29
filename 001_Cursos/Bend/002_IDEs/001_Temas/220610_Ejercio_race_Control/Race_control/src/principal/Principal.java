package principal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import Servicios.MenuService;
import Servicios.PantallaService;
import clases_Objeto.*;
public class Principal {

	public static void main(String[] args) {
	
		
		PantallaService.borrar();
		
		MenuService.principal(); 
}
}
