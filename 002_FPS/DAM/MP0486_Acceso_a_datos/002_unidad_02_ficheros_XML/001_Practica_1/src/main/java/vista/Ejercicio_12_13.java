
package vista;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Ejercicio_12_13 {
    public static void main (String arg[]){
         File ficheroOrigenPersona =new File("./src/main/resources/ficheroOrigenPersona.dat");
        EscribirFicheroPerosnas(ficheroOrigenPersona);
        leerFicheroPersonas(ficheroOrigenPersona);
        
    }  
   public static void EscribirFicheroPerosnas(File ficheroOrigenPersona){     
   
        HashMap<String ,Double[]> personas=new HashMap<>();
        personas.put("Cesar", new Double[]{46D,1860.35});
        personas.put("Pablo", new Double[]{49D,3690.99});
        personas.put("Roman", new Double[]{46D,2200.49});
        personas.put("Alfonso", new Double[]{30D,1860.35});
        personas.put("Andres",new Double[]{31D,1790.34});
        personas.put("Urdaneta", new Double[]{48D,1923.87});
        personas.put("Iria",new Double[]{45D,2298.87});
        System.out.println(personas.size());
        try{
            ficheroOrigenPersona.createNewFile();       
            FileOutputStream fOS=new FileOutputStream(ficheroOrigenPersona);
            DataOutputStream dOS=new DataOutputStream(fOS);
       for(String key:personas.keySet()){
         dOS.writeUTF(key);
         dOS.writeDouble(personas.get(key)[0]);
         dOS.writeDouble(personas.get(key)[1]);
       
          }
            dOS.close();
        }catch(IOException ex){
            System.out.println("Error de creación del fichero");
        }
    }
   
   public static void leerFicheroPersonas(File ficheroOrigenPerosnas){
        try {
            FileInputStream fIS=new FileInputStream(ficheroOrigenPerosnas);
            DataInputStream dIS=new DataInputStream(fIS);
            while(dIS.available()>0){
            String nombre=dIS.readUTF();
            Double edad=dIS.readDouble();
            Double sueldo=dIS.readDouble();
                System.out.println(nombre+" "+edad+" "+sueldo);
            }
            dIS.close();
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio_12_13.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
   
} 
    
    
    
    
