
package vista;

import controlador.ControladorEjercicio4;
;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author AD
 */
public class Vejercicio4 extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Vejercicio4()  {
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("/typsa_ventanas.gif")).getImage());
        ControladorEjercicio4.inciarFactory();
       
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public JTextField getTxtDept_n() {
        return txtDept_n;
    }

    public JTextField getTxtDnombre() {
        return txtDnombre;
    }

    public JTextField getTxtLoc() {
        return txtLoc;
    }

    public JTextArea getTextAreaDepartamentos() {
        return textAreaDepartamentos;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelnDpt = new javax.swing.JLabel();
        LbDnombre = new javax.swing.JLabel();
        lbLoc = new javax.swing.JLabel();
        txtDept_n = new javax.swing.JTextField();
        txtDnombre = new javax.swing.JTextField();
        txtLoc = new javax.swing.JTextField();
        btnInsertarDept = new javax.swing.JButton();
        btnBorrarDept = new javax.swing.JButton();
        btnModificarDep = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnInsertarDeptSinComprobar = new javax.swing.JButton();
        btnBorrarDept1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDepartamentos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelnDpt.setText("Nº Departamento");

        LbDnombre.setText("Nombre");

        lbLoc.setText("Localización");

        txtDept_n.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDept_nFocusLost(evt);
            }
        });
        txtDept_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDept_nActionPerformed(evt);
            }
        });

        btnInsertarDept.setText("Insertar Comprobando");
        btnInsertarDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarDeptMouseClicked(evt);
            }
        });
        btnInsertarDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarDeptActionPerformed(evt);
            }
        });

        btnBorrarDept.setText("Borrar Comprobando");
        btnBorrarDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarDeptMouseClicked(evt);
            }
        });

        btnModificarDep.setText("Modificar");
        btnModificarDep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarDepMouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnInsertarDeptSinComprobar.setText("Insertar Sin Comprobar");
        btnInsertarDeptSinComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarDeptSinComprobarMouseClicked(evt);
            }
        });
        btnInsertarDeptSinComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarDeptSinComprobarActionPerformed(evt);
            }
        });

        btnBorrarDept1.setText("Borrar Sin Comprobar");
        btnBorrarDept1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarDept1MouseClicked(evt);
            }
        });

        textAreaDepartamentos.setColumns(20);
        textAreaDepartamentos.setRows(5);
        jScrollPane2.setViewportView(textAreaDepartamentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelnDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbDnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDept_n, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtDnombre)
                            .addComponent(txtLoc))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnModificarDep))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsertarDept)
                                    .addComponent(btnBorrarDept))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInsertarDeptSinComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrarDept1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarDep)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelnDpt)
                            .addComponent(txtDept_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertarDept)
                            .addComponent(btnInsertarDeptSinComprobar))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbDnombre)
                            .addComponent(txtDnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarDept, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarDept1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLoc)
                            .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarDeptActionPerformed

    private void txtDept_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDept_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDept_nActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        ControladorEjercicio4.cerrarFactory();
    }//GEN-LAST:event_formWindowClosed

    private void txtDept_nFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDept_nFocusLost
        // TODO add your handling code here:
        ControladorEjercicio4.RellenarDatos();
    }//GEN-LAST:event_txtDept_nFocusLost

    private void btnInsertarDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarDeptMouseClicked
       ControladorEjercicio4.InsertarDepartamentoComprobando();
    }//GEN-LAST:event_btnInsertarDeptMouseClicked

    private void btnInsertarDeptSinComprobarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarDeptSinComprobarMouseClicked
        ControladorEjercicio4.InsertarDepartamentoSinComporbar();
    }//GEN-LAST:event_btnInsertarDeptSinComprobarMouseClicked

    private void btnInsertarDeptSinComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarDeptSinComprobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarDeptSinComprobarActionPerformed

    private void btnBorrarDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarDeptMouseClicked
        ControladorEjercicio4.borrarComprobando();// TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarDeptMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
ControladorEjercicio4.mostrarDepartamentos();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnModificarDepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarDepMouseClicked
ControladorEjercicio4.actualizarDepartamento();       
    }//GEN-LAST:event_btnModificarDepMouseClicked

    private void btnBorrarDept1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarDept1MouseClicked
        // TODO add your handling code here:
        ControladorEjercicio4.borrarSinComprobar();
    }//GEN-LAST:event_btnBorrarDept1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbDnombre;
    private javax.swing.JButton btnBorrarDept;
    private javax.swing.JButton btnBorrarDept1;
    private javax.swing.JButton btnInsertarDept;
    private javax.swing.JButton btnInsertarDeptSinComprobar;
    private javax.swing.JButton btnModificarDep;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelnDpt;
    private javax.swing.JLabel lbLoc;
    private javax.swing.JTextArea textAreaDepartamentos;
    private javax.swing.JTextField txtDept_n;
    private javax.swing.JTextField txtDnombre;
    private javax.swing.JTextField txtLoc;
    // End of variables declaration//GEN-END:variables
}