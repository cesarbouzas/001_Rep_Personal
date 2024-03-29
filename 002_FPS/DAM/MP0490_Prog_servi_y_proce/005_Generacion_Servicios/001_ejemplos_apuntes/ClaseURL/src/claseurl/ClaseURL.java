
package claseurl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Usuario
 */
public class ClaseURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        URL direccion=new URL("http://www.it.uc3m.es:80/index.html");
            System.out.println("********"+direccion.toString()+"*******");
            System.out.println("Protocolo: "+direccion.getProtocol());
            System.out.println("Host: "+direccion.getHost());
            System.out.println("Puerto: "+direccion.getPort());
            System.out.println("Fichero: "+direccion.getFile());
            System.out.println(direccion.openConnection().getContentType());
                  
        //dividimos la URL en distintos pasos
        }catch(IOException e){
            System.out.println(e.getMessage());}
    }
    
}
