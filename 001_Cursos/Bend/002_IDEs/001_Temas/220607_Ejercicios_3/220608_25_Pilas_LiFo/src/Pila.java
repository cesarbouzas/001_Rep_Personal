

import java.util.Stack;


public class Pila {
	
	public static void main(String arg[]) {
	
	String[] platos= {"plato0","plato1","plato2","plato3","plato5"};
	
	Stack <String> pilaPlatos=new Stack<String>();
	
	for(String s:platos) {
	pilaPlatos.add(s);
	}
	System.out.println(pilaPlatos);
	pilaPlatos.push("ultimo");
	System.out.println(pilaPlatos);
	pilaPlatos.pop();
	pilaPlatos.pop();
	System.out.println(pilaPlatos);
	System.out.println("Añadimos Sarten y cazo");
	pilaPlatos.push("sarten");
	pilaPlatos.add("Cazo");
	System.out.println(pilaPlatos);	
	System.out.println("Borramos todos los elementos uno por uno");
	while(!pilaPlatos.isEmpty()) {
		pilaPlatos.pop();
		System.out.println(pilaPlatos);
	}
	
	
	
	
	
	}
	
}


