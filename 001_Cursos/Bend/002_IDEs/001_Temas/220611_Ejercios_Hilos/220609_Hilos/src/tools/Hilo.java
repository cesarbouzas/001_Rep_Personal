package tools;

public abstract class Hilo {
	
	public static long miliAle(int max,int min){
		return (Math.round((Math.random()*(max-min)+min)*1000));
	}
	public static void imprimir(Thread t) {
		String txt="**********Hilo :"+t.getName()+"********\n";
		txt+="id= "+t.getId()+"\n";
		txt+="Estado= "+t.getState()+"\n";
		txt+="Clase = "+t.getClass().getName()+"\n";
		txt+="Prioridad ="+t.getPriority()+"\n";
		txt+="***************************************\n";
		System.out.println(txt);
	}
	public static void imprimir(Runnable r) {
		Thread hiloActual=Thread.currentThread();
		String txt="**********Hilo :"+hiloActual.getName()+"********\n";
		txt+="id= "+hiloActual.getId()+"\n";
		txt+="Estado= "+hiloActual.getState()+"\n";
		txt+="Clase = "+hiloActual.getClass().getName()+"\n";
		txt+="Prioridad ="+hiloActual.getPriority()+"\n";
		txt+="***************************************\n";
		System.out.println(txt);
	}
//	public static void main(String[] args) throws InterruptedException {
//		Thread principal=Thread.currentThread();
//		principal.setName("Princiapl");
//		imprimir(Thread.currentThread());
//		principal.sleep(miliAle(1, 9));
//		imprimir(principal);
//		principal.wait(2000);
//		imprimir(principal);
//		
//		
//	}
}
