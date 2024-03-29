
package socketficheros;


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import mesajes.MensajeEnvioArchivo;
import mesajes.MensajePeticionArchivo;

/**
 *
 * @author cesar bouzas soto
 */
public class Cliente {
    
    //main de ejecucion del cliente
    public static void main(String args[]){
        //se instancia un nuevo cliente 
        Cliente cliente=new Cliente();
        // Se llama a la calse pide fichero que se encarga de pedir un fichero al servidor 
        
        cliente.pideFiechro(new File("./src/socketficheros/cesar.txt"), "localhost", 1500);
    
    }

  public void pideFiechro(File f, String servidor, int puerto)
    {
        try
        {
            // Se crea un sockect cliente llamndo a un servidor (localhost) e indicando el puerto 1500 .
            Socket cSocket = new Socket(servidor, puerto);

            // Se envia un mensaje de petici�n de fichero.
            ObjectOutputStream oos = new ObjectOutputStream(cSocket
                    .getOutputStream());
            MensajePeticionArchivo msg = new MensajePeticionArchivo();
            msg.nombreFichero = f.getAbsolutePath();
            oos.writeObject(msg);

            // Se abre un fichero para empezar a copiar lo que se reciba.
            FileOutputStream fOS = new FileOutputStream(f.getAbsolutePath()
                    + "_copia.txt");

            // Se crea un ObjectInputStream del cSocket para leer los mensajes
            // que contienen el fichero.
            ObjectInputStream oIS = new ObjectInputStream(cSocket
                    .getInputStream());
            MensajeEnvioArchivo mensajeRecibido;
            Object mensajeAux;
            do {
                // Se lee el mensaje en una variabla auxiliar
                mensajeAux = oIS.readObject();
                
                // si es del tipo esperado MensajeEnvioArchivo, se hace un casteo
                if (mensajeAux instanceof MensajeEnvioArchivo)
                {
                    mensajeRecibido = (MensajeEnvioArchivo) mensajeAux;
                    // Se escribe en pantalla y en el fichero
                    System.out.print(new String(
                            mensajeRecibido.content, 0,
                            mensajeRecibido.validBytes));
                    fOS.write(mensajeRecibido.content, 0,
                            mensajeRecibido.validBytes);
                } else
                {
                    // Si no es del tipo esperado, se marca error y se termina
                    // el bucle
                    System.err.println("Mensaje no esperado "
                            + mensajeAux.getClass().getName());
                    break;
                }
            } while (!mensajeRecibido.isLastMsg);
            
            // Se cierra cSocket y fichero
            fOS.close();
            oIS.close();
            cSocket.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
 
}
