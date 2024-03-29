package Ejercicio_31_excepciones_perosnales;

public class validar {
	public static void esValido(boolean valido) throws MiError {
		if(!valido) throw new MiError();
		
	}

public static void esValido(boolean valido,String mensaje) throws MiError {
			if(!valido) throw new MiError(mensaje);
		
	}

		
	}


