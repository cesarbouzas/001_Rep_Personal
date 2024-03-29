
package controlador;

import controlador.factory.DAOFactory;
import controlador.factory.MySQLDAOFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamento;
import vista.Vejercicio4;

/**
 *
 * @author AD
 */
public class ControladorEjercicio4 {
    
    public static Vejercicio4 ventana=new Vejercicio4();
    public static DAOFactory factoryDAO;
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;
    
    public static void iniciar(){
        
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
       
    }
    public static void inciarFactory(){
        factoryDAO=MySQLDAOFactory.getDAOFactory(MySQLDAOFactory.MYSQL);
        depDAO=factoryDAO.getDepartamentoDAO();
        empDAO=factoryDAO.getEmpleadoDAO();
        
                
    }
    public static void cerrarFactory(){
        try {
            factoryDAO.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void RellenarDatos() {
        Departamento dept;
        String txtinsertado=ventana.getTxtDept_n().getText();
        try {
            Connection conn=factoryDAO.getConnection();
            
            if(isStringNumber(txtinsertado)){
                dept=depDAO.buscarDepartamento(conn,Integer.parseInt(txtinsertado));
                if(dept!=null){
                    ventana.getTxtDnombre().setText(dept.getDnombre());
                    ventana.getTxtLoc().setText(dept.getLoc());
                    empDAO.mostrarEmpleados(conn,dept.getDept_no(),ventana.getjTextArea1());
                    ControladorEjercicio4.mostrarDepartamentos();
                }else{
                    JOptionPane.showMessageDialog(null, "El departamento"+ txtinsertado+ " no existe");
                    limpiarDatos();
                }
                factoryDAO.releaseConnection(conn);
                        
            }else{
                JOptionPane.showMessageDialog(null,"Error de los datos introducidos ");
                limpiarDatos();
            }
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        }
     public static void InsertarDepartamentoComprobando() {
       
         if(isStringNumber(ventana.getTxtDept_n().getText())){
            int num=Integer.parseInt(ventana.getTxtDept_n().getText());
            try{
            Connection conn=factoryDAO.getConnection();
            Departamento dept=depDAO.buscarDepartamento(conn,num);
            if(dept==null){
                if(ventana.getTxtDnombre().getText().isEmpty()||ventana.getTxtLoc().getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Introduce todos los datos");
                
                }else{
                    try{
                    dept=new Departamento(num, ventana.getTxtDnombre().getText(), ventana.getTxtLoc().getText());
                   JOptionPane.showMessageDialog(null,depDAO.InsertarDepartamento(conn,dept)+" registros modificados");
                    conn.commit();
                    RellenarDatos();
                    
                   
        
        
                    }catch(SQLException e){
                        
                     conn.rollback();
                    }
                    }
                
            }else{
                JOptionPane.showMessageDialog(null, "El departamento ya existe");
            }
            factoryDAO.releaseConnection(conn);
         }catch(Exception e){
             
            e.printStackTrace();
         }
           
         }else{
             JOptionPane.showMessageDialog(null,"Numero de departamento con formato incorrecto");
         }
         }
    public static void  InsertarDepartamentoSinComporbar(){
            Connection conn=null;
            
            if(!ventana.getTxtDept_n().getText().isEmpty()
               &&!ventana.getTxtDnombre().getText().isEmpty()
               &&!ventana.getTxtLoc().getText().isEmpty())
            {
               try{
                conn=factoryDAO.getConnection();
                Departamento dept=new Departamento(Integer.parseInt(ventana.getTxtDept_n().getText()), ventana.getTxtDnombre().getText(),ventana.getTxtLoc().getText());
                JOptionPane.showMessageDialog(null,"Se han modificado "+depDAO.InsertarDepartamento(conn, dept)+" registros");
                conn.commit();
                 RellenarDatos();
               }catch(SQLException eSQL){
                    try{
                        switch (eSQL.getErrorCode()) {
                            case 1062->                                
                                JOptionPane.showMessageDialog(null, "Departaento ya existe");
                            default->{}
                        }
                   conn.rollback();
                       
                   }catch(SQLException eSQL1){
                       eSQL1.printStackTrace();
                   }
                   
               }catch(NumberFormatException eNF){
                   try{
                       JOptionPane.showMessageDialog(null, "Error de datos");
                   conn.rollback();
                   }catch( SQLException eNF1){
                       eNF1.printStackTrace();
                   }
               }catch(Exception e){
                   try{
                   conn.rollback();
                   JOptionPane.showMessageDialog(null, "Error general");
                   }catch(SQLException e1){
                           e.printStackTrace();
                   }
               }
            
            
            
            }else{
                JOptionPane.showMessageDialog(null,"Introduce todos los datos");
            }  
        
    
    }
    
    
    
    
    public static boolean isStringNumber(String txt){
        try{
            Integer.parseInt(txt);
        }catch(NumberFormatException e){
            return false;
            
         
        }
        return true;
    }
    public static void limpiarDatos(){
        ventana.getTxtDnombre().setText("");
        ventana.getTxtLoc().setText("");
        ventana.getjTextArea1().setText("");
        mostrarDepartamentos();
    }

    public static void borrarComprobando() {
        Connection conn=null;
        if(ventana.getTxtDept_n().getText().isEmpty()
                ||ventana.getTxtDnombre().getText().isEmpty()
                ||ventana.getTxtLoc().getText().isBlank())
        {
            JOptionPane.showMessageDialog(null,"Introduce Datos");
        }else{
         try{
             conn=factoryDAO.getConnection();
             int numDept=Integer.parseInt(ventana.getTxtDept_n().getText());
             Departamento dept=depDAO.buscarDepartamento(conn, numDept);
             System.out.println(depDAO.contarEmplados(conn, numDept));
             if(dept==null ){
             JOptionPane.showMessageDialog(null, "El departamento no existe ");
             }else if(depDAO.contarEmplados(conn, numDept)>0){
             JOptionPane.showMessageDialog(null, "El departamento tiene empleados");
             }else{
             JOptionPane.showMessageDialog(null,"Han sido borrados "+depDAO.borrarDepartamento(conn,numDept )+" registros");    
             conn.commit();
               RellenarDatos();
               
             }
             
             factoryDAO.releaseConnection(conn);
         }catch(SQLException eSDQL){
             eSDQL.printStackTrace();
             try {
                 switch (eSDQL.getErrorCode()) {
                     case 1061->
                            JOptionPane.showMessageDialog(null,"El departamento tiene empleados , no puede ser borrado");
                         
                     default->{}
                         
                 }
                 
                 conn.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(ControladorEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         }catch(NumberFormatException eNFE){
         
             try {
                 JOptionPane.showMessageDialog(null, "Numero de departamento invalido");
                 
                 conn.rollback();
             } catch (SQLException ex) {
               
                 Logger.getLogger(ControladorEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         }catch(Exception e){
             e.printStackTrace();
             try {
                 conn.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(ControladorEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
             }
         }   
        
        
        }
        
        
    }
    
    public static void borrarSinComprobar(){
    Connection conn=null;
    
    if(ventana.getTxtDept_n().getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Inserte un numero de deparamento ");
    }else{
        try{
            conn=factoryDAO.getConnection();
           depDAO.borrarDepartamento(conn, Integer.parseInt(ventana.getTxtDept_n().getText()));
           conn.commit();
           JOptionPane.showMessageDialog(null,"Departamento Borrado");
        }catch(NumberFormatException eNF){
            eNF.printStackTrace();
            JOptionPane.showMessageDialog(null,"numero de departamento formato invalido");
            
        }catch(SQLException eSQL){
                
                switch (eSQL.getErrorCode()) {
                case 1451->
                    JOptionPane.showMessageDialog(null,"Error al borrar el departamento");    
                default->{
                     try {
                    conn.rollback();
                    } catch (SQLException ex) {
                     Logger.getLogger(ControladorEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
                     }
}
                }
                   } catch (Exception ex) {
            Logger.getLogger(ControladorEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
            }
            factoryDAO.releaseConnection(conn);
        }
        
    

    
public static void mostrarDepartamentos() {
    Connection conn=null;
    try{
    conn=factoryDAO.getConnection();
    depDAO.listarTodosDepartamentos(conn,ventana.getTextAreaDepartamentos() );
    }catch(SQLException eSQL){
        eSQL.printStackTrace();
    }catch(Exception e){
        e.printStackTrace();
    }
    factoryDAO.releaseConnection(conn);
}

    public static void actualizarDepartamento() {
         Connection conn=null;
        if(ventana.getTxtDept_n().getText().isEmpty()
                ||ventana.getTxtDnombre().getText().isEmpty()
                ||ventana.getTxtLoc().getText().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Introduce todos los datos");
        
        }else{
           
           try{
                int dept_no=Integer.parseInt(ventana.getTxtDept_n().getText());
                conn=factoryDAO.getConnection();
                Departamento dep=new Departamento(dept_no, ventana.getTxtDnombre().getText(),ventana.getTxtLoc().getText());
                if(depDAO.actualizarDepartamento(conn,dep)==1){
                 conn.commit();
                  RellenarDatos();
                 JOptionPane.showMessageDialog(null, "se ha actualizado un registro");
                }else if(depDAO.actualizarDepartamento(conn, dep)==0){
                 JOptionPane.showMessageDialog(null, "Se han actualizados 0 registros");
                }else{
                  JOptionPane.showMessageDialog(null, "Se han actulizado mas de un registro error!");
                }
                
                
           }catch(NumberFormatException eNF){
               JOptionPane.showMessageDialog(null, "Error de formato de numero departamento");
            }catch(SQLException eSQL){
                eSQL.printStackTrace();
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
                }
             }catch(Exception e){
                e.printStackTrace();
                
        }
  
    }
        factoryDAO.releaseConnection(conn);
    }
    
}
