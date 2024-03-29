public class Bolas_Aleatroias {
	final static String[] COLORES={"Azul","Roja","Verde","Amarillo","Rosa"}; 
	public static String buscarColor(int n) {
		
		if(n<COLORES.length) {	
			return COLORES[n];
		}else {
			return "Color no valido";
		}
	}
	// n bolas para c colores diferentes;
	public static String[] sacarBolasColores(int n,int c) {
		double valor;
		int numero=0;
		String[] resultados=new String[n];
		System.out.print("\n{");
		for(int i=0;i<n;i++) {
			valor=(Math.random()*(c-1));
			numero=(int)Math.round(valor);
			resultados[i]=buscarColor(numero);
			if(i<n-1) {
			System.out.print(resultados[i]+",");
			}else {
				System.out.print(resultados[i]+"}");	
			}
		}
				return resultados;
	}
	public static int contarBolasColor(String[] colores,String color) {
		int n=0;
		for(int i=0;i<colores.length;i++) {
			if(colores[i]==color) {
				n++;
			}		
		}
		return n;
	}
	public static void sacarBolasHastaColor(int n,int ncolores,String c) {
	double valor;
	int numero=0;
	System.out.print("\n{");
	String[] resultados=new String[n];
	int i=0;
	do {
	valor=(Math.random()*(ncolores-1));
	numero=(int)Math.round(valor);
	resultados[i]=buscarColor(numero);
	if(i<n-1) {
	System.out.print(resultados[i]+",");
	}else {
		System.out.print(resultados[i]+"}");	
	}
	i++;
	}while((c!=resultados[i-1])&&(i<n));
		
	}
	
	public static void main(String[] args) {
		sacarBolasColores(10, 3);
		sacarBolasColores(10, 4);
		sacarBolasColores(10,5);
		sacarBolasColores(10, 6);
		System.out.print("->Han salido "+contarBolasColor(sacarBolasColores(10, 3), COLORES[0])+" bolas azules");
		sacarBolasHastaColor(10, 3,"Azul");
		sacarBolasHastaColor(20, 5,"Amarillo");
	}

}
