
package vista;
//Escribe un programa que permita visualizar todos los archivos que empiecen con la letra “E” en un
//directorio concreto. Muestra de cada uno de ellos su nombre y tamaño.

import java.io.File;
import javax.swing.filechooser.FileFilter;

//Recuerda que primero debes crear el filtro y a continuación aplicarlo al método list o listfiles.


public class Ejercicio4 {
    
    public static void main (String ags[]){
    
        File directory=new File("./src/main/resources/");
        filtroEmpiezapor filtro=new filtroEmpiezapor();
        for(File f:directory.listFiles(filtro)){
        
            System.out.println(f.getName());
        }
    
    }
    
   static class filtroEmpiezapor implements java.io.FileFilter{

        @Override
        public boolean accept(File pathname) {
        
          return  pathname.getName().startsWith("e", 0);
                
            
        }
    
    }
    
}
