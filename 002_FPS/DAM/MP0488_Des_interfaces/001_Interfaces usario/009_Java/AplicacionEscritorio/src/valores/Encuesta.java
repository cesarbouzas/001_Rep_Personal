/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package valores;

/**
 *
 * @author cesar
 */
public class Encuesta extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Encuesta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHacerEncuesta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnArchivo = new javax.swing.JMenu();
        jMnEncuesta = new javax.swing.JMenu();
        jMnHacerEncuesta = new javax.swing.JMenuItem();
        jMnAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHacerEncuesta.setText("Hacer encuesta");
        btnHacerEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerEncuestaActionPerformed(evt);
            }
        });

        jMnArchivo.setText("Archivo");
        jMenuBar1.add(jMnArchivo);

        jMnEncuesta.setText("Encuesta");

        jMnHacerEncuesta.setText("Hacer encuesta");
        jMnHacerEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnHacerEncuestaActionPerformed(evt);
            }
        });
        jMnEncuesta.add(jMnHacerEncuesta);

        jMenuBar1.add(jMnEncuesta);

        jMnAyuda.setText("Ayuda");
        jMenuBar1.add(jMnAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnHacerEncuesta)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnHacerEncuesta)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnHacerEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnHacerEncuestaActionPerformed
        new Formulario().setVisible(true);
    }//GEN-LAST:event_jMnHacerEncuestaActionPerformed

    private void btnHacerEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerEncuestaActionPerformed
        Formulario miFormulario=new Formulario();
        miFormulario.setVisible(true);
    }//GEN-LAST:event_btnHacerEncuestaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHacerEncuesta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnArchivo;
    private javax.swing.JMenu jMnAyuda;
    private javax.swing.JMenu jMnEncuesta;
    private javax.swing.JMenuItem jMnHacerEncuesta;
    // End of variables declaration//GEN-END:variables
}
