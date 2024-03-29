package vista;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        File file=new File("./src/main/resources/archivo.txt");
        
        if(file.exists()){
            System.out.println("El fichero "+file.getName()+" existe  y teiene un tamaño de "+file.length()+" bytes");
            
        }else{
            System.out.println("El fichero  "+file.getName()+" no existe ");
            System.out.println(file.exists());
            String root=file.getParent();
            System.out.println(root); 
        }
        
    }
}
