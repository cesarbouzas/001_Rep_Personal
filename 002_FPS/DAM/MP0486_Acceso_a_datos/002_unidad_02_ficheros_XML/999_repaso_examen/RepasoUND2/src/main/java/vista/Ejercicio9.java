
package vista;

//Crea un fichero en la carpeta resources (dentro de src/main) denominado origen.txt. El fichero

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//puedes crearlo directamente mediante la opción new File-→Other-→>Empty File-→ Escribir
//nombre del fichero (origen.txt) y escribir directamente en él el contenido del mismo (varias lineas
//de texto).

//Escribe un programa que permita crear un fichero de texto (destino.txt) a partir del fichero de texto
//creado (origen.txt).
//El proceso de lectura/escritura (I/O) de los ficheros de texto lo harás carácter a carácter utilizando
//las clases FileReader y FileWriter.



public class Ejercicio9 {
  public static void main(String args[]){
      
      File origen=new File("./src/main/origen.txt");
      File destino=new File("./src/main/destino.txt");
      int car;
      try {
          origen.createNewFile();
          destino.createNewFile();
       
          FileReader fR=new FileReader(origen);
          FileWriter fW=new FileWriter(destino);
         while((car=fR.read())!=-1){
             
             fW.write(car);
         }
          fW.close();
          fR.close();
      } catch (IOException ex) {
          ex.printStackTrace();
      }
      
      
  
  
  
  }
    
    
}
