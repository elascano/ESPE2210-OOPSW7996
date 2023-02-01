/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class FrmMultiply extends javax.swing.JFrame {

    /**
     * Creates new form FrmMultiply
     */
    public FrmMultiply() {
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

        pnlOperation = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMultiplicand = new javax.swing.JTextField();
        txtMultiplicator = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbProduct = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnBasicO = new javax.swing.JMenu();
        mnItmExit = new javax.swing.JMenuItem();
        mnItmHome = new javax.swing.JMenuItem();
        mnOperations = new javax.swing.JMenu();
        mnItmSum = new javax.swing.JMenuItem();
        mnItmRest = new javax.swing.JMenuItem();
        mnItmMul = new javax.swing.JMenuItem();
        mnItmDiv = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Multiplication");

        jLabel3.setText("Multiplicand:");

        txtMultiplicand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultiplicandActionPerformed(evt);
            }
        });

        txtMultiplicator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultiplicatorActionPerformed(evt);
            }
        });

        jLabel4.setText("Multiplicator:");

        btnCalc.setText("Calculate");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel5.setText("Product");

        lbProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProduct.setText("00.00");

        javax.swing.GroupLayout pnlOperationLayout = new javax.swing.GroupLayout(pnlOperation);
        pnlOperation.setLayout(pnlOperationLayout);
        pnlOperationLayout.setHorizontalGroup(
            pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperationLayout.createSequentialGroup()
                .addGroup(pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOperationLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addGroup(pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOperationLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMultiplicator, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOperationLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtMultiplicand, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlOperationLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlOperationLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(pnlOperationLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel5)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlOperationLayout.setVerticalGroup(
            pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMultiplicand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMultiplicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalc)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lbProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        mnBasicO.setText("BasicOperationApp");

        mnItmExit.setText("Exit");
        mnItmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmExitActionPerformed(evt);
            }
        });
        mnBasicO.add(mnItmExit);

        mnItmHome.setText("Home");
        mnItmHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmHomeActionPerformed(evt);
            }
        });
        mnBasicO.add(mnItmHome);

        jMenuBar1.add(mnBasicO);

        mnOperations.setText("Operations");

        mnItmSum.setText("Sum");
        mnItmSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmSumActionPerformed(evt);
            }
        });
        mnOperations.add(mnItmSum);

        mnItmRest.setText("Rest");
        mnItmRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmRestActionPerformed(evt);
            }
        });
        mnOperations.add(mnItmRest);

        mnItmMul.setText("Multiply");
        mnItmMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmMulActionPerformed(evt);
            }
        });
        mnOperations.add(mnItmMul);

        mnItmDiv.setText("Division");
        mnItmDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmDivActionPerformed(evt);
            }
        });
        mnOperations.add(mnItmDiv);

        jMenuBar1.add(mnOperations);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnItmHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmHomeActionPerformed
        // TODO add your handling code here:
        FrmHome home = new FrmHome();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItmHomeActionPerformed

    private void mnItmRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmRestActionPerformed
        // TODO add your handling code here:
        FrmRest rest = new FrmRest();
        rest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItmRestActionPerformed

    private void mnItmMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmMulActionPerformed
        // TODO add your handling code here:
        FrmMultiply mul = new FrmMultiply();
        mul.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItmMulActionPerformed

    private void mnItmDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmDivActionPerformed
        // TODO add your handling code here:
        FrmDivision div = new FrmDivision();
        div.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItmDivActionPerformed

    private void mnItmSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmSumActionPerformed
        // TODO add your handling code here:
        FrmSum sum = new FrmSum();
        sum.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItmSumActionPerformed

    private void txtMultiplicandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultiplicandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMultiplicandActionPerformed

    private void txtMultiplicatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultiplicatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMultiplicatorActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        BasicOperation operation = new BasicOperation();
        float multiplicand = Float.parseFloat(txtMultiplicand.getText());
        float multiplicator = Float.parseFloat(txtMultiplicator.getText());

        lbProduct.setText(Float.toString(operation.multiply(multiplicand,multiplicator)));
    }//GEN-LAST:event_btnCalcActionPerformed

    private void mnItmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnItmExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMultiply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMultiply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMultiply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMultiply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMultiply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbProduct;
    private javax.swing.JMenu mnBasicO;
    private javax.swing.JMenuItem mnItmDiv;
    private javax.swing.JMenuItem mnItmExit;
    private javax.swing.JMenuItem mnItmHome;
    private javax.swing.JMenuItem mnItmMul;
    private javax.swing.JMenuItem mnItmRest;
    private javax.swing.JMenuItem mnItmSum;
    private javax.swing.JMenu mnOperations;
    private javax.swing.JPanel pnlOperation;
    private javax.swing.JTextField txtMultiplicand;
    private javax.swing.JTextField txtMultiplicator;
    // End of variables declaration//GEN-END:variables
}
