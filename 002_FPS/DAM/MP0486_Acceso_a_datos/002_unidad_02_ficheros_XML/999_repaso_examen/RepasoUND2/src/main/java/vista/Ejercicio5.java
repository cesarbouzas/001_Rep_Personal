
package vista;

//        Crea una estructura de directorios de al menos 3 niveles.

import java.io.File;
import java.io.IOException;


//Crearemos el directorio Deporte (dentro de la carpeta src). Dentro de deporte crearemos los
//directorios Individual y Colectivo. Dentro de individual crearemos el directorio/carpeta Tenis y
//dentro de colectivo crearemos las carpetas Baloncesto y Futbol.
//A mayores crearemos 2 ficheros en la carpeta individual con extensión .java, 1 fichero en la carpeta
//colectivo con extensión .java, 1 fichero en la carpeta tenis con extensión .txt, 3 ficheros en la
//carpeta baloncesto 1 con extensión java y 2 con extensión txt.
//Finalmente movemos 1 de los ficheros con extensión txt de la carpeta baloncesto a la carpeta tenis.
//Utiliza el método renameTo (origen.renameTo(destino). Para indicar el destino en la creación del
//objeto file destino se indica a que carpeta va
public class Ejercicio5 {
    public static void main(String args[]) {
        

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
        
        
    
    }
    

