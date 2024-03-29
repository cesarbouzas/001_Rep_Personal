
package vista;

import controlador.ControladorEjercicio5;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.vo.Departamentos;

/**
 *
 * @author Usuario
 */
public class Vejercicio5 extends javax.swing.JFrame {


    public Vejercicio5() {
        initComponents();
    }

    public JComboBox<Departamentos> getCBdepartamento() {
        return CBdepartamento;
    }

    public void setCBdepartamento(JComboBox<Departamentos> CBdepartamento) {
        this.CBdepartamento = CBdepartamento;
    }

    public JTextField getTxtEmp_Director() {
        return txtEmp_Director;
    }

    public void setTxtEmp_Director(JTextField txtEmp_Director) {
        this.txtEmp_Director = txtEmp_Director;
    }

    public JTextField getTxtEmp_Salario() {
        return txtEmp_Salario;
    }

    public void setTxtEmp_Salario(JTextField txtEmp_Salario) {
        this.txtEmp_Salario = txtEmp_Salario;
    }

    public JTextField getTxtEmp_apellido() {
        return txtEmp_apellido;
    }

    public void setTxtEmp_apellido(JTextField txtEmp_apellido) {
        this.txtEmp_apellido = txtEmp_apellido;
    }

    public JTextField getTxtEmp_no() {
        return txtEmp_no;
    }

    public void setTxtEmp_no(JTextField txtEmp_no) {
        this.txtEmp_no = txtEmp_no;
    }

    public JTextField getTxtEmp_oficio() {
        return txtEmp_oficio;
    }

    public void setTxtEmp_oficio(JTextField txtEmp_oficio) {
        this.txtEmp_oficio = txtEmp_oficio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBdepartamento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtEmp_no = new javax.swing.JTextField();
        txtEmp_apellido = new javax.swing.JTextField();
        txtEmp_oficio = new javax.swing.JTextField();
        txtEmp_Director = new javax.swing.JTextField();
        txtEmp_Salario = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablaEmpleados = new javax.swing.JTable();

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

        jLabel2.setText("Apellido");

        jLabel3.setText("Oficio");

        jLabel4.setText("Director");

        jLabel5.setText("Salario");

        jLabel6.setText("Departamento");

        txtEmp_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmp_noFocusLost(evt);
            }
        });
        txtEmp_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmp_noActionPerformed(evt);
            }
        });

        txtEmp_apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmp_apellidoFocusLost(evt);
            }
        });

        txtEmp_oficio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmp_oficioFocusLost(evt);
            }
        });

        txtEmp_Director.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmp_DirectorFocusLost(evt);
            }
        });

        txtEmp_Salario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmp_SalarioFocusLost(evt);
            }
        });
        txtEmp_Salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmp_SalarioActionPerformed(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMouseClicked(evt);
            }
        });
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        JtablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtablaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtEmp_no, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmp_Salario)
                                .addComponent(txtEmp_Director)
                                .addComponent(txtEmp_oficio)
                                .addComponent(txtEmp_apellido))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmp_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmp_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtEmp_oficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtEmp_Director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtEmp_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CBdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtEmp_SalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmp_SalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmp_SalarioActionPerformed

    private void txtEmp_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmp_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmp_noActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
ControladorEjercicio5.finalizarConession();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ControladorEjercicio5.iniciarConession();
        ControladorEjercicio5.cargarComboDepartamentos();
        ControladorEjercicio5.rellenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void txtEmp_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmp_noFocusLost
        ControladorEjercicio5.rellenarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmp_noFocusLost

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
ControladorEjercicio5.insertarEmpleado();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void txtEmp_apellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmp_apellidoFocusLost
        // TODO add your handling code he
        ControladorEjercicio5.comprobarCampoTxt(this.txtEmp_apellido);
    }//GEN-LAST:event_txtEmp_apellidoFocusLost

    private void txtEmp_oficioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmp_oficioFocusLost
        ControladorEjercicio5.comprobarCampoTxt(this.txtEmp_oficio);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmp_oficioFocusLost

    private void txtEmp_DirectorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmp_DirectorFocusLost
     ControladorEjercicio5.comprobarCampoNumero(this.txtEmp_Director);
     ControladorEjercicio5.comprobarDirector();
    }//GEN-LAST:event_txtEmp_DirectorFocusLost

    private void txtEmp_SalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmp_SalarioFocusLost
     ControladorEjercicio5.comprobarCampoDecimal(txtEmp_Salario);   
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmp_SalarioFocusLost

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
ControladorEjercicio5.borrarEmpleado();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
ControladorEjercicio5.modificarEmpleado();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
ControladorEjercicio5.modificarEmpleado();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    public JTable getJtableEmpleados() {
        return JtablaEmpleados;
    }

    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Departamentos> CBdepartamento;
    private javax.swing.JTable JtablaEmpleados;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmp_Director;
    private javax.swing.JTextField txtEmp_Salario;
    private javax.swing.JTextField txtEmp_apellido;
    private javax.swing.JTextField txtEmp_no;
    private javax.swing.JTextField txtEmp_oficio;
    // End of variables declaration//GEN-END:variables
}
