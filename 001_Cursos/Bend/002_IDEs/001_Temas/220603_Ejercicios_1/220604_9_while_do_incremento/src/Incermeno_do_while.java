
public class Incermeno_do_while {
	public static void incrementarVariable(int n) {
	int i=1;
	do {
		if(i<n) {
			System.out.print(i+",");
		}else {
			System.out.print(i+".");	
		}
		if(i%40==0) {
			System.out.print("\n");
		}
		i++;
		}while(i<n);
	}
	
	
	
	public static void main(String[] args) {
		incrementarVariable(200);

	}

}
