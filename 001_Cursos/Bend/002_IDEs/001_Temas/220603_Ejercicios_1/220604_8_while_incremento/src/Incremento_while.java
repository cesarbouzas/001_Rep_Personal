
public class Incremento_while {

	public static void  incrementoVariable(int n) {
	int i=1;
		
		while(i <=n) {
			if(i<n) {
			System.out.print(i+",");
			}else {
			System.out.print(i+".");	
			}
			if(i%40==0) {
				System.out.print("\n");
			}
			i++;
		}
	}
	public static void main(String[] args) {
		incrementoVariable(200);
	}

}
