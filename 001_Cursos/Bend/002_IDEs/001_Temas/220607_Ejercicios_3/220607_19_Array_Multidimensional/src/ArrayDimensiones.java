
public abstract class ArrayDimensiones {
	
	public static void imprimirArray(int[][] a2D) {
		String txt="{";
		for(int i=0 ;i<a2D.length;i++) {
			
			
			for(int j=0;j<a2D[i].length;j++) {
				if(j==0) {
					txt+="{"+a2D[i][j]+",";;
				}else if(j==a2D[i].length-1) {
					txt+=a2D[i][j]+"}";
				}else {
					txt+=a2D[i][j]+",";
				}	
			}
			if(i<a2D.length-1) {
				txt+=",";
			}else{
				txt+="}";
			}
		}
		System.out.println("El array de dos dimensiones es: "+txt);
	}
	
	public static void imprimirArray(int[][][] a3D) {
		String txt="{\n";
		int sum=0;
		for(int i=0 ;i<a3D.length;i++) {
			txt+=" {\n";
			for(int j=0 ;j<a3D[i].length;j++) {
				for(int k=0;k<a3D[i][j].length;k++){
					sum+=a3D[i][j][k];
					if(k==0) {
						txt+="  {"+a3D[i][j][k]+",";;
					}else if(k==a3D[i][j].length-1) {
						txt+=a3D[i][j][k]+"}";
					}else {
						txt+=a3D[i][j][k]+",";
						
					}	
				}
				if(j<a3D[i].length-1) {
					txt+=",\n";
				}else{
					txt+="}\n";
				}
			}
			txt+="}";	
		}
		
		System.out.println(txt+"=> Donde la Suma es :"+sum);;//30+35+108x2=281
	}
	
	}

	
