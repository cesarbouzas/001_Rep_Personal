
package pkg001_ejemplo1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class EscribirNumeros {

    private Vector<Integer> numeros;
    private final static int N_NUMEROS=100;
    
    public void escribirNumeros(){
        numeros=new Vector<Integer>(N_NUMEROS);
        Random generarNumeroAleatorio=new Random();
        
        for(int i=0;i<N_NUMEROS;i++){
            numeros.addElement(generarNumeroAleatorio.nextInt(100));
        }
        PrintWriter out=null;
        System.out.println("Entrando en la zona Try");
        try{
            File f=new File("C:\\salida.txt");
        if(f.createNewFile()){
            System.out.println("Fichero creado");
        }else{
            System.out.println("El fichero ya existe");
            
        }   
        out=new PrintWriter(new FileWriter("C:\\salida.txt"));
        for(int i=0;i<numeros.size();i++){
            out.println(numeros.get(i));
        }
        }catch(ArrayIndexOutOfBoundsException eb){
            System.out.println("Error de indice en el vector");
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            
            if(out!=null){
                out.close();
                System.out.println("Se ha cerrado el fichero");
        }else{
                System.out.println("No se ha cerrado el fichero");
                
            }
        }
   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     EscribirNumeros e=   new EscribirNumeros();
    e.escribirNumeros();
    }
    
}
