/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author Usuario
 */
public class PruebaConexion {
    public static void main(String[] args) {
        Conexion con=new Conexion();
       con.conectar();
       if(con.cadena!=null){
       System.out.println("Conexion establecida");
       }else{
           System.out.println("Error de conexion");
       }
    }
    
}
