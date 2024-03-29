/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 { 
    public static void listarDirectorioFiltrado(File laRaiz){
        FilenameFilter filtro=new FilenameFilter(){
    @Override
    public boolean accept(File dir, String name) {
        File f=new File(dir,name);
        return  name.endsWith(".java")||f.isDirectory();
    }
    };
        
        File[] contendioDirectorio=laRaiz.listFiles(filtro);
        for(File item:contendioDirectorio){
        if(item.exists()&&item.isDirectory()){
            Ejercicio_7.listarDirectorioFiltrado(item);
        }else if(item.exists()&& item.isFile()){
            System.out.printf("%70s%7s%10d kb\n",item.getPath(),"---->",item.length());
        }else{
            if(item.exists()){
                System.out.println("La ruta existe!!! error de otro tipo");
            }else{
                System.out.println("La ruta no existe"); 
            }
        }       
        }
    }
public static void main(String args[]){
    Ejercicio_7.listarDirectorioFiltrado(new File("./src/deportes/"));
    
}
   
    
}
