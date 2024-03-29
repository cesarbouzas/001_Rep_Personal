/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorEjercicio3;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Vejercicio3 extends javax.swing.JFrame {

    /**
     * Creates new form Vejercicio3
     */
    public Vejercicio3() {
        initComponents();
        ControladorEjercicio3.inicicarSession();
       
    }

    public JTextField getTxtDep_Loc() {
        return txtDep_Loc;
    }

    public void setTxtDep_Loc(JTextField txtDep_Loc) {
        this.txtDep_Loc = txtDep_Loc;
    }

    public JTextField getTxtDep_no() {
        return txtDep_no;
    }

    public void setTxtDep_no(JTextField txtDep_no) {
        this.txtDep_no = txtDep_no;
    }

    public JTextField getTxtDep_nombre() {
        return txtDep_nombre;
    }

    public void setTxtDep_nombre(JTextField txtDep_nombre) {
        this.txtDep_nombre = txtDep_nombre;
    }

    public JButton getBtnDep_borrar() {
        return btnDep_borrar;
    }

    public JButton getBtnDep_insertar() {
        return btnDep_insertar;
    }

    public JButton getBtnDep_modificar() {
        return btnDep_modificar;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDep_no = new javax.swing.JTextField();
        txtDep_nombre = new javax.swing.JTextField();
        txtDep_Loc = new javax.swing.JTextField();
        btnDep_insertar = new javax.swing.JButton();
        btnDep_borrar = new javax.swing.JButton();
        btnDep_modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nº :");

        jLabel2.setText("Nombre :");

        jLabel3.setText("Localización:");

        txtDep_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDep_noFocusLost(evt);
            }
        });

        btnDep_insertar.setText("Añadir");

        btnDep_borrar.setText("Borrar");

        btnDep_modificar.setText("Modificar");

        jLabel4.setText("Departamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDep_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDep_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDep_no, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDep_insertar)
                    .addComponent(btnDep_borrar)
                    .addComponent(btnDep_modificar))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDep_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDep_insertar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDep_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDep_borrar)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDep_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDep_modificar)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDep_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDep_noFocusLost
ControladorEjercicio3.cargarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDep_noFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDep_borrar;
    private javax.swing.JButton btnDep_insertar;
    private javax.swing.JButton btnDep_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDep_Loc;
    private javax.swing.JTextField txtDep_no;
    private javax.swing.JTextField txtDep_nombre;
    // End of variables declaration//GEN-END:variables
}
