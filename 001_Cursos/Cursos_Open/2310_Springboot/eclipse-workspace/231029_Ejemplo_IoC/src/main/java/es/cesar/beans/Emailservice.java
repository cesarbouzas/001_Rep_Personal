package es.cesar.beans;

public class Emailservice {

	private Saludo saludator;
	
	public Emailservice() {};
	
	public void setSaludator(Saludo saludator) {
		this.saludator=saludator;
	}
	
	public void enviarMail() {
	System.out.println("Email enviado con el me¡msg ="+saludator.getMsg());
	}
	
}