/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.CruiseShips.view;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class MenuCruiceShip extends javax.swing.JFrame {

    /**
     * Creates new form FrmCruice
     */
    public MenuCruiceShip() {
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

        jPanel3 = new javax.swing.JPanel();
        lblPresentation = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mYarangaCruiceShips = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        mCruiceShip = new javax.swing.JMenu();
        miCreate = new javax.swing.JMenuItem();
        mHelp = new javax.swing.JMenu();
        miCommonProblems = new javax.swing.JMenuItem();
        miSupport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPresentation.setText("Welcome to Yaranga CruiceShips");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblPresentation)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(lblPresentation)
                .addGap(115, 115, 115))
        );

        mYarangaCruiceShips.setText("Yaranga CruiceShips");

        miAbout.setText("About");
        miAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAboutActionPerformed(evt);
            }
        });
        mYarangaCruiceShips.add(miAbout);

        miExit.setText("Exit");
        mYarangaCruiceShips.add(miExit);

        jMenuBar1.add(mYarangaCruiceShips);

        mCruiceShip.setText("CruiceShip");

        miCreate.setText("Create");
        miCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateActionPerformed(evt);
            }
        });
        mCruiceShip.add(miCreate);

        jMenuBar1.add(mCruiceShip);

        mHelp.setText("Help");

        miCommonProblems.setText("Common Problems");
        miCommonProblems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCommonProblemsActionPerformed(evt);
            }
        });
        mHelp.add(miCommonProblems);

        miSupport.setText("Support");
        mHelp.add(miSupport);

        jMenuBar1.add(mHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAboutActionPerformed

    private void miCommonProblemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCommonProblemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miCommonProblemsActionPerformed

    private void miCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateActionPerformed
        FrmCruiceShip frmCruiceShip = new FrmCruiceShip();
        this.setVisible(false);
        frmCruiceShip.setVisible(true);
    }//GEN-LAST:event_miCreateActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCruiceShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCruiceShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCruiceShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCruiceShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCruiceShip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPresentation;
    private javax.swing.JMenu mCruiceShip;
    private javax.swing.JMenu mHelp;
    private javax.swing.JMenu mYarangaCruiceShips;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miCommonProblems;
    private javax.swing.JMenuItem miCreate;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miSupport;
    // End of variables declaration//GEN-END:variables
}
