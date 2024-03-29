import java.util.LinkedList;
public class lista_String_Ordenada {
	

	public static void main(String[] args) {
		LinkedList<String> palabras=new LinkedList<>();
		palabras.add("aaa");
		palabras.add("trac");
		palabras.add("tor");
		palabras.add("vol");
		palabras.add("ador");
		palabras.add("aaa");
		int i=0;
		System.out.println("Con index.of()------>Con un contador------------.....>Hashcode");
		for(String s:palabras) {
			System.out.print("Pos["+palabras.indexOf(s)+"]= "+s+"-----------> ");
			System.out.println("Pos["+(i++)+"]= "+s+" ---->hashcode----->"+s.hashCode());
		}
		
	}
	
	
	

}
