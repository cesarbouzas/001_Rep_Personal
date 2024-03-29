
package vista;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Ejercicio_14_15 {
    
    public static void escribirPersonasFichero(File f,ArrayList<Persona> personas){
     try{
        if(f.createNewFile()||f.exists()){
            try (FileOutputStream fOS=new FileOutputStream(f,true);
                    ObjectOutputStream oOS = new ObjectOutputStream(fOS)) {
                for(Persona p:personas){
                oOS.writeObject(p);
                System.out.println("Persona Grabada en fichero :");
                System.out.println(p.toString());}
            }
        }
       
     }catch(IOException e){
         System.out.println("Error con el fichero");
     } 
     
    }
    public static ArrayList<Persona> leerPersonasFichero(File f){
        ArrayList<Persona> personasLeidas=new ArrayList<>();
        if(f.exists()){
            try (
                FileInputStream fIS=new FileInputStream(f);
                ObjectInputStream oIS=new ObjectInputStream(fIS);
                    ){
                Persona personaLeida;
                while(true){
                   
                    personaLeida=(Persona)oIS.readObject();
                    personasLeidas.add(personaLeida);
                   
                  } 
            }catch (EOFException fxs){
                System.out.println("Final del fichero");
            }catch (IOException  e){
                System.err.println("Error IOE ");
            }catch(ClassNotFoundException c){
                System.out.println("no mas objetos persona encontrados");
            }
        
        }else{
           
            System.out.println("El fichero no existe");
        }
    
        return personasLeidas;
    }
    
    
    public static void main(String arg[]){
    File f=new File("./src/main/resources/ficheroBinarioOrigen.txt");
    Persona p1=new Persona("Cesar", 46, 3890.34);
    Persona p2=new Persona("Alfonso", 31, 2890.34);
    Persona p3=new Persona("Andres", 30, 3790.34);
    Persona p4=new Persona("Iria", 44, 2290.34);
    Persona p5=new Persona("Urdaneta", 48, 1990.34);
    Persona p6=new Persona("Pablo", 49, 3890.34);
    Persona p7=new Persona("Roman", 46, 2890.34);
   
    
    HashMap<Integer,Persona> personalGalicia=new HashMap<>();
    
    personalGalicia.put(p1.getId(),p1);
    personalGalicia.put(p2.getId(),p2);
    personalGalicia.put(p3.getId(),p3);
    personalGalicia.put(p4.getId(),p4);
    personalGalicia.put(p5.getId(),p5);
    personalGalicia.put(p6.getId(),p6);
    personalGalicia.put(p7.getId(),p7);
    
    ArrayList<Persona> listaPersonas=new ArrayList<>(personalGalicia.values());
    escribirPersonasFichero(f,listaPersonas);
   
     ArrayList<Persona> personasRecuperadas;
    personasRecuperadas=leerPersonasFichero(f);
        System.out.println(personasRecuperadas.size());
        
        System.out.println("Personas recuperadas:");
    for(Persona p:personasRecuperadas){
        
        System.out.println(p.toString());  
    }
    
}
}
