package Ejercicio_58_Stream_IntStream;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
public class Nombres_IntStream {
	
	public static void main (String args[]) {	
		List<String> nombres=new ArrayList<>();
		nombres.add("Cesar");
		nombres.add("Mateo");
		nombres.add("Natividad");
		nombres.add("Manuel");
		AtomicInteger contador = new AtomicInteger(0);
	
		contador.set(0);

		System.out.println(nombres);
		nombres.stream()
				.map(x->x.length())
				.mapToInt(x->x)
				.forEach(x->{
					String txt;
					if(contador.get()==0) {
					txt="{"+Integer.toString(x) + (((nombres.size())==contador.incrementAndGet())?"}":",");}else {
						txt=Integer.toString(x) + (((nombres.size())==contador.incrementAndGet())?"}":",");
					}
					System.out.print(txt);
				});
		System.out.println("\n");
		IntSummaryStatistics estadisticas=nombres.stream().mapToInt(x->x.length()).summaryStatistics();
		System.out.println(estadisticas);
		
		
	}

}
