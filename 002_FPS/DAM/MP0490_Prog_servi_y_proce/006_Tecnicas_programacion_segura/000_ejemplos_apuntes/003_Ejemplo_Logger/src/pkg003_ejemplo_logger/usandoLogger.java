
package pkg003_ejemplo_logger;

import java.io.*;
import java.util.logging.*;

/**
 *
 * @author Usuario
 */
public class usandoLogger {

        
    public static void main(String[] args) {
     Logger logger=Logger.getLogger("MyLog");
     
     FileHandler fh;
     try{
     fh=new FileHandler("C:\\MyLogrFile.log",true);
     logger.addHandler(fh);
     logger.setLevel(Level.ALL);
     SimpleFormatter sm=new SimpleFormatter();
     fh.setFormatter(sm);
     logger.log(Level.INFO,"mi primer log despues de 4 años");
     }catch(SecurityException ex){
     ex.printStackTrace();
     }catch(IOException e){
     e.printStackTrace();
     }
     }
    
}
