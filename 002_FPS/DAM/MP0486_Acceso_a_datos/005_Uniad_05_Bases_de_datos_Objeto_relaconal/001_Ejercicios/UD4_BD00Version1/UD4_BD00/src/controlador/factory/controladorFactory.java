/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.factory;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;

/**
 *
 * @author acceso a datos
 */
public class controladorFactory {
    static String BDEmpleados = "./src/BD/ejemplo.db40";
    static ObjectContainer bd;

    public static void abrirBD() {
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDEmpleados);
    }

    public static void cerrarBD() {
        bd.close();
    }

    public static ObjectContainer getBD() {
        return bd;
    }
    public static DepartamentoDAO getDepartamentoDAO() {
        return new DepartamentoDAO();
    }

    public static EmpleadoDAO getEmpleadoDAO() {
        return new EmpleadoDAO();
    }    
    
}