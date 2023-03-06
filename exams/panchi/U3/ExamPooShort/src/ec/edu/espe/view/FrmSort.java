package ec.edu.espe.view;

import ec.edu.espe.controller.NumbersController;
import ec.edu.espe.controller.SortingContext;
import ec.edu.espe.controller.SortingStrategy;
import ec.edu.espe.model.Numbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class FrmSort extends javax.swing.JFrame {

    /**
     * Creates new form SortApp
     */
    public FrmSort() {
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
        btnSort = new javax.swing.JButton();
        txtNumberD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumberO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAlgorithm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel1.setText("Sorting");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));
        getContentPane().add(txtNumberD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Numbers in desorder");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Numbers in order");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        txtNumberO.setEnabled(false);
        getContentPane().add(txtNumberO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Algorithm used");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtAlgorithm.setEnabled(false);
        getContentPane().add(txtAlgorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, -1));

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
            java.util.logging.Logger.getLogger(FrmSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAlgorithm;
    private javax.swing.JTextField txtNumberD;
    private javax.swing.JTextField txtNumberO;
    // End of variables declaration//GEN-END:variables
}
