
public class principal {

	
	public static void main(String[] args) {
		
		int[] aEnteros={5,6,7,8,6,9,4,2,8,9};
		String[] aString= {"En","un","lugar","de","la","mancha","de","cuyo","nombre","no","quiero","acordarme"};
		
		Arrays_numeros_String.impArray(aEnteros);
		Arrays_numeros_String.impArray(aString);
		System.out.println("---------------------");
		Arrays_numeros_String.sacarPosN(aString, 10);
		System.out.println("**********************");
		Arrays_numeros_String.impArray(aEnteros,10);
		System.out.println("--");
		for(int i=0;i<aEnteros.length;i++) {
		Arrays_numeros_String.impArray(aEnteros,i+1);
		}
		System.out.println("--");
		Arrays_numeros_String.impArray(aEnteros,11);
	}	
		
}
