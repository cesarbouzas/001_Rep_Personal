
package vista;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;


public class Ejercicio_11 {
    
    
public static void main(String args[]){    
File imagenOrigen=new File("./src/main/resources/decena_Mateo_Bouzas.jpg");
File imagenDestino=new File("./src/main/resources/img_desino.jpg");

if(imagenOrigen.exists()){
    try {
        if(imagenDestino.createNewFile()||imagenDestino.exists()){
            FileInputStream fIS=new FileInputStream(imagenOrigen);
            FileOutputStream fOS=new FileOutputStream(imagenDestino);
            File fichero=new File("./src/main/resources/imagen.txt");
            FileWriter fW=new FileWriter(fichero);
            byte[] buffer=new byte[1024];
            int bytesLeidos=0;
            ByteArrayOutputStream BAOS=new ByteArrayOutputStream();
            while((bytesLeidos=fIS.read(buffer))!=-1){
                BAOS.write(buffer, 0, bytesLeidos);
                for(byte item:buffer){
                    fW.write(item );
                }
                
                }
           
            fOS.write(BAOS.toByteArray());
        }else{
            System.out.println("Error en el fichero de destino");
        }
    } catch (IOException ex) {
        System.out.println("El fichero origen no existe");;
    }
    
}




}
}