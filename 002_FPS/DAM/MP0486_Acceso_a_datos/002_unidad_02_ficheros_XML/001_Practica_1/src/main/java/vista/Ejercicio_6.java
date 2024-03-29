
package vista;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class Ejercicio_6 {
    
    public static void  listarDirectorio(File file){
        File[] result=null;
        if(file.exists()||file.isDirectory()){
            result=file.listFiles();
           for(File archivo:result) {
              if(archivo.isDirectory()){
                  System.out.println("**********Directorio-->"+archivo.getPath());
                 listarDirectorio(archivo);   
           }else if(archivo.exists()||archivo.isFile()){
            System.out.printf("%-70s%-7s%-5d kb\n",archivo.getPath(),"---->",file.length());
           }
           
           }    
        }else{
            System.out.println("Error de listado de fichero");
            System.exit(-1);
        }
       
    }
    
    
    public static void main(String args[]){
    File base=new File("./src/deportes/");
    System.out.println("El fichero base existe");
        listarDirectorio(base);
    }
    }
    
    

