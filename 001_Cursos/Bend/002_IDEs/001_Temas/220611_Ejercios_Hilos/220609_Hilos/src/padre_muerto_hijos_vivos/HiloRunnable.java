package padre_muerto_hijos_vivos;


import tools.Hilo;

public class HiloRunnable implements Runnable{

	Thread hi;
	
	public HiloRunnable(Thread t) {
		hi=t;
	}
	
	public void run() {
		for(int i=0 ;i<2;i++) {
	
		Hilo.imprimir(Thread.currentThread());
		Hilo.imprimir(hi);
		System.out.println(hi.isAlive());
		}			
	}

	public static void main(String[] args) throws Exception {
		Thread principal=Thread.currentThread();
		principal.setName("principal");
		Thread hilo1=new Thread(new HiloRunnable(principal),"1");
		Thread hilo2=new Thread(new HiloRunnable(principal),"2");
		Thread hilo3=new Thread(new HiloRunnable(principal),"3");
		
//		Thread principal=Thread.currentThread();
//		principal.setName("principal");
//		Thread t=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=0 ;i<2;i++) {
//					Hilo.imprimir(Thread.currentThread());
//					Hilo.imprimir(principal);
//			}}
//			});
//		t.start();
		hilo1.start();
		//hilo1.join();
		hilo2.start();
		//hilo2.join();
		hilo3.start();
		Hilo.imprimir(principal);

	}


}

