package ec.edu.espe.urbanizationtreasury.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class FrmViewResidents extends javax.swing.JFrame {

    /**
     * Creates new form FrmViewResidents
     */
    public FrmViewResidents() {
        initComponents();
        mostTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuResident1 = new javax.swing.JMenu();
        mnitNewResident1 = new javax.swing.JMenuItem();
        mnuitResidentInformation1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuitDeleteResident1 = new javax.swing.JMenuItem();
        mnuPrintResident1 = new javax.swing.JMenuItem();
        mnuPayment = new javax.swing.JMenu();
        mnuitNewPayment = new javax.swing.JMenuItem();
        mnuItDeletePayment = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuitBenefist = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuitFrequentQuestions = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Residents");

        btnPrint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("UrbanizationTreasury");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        jMenu1.add(itmAbout);

        jMenuItem2.setText("Quit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        mnuResident1.setText("Residente");

        mnitNewResident1.setText("Nuevo Residente");
        mnitNewResident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitNewResident1ActionPerformed(evt);
            }
        });
        mnuResident1.add(mnitNewResident1);

        mnuitResidentInformation1.setText("Informacion del Residente");
        mnuitResidentInformation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitResidentInformation1ActionPerformed(evt);
            }
        });
        mnuResident1.add(mnuitResidentInformation1);

        jMenuItem3.setText("Editar Residente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuResident1.add(jMenuItem3);

        mnuitDeleteResident1.setText("Eliminar Residente");
        mnuitDeleteResident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitDeleteResident1ActionPerformed(evt);
            }
        });
        mnuResident1.add(mnuitDeleteResident1);

        mnuPrintResident1.setText("Imprimir Residentes");
        mnuPrintResident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrintResident1ActionPerformed(evt);
            }
        });
        mnuResident1.add(mnuPrintResident1);

        jMenuBar1.add(mnuResident1);

        mnuPayment.setText("Pagos");
        mnuPayment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuPaymentItemStateChanged(evt);
            }
        });

        mnuitNewPayment.setText("Nuevo Pago");
        mnuitNewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitNewPaymentActionPerformed(evt);
            }
        });
        mnuPayment.add(mnuitNewPayment);

        mnuItDeletePayment.setText("Eliminar Pago");
        mnuItDeletePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItDeletePaymentActionPerformed(evt);
            }
        });
        mnuPayment.add(mnuItDeletePayment);

        jMenuBar1.add(mnuPayment);

        jMenu3.setText("Extra");

        mnuitBenefist.setText("Benefist");
        mnuitBenefist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitBenefistActionPerformed(evt);
            }
        });
        jMenu3.add(mnuitBenefist);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        mnuitFrequentQuestions.setText("Preguntas Frecuentes");
        mnuitFrequentQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitFrequentQuestionsActionPerformed(evt);
            }
        });
        jMenu4.add(mnuitFrequentQuestions);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPrint))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(btnPrint))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Batch");
        this.table.setModel(model);
        
        String[] info = new String[3];
        
        model.getDataVector().removeAllElements();
        
        String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");

            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> collection = database.getCollection("Residents");
                
                MongoCursor<Document> cursor = collection.find().iterator();
                try {
                    while (cursor.hasNext()) {
                        Document resident =cursor.next();
                        info[0]=String.valueOf(resident.get("id"));
                        info[1]=String.valueOf(resident.get("name"));
                        info[2]=String.valueOf(resident.get("batch"));
                        model.addRow(info);
                    }
                } finally {
                    cursor.close();
                }


            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UrbanizationTreasury urbanizationTreasury;
        urbanizationTreasury = new UrbanizationTreasury();
        this.setVisible(false);
        urbanizationTreasury.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Residents");
        MessageFormat footer = new MessageFormat("page {0,number,integer}");

        try {
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        // TODO add your handling code here:
        FrmAbout frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmAboutActionPerformed

    private void mnuitNewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitNewPaymentActionPerformed
        // TODO add your handling code here:
        FrmNewPayment newPay = new FrmNewPayment();
        newPay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitNewPaymentActionPerformed

    private void mnuItDeletePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItDeletePaymentActionPerformed
        // TODO add your handling code here:
        FrmDeletePayment editPayment = new FrmDeletePayment();
        editPayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuItDeletePaymentActionPerformed

    private void mnuPaymentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuPaymentItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPaymentItemStateChanged

    private void mnuitBenefistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitBenefistActionPerformed
        // TODO add your handling code here:
        FrmBenefists benefists = new FrmBenefists();
        benefists.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitBenefistActionPerformed

    private void mnuitFrequentQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitFrequentQuestionsActionPerformed
        // TODO add your handling code here:
        FrmFrequentQuestions frecuentQuestions = new FrmFrequentQuestions();
        frecuentQuestions.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitFrequentQuestionsActionPerformed

    private void mnitNewResident1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitNewResident1ActionPerformed
        // TODO add your handling code here:
        FrmNewResident newResident1 = new FrmNewResident();
        newResident1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnitNewResident1ActionPerformed

    private void mnuitResidentInformation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitResidentInformation1ActionPerformed
        // TODO add your handling code here:
        FrmResidentInformation residentInfo = new FrmResidentInformation();
        residentInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitResidentInformation1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FrmEditResident editResident = new FrmEditResident();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuitDeleteResident1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitDeleteResident1ActionPerformed
        // TODO add your handling code here:
        FrmDeleteResident editResident = new FrmDeleteResident();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitDeleteResident1ActionPerformed

    private void mnuPrintResident1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrintResident1ActionPerformed
        // TODO add your handling code here:
        FrmViewResidents editResident = new FrmViewResidents();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuPrintResident1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmViewResidents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmViewResidents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmViewResidents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmViewResidents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmViewResidents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mnitNewResident1;
    private javax.swing.JMenuItem mnuItDeletePayment;
    private javax.swing.JMenu mnuPayment;
    private javax.swing.JMenuItem mnuPrintResident1;
    private javax.swing.JMenu mnuResident1;
    private javax.swing.JMenuItem mnuitBenefist;
    private javax.swing.JMenuItem mnuitDeleteResident1;
    private javax.swing.JMenuItem mnuitFrequentQuestions;
    private javax.swing.JMenuItem mnuitNewPayment;
    private javax.swing.JMenuItem mnuitResidentInformation1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
