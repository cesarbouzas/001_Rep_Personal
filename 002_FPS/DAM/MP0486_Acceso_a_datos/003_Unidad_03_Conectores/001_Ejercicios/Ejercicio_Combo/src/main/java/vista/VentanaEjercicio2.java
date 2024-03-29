/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorEjercicio2;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import modelo.vo.Departamento;

/**
 *
 * @author AD
 */
public class VentanaEjercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public VentanaEjercicio2() {
        initComponents();
        ControladorEjercicio2.iniciarFactory();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        ComboBox = new javax.swing.JComboBox<>();
        lbNumEmpleados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        ComboBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ComboBoxComponentAdded(evt);
            }
        });
        ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxItemStateChanged(evt);
            }
        });
        ComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ComboBoxPropertyChange(evt);
            }
        });

        lbNumEmpleados.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(301, 301, 301))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNumEmpleados)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            ControladorEjercicio2.cerrarFactory();  // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       ControladorEjercicio2.cargarListaDepartamentos();
        ControladorEjercicio2.listarEmpleadosPorDepartamento();
      
    }//GEN-LAST:event_formWindowOpened

    private void ComboBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ComboBoxComponentAdded
         // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxComponentAdded

    private void ComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ComboBoxPropertyChange
        // TODO add your hCandling code here:
     
    }//GEN-LAST:event_ComboBoxPropertyChange

    private void ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxItemStateChanged
        // TODO add your handling code here:
        ControladorEjercicio2.listarEmpleadosPorDepartamento();
    }//GEN-LAST:event_ComboBoxItemStateChanged


    public JComboBox<Departamento> getComboBox() {
        return ComboBox;
    }

    public JLabel getLbNumEmpleados() {
        return lbNumEmpleados;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    
    public JTextArea getTextArea() {
        return textArea;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Departamento> ComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNumEmpleados;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
