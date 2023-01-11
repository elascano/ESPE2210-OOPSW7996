package ec.edu.espe.urbanizationtreasury.view;

/**
 *
 * @author Matias Suarez, WebMasterTeam, DCCO-ESPE
 */
public class UrbanizationTreasury extends javax.swing.JFrame {

    /**
     * Creates new form UrbanizationTreasury
     */
    
    public UrbanizationTreasury() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newResident = new javax.swing.JButton();
        UpdateResidente = new javax.swing.JButton();
        DeleteResident = new javax.swing.JButton();
        informationTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Urbanization Treasury");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("System");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        newResident.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newResident.setText("New Resident");
        newResident.setActionCommand("newResident");
        newResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newResidentActionPerformed(evt);
            }
        });

        UpdateResidente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UpdateResidente.setText("Update Residente");
        UpdateResidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateResidenteActionPerformed(evt);
            }
        });

        DeleteResident.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DeleteResident.setText("Delete Resident");
        DeleteResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteResidentActionPerformed(evt);
            }
        });

        informationTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        informationTable.setText("Table of Information");
        informationTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(informationTable, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(UpdateResidente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteResident, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newResident, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(newResident)
                .addGap(18, 18, 18)
                .addComponent(UpdateResidente)
                .addGap(18, 18, 18)
                .addComponent(DeleteResident)
                .addGap(18, 18, 18)
                .addComponent(informationTable)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newResidentActionPerformed
        // TODO add your handling code here:
        FrmCreateResident residentInfo = new FrmCreateResident();
        residentInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newResidentActionPerformed

    private void UpdateResidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateResidenteActionPerformed
        // TODO add your handling code here:
        FrmUpdateResident residentUpdate = new FrmUpdateResident();
        residentUpdate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateResidenteActionPerformed

    private void informationTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationTableActionPerformed
        // TODO add your handling code here:
        FrmReadResident findResident = new FrmReadResident();
        findResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_informationTableActionPerformed

    private void DeleteResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteResidentActionPerformed
        // TODO add your handling code here:
        FrmDeleteResident deleteResident = new FrmDeleteResident();
        deleteResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteResidentActionPerformed

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
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrbanizationTreasury().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteResident;
    private javax.swing.JButton UpdateResidente;
    private javax.swing.JButton informationTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newResident;
    // End of variables declaration//GEN-END:variables
}
