/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import controlador.factory.controladorFactory;
import modelo.vo.Empleado;

/**
 *
 * @author Acceso a datos
 */
public class EmpleadoDAO {
    public void insertar(Empleado e) {
        controladorFactory.getBD().store(e);
    }
}
