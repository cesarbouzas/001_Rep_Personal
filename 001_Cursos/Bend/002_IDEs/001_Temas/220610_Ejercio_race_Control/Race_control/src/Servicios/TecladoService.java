package Servicios;

import java.util.Scanner;

public abstract class TecladoService {
	public static  int leerInt() {
		return new Scanner(System.in).nextInt();
	}
	public static String leerString() {
		 return new Scanner(System.in).nextLine();
	}

}
