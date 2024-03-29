package es.cesar.beans;

public class Saludo {
	
	private String msg="Hola cesar";
	
	//public Saludo() {};
	
	public Saludo(String txtConcatenar) {
		this.msg=this.msg+txtConcatenar;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg=msg;
	}

}
