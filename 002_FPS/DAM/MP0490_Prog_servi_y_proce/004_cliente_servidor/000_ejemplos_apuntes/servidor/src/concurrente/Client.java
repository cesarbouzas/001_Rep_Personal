
package concurrente;


import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Client {
    static final String Host="localhost";
    static final int PORT=2000;
    String data;
    Scanner teclado=new Scanner(System.in);
     
    
    
    
    public Client(){
    try{
        //Creamos los flujos de entrada y salida
        try (Socket sCliente = new Socket(Host, PORT)) {
            //Creamos los flujos de entrada y salida
            DataInputStream data_input_stream=new DataInputStream(sCliente.getInputStream());
            DataOutputStream data_output_stream=new DataOutputStream(sCliente.getOutputStream());
            
            //Tareas que realiza el cliente
            while(data!="exit"){
            System.out.println("Cliente:Introduce una opcion :");
            data_output_stream.writeUTF( teclado.nextLine());
            String data=data_input_stream.readUTF();
            System.out.println(data);
            }
        }
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
    
        }
    
public static void main(String[] args){
    new Client();
}    
}
