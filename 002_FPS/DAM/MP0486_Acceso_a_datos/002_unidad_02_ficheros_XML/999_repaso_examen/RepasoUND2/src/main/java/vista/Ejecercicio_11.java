
package vista;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Ejecercicio_11 {
    
    public static void main(String args[]) throws IOException{
    File foto=new File("./src/main/cesar.jpg");
    File foto2=new File("./src/main/cesarCopia.jpg");
    foto2.createNewFile();
    int c;
    try{
    FileInputStream fIS=new FileInputStream(foto);
    FileOutputStream fOS=new FileOutputStream(foto2);
    while((c=fIS.read())!=-1){
        fOS.write(c);
    }
    fIS.close();
    fOS.close();
    }catch(FileNotFoundException ex){
        ex.printStackTrace();
    }
    
}
    }