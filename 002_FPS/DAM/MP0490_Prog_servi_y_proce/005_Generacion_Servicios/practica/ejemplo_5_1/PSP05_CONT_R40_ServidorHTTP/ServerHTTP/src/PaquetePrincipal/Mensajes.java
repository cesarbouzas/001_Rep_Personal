
package PaquetePrincipal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author cesar bouzas soto
 */
//Mensajes que intercambia el Servidor con el Cliente según protocolo HTTP
public class Mensajes {
 public static final String lineaInicial_OK = "HTTP/1.1 200 OK";
 public static final String lineaInicial_NotFound =
          "HTTP/1.1 404 Not Found";
//  public static final String lineaInicial_BadRequest =
//          "HTTP/1.1 400 Bad Request";
 
 
 
public  static String getFechaAhora(){
DateFormat df=new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss z",Locale.ENGLISH);
df.setTimeZone(TimeZone.getTimeZone("GMT"));
return df.format(new Date());
}
}
