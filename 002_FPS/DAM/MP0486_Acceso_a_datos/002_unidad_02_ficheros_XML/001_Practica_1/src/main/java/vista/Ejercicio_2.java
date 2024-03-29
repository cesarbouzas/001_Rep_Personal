/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {
    
    
    public static void main(String[] args){
        
        File file=new File("./src/main/");
        
        if (file.exists()){
            System.out.println("El path introducido es válido");
            if(file.isDirectory()){
               String[] ficheros= file.list();                
               System.out.println("La ruta introducida "+file.getName()+" es un directorio");
               File fileItem;
            
                try {
                  fileItem = new File(file.getCanonicalPath());
                  String canonicalPath=fileItem.getAbsolutePath()+"\\";
                    System.out.println(canonicalPath);
                   for (String fichero : ficheros) {
                       fileItem = new File(canonicalPath + fichero);
                       if(fileItem.exists()&& file.isFile()){
                       System.out.printf("%-20s%-20s%-20s%-20s\n",fichero ,"------>" ,fileItem.length(), " bytes");
                      }else if(fileItem.exists()&& fileItem.isDirectory()){
                       System.out.printf("%-20s%-20s%-20s\n",fichero , "------>" ,"Directorio");
                      }else{
                           System.out.println("Error de listado");
                      }
                   }
                } catch (IOException ex) {
                    System.err.println("Problema con la creaccion del listado de ficheros");
                }
               
               
            }else if(file.isFile()){
                System.out.println(file.getName()+"------>"+file.getTotalSpace()+" bytes");
            }
        }else{
            System.out.println("El fichero o directorio "+file.getName()+" no existe");
        }
        
        
        
        
    }
}
