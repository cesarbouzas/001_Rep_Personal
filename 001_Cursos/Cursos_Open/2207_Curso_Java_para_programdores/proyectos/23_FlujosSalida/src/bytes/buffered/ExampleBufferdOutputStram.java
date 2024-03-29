package bytes.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExampleBufferdOutputStram extends EjemploBufferedOutputStream {

	public static void main(String[] args) {
	
		byte[] buffer=new byte[1024*32];
		Arrays.fill(buffer, Byte.parseByte("1"));
		BufferedOutputStream bos=null;
		
		try {
			bos=new BufferedOutputStream(new FileOutputStream("buffered2.dat"));
			bos.write(buffer);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bos!=null) {
				try {
					bos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}		
			}
		}
	}

}
