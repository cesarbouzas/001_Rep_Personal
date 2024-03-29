
package inetaddress;
import java.net.InetAddress;
/**
 *
 * @author Usuario
 */
public class InetAddressExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    try{
        System.out.println("*********En Red Local*************\n");
   
    //Obtienr el objeto InetAddressExample de localhost
    InetAddress objetoLocalHost=InetAddress.getByName("localhost");
    //imprimo la ip de localhost
    System.out.println("IP de localhost:"+objetoLocalHost.getHostAddress());
    //Obtencion de la direccion de mi equipo
    InetAddress myLanIP=InetAddress.getLocalHost();
    System.out.println("IP de mi equipo:"+myLanIP+"->getLocalhost().");
    myLanIP=InetAddress.getByName("Toshiba");
    System.out.println("IP de mi equipo:"+myLanIP+"->getByName(\"Toshiba\").");
    myLanIP=InetAddress.getLocalHost();
    System.out.println("El nombre de mi equipo en red"+myLanIP.getHostName());
    System.out.println("\n*********En Internet*************\n");
    
    //Obtener el objeto InetAddres de www.iesalandalus.org
    InetAddress osmosObjeto=InetAddress.getByName("www.osmos.es");
        System.out.println("La direccion IP de "+osmosObjeto.getHostName()+" es :"
                +osmosObjeto.getHostAddress());
    InetAddress[] servidorGoogle=InetAddress.getAllByName("google.com");
        System.out.println("La ip de google continen los siguientes host:");
    for(int i=0; i<servidorGoogle.length;i++){
        System.out.println(i+1+"-"+servidorGoogle[i].getHostName());
    }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
    
    
    
    }
    
}
