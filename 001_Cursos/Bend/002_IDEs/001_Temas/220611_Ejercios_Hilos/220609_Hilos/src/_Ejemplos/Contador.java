package _Ejemplos;

public class Contador {
private int c;
	
Contador(int c){
	this.c=c;
}
public void incrementarContador() {
	c++;
}
public void decrementarContador() {
	c--;
}

public int mostarContador() {
	return this.c;
}
}
