/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.DaoFactory;
import controlador.factory.MySQLDAOFactory;

public class ControladorEnunciado1 {
    public static void iniciar(){};
    public static void iniciaFactory(){
        DaoFactory mslF= MySQLDAOFactory.getDAOFactory(DaoFactory.MYSQL);
        
    }
    public static void cerrarFactory(){};
    public static void listarDepartamentos(){};
    
}
