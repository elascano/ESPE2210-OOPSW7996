package ec.edu.espe.calculator.view;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class SimpleCalculator extends javax.swing.JFrame {

    /**
     * Creates new form SimpleCalculator
     */
    public SimpleCalculator() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        mOperations = new javax.swing.JMenu();
        miAdd = new javax.swing.JMenuItem();
        miSubstract = new javax.swing.JMenuItem();
        miMultiply = new javax.swing.JMenuItem();
        miDivide = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miIva = new javax.swing.JMenuItem();
        miRentTax = new javax.swing.JMenuItem();
        mHelp = new javax.swing.JMenu();
        miContactSupport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");

        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to Simple Calculator!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenu1.setText("Simple Calculator");

        miAbout.setText("About");
        jMenu1.add(miAbout);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        mOperations.setText("Operations");

        miAdd.setText("Add");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        mOperations.add(miAdd);

        miSubstract.setText("Substract");
        miSubstract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSubstractActionPerformed(evt);
            }
        });
        mOperations.add(miSubstract);

        miMultiply.setText("Multiply");
        miMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMultiplyActionPerformed(evt);
            }
        });
        mOperations.add(miMultiply);

        miDivide.setText("Divide");
        miDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDivideActionPerformed(evt);
            }
        });
        mOperations.add(miDivide);

        jMenuBar1.add(mOperations);

        jMenu2.setText("Tax");

        miIva.setText("Iva");
        miIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIvaActionPerformed(evt);
            }
        });
        jMenu2.add(miIva);

        miRentTax.setText("Rent tax");
        miRentTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRentTaxActionPerformed(evt);
            }
        });
        jMenu2.add(miRentTax);

        jMenuBar1.add(jMenu2);

        mHelp.setText("Help");

        miContactSupport.setText("Contact Support");
        mHelp.add(miContactSupport);

        jMenuBar1.add(mHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
        FrmAdd frmAdd = new FrmAdd();
        this.setVisible(false);
        frmAdd.setVisible(true);
    }//GEN-LAST:event_miAddActionPerformed

    private void miSubstractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSubstractActionPerformed
        FrmSubstract frmSubstract = new FrmSubstract();
        this.setVisible(false);
        frmSubstract.setVisible(true);
    }//GEN-LAST:event_miSubstractActionPerformed

    private void miMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMultiplyActionPerformed
        FrmMultiply frmMultiply = new FrmMultiply();
        this.setVisible(false);
        frmMultiply.setVisible(true);
    }//GEN-LAST:event_miMultiplyActionPerformed

    private void miDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDivideActionPerformed
        FrmDivide frmDivide = new FrmDivide();
        this.setVisible(false);
        frmDivide.setVisible(true);
    }//GEN-LAST:event_miDivideActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_miExitActionPerformed

    private void miIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIvaActionPerformed
       FrmIva frmIva = new FrmIva();
       this.setVisible(false);
       frmIva.setVisible(true);
    }//GEN-LAST:event_miIvaActionPerformed

    private void miRentTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRentTaxActionPerformed
       FrmRentTax frmRentTax = new FrmRentTax();
       this.setVisible(false);
       frmRentTax.setVisible(true);
    }//GEN-LAST:event_miRentTaxActionPerformed

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
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mHelp;
    private javax.swing.JMenu mOperations;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miContactSupport;
    private javax.swing.JMenuItem miDivide;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miIva;
    private javax.swing.JMenuItem miMultiply;
    private javax.swing.JMenuItem miRentTax;
    private javax.swing.JMenuItem miSubstract;
    // End of variables declaration//GEN-END:variables
}
