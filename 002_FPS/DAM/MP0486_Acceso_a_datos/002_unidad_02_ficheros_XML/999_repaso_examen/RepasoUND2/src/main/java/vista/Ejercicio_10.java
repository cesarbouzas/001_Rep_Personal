//Escribe un programa que permita crear un fichero de texto (destino.txt) a partir de un fichero de
//texto (origen.txt). En este caso no lo vamos a crear si no existe, sino que indicamos que no existe.
//El proceso de lectura/escritura (I/O) de los ficheros de texto lo harás linea a linea utilizando las
//clases FileReader y FileWriter, así como BufferedReader y BufferedWriter. Además deberás
//comprobar que el fichero origen.txt existe, si no existe no realizará el proces
package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ejercicio_10 {
   
    public static void main(String args[]) throws IOException{
        File origen=new File("./src/main/origen.txt");
        File destino=new File("./src/main/detino2.txt");
        String line;
        if(origen.exists()){
            try{
                FileReader fR=new FileReader(origen);
                BufferedReader bR=new BufferedReader(fR);
                FileWriter fW=new FileWriter(destino);
                BufferedWriter bW=new BufferedWriter(fW);
                while((line=bR.readLine())!=null){
                    bW.write(line);
                }
                bR.close();
                bW.close();
            }catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
        }
        
    }
}
