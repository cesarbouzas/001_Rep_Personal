
package vista;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio8 {
    
    
public static void borrarDirectorio(File dir){
    File[] ficheros=dir.listFiles();
    for(File f:ficheros){
        if(f.isDirectory()){
            borrarDirectorio(f);
            f.delete();
        }
        if(f.isFile()){
            f.delete();
        }
        
    }
    
}   
    public static void crearEjercicio5(){
         File deporte=new File("./src/main/resources/deportes");
        deporte.mkdir();
        File individual=new File("./src/main/resources/deportes/individual");
        individual.mkdir();
        File colectivo=new File("./src/main/resources/deportes/colectivo");
        colectivo.mkdir();
        File tenis=new File("./src/main/resources/deportes/individual/tenis");
        File futbol=new File("./src/main/resources/deportes/colectivo/futbol");
        File baloncesto=new File("./src/main/resources/deportes/colectivo/baloncesto");
        tenis.mkdir();
        futbol.mkdir();
        baloncesto.mkdir();
        File f1 = new File("./src/main/resources/deportes/individual/fichero1.java");
        File f2 = new File("./src/main/resources/deportes/individual/fichero2.java");
        File f3 = new File("./src/main/resources/deportes/colectivo/fichero3.java");
        File f4 = new File("./src/main/resources/deportes/individual/tenis/resultados.txt");
        File f5 = new File("./src/main/resources/deportes/colectivo/baloncesto/fichero5.java");
        File f6 = new File("./src/main/resources/deportes/colectivo/baloncesto/fichero6.java");
        File f7 = new File("./src/main/resources/deportes/colectivo/baloncesto/fichero7.java");
        File f8 = new File("./src/main/resources/deportes/colectivo/baloncesto/fichero8.txt");
        File f9 = new File("./src/main/resources/deportes/colectivo/baloncesto/fichero9.txt");
           try{
               f1.createNewFile();
               f2.createNewFile();
               f3.createNewFile();
               f4.createNewFile();
               f5.createNewFile();
               f6.createNewFile();
               f7.createNewFile();
               f8.createNewFile();
               f9.createNewFile();
              
               File f12 = new File("./src/main/resources/deportes/individual/tenis/fichero8movido.txt");      
         f8.renameTo(f12);
        }catch(IOException e){
            e.printStackTrace();
        }
        
         
    }
        
    
    
    
    

    public static void main(String args[]) {
         File deporte=new File("./src/main/resources/deportes");
           crearEjercicio5();
        JOptionPane.showMessageDialog(null, "vas a borrar la carpeta deporte");
        borrarDirectorio(deporte);

}  
}