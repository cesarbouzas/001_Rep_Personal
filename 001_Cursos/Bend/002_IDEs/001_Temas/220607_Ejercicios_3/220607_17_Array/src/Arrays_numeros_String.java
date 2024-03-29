
public abstract class Arrays_numeros_String {
	
public static void impArray(int[] enteros) { 
	String txt="{";

	for(int i=0;i<enteros.length;i++) {
		if(i!=enteros.length-1) {
			txt+=enteros[i]+",";
		}else  {
			txt+=enteros[i]+"}";
		}
	}
	System.out.println(txt);
}
public static void impArray(int[] enteros,int pos) { 
	String txt="{";
if(pos<=enteros.length) {
	for(int i=0;i<pos;i++) {
		if(i!=pos-1) {
			txt+=enteros[i]+",";
		}else  {
			txt+=enteros[i]+"}";
		}
	}
}else {
	txt="Posicion erronea, fuera del array, debe ser menor de "+enteros.length;
}
	System.out.println(txt);
}

public static void impArray(String[] cadenas) { 
	String txt="{";

	for(int i=0;i<cadenas.length;i++) {
		if(i!=cadenas.length-1) {
			txt+=cadenas[i]+",";
		}else  {
			txt+=cadenas[i]+"}";
		}
	}
	System.out.println(txt);
}


public static void sacarPosN(String[] cadenas, int veces ) {
	String txt="";
	for(int i=0;i<veces;i++) {
		int pos= (int)(Math.random()*(cadenas.length-2));
		if(i<=(veces-1)) {
			txt+=cadenas[pos]+" ";
		}else{
			txt+=cadenas[pos]+".";
		}
	}
	System.out.println(txt);
} 
	

	
	
	

}
