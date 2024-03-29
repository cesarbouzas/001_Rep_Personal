
package vista;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;




/**
 *
 * @author Usuario
 */
public class Ejercicio_5 {
 

 
 public static void main(String args[]){
File carpeta=new File("./src/deportes");

//Definimos los directorios con uns map relaciona un string nombre del directorio raiz con los directorios a crear dentros
Map<String,String[]> deportes=new HashMap<>();


String[] deportesIndividuales={"tenis"};
String[] deportesColectivos={"futbol","baloncesto"};

deportes.put("individuales",deportesIndividuales);
deportes.put("colectivos", deportesColectivos);
deportes.put("individuales",deportesIndividuales);

//Definimos los archivos con uns map relaciona un string nombre del directorio raiz con los ficheros a crear dentro
Map<String,String[]> ficheros=new HashMap<>();

String[] ficherosIndividuales={"equiposIndividuales.java","trofesosIndividuales.java"};
String[] ficherosColectivos={"equiposColectivos.java"};
String[] ficherosTenis={"jugadoresTenis.txt"};
String[] ficherosBaloncesto={"equiposbaloncesto.java","entrenadoresbaloncesto.txt","jugadoresBaloncesto.txt"};

ficheros.put("/individuales",ficherosIndividuales);
ficheros.put("/colectivos",ficherosColectivos);
ficheros.put("/individuales/tenis",ficherosTenis);
ficheros.put("/colectivos/baloncesto",ficherosBaloncesto);

//Crecion de directorios
if(carpeta.isDirectory()||carpeta.mkdir()){
    System.out.println("La ruta insertada es un directorio y existe o ha sido creado");
    Set<String> keys=deportes.keySet();
   
    for(String key : keys){
        File nivelUno=new File(carpeta.getPath()+"//"+key);
        if(nivelUno.mkdir()||nivelUno.exists()){
            System.out.println("Directorio "+nivelUno.getPath()+" creado con exito o existente");
             for(String dos:deportes.get(key)){
                 File nivelDos=new File(nivelUno.getPath()+"//"+dos);
                 if(nivelDos.mkdir()||nivelDos.exists()){
                    System.out.println("Directorio "+nivelDos.getPath()+" creado con exito o existente");
         
                    }
                 }
             
        }else{
            System.out.println("Erro al crear el directorio "+nivelUno.getPath());
            }
        System.out.println("**************************************************");
    }
    
}else{
    System.out.println("Error de creaccion ");
}
//Creacion de Ficheros

  Set<String> keysFicheros=ficheros.keySet();
  for(String keyFichero:keysFicheros){
      String[] nombresFicheros=ficheros.get(keyFichero);
      for(String nombre:nombresFicheros){
          File fichero=new File(carpeta.getPath()+keyFichero+"/"+nombre);
      try {
        if(fichero.createNewFile()||fichero.exists()){
            System.out.println("Fichero creado o ya existente "+fichero.getPath());
        }else{
            System.err.println("Fichero no creado");}
    } catch (IOException ex) {
        System.out.println("Error de IOE");
    }
      }
  }
//Movemos uno de los ficheros de la carpeta baloncesto a tenis

File mover=    new File("./src/deportes/colectivos/baloncesto/jugadoresBaloncesto.txt");
mover.renameTo(new File("./src/deportes/individuales/tenis/jugadoresBaloncesto.txt"));
if(mover.exists()){
    System.out.println(mover.getPath());
}


}
}