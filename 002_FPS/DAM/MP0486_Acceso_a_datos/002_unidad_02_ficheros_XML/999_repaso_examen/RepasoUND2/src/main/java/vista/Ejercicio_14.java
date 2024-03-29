
package vista;

//Escribe un programa que permita crear un fichero de acceso aleatorio, un random access file,

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//denominado ficheroRAF.dat
//Los datos que va a guardar tendrá este formato:
//numeroempleado entero + nombre (10 caracteres)+ edad entero + salario double
//Teniendo en cuenta que los enteros son 4 bytes, los caracteres el doble de bytes de lo que ocupan y
//los doubles 4 bytes. Tenemos que el registro ocupa 4+20+4+8=36 bytes.
//Para evitar la petición de datos por teclado, los datos los inicializarás en la aplicación.
//A continuación crearás un programa que permita leer los datos del fichero creado. Puedes verificar
//que puedes leer un registro cualquiera, por eso es de acceso aleatorio, desplazándote con el seek
//directamente al registro mediante la fórmula (numeroderegistroabuscar-1)*tamañoderegistro.
public class Ejercicio_14 {
    
    
    
    public static void main (String args[]){
        
        
         String[] apellido = {"Fernandez", "Gil", "Lopez", "Ramos", "Sevilla", "Casilla", "Rey"};
        int[] dep = {10, 20, 10, 10, 30, 30, 20};
        Double[] salario = {1000.45, 2400.60, 3000.0, 1500.56, 2200.0, 1435.87, 2000.0};
        StringBuffer b=null;
        try {
            File file=new File("./src/main/persona.dat");
            file.createNewFile();
            RandomAccessFile rAF=new RandomAccessFile(file, "rw");
            for(int i=0;i<apellido.length;i++){
                b=new StringBuffer(apellido[i]);
                b.setLength(10);
                rAF.writeChars(b.toString());
                rAF.writeInt(dep[i]);
                rAF.writeDouble(salario[i]);
            }
            rAF.close();
            
            
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    
    
    }
    public static void leerRaf(File fichero){
//        Escribe un programa que permita crear un fichero de acceso aleatorio, un random access file,
//denominado ficheroRAF.dat
//Los datos que va a guardar tendrá este formato:
//numeroempleado entero + nombre (10 caracteres)+ edad entero + salario double
//Teniendo en cuenta que los enteros son 4 bytes, los caracteres el doble de bytes de lo que ocupan y
//los doubles 4 bytes. Tenemos que el registro ocupa 4+20+4+8=36 bytes.
//Para evitar la petición de datos por teclado, los datos los inicializarás en la aplicación.
//A continuación crearás un programa que permita leer los datos del fichero creado. Puedes verificar
//que puedes leer un registro cualquiera, por eso es de acceso aleatorio, desplazándote con el seek
//directamente al registro mediante la fórmula (numeroderegistroabuscar-1)*tamañoderegistro.
        int numEmp,dep,pos;
        Double salario;
         char[] apellido=new char[10],aux;
        try{
         RandomAccessFile rAF=new RandomAccessFile(fichero, "rw");
         rAF.seek(0);
         while(rAF.getFilePointer()!=rAF.length()){
             
         }
                 }catch(FileNotFoundException ex){
                 ex.printStackTrace();
                 }
    }
    
}
