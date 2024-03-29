
package socketficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import mesajes.MensajeEnvioArchivo;
import mesajes.MensajePeticionArchivo;

/**
 *
 * @author Cesar Bouzas Soto
 */
public class Servidor {
    //variable de clase que indica el puerto
    private final static int PORT=1500;
    //variable de clase que indica el tiempo de espera en sg
    private final static int WAIT=10;
    
    
   //eejcucion del servidor , consiste simplemente en creaar un servidor nuevo 
 public static void main(String arg[]){
 
     Servidor server=new Servidor();
     
 }   
    
    
    
 
    public Servidor(){
        try {
            //creaccion de la instancia de ServerSocker en el puerto 1500
            ServerSocket svSocket=new ServerSocket(PORT);
            //esperamos hasta que un cliente conecte cuando esto ocurra se almacena el Socket en cliente
            Socket cliente=svSocket.accept();
            //se da un tiempo de espera  para que tenga tiempo el cliente a leer antes de cerrar el server 
            cliente.setSoLinger(true, WAIT);
            //creamos un stream de engrada 
            ObjectInputStream oIS=new ObjectInputStream(cliente.getInputStream());
            //alamcenamos el stream object en la instancia msg
            Object msg=oIS.readObject();
            //Si el objeto es una instancia de peticion de archivo creamos un nuevo objeto FILE
            if(msg instanceof mesajes.MensajePeticionArchivo){
                File f=new File(((MensajePeticionArchivo) msg).nombreFichero);
                //Stream de salida 
                ObjectOutputStream oOS =new ObjectOutputStream(cliente.getOutputStream());
                sendFile(f, oOS);
            }
                   
        } catch (IOException ex) {
            System.out.println("Error (I/O) de creaccion de Socked servidor");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error (I/O) de creaccion de Socked servidor");
        }
        
        
    
    }
    /**
     * 
     * @param f fichero que se envia 
     * @param oOS Stream de salida
     */
    public void sendFile(File f,ObjectOutputStream oOS){
        //si el fichero existe procedemos en caso contrario lanzamos un error (else)      
        if(f.exists()){
                  //partimos que este no es el ultimo mensaje de la transmision
                    boolean isLast=false;
                  try {
                      
                      FileInputStream fIS=new FileInputStream(f);
                      MensajeEnvioArchivo msg=new MensajeEnvioArchivo();
                      int leidos=fIS.read(msg.content);
                      while(leidos>-1){
                      msg.validBytes=leidos;
                      if(leidos<MensajeEnvioArchivo.NUMBER_BYTES_X_MSG){
                          msg.isLastMsg=true;
                          isLast=true;
                          System.err.println("mensaje partido");
                      }else{
                          msg.isLastMsg=false;
                          
                      }
                      oOS.writeObject(msg);
                      if(msg.isLastMsg){
                          break;
                      }
                      msg=new MensajeEnvioArchivo();
                      msg.nameFile=f.getName();
                      leidos=fIS.read(msg.content);
                      }
                      if(isLast==false){
                      msg.isLastMsg=true;
                      msg.validBytes=0;
                      oOS.writeObject(msg);
                      }
                      oOS.close();
                      
                  } catch (FileNotFoundException ex) {
                      System.out.println("fichero no encontrado");
                  } catch (IOException ex) {
                      System.out.println("Error de entrada salida");
                  }
                    
                }else{
                    System.out.println("Fichero"+f.getAbsoluteFile() +" no encontrado");
                }
        
        }
    
}
