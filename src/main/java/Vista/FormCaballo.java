/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Aprendiente
 */
public class FormCaballo extends javax.swing.JFrame {

    /**
     * Creates new form FormCaballo
     */
    public FormCaballo() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlDatosCaballo = new javax.swing.JPanel();
        lblDatosCaballo = new javax.swing.JLabel();
        lblNombreCaballo = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        txtNombreCaballo = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        pnlDatosDueno = new javax.swing.JPanel();
        lblDatosDueno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Caballo y Dueño");

        pnlDatosCaballo.setBackground(new java.awt.Color(222, 222, 171));
        pnlDatosCaballo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDatosCaballo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblDatosCaballo.setText("Datos del caballo:");

        lblNombreCaballo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblNombreCaballo.setText("Nombre:");

        lblRaza.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblRaza.setText("Raza:");

        lblColor.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblColor.setText("Color:");

        txtNombreCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCaballoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosCaballoLayout = new javax.swing.GroupLayout(pnlDatosCaballo);
        pnlDatosCaballo.setLayout(pnlDatosCaballoLayout);
        pnlDatosCaballoLayout.setHorizontalGroup(
            pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosCaballoLayout.createSequentialGroup()
                .addGroup(pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosCaballoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCaballo)
                            .addComponent(lblRaza)
                            .addComponent(lblColor))
                        .addGap(30, 30, 30)
                        .addGroup(pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtColor)
                            .addComponent(txtNombreCaballo)))
                    .addGroup(pnlDatosCaballoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDatosCaballo)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlDatosCaballoLayout.setVerticalGroup(
            pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosCaballoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosCaballo)
                .addGap(50, 50, 50)
                .addGroup(pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCaballo)
                    .addComponent(txtNombreCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlDatosCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosDueno.setBackground(new java.awt.Color(222, 222, 171));
        pnlDatosDueno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlDatosDueno.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N

        lblDatosDueno.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblDatosDueno.setText("Datos del dueño");

        lblNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblEdad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lblEdad.setText("Edad");

        lblTelefono.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lblTelefono.setText("Telefono");

        javax.swing.GroupLayout pnlDatosDuenoLayout = new javax.swing.GroupLayout(pnlDatosDueno);
        pnlDatosDueno.setLayout(pnlDatosDuenoLayout);
        pnlDatosDuenoLayout.setHorizontalGroup(
            pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosDuenoLayout.createSequentialGroup()
                .addGroup(pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosDuenoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDatosDueno))
                    .addGroup(pnlDatosDuenoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEdad)
                                .addComponent(lblNombre))
                            .addComponent(lblTelefono))
                        .addGap(24, 24, 24)
                        .addGroup(pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtEdad)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlDatosDuenoLayout.setVerticalGroup(
            pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosDuenoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosDueno)
                .addGap(51, 51, 51)
                .addGroup(pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlDatosDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(102, 255, 102));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDatosCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDatosDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDatosCaballo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatosDueno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCaballoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCaballoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //Controlador manda esto al logico para construir un caballo y un dueño
        //al terminar los agrega a algun tipo de almacenamiento....
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //preguntar si quiere cancelar la accion y si, la respuesta es si cerrar y cancelar la operacion.
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCaballo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDatosCaballo;
    private javax.swing.JLabel lblDatosDueno;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreCaballo;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlDatosCaballo;
    private javax.swing.JPanel pnlDatosDueno;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCaballo;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
