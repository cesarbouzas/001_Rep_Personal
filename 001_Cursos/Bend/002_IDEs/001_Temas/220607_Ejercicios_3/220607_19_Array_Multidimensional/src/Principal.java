
public class Principal {

	public static void main(String[] args) {
	int[][] dosDimensiones= {{0,1,2,3,4},{0,1,2,3,4}};
	int[][][] tresDimensiones= {
			{
				{0,1,2,3,4},
				{0,1,2,3,4},
				{0,1,2,3,4}
				},	
				{
				{5,6,7,8,9},
				{1,1,2,5,99},
				{1,1,2,5,99}
			}
			};//[2][3][5]
	ArrayDimensiones.imprimirArray(dosDimensiones);
	ArrayDimensiones.imprimirArray(tresDimensiones);
	}


}
 
