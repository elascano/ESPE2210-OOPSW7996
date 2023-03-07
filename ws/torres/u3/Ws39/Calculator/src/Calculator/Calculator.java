package Calculator;

import ec.edu.espe.calculator.controller.BasicOperation;
import static ec.edu.espe.calculator.controller.ButtonIcon.adjustButtonIcon;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Calculator extends javax.swing.JFrame {
    BasicOperation basicOperation = new BasicOperation();
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        adjustButtonIcon(btnAdd);
        adjustButtonIcon(btnDivide);
        adjustButtonIcon(btnMultiply);
        adjustButtonIcon(btnSubtract);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResult = new javax.swing.JTextField();
        btnDivide = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtvalue2 = new javax.swing.JTextField();
        txtValue1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 190, 30));

        btnDivide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculator/images/buttonDivision.png"))); // NOI18N
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 60, 40));

        btnMultiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculator/images/ButtonMultiplicity.png"))); // NOI18N
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 60, 40));

        btnSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculator/images/ButtonSub.png"))); // NOI18N
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 60, 40));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculator/images/ButtonAdd.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 60, 40));
        getContentPane().add(txtvalue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 90, 30));
        getContentPane().add(txtValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculator/images/Calculator.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        float addend1;
        float addend2;
        float sum;
        
        txtResult.setText("");
        addend1 = Float.parseFloat(txtValue1.getText());
        addend2 = Float.parseFloat(txtvalue2.getText());
        
        sum = basicOperation.add(addend1, addend2);
        txtResult.setText(String.valueOf(sum));
        System.out.println(sum);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        // TODO add your handling code here:
        float difference;
        float minuend;
        float subtrahend;
        
        txtResult.setText("");
        minuend = Float.parseFloat(txtValue1.getText());
        subtrahend = Float.parseFloat(txtvalue2.getText());
        
        difference = basicOperation.subtract(minuend, subtrahend);
        txtResult.setText(String.valueOf(difference));
        System.out.println(difference);
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        // TODO add your handling code here:
        float product;
        float multiplicand;
        float multiplicator;
        
        txtResult.setText("");
        multiplicand = Float.parseFloat(txtValue1.getText());
        multiplicator = Float.parseFloat(txtvalue2.getText());
        
        product = basicOperation.multiply(multiplicand, multiplicator);
        txtResult.setText(String.valueOf(product));
        System.out.println(product);
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        // TODO add your handling code here:
        float quotient;
        float divisor;
        float dividend;
        
        txtResult.setText("");
        divisor = Float.parseFloat(txtValue1.getText());
        dividend = Float.parseFloat(txtvalue2.getText());
        
        quotient = basicOperation.divide(divisor, dividend);
        txtResult.setText(String.valueOf(quotient));
        System.out.println(quotient);
    }//GEN-LAST:event_btnDivideActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtValue1;
    private javax.swing.JTextField txtvalue2;
    // End of variables declaration//GEN-END:variables
}