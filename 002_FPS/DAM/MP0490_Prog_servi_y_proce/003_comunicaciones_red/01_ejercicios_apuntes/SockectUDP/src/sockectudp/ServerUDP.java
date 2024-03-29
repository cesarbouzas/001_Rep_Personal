
package sockectudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ServerUDP {
    
    public static final int PORT=1500;

    public static void main(String args[]) {
        
        
        if(args.length!=2){
            System.out.println("Debes indicar la maquina y el mensaje ");    
        }else try{
            DatagramSocket sSocket=new DatagramSocket();
            InetAddress equipo=InetAddress.getByName(args[0]);
            byte[] cadena=args[1].getBytes();
            DatagramPacket msg=new DatagramPacket(cadena,cadena.length,equipo,ServerUDP.PORT);
            sSocket.send(msg);
            sSocket.close();
        }catch(UnknownHostException e) { 
      System.err.println("Desconocido: " + e.getMessage()); 
    } catch(SocketException e) { 
      System.err.println("Socket: " + e.getMessage()); 
    } catch(IOException e) { 
      System.err.println("E/S: " + e.getMessage()); 
    }
}
}
