
package concurrente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConcurrent extends Thread{
    
    Socket sClient;
    private static final int PUERTO=2000;
    ServerSocket sServer;
    
    public ServerConcurrent(Socket cliente){
        sClient=cliente;
    }
  
    
    public static void main(String[] args){
    try{
        //incicio el servidor en el puerto
        ServerSocket sSocket=new ServerSocket(PUERTO);
        System.out.println("Servidor:Escucho el puerto : "+PUERTO);
        while(true){
            Socket socketCliente=sSocket.accept();
            System.out.println("Servidor:Cliente conectado");
            new ServerConcurrent(socketCliente).start();
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
    
    
    @Override
    public void run(){
        int estado=1;
        String comando="";
    try{
        //Creamos los datos de entrada y salida.
        DataInputStream data_input_stream=new DataInputStream(sClient.getInputStream());
        DataOutputStream data_out_stream=new DataOutputStream(sClient.getOutputStream());
        //Atender las peticiones de los clientes.
        data_out_stream.writeUTF("servidor:se ha conectado el cliente de manera correcta");
        do{
                      switch(estado){
                    
                    case 1:
                        System.out.println("Servidor:Introduce comando (ls/get/exit)");
                        comando=data_input_stream.readUTF();
                        System.out.println(comando);
                        if(comando.equals("ls")){
                            System.out.println("\tServidor:El cliente quiere ver el contenido del directorio");
                            data_out_stream.writeUTF("Servidor:muestro datos de directorio");
                            estado=1;
                            break;
                        }else
                            if(comando.equals("get")){
                                // Voy al estado 3 para mostrar el fichero
                                data_out_stream.writeUTF("Servidor:muestro el fichero");
                                estado=3;
                                break;
                            }else
                                estado=1;
                        break;
                        
                    case 3://voy a mostrar el archivo
                        System.out.println("Servidor:Introduce el nombre del archivo");
                        estado=1;
                        
                        break;
                }
                
                if(comando.equals("exit")){ 
                    estado=-1;
                    data_out_stream.writeUTF("exit");
                }
            }while(estado!=-1);
        
        
        
        
        
       sClient.close();//Cerramos el socket de conexion
        System.out.println("Servidor:Cliente desconectado");
    
    }catch(Exception e){
            System.out.println(e.getMessage());
    }   
    }
    
}