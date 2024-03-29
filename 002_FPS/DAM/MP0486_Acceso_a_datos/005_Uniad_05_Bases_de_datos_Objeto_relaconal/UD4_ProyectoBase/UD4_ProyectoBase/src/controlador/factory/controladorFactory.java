/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.factory;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;


/**
 *
 * @author acceso a datos
 */
public class controladorFactory {
    static String BDEmpresa = "./src/BD/ejemplo.db40";
    static ObjectContainer bd;

    public static void abrirBD() {
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDEmpresa);
    }

    public static void cerrarBD() {
        bd.close();
    }

    public static ObjectContainer getBD() {
        return bd;
    }
//    
//    public static DepartamentoDAO getDepartamentoDAO() {
//        return new DepartamentoDAO();
//    }
    
    
}
