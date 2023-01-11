/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.Drivers.view;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TaxiAirportSystem extends javax.swing.JFrame {

    /**
     * Creates new form TaxiAirportRegistration
     */
    public TaxiAirportSystem() {
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        itmTaxiAirport = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmQuit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmAddDriver = new javax.swing.JMenuItem();
        itmFindDriver = new javax.swing.JMenuItem();
        itmUpdateDriver = new javax.swing.JMenuItem();
        itmRemoveDriver = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itmAddTraveler = new javax.swing.JMenuItem();
        itmFindTraveler = new javax.swing.JMenuItem();
        itmUpdateTraveler = new javax.swing.JMenuItem();
        itmRemoveTraveler = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itmPayments = new javax.swing.JMenuItem();
        mnAccounting = new javax.swing.JMenu();
        itmDaily = new javax.swing.JMenuItem();
        itmMonthly = new javax.swing.JMenuItem();
        itmAnnuary = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itmSupport = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taxi Aiport System");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Taxi Airport System");

        itmTaxiAirport.setText("Taxi Aiport System");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        itmTaxiAirport.add(itmAbout);

        itmQuit.setText("Quit");
        itmTaxiAirport.add(itmQuit);

        jMenuBar1.add(itmTaxiAirport);

        jMenu2.setText("Driver");

        itmAddDriver.setText("Add  Driver");
        jMenu2.add(itmAddDriver);

        itmFindDriver.setText("Find Driver ");
        jMenu2.add(itmFindDriver);

        itmUpdateDriver.setText("Update Driver");
        jMenu2.add(itmUpdateDriver);

        itmRemoveDriver.setText("Remove Driver");
        jMenu2.add(itmRemoveDriver);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Traveler");

        itmAddTraveler.setText("Add Traveler");
        jMenu1.add(itmAddTraveler);

        itmFindTraveler.setText("Find Traveler");
        jMenu1.add(itmFindTraveler);

        itmUpdateTraveler.setText("Update Traveler");
        jMenu1.add(itmUpdateTraveler);

        itmRemoveTraveler.setText("Remove Traveler");
        jMenu1.add(itmRemoveTraveler);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Service");

        itmPayments.setText("Paymets");
        jMenu3.add(itmPayments);

        mnAccounting.setText("Accounting");

        itmDaily.setText("Daily");
        mnAccounting.add(itmDaily);

        itmMonthly.setText("Monthly");
        mnAccounting.add(itmMonthly);

        itmAnnuary.setText("Annual");
        mnAccounting.add(itmAnnuary);

        jMenu3.add(mnAccounting);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");

        itmSupport.setText("Support");
        jMenu4.add(itmSupport);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
    FrmAbout frmAbout;
    frmAbout =  new FrmAbout();
    frmAbout.setVisible(true);
    }//GEN-LAST:event_itmAboutActionPerformed

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
            java.util.logging.Logger.getLogger(TaxiAirportSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaxiAirportSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaxiAirportSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaxiAirportSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxiAirportSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmAddDriver;
    private javax.swing.JMenuItem itmAddTraveler;
    private javax.swing.JMenuItem itmAnnuary;
    private javax.swing.JMenuItem itmDaily;
    private javax.swing.JMenuItem itmFindDriver;
    private javax.swing.JMenuItem itmFindTraveler;
    private javax.swing.JMenuItem itmMonthly;
    private javax.swing.JMenuItem itmPayments;
    private javax.swing.JMenuItem itmQuit;
    private javax.swing.JMenuItem itmRemoveDriver;
    private javax.swing.JMenuItem itmRemoveTraveler;
    private javax.swing.JMenuItem itmSupport;
    private javax.swing.JMenu itmTaxiAirport;
    private javax.swing.JMenuItem itmUpdateDriver;
    private javax.swing.JMenuItem itmUpdateTraveler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnAccounting;
    // End of variables declaration//GEN-END:variables
}
