
package vista;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Ejercicio_16_17 {

public static boolean escribriFicheroRAF(File f,Persona p){
    boolean result=false;
    
    
        //me situo al final para escibir en el fichero
        try (RandomAccessFile rAF = new RandomAccessFile(f, "rw")) {
            //me situo al final para escibir en el fichero
         
            rAF.writeByte(p.getId());
            StringBuffer buffer=new StringBuffer(p.getNombre());
            buffer.setLength(10);
            rAF.writeChars(buffer.toString());
            rAF.writeInt(p.getEdad());
            rAF.writeDouble(p.getSueldo());
            result=true;
        
    } catch (IOException ex) {
        System.out.println("Error de IOE");
    }
    return result;
}
   public static ArrayList<Persona> leerRAFCompleto(File f){
   ArrayList<Persona> personas=new ArrayList<>();
   try(
   RandomAccessFile rAF=new RandomAccessFile(f,"r");
     ){
       rAF.seek(0);
       int numRegistro=1;
       int id;
       String name;
       int edad;
       double sueldo;
       while(rAF.getFilePointer()<rAF.length()){
          // rAF.seek((numRegistro-1)*(4+10+4+8));
           id=rAF.readInt();
           //rAF.seek(4);
           
           byte[] nombreBytes=new byte[10];
           rAF.readFully(nombreBytes);
           name=new String(nombreBytes).trim();
           
           //rAF.seek(10);
           edad=rAF.readInt();
           //rAF.seek(4);
           sueldo=rAF.readDouble();
          // rAF.seek(8);
           personas.add(new Persona(id,name,edad,sueldo));
           //numRegistro++;
           System.out.println(personas.get(numRegistro-1).toString());
           numRegistro++;
       }
       
    }catch (IOException e){
               System.out.println("Error de lectura "+e.getMessage());
           }
   
   
   
   return personas;
   }
    
    public static void main(String args[]) {
        File file=new File("./src/main/resources/personasRAF.txt");
    try {
        if(file.exists()){
            file.delete();
        }
        file.createNewFile();
    } catch (IOException ex) {
        Logger.getLogger(Ejercicio_16_17.class.getName()).log(Level.SEVERE, null, ex);
    }
        Persona p1=new Persona("Cesar", 46, 3456.87);
        Persona p2=new Persona("Andres",31,1980.23);
        escribriFicheroRAF(file, p1);
        escribriFicheroRAF(file, p2);
        ArrayList<Persona> Personas=leerRAFCompleto(file);
        for(Persona p:Personas){
            System.out.println(p);
        }
    }
    
    
}
