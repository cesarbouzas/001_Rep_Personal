
public abstract class ArrayTools {
	
	public static void conatarValor(int[] array ,int valor) {
		int nVeces=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==valor) {
				nVeces++;
			}
		}
		switch(nVeces){
			case 0:
				System.out.println("El numero "+ valor+" no aprece.");
				break;
			case 1:
				System.out.println("El numero "+ valor+" aparece "+nVeces+ " vez");
				break;
			default:
				System.out.println("El numero "+ valor+" aparece "+nVeces+ " veces");
		}
		} 

}
