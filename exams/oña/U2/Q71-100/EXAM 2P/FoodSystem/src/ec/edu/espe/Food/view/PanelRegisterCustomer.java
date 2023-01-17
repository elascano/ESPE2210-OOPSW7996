package ec.edu.espe.Food.view;

import com.toedter.calendar.JDateChooser;
import ec.edu.espe.Food.controller.CustomerController;
import ec.edu.espe.Food.controller.ServiceController;
import ec.edu.espe.Food.model.MongoDBConnection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class PanelRegisterCustomer extends javax.swing.JPanel {

    /**
     * Creates new form Panel_allData
     */
    public PanelRegisterCustomer() {
        initComponents();
        MongoDBConnection mongoDB;
        mongoDB = new MongoDBConnection();
        mongoDB.connectDatabase();
    }
    
SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yy");
    
    public String getDate(JDateChooser jdDate){
        if(jdDate.getDate() != null){
            return formDate.format(jdDate.getDate());
        } 
        else{
            return null;
        }
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
        lbDataCustomer = new javax.swing.JLabel();
        lblSN = new javax.swing.JLabel();
        lblTOS = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFN1 = new javax.swing.JLabel();
        txt_Surnames = new javax.swing.JTextField();
        txt_FullNames = new javax.swing.JTextField();
        txt_Cost = new javax.swing.JTextField();
        cmbPaymentMethod = new javax.swing.JComboBox<>();
        btn_Register = new javax.swing.JButton();
        btn_NewRegister = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_Register1 = new javax.swing.JButton();
        cmb_Food = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(740, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDataCustomer.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        lbDataCustomer.setText("REGISTER");
        jPanel1.add(lbDataCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 140, -1));

        lblSN.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        lblSN.setText("Last Names:");
        jPanel1.add(lblSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        lblTOS.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        lblTOS.setText("Food");
        jPanel1.add(lblTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

        lblCost.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        lblCost.setText("Cost $ :");
        jPanel1.add(lblCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        jLabel1.setText("Payment Method:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lblFN1.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        lblFN1.setText("Customer Name");
        jPanel1.add(lblFN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txt_Surnames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Surnames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SurnamesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Surnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 250, 30));

        txt_FullNames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_FullNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FullNamesActionPerformed(evt);
            }
        });
        txt_FullNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_FullNamesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_FullNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 250, 30));

        txt_Cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, 30));

        cmbPaymentMethod.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cmbPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de Credito", "Tarjeta de Debito ", "PayPal" }));
        cmbPaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentMethodActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 30));

        btn_Register.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Register.setText("REGISTER");
        btn_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RegisterMouseExited(evt);
            }
        });
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 40));

        btn_NewRegister.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_NewRegister.setText("NEW REGISTER");
        btn_NewRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NewRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_NewRegisterMousePressed(evt);
            }
        });
        btn_NewRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_NewRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, 30));

        btn_Cancel.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Cancel.setText("CANCEL");
        btn_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CancelMousePressed(evt);
            }
        });
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 100, 30));

        btn_Register1.setBackground(new java.awt.Color(0, 255, 204));
        btn_Register1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Register1.setText("REGISTER");
        btn_Register1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Register1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        cmb_Food.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cmb_Food.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sopa", "Hamburguesa", "Pizza", "Paninis" }));
        jPanel1.add(cmb_Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
    CustomerController customerController;
    customerController = new CustomerController("Customers");
        
    int i =  JOptionPane.showConfirmDialog(this,"Register Customer?","Aviso",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        customerController.createToDatabase(customerController.RegisterAndBuildDocument(txt_FullNames.getText(), 
                txt_Surnames.getText(),
                cmb_Food.getSelectedItem().toString(), 
                txt_Cost.getText(), 
                cmbPaymentMethod.getSelectedItem().toString()));

        JOptionPane.showMessageDialog(this, "Data saved successfully");
      }else if(i==1){
          this.setVisible(true);
      }
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void txt_FullNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FullNamesActionPerformed
        //
    }//GEN-LAST:event_txt_FullNamesActionPerformed

    private void txt_FullNamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FullNamesKeyTyped
        
        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
        evt.consume();
        JOptionPane.showMessageDialog(txt_FullNames, "Enter only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_FullNamesKeyTyped

    private void btn_Register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Register1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Register1ActionPerformed

    private void btn_NewRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewRegisterActionPerformed
        
      int i =  JOptionPane.showConfirmDialog(this,"Register a new Customer?","Warning",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        txt_FullNames.setText("");
        txt_Surnames.setText("");
        txt_Cost.setText("");
      
      }else if(i==1){
          this.setVisible(true);
      }
    }//GEN-LAST:event_btn_NewRegisterActionPerformed

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered

    }//GEN-LAST:event_btn_CancelMouseEntered

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMouseEntered
       
    }//GEN-LAST:event_btn_RegisterMouseEntered

    private void btn_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMouseExited
        
    }//GEN-LAST:event_btn_RegisterMouseExited

    private void btn_NewRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewRegisterMouseEntered
        
    }//GEN-LAST:event_btn_NewRegisterMouseEntered

    private void btn_NewRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewRegisterMouseExited
       
    }//GEN-LAST:event_btn_NewRegisterMouseExited

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        int i =  JOptionPane.showConfirmDialog(this,"Do you want cancel? you don't save data","Warning",JOptionPane.WARNING_MESSAGE);
        if(i==0){
        txt_FullNames.setText("");
        txt_Surnames.setText("");
        txt_Cost.setText("");
        }else if(i==1){
            this.setVisible(true);
        }
    }//GEN-LAST:event_btn_CancelMousePressed

    private void txt_SurnamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SurnamesKeyTyped
        //   validado por Erick Moreira
        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
        evt.consume();
        JOptionPane.showMessageDialog(txt_Surnames, "Enter only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_SurnamesKeyTyped

    private void txt_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostKeyTyped
        char character = evt.getKeyChar();
        
        if(((character < '0' || character > '9')) && (character != KeyEvent.VK_BACK_SPACE)
            && (character != '.' || txt_Cost.getText().contains(".") )){
            evt.consume();
        }
    }//GEN-LAST:event_txt_CostKeyTyped

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        //
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_NewRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewRegisterMousePressed
        int i =  JOptionPane.showConfirmDialog(this,"Register a new customer?","Aviso",JOptionPane.WARNING_MESSAGE);
        if(i==0){
        txt_FullNames.setText("");
        txt_Surnames.setText("");
        txt_Cost.setText("");
        }else if(i==1){
            this.setVisible(true);
        }
    }//GEN-LAST:event_btn_NewRegisterMousePressed

    private void cmbPaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentMethodActionPerformed

    }//GEN-LAST:event_cmbPaymentMethodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_NewRegister;
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_Register1;
    private javax.swing.JComboBox<String> cmbPaymentMethod;
    private javax.swing.JComboBox<String> cmb_Food;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDataCustomer;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblFN1;
    private javax.swing.JLabel lblSN;
    private javax.swing.JLabel lblTOS;
    private javax.swing.JTextField txt_Cost;
    private javax.swing.JTextField txt_FullNames;
    private javax.swing.JTextField txt_Surnames;
    // End of variables declaration//GEN-END:variables
}
