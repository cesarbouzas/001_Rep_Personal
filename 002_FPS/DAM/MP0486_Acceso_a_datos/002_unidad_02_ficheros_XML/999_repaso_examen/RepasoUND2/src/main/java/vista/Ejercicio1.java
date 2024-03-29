
package vista;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
            File f=new File("./src/main/resources/fichero.txt");
            if(f.exists()){
                System.out.println("GetAbsolutePath: "+f.getAbsolutePath());
                System.err.println("GetName : "+f.getName());
                System.out.println("GetTotalSpace: "+f.getTotalSpace());
                System.out.println();
            }
    }
}
