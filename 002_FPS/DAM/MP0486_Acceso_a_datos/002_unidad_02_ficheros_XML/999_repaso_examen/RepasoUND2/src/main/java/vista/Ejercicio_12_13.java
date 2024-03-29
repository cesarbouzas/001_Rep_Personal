
package vista;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ejercicio_12_13 {
//    Entendemos por datos básicos que guardaremos tipos de datos definidos en java: int,double,
//String…
//Escribe un programa que permita crear un fichero de datos (nombre ,edad y salario de personas)
//denominado fichorigen.dat. Para evitar la petición de datos por teclado, los datos los inicializarás en
//la aplicación.
//A continuación crearás otro programa que permita leer el fichorigen.dat y mostrará los datos por
//pantalla.
////El proceso de lectura/escritura (I/O) de los ficheros lo harás utiilizando las clases FileInputStream,
//FileOutputStream, DataOutputStream y DataInputStream.
//    
    public static void main(String args[]) throws IOException{
        
    File origen=new File("./src/main/origen.dat");
    File destion=new File("./src/main/destino.dat");
       
    try{
        origen.createNewFile();
        destion.createNewFile();
        
        
        FileOutputStream fOS=new FileOutputStream(origen);
        DataOutputStream dOS=new DataOutputStream(fOS);
        String nombres[]={"Cesar","Raquel","Pedro"};
        int edades[]={46,47,50};
        double salario[]={1900.56,2345.87,4567.23};
        
        for(int i=0;i<=nombres.length;i++){
        dOS.writeUTF(nombres[i]);
        dOS.writeInt(edades[i]);
        dOS.writeDouble(salario[i]);
        }
    }catch(IOException e){
        
    e.printStackTrace();
    }
            
        
        
    }
    
}
