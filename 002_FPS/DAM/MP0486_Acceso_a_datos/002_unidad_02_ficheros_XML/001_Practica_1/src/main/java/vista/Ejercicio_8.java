
package vista;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class Ejercicio_8 {

    
    public static void borrar (File dir){
        //Para borrar también tenemos que hacer una recorrido recursivo.
            File archivosaborrar[]=dir.listFiles();
            System.out.println(archivosaborrar.length);
            for (File arch:archivosaborrar){
              if (arch.exists()&& arch.isFile()) 
                 arch.delete();
              else  borrar(arch);
            }
            dir.delete();
    }
public static void borrarFicheros(File dir){
    File[] contenido;
    if(dir.exists()&&dir.isDirectory()){
            contenido=dir.listFiles();
            for(File item:contenido){
                if(item.isDirectory()){
                   borrarFicheros(item);
                }else{
                    item.delete();
                    System.out.println("Fichero "+item.getPath()+" borrado");
                }
            }
    }else if(dir.isFile()&& dir.exists()){
        dir.delete();
        System.out.println("Fichero "+dir.getPath()+" borrado");
     }
}
public static void borrarDirectorio(File file){
    if(file.exists()&& file.isDirectory()){
        if(file.delete()){
            System.out.println("Directorio "+file.getPath()+" borrado");
        }else{
            File[] contenido=file.listFiles();
            for(File item:contenido){
                if(item.isDirectory()){
                    borrarDirectorio(item);
                }else{
                    borrarFicheros(item);
                    
                }
            }
        }

    }   
    }
    
public static void main(String args[]){
    File deportes=new File("./src/deportes");
    deportes.mkdir();
    System.out.println("directorio creado");
    borrar(new File("./src/deportes"));
}

}
