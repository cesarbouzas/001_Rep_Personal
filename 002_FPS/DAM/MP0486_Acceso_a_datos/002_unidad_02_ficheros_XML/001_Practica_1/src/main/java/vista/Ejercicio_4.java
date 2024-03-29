
package vista;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Usuario
 */
  
public class Ejercicio_4 {   
    public static void main(String args[]){
           File file=new File("./src/main/resources");
        
      if(file.exists()){  
        String[] archivos = file.list(new FilenameFilter() {
                   @Override
                   public boolean accept(File dir, String name) {
                       return name.startsWith("E");
                   }
        
               }
        );
        for(String archivo:archivos){
            File itemFile=new File(file.getPath()+"/"+archivo);
            System.out.printf("%-120s%-10s%-10d kb\n",itemFile.toString(),"----->",itemFile.length());
        }        
                       
     }          
          
  
    }
}
