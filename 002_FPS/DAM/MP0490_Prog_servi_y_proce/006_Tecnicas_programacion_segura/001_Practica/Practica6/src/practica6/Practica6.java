
package practica6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.logging.*;

/**
 *
 * @author Usuario
 */

public class Practica6 {
private static String nombreUsuario=null;
private static String nombreFichero=null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       pedirNombre();
       solicitarFichero();
       visualizarFichero(nombreFichero);
    }
    
    public static void escribirLogger(String msg){
        Logger log=Logger.getLogger("MyLog");
        FileHandler fh;
        try{
            fh=new FileHandler("c:\\datos\\myLogFile.log",true);
            log.addHandler(fh);
            log.setLevel(Level.);
            fh.setFormatter(new SimpleFormatter());
            log.log(Level.INFO,msg);
        }catch(IOException ei){
            ei.printStackTrace();    
        }catch(SecurityException se){
            se.printStackTrace();
        }catch(Exception e ){
         e.printStackTrace();
        }
    }
    public static void pedirNombre(){
     String nombreIntroducido;
     Pattern formatoNombre=Pattern.compile("[a-z]{8}");
     Matcher  mt;
     boolean isOk=false;
     do{
     System.out.print("Intruduce un nombre de usuario (8 caracteres en minusculas) :");
     Scanner sc=new Scanner(System.in);
     nombreIntroducido=sc.nextLine();
     mt=formatoNombre.matcher(nombreIntroducido);
     if(mt.find()){
         System.out.println("El nombre ingresado : "+nombreIntroducido+" cumple con los requisitos ");
         isOk=true;
     }else{
         isOk=false;
         System.out.println("El nombre ingresado : "+nombreIntroducido+" no cumple con los requisitos");
         if(nombreIntroducido.length()!=8){
             System.out.println("Caracteres distintos de 8 indicados . Introdudidos :" +nombreIntroducido.length());
         }
         if(!nombreIntroducido.toLowerCase().equals(nombreIntroducido)){
              System.out.println("Debes introducir todo en minisculas .");
         }   
     }
     //}while(!mt.find())
     } while (!isOk);  
     nombreUsuario=nombreIntroducido;
     escribirLogger("Se ha ingresado el nombre :"+nombreUsuario);
    }
    
    public static void solicitarFichero(){
    String nombreFicheroInsertado;
    Pattern formatoFichero=Pattern.compile("[a-zA-z]{1,8}\\.[a-z]{3}");
    boolean isOk=false;
    do{
        System.out.print("Introduce el nombre del fichero :");
        Scanner sc=new Scanner(System.in);
        nombreFicheroInsertado= sc.nextLine();
        Matcher mt=formatoFichero.matcher(nombreFicheroInsertado);
        if(mt.find()){
            System.out.println("Fichero con formato de nombre correcto");
            isOk=true;
        }else{
            System.out.println("Fichero con formato incorrecto");
        }
    }while(!isOk);
        nombreFichero=nombreFicheroInsertado;
        escribirLogger("Se ha ingresado el fichero:"+nombreFichero);
    } 

public static void visualizarFichero(String f){
    File file=new File(f);
    if(file.exists()){
        System.out.println("El fichero existe");
        try{
            FileInputStream fIS=new FileInputStream(file);
            InputStreamReader iSR=new InputStreamReader(fIS);
            BufferedReader bR=new BufferedReader(iSR);
            String linea;
            while((linea = bR.readLine())!=null){
                System.out.println(linea);
            }
            escribirLogger("Se ha leido el fichero "+file.getPath());
            bR.close();
        }catch(IOException e){
        e.printStackTrace();
        }   
    }else{
        System.out.println("El fichero no existe");
    }
} 
}
