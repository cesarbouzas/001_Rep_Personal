package bytes.fileinput;

import java.io.FileInputStream;
import java.io.IOException;

public class ExampleFileInputStream {

	public static void main(String[] args) {
		
		
		FileInputStream fInS=null;
		
		try {
			fInS=new FileInputStream("first.dat");
			int c;
			int contador=0;
			while((c=fInS.read())!=-1) {
			contador++;
			if(c%30==0) {
				System.out.println("\n");
			}
			System.out.print(c+" ");
			}
			System.out.println(contador);
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			if(fInS!=null) {
			try {
				fInS.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

 }
}