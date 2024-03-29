/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

//Escribe un programa en el que referenciemos un objeto de la clase File. A partir de ahi deberás

import java.io.File;

//comprobar:
//Si no existe indícalo.
//Si existe y es un fichero, mostrarás la ruta relativa del fichero y su tamaño.
//Si existe y es un directorio, ba
public class Ejercicio2 {
    
      public static String formatFile(File f){
          if(f.isFile()){
          return String.format("%-10s%-10s%-10d\n",f.getName(),"----------",f.getTotalSpace());
          }
          return null;
      } 
      public static String formatDirectory(File f){
       if(f.isDirectory()){
          return String.format("%-10s%-10s%-10s\n",f.getName(),"---------->","Directorio");
          }
          return null;
      }
    
  public static void main(String args[]){  
      
   
      
    File f =new File("./");
    if( f.exists()){
        if(f.isFile()){
            System.out.println(formatFile(f));
        }
        if(f.isDirectory()){
           String[] ficheros=f.list();
           for(String s:ficheros){
               System.out.println(s);
           }
           File[] files= f.listFiles();
           for(File fil:files){
               if(fil.isDirectory()){
               System.out.print(formatDirectory(fil));
                }else{
                   System.out.print(formatFile(fil));   
                   
               }}
    }
    
}else{
        System.out.println("El fichero/directorio no existe");
    }
}
}