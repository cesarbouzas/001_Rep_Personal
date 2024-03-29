
package vista;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Ejercicio_10 {
    
    
    
    
    
    
    
    public static void main (String args[]){
        File origen=new File("./src/main/resources/origen.txt");
        if(origen.exists()){
        try {
            File destino=new File("./src/main/resources/Ejercicio10_destino.txt");
            if(destino.createNewFile()){
                try(
                InputStreamReader fR=new FileReader(origen);
                OutputStreamWriter fW=new FileWriter(destino);
                BufferedReader bR=new BufferedReader(fR);
                BufferedWriter bW=new BufferedWriter(fW);){
                String line;
                        while((line=bR.readLine())!=null){
                            bW.write(line);
                            bW.newLine();
                        }
                }catch(IOException ex){
                    System.out.println("Error");
                }
            
            } else{
                System.out.println("Error al crear el fichero destino");
            } 
        } catch (IOException ex) {
            System.out.println("Error al crear el fichero destino");
        }
    
    }else{
            System.out.println("Fichero :"+origen.getPath()+" no existe");
            
        }
    }
    
    
    
    
}
