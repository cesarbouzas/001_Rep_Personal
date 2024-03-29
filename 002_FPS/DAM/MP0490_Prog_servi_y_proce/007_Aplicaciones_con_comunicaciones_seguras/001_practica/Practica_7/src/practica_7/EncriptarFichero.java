
package practica_7;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Cesar Bouzas soto
 */
public class EncriptarFichero {

  
    private static final int TAMANO_LLAVE = 128;
    private static final String ALGORIT = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final String FILE = "fichero.cifrado";

    public static void main(String[] args) {
        String nombreUsuario = "cesar";
        String password = "bouzassoto";
        try {
            // Generar clave a partir del nombre de usuario y la contraseña
            byte[] key = generadorDeKey(nombreUsuario, password);
            // Generar una cadena de texto
            String texto = generadorDeTexto();
            // Encriptar el texto y guardarlo en el archivo indicado
            encriptarTextoaArchivo(key, texto);
            // Desencriptar el texto 
            String textoDesencriptado = desencriptarTexto(key);
            System.out.println("Contenido desencriptado: " + textoDesencriptado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] generadorDeKey(String username, String password) throws Exception {
        String semilla = username + password;
        MessageDigest md = MessageDigest.getInstance("SHA-256");
         /**
         Message Digest Devuelve un objeto MessageDigest que implementa el algoritmo de digestión especificado.
         Este método atraviesa la lista de proveedores de seguridad registrados,
         empezando por el proveedor preferido.
         Se devuelve un nuevo objeto MessageDigest que encapsula la implementación MessageDigestSpi
         del primer Proveedor que soporta el algoritmo especificado.
         **/
        Provider[] providers = Security.getProviders();
        System.out.println("***************** La lista de providers:");  
        for (int i = 0; i < providers.length; i++) {   
            Set<Provider.Service> servicios = providers[i].getServices();
            System.out.println("<---"+providers[i].toString()+"--->Servicios :");
            for (Provider.Service servicio : servicios) {
                System.out.println("*"+servicio.getAlgorithm());
            }    
        }
        byte[] semillaBytes = semilla.getBytes("UTF-8");
        System.out.print("****************La semilla en bytes es: ");
        for(int i=0 ;i<semillaBytes.length;i++){
            System.out.print(semillaBytes[i]); 
       }
        System.out.println("");
        //        System.out.print("****************La llave en bytes es: ");
                byte[] key = md.digest(semillaBytes);
        //        for(int i=0 ;i<key.length;i++){
        //            System.out.print(key[i]); 
        //       }
        //        System.out.println("");
        //  solo los primeros bytes requeridos para el tamaño de clave
        return Arrays.copyOf(key, TAMANO_LLAVE / 8);
    }

    private static String generadorDeTexto() {
        // Generar una cadena de texto basada en un texto de ejemplo
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("En un lugar de la Mancha, de cuyo nombre no quiero acordarme,"
                    + " no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,"
                    + " adarga antigua, ...\n");
        }
        return sb.toString();
    }

    private static void encriptarTextoaArchivo(byte[] key, String text) throws Exception {
        byte[] iv = generarVectorInicio();
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, ALGORIT);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);

        byte[] encryptedText = cipher.doFinal(text.getBytes("UTF-8"));

        try (FileOutputStream fos = new FileOutputStream(FILE)) {
            fos.write(iv);
            fos.write(encryptedText);
        }

        System.out.println("Archivo cifrado guardado ok!.");
    }
    // Generar vector de inicialización aleatorio    
    private static byte[] generarVectorInicio() {
        byte[] iv = new byte[16]; 
        new java.util.Random().nextBytes(iv);
        return iv;
    }

    private static String desencriptarTexto(byte[] key) throws Exception {
        byte[] archivoEnBytes = Files.readAllBytes(Paths.get(FILE));
        byte[] iv = Arrays.copyOfRange(archivoEnBytes, 0, 16);
        byte[] textoEncriptado = Arrays.copyOfRange(archivoEnBytes, 16, archivoEnBytes.length);

        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, ALGORIT);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);

        byte[] decryptedTextBytes = cipher.doFinal(textoEncriptado);
        String decryptedText = new String(decryptedTextBytes, "UTF-8");

        return decryptedText;
    }
}

