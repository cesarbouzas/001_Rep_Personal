
package PaquetePrincipal;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author cesar Bouzas soto
 */
public class HiloServerHttp extends Thread{
   
  private Socket socketCliente;

 public HiloServerHttp(Socket socketCliente) {

        this.socketCliente = socketCliente;
}
    public void run() {

    try{
      
        ServidorHTTP.procesaPeticion(socketCliente);
        //cerramos la conexion de este hilo
        socketCliente.close();
        System.out.println("cliente atendido");
          
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    
  }

}


    

