
package vista;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
/**
 *
 * @author Usuario
 */
public class Ejercicio_4_B implements FilenameFilter {
private String empieza;

    
    public Ejercicio_4_B(String empieza){
        this.empieza=empieza;
    }
    
    @Override
    public boolean accept(File dir, String name){ 
    return name.startsWith(empieza);
    }
    
   public static void main(String args[]){ 
       System.out.println("Bienvenido al programa de filtradoo de puta pesada en la cafeteria");
    File file=new File("./src/main/resources");
    if(file.exists()){
        System.out.println("La ruta es introduducida es correcta");
        if(file.isFile()){
            System.out.println("La direccion existe y es un archivo ");
        }else if(file.isDirectory()){
            System.out.println("La ruta es un directorio. ");
            File[] files=file.listFiles(new Ejercicio_4_B("E"));
            Arrays.stream(files)
            .filter(x->x.isFile()||x.isDirectory())
            .forEach(x->System.out.printf("%-20S%-7S%-10d kb \n",x.getName(),"---->",x.length()));
            System.out.println("La zorra de la cafeteria sigue hablando a todo volumen");
        }else{
            System.out.println("Error inesperado de filtrado");        }
   }else{
        System.out.println("La ruta introducida no existe ");
    }
   }
}
