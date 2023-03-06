package ec.edu.espe.sortNumbers.view;

import ec.edu.espe.sortNumbers.controller.NumbersController;
import ec.edu.espe.sortNumbers.controller.SortingContext;
import ec.edu.espe.sortNumbers.controller.SortingStrategy;
import ec.edu.espe.sortNumbers.model.Numbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class FrmSortApp extends javax.swing.JFrame {

    public FrmSortApp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSort = new javax.swing.JButton();
        txtNumberD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumberO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAlgorithm = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSort.setBackground(new java.awt.Color(255, 102, 102));
        btnSort.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnSort.setText("SORT NUMBERS");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 170, 50));

        txtNumberD.setBackground(new java.awt.Color(255, 255, 255));
        txtNumberD.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtNumberD.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNumberD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 82, 280, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Numbers in desorder:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numbers in order:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 30));

        txtNumberO.setBackground(new java.awt.Color(255, 255, 255));
        txtNumberO.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtNumberO.setForeground(new java.awt.Color(0, 0, 0));
        txtNumberO.setEnabled(false);
        getContentPane().add(txtNumberO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 280, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Algorithm used:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        txtAlgorithm.setBackground(new java.awt.Color(255, 255, 255));
        txtAlgorithm.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAlgorithm.setForeground(new java.awt.Color(0, 0, 0));
        txtAlgorithm.setEnabled(false);
        getContentPane().add(txtAlgorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 230, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sorting Numbers");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 340));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        btnExit.setBackground(new java.awt.Color(255, 153, 153));
        btnExit.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 570, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        String numberInDesorder;
        SortingContext sortingContext;
        Numbers listDigits;
        NumbersController NumbersController;
        Document document;
        NumbersController = new NumbersController();
        listDigits = new Numbers();
        sortingContext = new SortingContext();
        document = new Document();

        numberInDesorder = txtNumberD.getText();

        String[] numberToSort = numberInDesorder.split(",");
        int[] numbersOfList = new int[numberToSort.length];
        listDigits.setNumbersDisordered(numbersOfList);

        for (int i = 0; i < numberToSort.length; i++) {
            numbersOfList[i] = Integer.parseInt(numberToSort[i]);
        }
        SortingStrategy sortingStrategy;
        sortingStrategy = sortingContext.setSortStrategy(numbersOfList, listDigits);

        sortingStrategy.sort(listDigits);
        document = NumbersController.createDocument(listDigits);

        NumbersController.updateToDatabase(document);

        txtNumberO.setText(Arrays.toString(listDigits.getListOfNumberOrdered()));
        txtAlgorithm.setText(listDigits.getSortAlgorithm());
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       dispose();
    }//GEN-LAST:event_btnExitActionPerformed


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
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSortApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAlgorithm;
    private javax.swing.JTextField txtNumberD;
    private javax.swing.JTextField txtNumberO;
    // End of variables declaration//GEN-END:variables
}
