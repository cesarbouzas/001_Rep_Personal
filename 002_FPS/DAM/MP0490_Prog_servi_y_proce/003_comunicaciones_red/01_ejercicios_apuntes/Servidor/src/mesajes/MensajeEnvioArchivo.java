
package mesajes;

import java.io.Serializable;

/**
 *
 * @author Cesar Bouzas 
 */
public class MensajeEnvioArchivo implements Serializable{
   
    
    //Definimos el numero de bytes para cada mensaje , sera una constante  de clase
    public static final int NUMBER_BYTES_X_MSG=10;
   
    //contendio de cada mensaje , un array de bytes de longitud NUMBER_BYTES_X_MSG
    public byte[] content=new byte[NUMBER_BYTES_X_MSG];
    //Booleano que nos permite indicar si es el último mensaje de todos
    public boolean isLastMsg=false;
    //ruta del fichero que queremos servir
    public String nameFile="";
    //entero que define los bytes validos.
    public int validBytes=0;
    
    
    

 
}
