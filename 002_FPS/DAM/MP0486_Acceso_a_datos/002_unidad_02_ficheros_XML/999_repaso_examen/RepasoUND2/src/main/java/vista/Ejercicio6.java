
package vista;

import java.io.File;


//ENUNCIADO 6: Busqueda Recursiva
//Realiza un programa para que pasándole un directorio raiz muestre todos los ficheros que contiene
//la estructura. Puedes probar con la carpeta “Deporte”. 
public class Ejercicio6 {
    public static void main(String args[]){
        Filtro filtro=new Filtro();
        File deportes=new File ("./src/main/resources/deportes");
        listarDirectorio(deportes,filtro);
    }
    
    public static void listarDirectorio(File dir,Filtro filtro){
       File[] ficheros= dir.listFiles(filtro);
       for(File f:ficheros){
           if(f.isDirectory()){
               System.out.println("Drectorio "+f.getName());
               listarDirectorio(f,filtro);
           }
           if(f.isFile()){
               System.out.println("fichero ---->"+f.getName());
           }
       }
        
        
    }
    static class Filtro implements java.io.FileFilter{

        @Override
        public boolean accept(File pathname) {
           return pathname.isDirectory()||pathname.getAbsolutePath().endsWith("java");
        }

     
      

    
    }
    
}
