package ec.edu.espe.AbstractFactory.view;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FrmClientApp extends javax.swing.JFrame {

    /**
     * Creates new form FrmClientApp
     */
    public FrmClientApp() {
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

                    jMenuItem1 = new javax.swing.JMenuItem();
                    jPanel1 = new javax.swing.JPanel();
                    jLabel1 = new javax.swing.JLabel();
                    jButton1 = new javax.swing.JButton();
                    jButton2 = new javax.swing.JButton();
                    jButton3 = new javax.swing.JButton();

                    jMenuItem1.setText("jMenuItem1");

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                    jLabel1.setFont(new java.awt.Font("Minecraft", 1, 36)); // NOI18N
                    jLabel1.setText("Client App");

                    jButton1.setText("Windows");
                    jButton1.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton1ActionPerformed(evt);
                              }
                    });

                    jButton2.setText("Linux");
                    jButton2.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton2ActionPerformed(evt);
                              }
                    });

                    jButton3.setText("Exit");
                    jButton3.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton3ActionPerformed(evt);
                              }
                    });

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                    jPanel1.setLayout(jPanel1Layout);
                    jPanel1Layout.setHorizontalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(88, 88, 88))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(57, 57, 57)
                                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(39, 39, 39)
                                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(152, 152, 152)
                                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(60, Short.MAX_VALUE))
                    );
                    jPanel1Layout.setVerticalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton3)
                                        .addContainerGap(31, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );

                    pack();
          }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmWindows frmWindows= new FrmWindows();
        this.setVisible(false);
        frmWindows.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         FrmLinux frmLinux= new FrmLinux();
        this.setVisible(false);
        frmLinux.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

          private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                    System.exit(0);
          }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientApp().setVisible(true);
            }
        });
    }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton jButton1;
          private javax.swing.JButton jButton2;
          private javax.swing.JButton jButton3;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JMenuItem jMenuItem1;
          private javax.swing.JPanel jPanel1;
          // End of variables declaration//GEN-END:variables
}
