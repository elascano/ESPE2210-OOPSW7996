package ec.edu.espe.fashionStore.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.fashionStore.controller.Controller;
import ec.edu.espe.fashionstore.model.Measurement;
import ec.edu.espe.fashionstore.model.Order;
import ec.edu.espe.fashionstore.view.FrmOrderMeasurement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class FrmCreateOrder extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Controller mongo = new Controller();

    public FrmCreateOrder() {
        initComponents();
        mostTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOrder = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbDay = new javax.swing.JComboBox<>();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnUpdateOrder = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFashionStore = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itmReportIssues = new javax.swing.JMenuItem();

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
        setTitle("Fashion Store - Create Order");

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 0, 18)); // NOI18N
        jLabel1.setText("FashionStore");

        jLabel2.setText("Name:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel3.setText("Order:");

        txtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderActionPerformed(evt);
            }
        });
        txtOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrderKeyTyped(evt);
            }
        });

        jLabel4.setText("Phone number:");

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        jLabel5.setText("Deadline");

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024" }));

        jLabel6.setText("Information of the Client:");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblOrder);

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Create");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Trajan Pro 3", 0, 12)); // NOI18N
        btnAdd.setText("Add Measurement");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setText("Year");

        jLabel8.setText("Month");

        jLabel9.setText("Day");

        btnUpdateOrder.setText("Update");
        btnUpdateOrder.setEnabled(false);
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });

        mnuFashionStore.setText("Fashion Store");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuFashionStore.add(itmAbout);

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuFashionStore.add(itmExit);

        jMenuBar1.add(mnuFashionStore);

        jMenu6.setText("Help");

        itmReportIssues.setText("Report Issues");
        itmReportIssues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReportIssuesActionPerformed(evt);
            }
        });
        jMenu6.add(itmReportIssues);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateOrder)
                            .addComponent(btnSave))
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9))
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(151, 151, 151)
                                    .addComponent(btnAdd))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(btnBack))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnSave)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnUpdateOrder)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostTable() {
        model.addColumn("Order");
        model.addColumn("Name");
        model.addColumn("Phonenumber");
        model.addColumn("Day");
        model.addColumn("Month");
        model.addColumn("Year");
        this.tblOrder.setModel(model);
    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenuOrder backmenu = new FrmMenuOrder();
        backmenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FashionStore");

            try {
                //Conection with database server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                int id = Integer.parseInt(txtOrder.getText());
                boolean existOrder = false;
                existOrder = Controller.noRepeatOrder(database, id, existOrder);
                if (existOrder == false) {
                    String[] Datos = new String[6];
                    Datos[0] = txtOrder.getText();
                    Datos[1] = txtName.getText();
                    Datos[2] = txtPhone.getText();
                    Datos[3] = cmbDay.getSelectedItem().toString();
                    Datos[4] = cmbMonth.getSelectedItem().toString();
                    Datos[5] = cmbYear.getSelectedItem().toString();
                    Measurement measurement = new Measurement();

                    String name = txtName.getText();
                    Long phoneNumber = Long.valueOf(txtPhone.getText());
                    String day = cmbDay.getSelectedItem().toString();
                    String month = cmbMonth.getSelectedItem().toString();
                    String year = cmbYear.getSelectedItem().toString();
                    txtOrder.setEnabled(false);
                    txtName.setEnabled(false);
                    txtPhone.setEnabled(false);
                    cmbDay.setEnabled(false);
                    cmbMonth.setEnabled(false);
                    cmbYear.setEnabled(false);
                    model.addRow(Datos);

                    Order order = new Order(id, name, phoneNumber, day, month, year, measurement);
                    Controller.insertDocumentMongo(database, order);
                    JOptionPane.showMessageDialog(this, "Order saved succesfully");

                    btnSave.setEnabled(false);
                    btnAdd.setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(this, "Id entered is already used in another order",
                            "Id already used", JOptionPane.ERROR_MESSAGE);
                }
            } catch (MongoException me) {
                System.err.println("An error ocurred while attempting to connect: " + me);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();

        if ((Character.isLetter(c)) || (Character.isWhitespace(c)) || (Character.isISOControl(c))) {
            txtName.setEditable(true);
        } else {
            txtName.setEditable(false);
            JOptionPane.showMessageDialog(this, c + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtOrderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderKeyTyped
        char a = evt.getKeyChar();

        if ((Character.isDigit(a)) || (Character.isISOControl(a))) {
            txtOrder.setEditable(true);
        } else {
            txtOrder.setEditable(false);
            JOptionPane.showMessageDialog(this, a + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtOrderKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char b = evt.getKeyChar();

        if ((Character.isDigit(b)) || (Character.isISOControl(b))) {
            txtPhone.setEditable(true);
        } else {
            txtPhone.setEditable(false);
            JOptionPane.showMessageDialog(this, b + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        FrmOrderMeasurement measurement = new FrmOrderMeasurement();
        if (!btnUpdateOrder.isEnabled()) {
            measurement.setVisible(true);
            measurement.txtOrderID.setText(txtOrder.getText());
            measurement.txtOrderType.setText("New");
        } else {

            int id = Integer.parseInt(txtOrder.getText());
            String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("FashionStore");

                try {
                    //Conection with database server
                    Bson command = new BsonDocument("ping", new BsonInt64(1));
                    org.bson.Document commandResult = database.runCommand(command);
                    System.out.println("Connected successfully to server.");

                    Order order = Controller.readMongo(database, id);
                    measurement.txtNeck.setText(String.valueOf(order.getMeasurement().getNeckMeasurement()));
                    measurement.txtChest.setText(String.valueOf(order.getMeasurement().getChestMeasurement()));
                    measurement.txtArm.setText(String.valueOf(order.getMeasurement().getArmMeasurement()));
                    measurement.txtShoulder.setText(String.valueOf(order.getMeasurement().getShoulderMeasurement()));
                    measurement.txtHip.setText(String.valueOf(order.getMeasurement().getHipMeasurement()));
                    measurement.txtWaist.setText(String.valueOf(order.getMeasurement().getWaistMeasurement()));
                    measurement.txtLeg.setText(String.valueOf(order.getMeasurement().getLegMeasurement()));

                } catch (MongoException me) {
                    System.err.println("An error ocurred while attempting to connect: " + me);
                }
            }
            measurement.setVisible(true);
            measurement.txtOrderID.setText(txtOrder.getText());
            measurement.txtOrderType.setText("Update");
            measurement.btnDelete.setEnabled(true);
        }
        //this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
        String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FashionStore");

            try {
                //Conection with database server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                //comvertir los parametros de acuerdo al constructor
                String[] Datos = new String[6];
                Datos[0] = txtOrder.getText();
                Datos[1] = txtName.getText();
                Datos[2] = txtPhone.getText();
                Datos[3] = cmbDay.getSelectedItem().toString();
                Datos[4] = cmbMonth.getSelectedItem().toString();
                Datos[5] = cmbYear.getSelectedItem().toString();
                int id = Integer.parseInt(txtOrder.getText());
                Order order = Controller.readMongo(database, id);
                Measurement measurement = order.getMeasurement();
                String name = txtName.getText();
                Long phoneNumber = Long.valueOf(txtPhone.getText());
                String day = cmbDay.getSelectedItem().toString();
                String month = cmbMonth.getSelectedItem().toString();
                String year = cmbYear.getSelectedItem().toString();
                txtOrder.setText("");
                txtName.setText("");
                txtPhone.setText("");
                cmbDay.setSelectedIndex(0);
                cmbMonth.setSelectedIndex(0);
                cmbYear.setSelectedIndex(0);
                model.addRow(Datos);

                order = new Order(id, name, phoneNumber, day, month, year, measurement);
                Controller.updateMongo(database, order);
                JOptionPane.showMessageDialog(this, "Order updated succesfully");
            } catch (MongoException me) {
                System.err.println("An error ocurred while attempting to connect: " + me);
            }
        }
    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    private void txtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        FrmAbout about = new FrmAbout();
        about.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmReportIssuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReportIssuesActionPerformed
        FrmReportIssue report = new FrmReportIssue();
        report.setVisible(true);
    }//GEN-LAST:event_itmReportIssuesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreateOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdateOrder;
    public javax.swing.JComboBox<String> cmbDay;
    public javax.swing.JComboBox<String> cmbMonth;
    public javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmReportIssues;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu mnuFashionStore;
    private javax.swing.JTable tblOrder;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtOrder;
    public javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
