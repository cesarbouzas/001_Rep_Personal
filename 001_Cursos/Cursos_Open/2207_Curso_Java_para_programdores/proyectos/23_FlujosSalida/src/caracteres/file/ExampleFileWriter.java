package caracteres.file;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter extends EjemploFileWriter {
	
	public static void main(String args[]) {
		
		FileWriter fw=null;
		String msg="Me llamo cesar y estoy sufriendo por falta de timepo";
		
		try {
			fw=new FileWriter("miprimerarchivo_char_achar.txt");
			for(char c:msg.toCharArray()) {
			fw.write(c);}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) {
				try {
					fw.close();
				}catch(IOException e) {
					e.printStackTrace();
			}
		}
	}

}
}