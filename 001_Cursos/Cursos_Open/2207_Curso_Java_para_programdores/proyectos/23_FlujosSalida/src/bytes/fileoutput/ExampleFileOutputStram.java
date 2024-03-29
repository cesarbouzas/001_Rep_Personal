package bytes.fileoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.IntStream;

public class ExampleFileOutputStram {

	public static void main(String[] args) {
	
		FileOutputStream fOut=null;
		
		try {	
			fOut=new FileOutputStream("first.dat");
			for(int i=0;i<1000;i++) {
				fOut.write(i);
			};		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			if(fOut!=null) {
				try {	
					fOut.close();
				}catch(IOException e) {
					e.printStackTrace();	
				}
	}
}
}
	}