
package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.time.Instant;
import java.util.Date;



/**
 *
 * @author Usuario
 */
public class Ejercicio_9_B {

    
    public static String listarDirectorio(File dir){
        String result="";
        if(dir.exists()&& dir.isDirectory()){
            File[] contendio=dir.listFiles();
            for(File item:contendio){
                if(item.isFile()){
                result += String.format("%-40s%-7s%-7d\n",item.getName(),"----->",item.getUsableSpace());
                }else if(item.isDirectory()){
                result += String.format("%-40s%-7s%-7s\n",item.getName(),"----->","Directorio");
                }
             }
        }
        return result;
    
    }
    
    public static void escribirStringEnFichero(String txt,File f){
        try {
            Writer fW=new FileWriter(f);
            BufferedWriter bW=new BufferedWriter(fW);
            bW.write(txt);
            bW.close();
            bW.close();
            System.out.println("Se ah realizado la escritura correctamente");
        } catch (IOException ex) {
            System.out.println("Error de escritura");
        }
        
    }
        public static void escribirStringEnFichero(String txt,File f,boolean andir){
        try {
            Writer fW=new FileWriter(f,andir);
            BufferedWriter bW=new BufferedWriter(fW);
            bW.write(txt);
            bW.close();
            bW.close();
            System.out.println("Se ah realizado la escritura correctamente");
        } catch (IOException ex) {
            System.out.println("Error de escritura");
        }
        
    }
    public static boolean crearFichero(File f){
        boolean result=false;
        if(f.exists()){
            result=true;
            System.out.println("El ficheo ya existe");
            return result;
        }else{
            try {
                f.getParentFile().mkdirs();
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");
            }
        }{
                
                }
        
        return result;
    };
    
    
    public static void escribirFicheroEnFichero(File origen,File destino){
        
        try {
           Reader fR = new FileReader(origen);
           Writer fW=new FileWriter(destino);
           BufferedReader bR=new BufferedReader(fR);
           BufferedWriter bW=new BufferedWriter(fW);
           String linea;
           int contadorAccesos=0;
           while((linea=bR.readLine())!= null){ 
           bW.write(linea);
           bW.newLine();
           contadorAccesos++;
           }
         
           bR.close();
           bW.close();
            System.out.println("Se han realizado "+contadorAccesos+" accesos");
        } catch (IOException ex) {
            System.out.println("Error de fichero");       
    }
    };
    
    
    public static void escribirFicheroEnFicheroByteaByte(File origen,File destino) {
    
       
        try {
            InputStreamReader fR = new FileReader(origen);
            OutputStreamWriter fW=new FileWriter(destino,true);
            
            int contadorAccesos=0; 
            int caracter;
            Date fecha=Date.from(Instant.now());
            fW.write(fecha.toString()+"\n");
            while((caracter=fR.read())!=-1){
                fW.write(caracter);
                contadorAccesos++;
            }
            System.out.println("Se han realizado "+ contadorAccesos+" accesos");
                fW.close();
                fR.close();
                
        } catch (IOException ex) {
             System.out.println("Error en lectura o escritura");
        }
        
        
        
    }
    public static String escribirDesdeTeclado(){
        String linea;
        String result="";
        try {  
        InputStreamReader teclado=new InputStreamReader(System.in);
        BufferedReader bR=new BufferedReader(teclado);
        System.out.print("Introduce lo que quieras guardar (-1) para salir:");
        Date fecha=new Date().from(Instant.now());
        linea="\n------------>"+ fecha.toString()+"<-------------\n"+bR.readLine();
        while(!linea.endsWith("-1")){
            System.out.print("Introduce lo que quieras guardar (-1) para salir:");
            result+=linea+"\n";
            linea=bR.readLine();
        }
            bR.close();
        } catch (IOException ex) {
            System.out.println("Error de lectura por teclado");
        }
     
        return result;
    }
    public static boolean escribirGBEnUSB(String dir,String msg, long gb){
    boolean result=false;
    msg+="\n";
    File usb=new File(dir);
    if(usb.exists()){
        File usbFile=new File(usb.getAbsolutePath()+"archivo.txt");
        try{
        if(usbFile.createNewFile()){
        OutputStreamWriter fw=new FileWriter(usbFile);
        BufferedWriter bW=new BufferedWriter(fw);
        long currentSize=0;
        
        while(currentSize<(gb*1024*1024*1024)){
            bW.write(msg);
            currentSize+=msg.length();
        }
        }
        }catch(IOException ex){
            System.out.println("Error en la cracion de fichero ");
        }}
    
    return result;
    }
    
    public static void main(String args[]) {
        File directorioListado=new File("c:/");
        File origen=new File("./src/main/resources/origen.txt");
        File destinoByte=new File("./src/main/resources/destinoByte.txt");
        File destinoBuffer=new File("./src/main/resources/destinoBuffer.txt");
        File teclado=new File(origen.getParent()+"/teclado.txt");
  
        crearFichero(origen);
        crearFichero(destinoByte);
        crearFichero(destinoBuffer);
        crearFichero(teclado);
      
        escribirStringEnFichero(listarDirectorio(directorioListado), origen);
        escribirFicheroEnFichero(origen, destinoBuffer);
        escribirFicheroEnFicheroByteaByte(origen, destinoByte);
        escribirStringEnFichero(escribirDesdeTeclado(), teclado,true);
//        escribirGBEnUSB("E:\\","Me comes los huevos", 1);
//        
//        for(int i=0;i<1024;i++){
//        escribirFicheroEnFichero(new File("E:\\archivo.txt"), new File("E:\\SU9741-TY-DTG-"+i+".txt"));
//        }
    }
}
