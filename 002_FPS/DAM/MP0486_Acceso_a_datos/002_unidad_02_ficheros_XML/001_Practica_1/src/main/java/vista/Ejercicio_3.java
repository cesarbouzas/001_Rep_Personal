
package vista;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {
    

public static void main(String[] args){

    File file=new File("./");
    if(file.exists()){
        System.out.println("La ruta introduida es válida");
        File[] archivos=file.listFiles();
     if(file.isDirectory()){
        for (File archivo : archivos) {
            if(archivo.isFile()){
                System.out.printf("%-120s%-10s%-10d kb\n",archivo.toString(),"------>",archivo.length());
                
            }else{
                System.out.printf("%-120s%-10s\n",archivo.toString(),"------> Directtorio");
            }
        }
     }else{
            if(file.isFile()){
                System.out.printf("%-120s%-10s,%-10d kb\n",file.toString(),"------>",file.length());
                
                }
        }
    }
    
    
    
    
}

}
