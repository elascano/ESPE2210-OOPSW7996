package ec.edu.espe.owners.view;

/**
 *
 * @author Alejandro Cuadrado,DCCO-ESPE
 */
public class RegistrationUrbanization extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrationUrbanization
     */
    public RegistrationUrbanization() {
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuUrbanizationTreasury = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmQuit = new javax.swing.JMenuItem();
        mnuResident = new javax.swing.JMenu();
        itmRegisterResident = new javax.swing.JMenuItem();
        itmResident = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itmDates = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        itmContact = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel1.setText("Alejandro Cuadrado tutorship");

        mnuUrbanizationTreasury.setText("InClass");
        mnuUrbanizationTreasury.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuUrbanizationTreasury.add(itmAbout);

        itmQuit.setText("Quit");
        mnuUrbanizationTreasury.add(itmQuit);

        jMenuBar1.add(mnuUrbanizationTreasury);

        mnuResident.setText("Add tutorship");
        mnuResident.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itmRegisterResident.setText("Add new tutorship");
        itmRegisterResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegisterResidentActionPerformed(evt);
            }
        });
        mnuResident.add(itmRegisterResident);

        itmResident.setText("select tutorship");
        itmResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmResidentActionPerformed(evt);
            }
        });
        mnuResident.add(itmResident);

        jMenuBar1.add(mnuResident);

        jMenu5.setText("Delete tutorship");
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jMenuItem4.setText("select tutorship");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem3.setText("delete one tutorship");
        jMenu5.add(jMenuItem3);

        jMenuItem5.setText("tutorship NRC ");
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("register");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itmDates.setText("general info");
        itmDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDatesActionPerformed(evt);
            }
        });
        jMenu4.add(itmDates);

        jMenuItem7.setText("Tutorship info");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        mnuHelp.setText("Help ");
        mnuHelp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itmContact.setText("Contact");
        itmContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContactActionPerformed(evt);
            }
        });
        mnuHelp.add(itmContact);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContactActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itmContactActionPerformed

    private void itmDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDatesActionPerformed
        // TODO add your handling code here:
        FrmInformation EnterInformation = new FrmInformation();
        EnterInformation.setVisible(true);
       
    }//GEN-LAST:event_itmDatesActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        // TODO add your handling code here:
        FrmAbout EnterAbout = new FrmAbout();
        EnterAbout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmRegisterResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegisterResidentActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_itmRegisterResidentActionPerformed

    private void itmResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmResidentActionPerformed
        // TODO add your handling code here:
         FrmResident EnterResident = new FrmResident();
        EnterResident.setVisible(true);
        
    }//GEN-LAST:event_itmResidentActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FrmPayments EnterPayments = new FrmPayments();
        EnterPayments.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationUrbanization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationUrbanization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationUrbanization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationUrbanization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationUrbanization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmContact;
    private javax.swing.JMenuItem itmDates;
    private javax.swing.JMenuItem itmQuit;
    private javax.swing.JMenuItem itmRegisterResident;
    private javax.swing.JMenuItem itmResident;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuResident;
    private javax.swing.JMenu mnuUrbanizationTreasury;
    // End of variables declaration//GEN-END:variables
}
