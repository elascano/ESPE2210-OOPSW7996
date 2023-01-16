
package ec.edu.espe.TaxiAirportSystem.view;

import ec.edu.espe.TaxiAirportSystem.controller.MongoData;
import ec.edu.espe.TaxiAirportSystem.model.Driver;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TaxiAirportSystem extends javax.swing.JFrame {
DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form TaxiAirportSystem
     */
 private void mostTable() {

        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Number");
        model.addColumn("Age");
        model.addColumn("Adress");
        model.addColumn("C.I");
        model.addColumn("Email");
        model.addColumn("Gender");
        model.addColumn("Vehicle Marck");
        model.addColumn("Vehicle Plate");
        model.addColumn("Vehicle Year");
        this.tbFind.setModel(model);
  }
 
    public TaxiAirportSystem() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnUpdateDriver = new javax.swing.JButton();
        btnAddDriver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlDelete = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIDdelete = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bthFind = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFind = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtreadID = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUpdateDriver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnUpdateDriver.setText("UPDATE DRIVER");
        btnUpdateDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDriverActionPerformed(evt);
            }
        });

        btnAddDriver.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnAddDriver.setText("ADD DRIVER");
        btnAddDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDriverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("DRIVER MENU");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("TAXI AIRPORT");

        pnlDelete.setBackground(new java.awt.Color(102, 102, 102));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter the ID to delete:");

        txtIDdelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDdeleteKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("DELETE DRIVER");

        javax.swing.GroupLayout pnlDeleteLayout = new javax.swing.GroupLayout(pnlDelete);
        pnlDelete.setLayout(pnlDeleteLayout);
        pnlDeleteLayout.setHorizontalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDeleteLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDeleteLayout.createSequentialGroup()
                        .addGroup(pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDeleteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtIDdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45))))
            .addGroup(pnlDeleteLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnDelete)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDeleteLayout.setVerticalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDeleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(txtIDdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(9, 9, 9))
        );

        bthFind.setText("SEARCH");
        bthFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthFindActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("SEARCH DRIVER");

        tbFind.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbFind);

        jLabel6.setText("Enter ID:");

        txtreadID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreadIDActionPerformed(evt);
            }
        });
        txtreadID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtreadIDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnAddDriver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnUpdateDriver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(pnlDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtreadID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bthFind))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(373, 373, 373))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(395, 395, 395))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnAddDriver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(btnUpdateDriver))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreadID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthFind)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void btnAddDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDriverActionPerformed
        // TODO add your handling code here:
        FrmAddDriver frmAddDriver = new FrmAddDriver();
        frmAddDriver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddDriverActionPerformed

    private void btnUpdateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDriverActionPerformed
       FrmUpdateDriver frmUpdateDriver = new FrmUpdateDriver();
        frmUpdateDriver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateDriverActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
int option = JOptionPane.showConfirmDialog(this, "Do you want to continue?");
        if (option == 0) {
            Driver driver = new Driver(txtIDdelete.getText(), "", "", "", "", "", "", "", "", "", "");
            MongoData.deleteDriver(driver);
            JOptionPane.showMessageDialog(this, "DRIVER SUCCESSFULLY REMOVED ");
            txtIDdelete.setText("");
        } else if (option == 1) {
            JOptionPane.showMessageDialog(this, "Operation Cancelled");
        } else if (option == 2) {
            TaxiAirportSystem backBtm = new TaxiAirportSystem();
            backBtm.setVisible(true);
            this.dispose();
        }    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIDdeleteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDdeleteKeyTyped
char d = evt.getKeyChar();

        if ((Character.isDigit(d)) || (Character.isISOControl(d))) {
            txtIDdelete.setEditable(true);
        } else {
            txtIDdelete.setEditable(false);
            JOptionPane.showMessageDialog(this, d + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIDdeleteKeyTyped

    private void bthFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthFindActionPerformed
        // TODO add your handling code here:
        Driver driver = new Driver(txtreadID.getText(), "", "", "", "", "", "", "", "", "", "");
        driver = MongoData.findDriver(driver);
                JOptionPane.showMessageDialog(this, "DRIVER VIEW SUCCESSFUL");

        String[] Datos = new String[11];
        Datos[0] = driver.getId();
        Datos[1] = driver.getName();
        Datos[2] = driver.getPhoneNumber();
        Datos[3] = driver.getAge();
        Datos[4] = driver.getAdress();
        Datos[5] = driver.getCI();
        Datos[6] = driver.getEmail();
        Datos[7] = driver.getGender();
        Datos[8] = driver.getVehicleMark();
        Datos[9] = driver.getVehiclePLate();
        Datos[10] =driver.getVehicleYear(); 
        
        txtreadID.setText("");
         model.addRow(Datos);
    }//GEN-LAST:event_bthFindActionPerformed

    private void txtreadIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreadIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtreadIDActionPerformed

    private void txtreadIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreadIDKeyTyped
 char d = evt.getKeyChar();

        if ((Character.isDigit(d))||(Character.isISOControl(d))) {
            txtreadID.setEditable(true);
        }
        else{
            txtreadID.setEditable(false);
            JOptionPane.showMessageDialog(this,d + " is not accepted here","Warning on input data",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtreadIDKeyTyped

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxiAirportSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthFind;
    private javax.swing.JButton btnAddDriver;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateDriver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JTable tbFind;
    private javax.swing.JTextField txtIDdelete;
    private javax.swing.JTextField txtreadID;
    // End of variables declaration//GEN-END:variables
}
