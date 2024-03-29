
package sockectudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class ClienteUDP {
    
    public static final int PORT=1500;

    public static void main(String[] args) {
        
        if(args.length!=0){
            System.out.println("Error de parametros , no se necesitan para Cliente UDP");
        }else try{
            
                DatagramSocket sSocket=new DatagramSocket(ClienteUDP.PORT);
                byte[] cadena=new byte[1000];
                DatagramPacket msg=new DatagramPacket(cadena,cadena.length);
                System.out.println("Esperando mensajes.....");
                while(true){
                    sSocket.receive(msg);
                    String datos=new String(msg.getData(),0,msg.getLength());
                    System.out.println("Mensaje recibido"+datos);
                }
            } catch (SocketException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
        }  
    }
    
}
