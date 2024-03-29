/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorEjercicio1;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.vo.Departamento;

/**
 *
 * @author Acceso a datos
 */
public class Vejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form ProyectoBase
     */
    public Vejercicio1() {
        initComponents();
        
    }

    public JComboBox<Departamento> getCbDepartamento() {
        return cbDepartamento;
    }

    public void setCbDepartamento(JComboBox<Departamento> cbDepartamento) {
        this.cbDepartamento = cbDepartamento;
    }

    

    public JTextField getTxt_apellido() {
        return txt_apellido;
    }

    public void setTxt_apellido(JTextField txt_apellido) {
        this.txt_apellido = txt_apellido;
    }

    public JTextField getTxt_nEmpleado() {
        return txt_nEmpleado;
    }

    public void setTxt_nEmpleado(JTextField txt_nEmpleado) {
        this.txt_nEmpleado = txt_nEmpleado;
    }

    public JTextField getTxt_salario() {
        return txt_salario;
    }

    public void setTxt_salario(JTextField txt_salario) {
        this.txt_salario = txt_salario;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_InicarBD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
        btn_Añadir = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        txt_nEmpleado = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_InicarBD.setText("Iniciar BD");
        btn_InicarBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InicarBDMouseClicked(evt);
            }
        });
        btn_InicarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InicarBDActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº Empleado");

        jLabel2.setText("Apellido");

        jLabel3.setText("Salario");

        jLabel4.setText("Departamento");

        btn_Añadir.setText("Añadir");
        btn_Añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AñadirMouseClicked(evt);
            }
        });
        btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AñadirActionPerformed(evt);
            }
        });

        btn_Borrar.setText("Borrar");
        btn_Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BorrarMouseClicked(evt);
            }
        });
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar");
        btn_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarMouseClicked(evt);
            }
        });

        txt_nEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nEmpleadoFocusLost(evt);
            }
        });

        txt_apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_apellidoFocusLost(evt);
            }
        });

        txt_salario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_salarioFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_InicarBD)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(txt_nEmpleado)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Borrar)
                            .addComponent(btn_Añadir)
                            .addComponent(btn_Modificar))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_InicarBD)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Añadir)
                    .addComponent(txt_nEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(btn_Borrar))
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btn_Modificar)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InicarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InicarBDActionPerformed
        // TODO add your handling code here:
        ControladorEjercicio1.iniciaBD();
        ControladorEjercicio1.cargarDatosDB();
        ControladorEjercicio1.cargarComboDepartamentos();
    }//GEN-LAST:event_btn_InicarBDActionPerformed

    private void btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AñadirActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened



// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btn_InicarBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicarBDMouseClicked
        // TODO add your handling code here:
        ControladorEjercicio1.cargarDatosDB();
        ControladorEjercicio1.cargarComboDepartamentos();
    }//GEN-LAST:event_btn_InicarBDMouseClicked

    private void txt_nEmpleadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nEmpleadoFocusLost
ControladorEjercicio1.cargarTxtFields();


        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nEmpleadoFocusLost

    private void btn_AñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AñadirMouseClicked
        ControladorEjercicio1.insertarEmpleado();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AñadirMouseClicked

    private void txt_apellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_apellidoFocusLost
ControladorEjercicio1.comprobarTextFieldApellido();
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoFocusLost

    private void txt_salarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_salarioFocusLost
ControladorEjercicio1.comprobarTextFieldSalario();
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioFocusLost

    private void btn_BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BorrarMouseClicked
ControladorEjercicio1.borrarEmpleado();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BorrarMouseClicked

    private void btn_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarMouseClicked
ControladorEjercicio1.modificarEmpleado();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ModificarMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Añadir;
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_InicarBD;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JComboBox<modelo.vo.Departamento> cbDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nEmpleado;
    private javax.swing.JTextField txt_salario;
    // End of variables declaration//GEN-END:variables
}