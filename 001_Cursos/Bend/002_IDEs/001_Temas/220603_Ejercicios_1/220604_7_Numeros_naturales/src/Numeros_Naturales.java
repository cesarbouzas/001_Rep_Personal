
public class Numeros_Naturales {
	
	public static void mostrarNaturales(int n) {
	String txt="";
	for(int i=1;i<=n;i++) {
		if(i<n) {
			txt=txt.concat(Integer.toString(i)+"+");
		}else {
			txt=txt.concat(Integer.toString(i)+".");
		}
	}
	System.out.println("Los "+n+ " primeros numeros naturales son :"+txt);
	}
	
	
	public static void sumarnNaturales(int n) {
	String txt="";
	int resultado=0;
	for(int i=1;i<=n;i++) {
		resultado+=i;
		if(i<n) {
			txt=txt.concat(Integer.toString(i)+"+");
		}else {
			txt=txt.concat(Integer.toString(i)+"=");
		}
	}
	System.out.println("La suma de los "+n+ " primeros numeros naturales es :"+txt+resultado);
	}
	public static void mostarMatiz(int a[]) {
		System.out.print("{");
		for(int j=0;j<a.length;j++) {
		if(j<a.length-1) {
			System.out.print(a[j]+",");}
		else {
			System.out.println(a[j]+"}");}
		}
	}
	public static void buscarElmentoenArray(int ele,int a[]) {
		int pos[]=new int [a.length];
		int sum=0;
		mostarMatiz(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				pos[i]=1;
				System.out.println("Elemento "+ele+" encontrado en posicion :"+(i+1));
			}else {
				pos[i]=0;
			}
			sum+=pos[i];
		}	
		System.out.println("Elemento "+ele+" se ha encontrada :"+sum+" veces");
		mostarMatiz(a);
		mostarMatiz(pos);
	}
	
	
	public static void main(String args[]) {
		mostrarNaturales(15);
		sumarnNaturales(20);
		int s[]= {44,44,2,1,2,2,2,2,3,4,1,44,44,2};
		buscarElmentoenArray(44, s);
		
	}
}
