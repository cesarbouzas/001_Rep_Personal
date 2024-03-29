/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.db4o.query.Query;
import controlador.factory.controladorFactory;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.vo.Departamento;

/**
 *
 * @author acceso a datos
 */
public class DepartamentoDAO {

    public void insertar(Departamento d) {
        controladorFactory.getBD().store(d);
    }

    public void modificar(Departamento d) {
        controladorFactory.getBD().store(d);
    }

    public void borrar(Departamento d) {
        controladorFactory.getBD().delete(d);
    }

    public Departamento existeDepartamentoQBE(Departamento d) throws Exception {

        ObjectSet result = controladorFactory.getBD().queryByExample(d);
        if (result.hasNext()) {
            return (Departamento) result.next();
        } else {
            return null;
        }
    }

   
    public void cargarCombo(DefaultComboBoxModel modelocombo) throws Exception {
        Departamento d;

        modelocombo.removeAllElements();

        /**
         * Utilizaremos una consulta de tipo SODA para cargar los datos de los
         * departamentos.
         */
        Query query = controladorFactory.getBD().query();
        query.constrain(Departamento.class);
        ObjectSet result = query.execute();

        Iterator it = result.iterator();
        while (it.hasNext()) {
            d = (Departamento) it.next();
            modelocombo.addElement(d);
        }
    }

}
