
package Vista;

public class Juego extends javax.swing.JFrame {

  
    public Juego() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblCaballos = new javax.swing.JLabel();
        jpbBarraCarrera = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIniciar = new javax.swing.JMenu();
        jMenuAgregar = new javax.swing.JMenu();
        AgreCaballo = new javax.swing.JMenuItem();
        AgreJugador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        tblDatos.setBackground(new java.awt.Color(222, 222, 171));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Jugador", "Apuesta", "Caballo"
            }
        ));
        jScrollPane2.setViewportView(tblDatos);

        lblCaballos.setText("🐴Caballos");

        jMenuIniciar.setText("Iniciar");
        jMenuBar1.add(jMenuIniciar);

        jMenuAgregar.setText("Agregar");

        AgreCaballo.setText("Caballo");
        AgreCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreCaballoActionPerformed(evt);
            }
        });
        jMenuAgregar.add(AgreCaballo);

        AgreJugador.setText("Jugador");
        jMenuAgregar.add(AgreJugador);

        jMenuBar1.add(jMenuAgregar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCaballos)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jpbBarraCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCaballos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpbBarraCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgreCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreCaballoActionPerformed
        // TODO add your handling code here:
        FormCaballo formCaba = new FormCaballo ();
        formCaba.setVisible(true);
        
    }//GEN-LAST:event_AgreCaballoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgreCaballo;
    private javax.swing.JMenuItem AgreJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenuAgregar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIniciar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar jpbBarraCarrera;
    private javax.swing.JLabel lblCaballos;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
