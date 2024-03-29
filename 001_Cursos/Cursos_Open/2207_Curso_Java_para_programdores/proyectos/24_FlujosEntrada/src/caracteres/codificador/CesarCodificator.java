package caracteres.codificador;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CesarCodificator extends CodificadorCesar {

	public static void main(String[] args) {

		 
		final int OFFSET=3;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		String linea=null;
		try {
			br=new BufferedReader(new FileReader("mensaje.txt"));
			bw=new BufferedWriter(new FileWriter("mensajetrucado.txt"));
			
			while((linea=br.readLine())!=null) {
				StringBuilder sb=new StringBuilder(linea.length());
				char[]lineaArray=linea.toUpperCase().toCharArray();
				for(char c:lineaArray) {
					if(Character.isLetter(c)) {
					int intValue=(int)(c-'A');
					intValue=(intValue+OFFSET)%26;
					c=(char)(intValue+'A');
					sb.append(c);
				}else {
					sb.append(c);
				}}
				bw.write(sb.toString());
				bw.newLine();
				
			}
			System.out.println("fichero creado correctamente");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			br.close();
			
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
			bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
