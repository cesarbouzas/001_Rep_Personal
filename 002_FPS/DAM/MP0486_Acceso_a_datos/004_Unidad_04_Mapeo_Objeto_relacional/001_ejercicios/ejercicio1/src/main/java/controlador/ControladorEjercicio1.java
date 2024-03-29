
package controlador;

import controlador.factory.HibernateUtil;
import java.util.ArrayList;
import modelo.dao.DepartamentoDAO;
import modelo.vo.Departamentos;
import org.hibernate.Session;
import vista.Vejercicio1;

/**
 *
 * @author acceso a datos
 */



public class ControladorEjercicio1 {

public static Vejercicio1 ventana=new Vejercicio1();
public static Session session;
public static DepartamentoDAO depDAO;
    
    public static void iniciar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void iniciarSesion(){
    session=HibernateUtil.getSessionFactory().openSession();
    depDAO=HibernateUtil.getDepartamentoDAO();
    
    }
    public static void cerrarSession(){
      session.close();
    }

    public static void mostrarDepartamentos() {
        HibernateUtil.commitTx(session);
        ArrayList<Departamentos> listadoDepartamentos=depDAO.listarAllDepartamentos(session);
        for(Departamentos item :listadoDepartamentos){
            ventana.getTxtAreaDepartamentos().append(item.getDeptNo()+"<->"+item.getDnombre()+"->"+item.getLoc()+"\n");
        }
        HibernateUtil.commitTx(session);
            
        }
  
        }
        
    
    


