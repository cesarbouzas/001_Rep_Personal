
package vista;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Usuario
 */
public class Ejercicio_9 {
    
    public static void borrarDirectorio(File dir){
    if(dir.exists()&& dir.isDirectory()){
    File[] contenido=dir.listFiles();
    for(File item:contenido){
        if(item.delete()){
            System.out.println(item.getParent()+ "borrado");
        }else{
            borrarDirectorio(item);
        }
        }
    }
     dir.delete();
    }
    
    
    public static boolean crearFichero(File fich){
        boolean result=false;
        if(!fich.exists()){
            fich.getParentFile().mkdirs();            
            try {
                if(fich.createNewFile()){
                    result=true;
                }
            } catch (IOException ex) {
                System.out.println("error al crear el fichero");
            }
        }
        
        return result;
    }
    
    public static String ListarDirectorio(File f){
        String result="";
        if(f.exists()&& f.isDirectory()){
            File[] contendio=f.listFiles();
            for(File item:contendio){
                if(item.isFile()){
                result+=String.format("%-40s%-7s%-10d\n",item.getName(),"----->",item.getTotalSpace());
            }else{
                  result+=String.format("%-100s%-7s%-10s\n",item.getName(),"----->","directorio");
                }}
        }else{
            result="El directorio no es válido";
        }
        return result;
    }
    
    public static void escribirEnArchivo(String txt,File file){
        
        try {
            DataOutputStream dOS=new DataOutputStream(new FileOutputStream(file));
            dOS.writeChars(txt);
      
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio_9.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void copiarFichero(File origen,File destino){
        try {
            try (OutputStream oS = new FileOutputStream(destino); 
                 InputStream iS = new FileInputStream(origen)) {
                byte[] buffer=new byte[1024];
                int bytesRead;
                while((bytesRead=iS.read(buffer))>0){
                    oS.write(buffer,0,bytesRead);
                }
            }
         
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio_9.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
    

    public static void main(String args[]) {
        
      
        
            String msg=ListarDirectorio(new File("C:/"));
            borrarDirectorio(new File ("./src/main/resources/origen.txt"));
            File origen=new File("./src/main/resources/origen.txt");
            File destino=new File("./src/main/resources/destino.txt");
            crearFichero(origen);
            crearFichero(destino);
            escribirEnArchivo(msg, origen);
            copiarFichero(origen, destino);
            
      
    }
}
