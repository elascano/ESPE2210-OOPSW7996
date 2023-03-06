package ec.edu.espe.StrategyPattern.view;

import ec.edu.espe.StrategyPattern.controller.SortNumbersController;
import ec.edu.espe.StrategyPattern.model.SortingContext;
import ec.edu.espe.StrategyPattern.model.SortingNumbers;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class FrmSortApp extends javax.swing.JFrame {

          /**
           * Creates new form FrmSortApp
           */
          public FrmSortApp() {
                    initComponents();
          }

          /**
           * This method is called from within the constructor to initialize the
           * form. WARNING: Do NOT modify this code. The content of this method
           * is always regenerated by the Form Editor.
           */
          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
          private void initComponents() {

                    jScrollPane3 = new javax.swing.JScrollPane();
                    jTable1 = new javax.swing.JTable();
                    jLabel1 = new javax.swing.JLabel();
                    jScrollPane1 = new javax.swing.JScrollPane();
                    txtIngressNumbers = new javax.swing.JTextArea();
                    jLabel2 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    jScrollPane2 = new javax.swing.JScrollPane();
                    txtOrderedNumbers = new javax.swing.JTextArea();
                    jLabel4 = new javax.swing.JLabel();
                    btmOrder = new javax.swing.JButton();
                    jScrollPane4 = new javax.swing.JScrollPane();
                    jTable2 = new javax.swing.JTable();

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                              new Object [][] {
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null}
                              },
                              new String [] {
                                        "Title 1", "Title 2", "Title 3", "Title 4"
                              }
                    ));
                    jScrollPane3.setViewportView(jTable1);

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                    jLabel1.setFont(new java.awt.Font("Minecraft", 1, 36)); // NOI18N
                    jLabel1.setText("SORT APP");

                    txtIngressNumbers.setColumns(20);
                    txtIngressNumbers.setRows(5);
                    txtIngressNumbers.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtIngressNumbersKeyTyped(evt);
                              }
                    });
                    jScrollPane1.setViewportView(txtIngressNumbers);

                    jLabel2.setText("Ingress the numbers ");

                    jLabel3.setText("that you want to order ");

                    txtOrderedNumbers.setEditable(false);
                    txtOrderedNumbers.setColumns(20);
                    txtOrderedNumbers.setRows(5);
                    jScrollPane2.setViewportView(txtOrderedNumbers);

                    jLabel4.setText("Ordered numbers");

                    btmOrder.setText("Order");
                    btmOrder.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btmOrderActionPerformed(evt);
                              }
                    });

                    jTable2.setModel(new javax.swing.table.DefaultTableModel(
                              new Object [][] {
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null}
                              },
                              new String [] {
                                        "Title 1", "Title 2", "Title 3", "Title 4"
                              }
                    ));
                    jScrollPane4.setViewportView(jTable2);

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel4)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addComponent(jLabel2)
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(jLabel3)))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addComponent(btmOrder)
                                                                      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                              .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(139, 139, 139)
                                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(168, 168, 168)
                                                            .addComponent(jLabel1)))
                                        .addContainerGap(64, Short.MAX_VALUE))
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btmOrder)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(48, Short.MAX_VALUE))
                    );

                    pack();
          }// </editor-fold>//GEN-END:initComponents

          private void btmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmOrderActionPerformed
                    if (txtIngressNumbers.getText().isEmpty()) {
                              JOptionPane.showMessageDialog(null, "Please, Ingress the information ");
                    } else {
                              SortingNumbers sort = new SortingNumbers();
                              String[] numbers = txtIngressNumbers.getText().split(",");
                              int data[] = new int[numbers.length];
                              for (int i = 0; i < numbers.length; i++) {
                                        data[i] = Integer.parseInt(numbers[i].trim());
                              }
                              SortingContext orderNumbers = new SortingContext();
                              int sortedNumbers[] = orderNumbers.sort(data);

                              txtOrderedNumbers.setText(Arrays.toString(sortedNumbers));
                              sort.setSorted(Arrays.toString(sortedNumbers));
                              sort.setSize(numbers.length);
                              sort.setUnSorted(numbers);
                              SortNumbersController.uploadDocument(sort);
                              JOptionPane.showMessageDialog(null, "Upload to repository successfully");
                              
                    }

          }//GEN-LAST:event_btmOrderActionPerformed

          private void txtIngressNumbersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngressNumbersKeyTyped
                    char c = evt.getKeyChar();
                    if (!(Character.isDigit(c) || c == ',')) {
                              evt.consume();
                    }
          }//GEN-LAST:event_txtIngressNumbersKeyTyped

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
                              java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                                        new FrmSortApp().setVisible(true);
                              }
                    });
          }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton btmOrder;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JScrollPane jScrollPane1;
          private javax.swing.JScrollPane jScrollPane2;
          private javax.swing.JScrollPane jScrollPane3;
          private javax.swing.JScrollPane jScrollPane4;
          private javax.swing.JTable jTable1;
          private javax.swing.JTable jTable2;
          private javax.swing.JTextArea txtIngressNumbers;
          private javax.swing.JTextArea txtOrderedNumbers;
          // End of variables declaration//GEN-END:variables

}
