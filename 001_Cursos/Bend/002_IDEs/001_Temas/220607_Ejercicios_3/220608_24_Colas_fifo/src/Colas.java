
import java.util.LinkedList;
import java.util.Queue;
public class Colas {
	
	
	public static void main(String[] args) {

	Queue <String> cola=new LinkedList<>();
	
	System.out.println("*********              ***********");
	System.out.println("          Caja Cerrada\n");
	String[] clientes= {"Natividad","Raquel","Cesar","Manuel","Mateo"};
	String txtIN="";
	for(String s:clientes) {
		cola.offer(s);
		txtIN+=s+",";
		System.out.println("|caja1  | \n|cerrada|<--- "+txtIN+"\n");
	}
	System.out.println("*********SE ABRE LA CAJA***********\n");
	
	String txtOUT="";
	for(String s:clientes) {
	txtOUT+=cola.poll()+",";
	txtIN=txtIN.replace((s+","),"");
	System.out.println(txtOUT+"<-[caja1 abierta]<--- "+txtIN+"\n");
	}
	
	
	System.out.println("Cola vacia "+cola+"\n");
	System.out.println("Añadimos a Natividad\n");
	cola.add("\nNatividad\n");
	
	System.out.println(cola+"\n\n");
	
	//Carlos me dice que para borar una lista siempre con el for normal
	
	Queue <String> cola2=new LinkedList<>();
	cola2.offer("perosan1");
	cola2.offer("perosan2");
	cola2.offer("perosan3");
	cola2.offer("perosan4");
	cola2.offer("perosan5");
	cola2.offer("perosan6");
	cola2.offer("perosan7");
	cola2.offer("perosan8");
	cola2.offer("perosan9");
	
	int n=cola2.size();
	for(int i=0;i<n;i++) {
		cola2.remove();
		System.out.println(cola2);
	}
	///Se pude hacer sin sacar fuera el tamaño??????
	
	cola2.offer("perosan1");
	cola2.offer("perosan2");
	cola2.offer("perosan3");
	cola2.offer("perosan4");
	cola2.offer("perosan5");
	cola2.offer("perosan6");
	cola2.offer("perosan7");
	cola2.offer("perosan8");
	cola2.offer("perosan9");
	
	while(!cola2.isEmpty()) {
	
		cola2.poll();
		System.out.println(cola2);
	}
	
	cola2.offer("perosan1");
	cola2.offer("perosan2");
	cola2.offer("perosan3");
	cola2.offer("perosan4");
	cola2.offer("perosan5");
	cola2.offer("perosan6");
	cola2.offer("perosan7");
	cola2.offer("perosan8");
	cola2.offer("perosan9");
	
	while(!cola2.isEmpty()) {
	//try {
		cola2.remove();
		System.out.println(cola2);
		
	//}catch(Exception e) {
		//System.out.println("Cola vacia");
	//}

		

	
	}}}


