
package vista;

import controlador.ControladorEjercicio5;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.vo.Departamento;

/**
 *
 * @author AD
 */
public class VEjercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public VEjercicio5() {
        initComponents();
        ControladorEjercicio5.iniciarFactory();
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
        txtEmpNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmpApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmpOficio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmpDirector = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmpSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboDepartamentos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaEmpleados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Número");

        txtEmpNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmpNoFocusLost(evt);
            }
        });

        jLabel2.setText("Apellido");

        jLabel3.setText("Oficio");

        txtEmpOficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpOficioActionPerformed(evt);
            }
        });

        jLabel4.setText("Director");

        txtEmpDirector.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmpDirectorFocusLost(evt);
            }
        });
        txtEmpDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpDirectorActionPerformed(evt);
            }
        });

        jLabel5.setText("Salario");

        txtEmpSalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmpSalarioFocusLost(evt);
            }
        });
        txtEmpSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpSalarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Departamento");

        jLabel7.setText("Empleado");

        jButton1.setText("Insertar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        TxtAreaEmpleados.setColumns(20);
        TxtAreaEmpleados.setRows(5);
        jScrollPane1.setViewportView(TxtAreaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmpApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtEmpOficio)
                                    .addComponent(txtEmpDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)))
                            .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmpApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmpOficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmpDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpOficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpOficioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpOficioActionPerformed

    private void txtEmpDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpDirectorActionPerformed

    private void txtEmpSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpSalarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEmpNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpNoFocusLost
    ControladorEjercicio5.rellenarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNoFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
ControladorEjercicio5.apagarFactory();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
ControladorEjercicio5.iniciarFactory();   
ControladorEjercicio5.rellenarComboDepartamentos();
ControladorEjercicio5.rellenarTxtAreaEmpleados();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
ControladorEjercicio5.insertarEmpleado();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtEmpDirectorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpDirectorFocusLost
    ControladorEjercicio5.comprobarDirectivo();        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpDirectorFocusLost

    private void txtEmpSalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpSalarioFocusLost
ControladorEjercicio5.comprobarSalarioNegativo();        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpSalarioFocusLost

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
ControladorEjercicio5.borrarEmpleado();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    ControladorEjercicio5.modificarEmpleado();
    }//GEN-LAST:event_jButton3MouseClicked

    public JComboBox<Departamento> getComboDepartamentos() {
        return comboDepartamentos;
    }

    public JTextArea getTxtAreaEmpleados() {
        return TxtAreaEmpleados;
    }

    public void setTxtAreaEmpleados(JTextArea TxtAreaEmpleados) {
        this.TxtAreaEmpleados = TxtAreaEmpleados;
    }

    public void setComboDepartamentos(JComboBox<Departamento> comboDepartamentos) {
        this.comboDepartamentos = comboDepartamentos;
    }

    public JTextField getTxtEmpApellido() {
        return txtEmpApellido;
    }

    public void setTxtEmpApellido(JTextField txtEmpApellido) {
        this.txtEmpApellido = txtEmpApellido;
    }

    public JTextField getTxtEmpDirector() {
        return txtEmpDirector;
    }

    public void setTxtEmpDirector(JTextField txtEmpDirector) {
        this.txtEmpDirector = txtEmpDirector;
    }

    public JTextField getTxtEmpNo() {
        return txtEmpNo;
    }

    public void setTxtEmpNo(JTextField txtEmpNo) {
        this.txtEmpNo = txtEmpNo;
    }

    public JTextField getTxtEmpOficio() {
        return txtEmpOficio;
    }

    public void setTxtEmpOficio(JTextField txtEmpOficio) {
        this.txtEmpOficio = txtEmpOficio;
    }

    public JTextField getTxtEmpSalario() {
        return txtEmpSalario;
    }

    public void setTxtEmpSalario(JTextField txtEmpSalario) {
        this.txtEmpSalario = txtEmpSalario;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxtAreaEmpleados;
    private javax.swing.JComboBox<Departamento> comboDepartamentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmpApellido;
    private javax.swing.JTextField txtEmpDirector;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtEmpOficio;
    private javax.swing.JTextField txtEmpSalario;
    // End of variables declaration//GEN-END:variables
}