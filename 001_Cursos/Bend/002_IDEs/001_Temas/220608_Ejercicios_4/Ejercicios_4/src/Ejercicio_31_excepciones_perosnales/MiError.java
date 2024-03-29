package Ejercicio_31_excepciones_perosnales;

public class MiError extends RuntimeException{
	public MiError(){
		super("vaya cagada cesar");
	}
	public MiError(String mensaje){
		super(mensaje);
	}

}
