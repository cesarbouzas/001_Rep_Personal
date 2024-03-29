package bytes.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaByte extends CopyBytes {

	public static void main(String[] args) {
		
		BufferedInputStream Bin=null;
		BufferedOutputStream Bout=null;

		final int TAM=1024*16;
		int cantidadBytes=0;
		byte[] buffer=new byte[TAM];
		try {
			Bin=new BufferedInputStream(new FileInputStream("openwebinars.jpg"));
			Bout=new BufferedOutputStream(new FileOutputStream("copia2.jpg"));
			while ((cantidadBytes=Bin.read(buffer,0,TAM))!=-1) {
				Bout.write(buffer,0,cantidadBytes);
			}
			System.out.println("El fichero ha sido copiado correctamente");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(Bin!=null&&Bout!=null) {
				try {
				Bin.close();
				Bout.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
			

	}

}}
