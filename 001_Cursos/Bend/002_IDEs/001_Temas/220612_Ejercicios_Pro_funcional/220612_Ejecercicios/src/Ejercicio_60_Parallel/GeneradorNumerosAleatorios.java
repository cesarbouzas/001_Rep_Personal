package Ejercicio_60_Parallel;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class GeneradorNumerosAleatorios extends Thread {
AtomicInteger c=new AtomicInteger(0);	

	
	
public void run() {
	for(int i=0;i<26;i++) {
	IntStream.generate(()->(int)(Math.random()*1000)).parallel().limit(1).forEach(x->System.out.println("El aleatorio "+c.getAndIncrement()+ " para la hora "+LocalDateTime.now().toString()+" es :"+x));
	try {
		this.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}	
	}
}
}