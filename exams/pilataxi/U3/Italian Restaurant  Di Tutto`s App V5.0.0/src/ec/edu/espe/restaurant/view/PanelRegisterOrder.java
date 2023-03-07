package ec.edu.espe.restaurant.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.toedter.calendar.JDateChooser;
import ec.edu.espe.restaurant.controller.CustomerController;
import ec.edu.espe.restaurant.controller.ServiceController;
import ec.edu.espe.restaurant.controller.MongoDBConnection;
import ec.edu.espe.restaurant.model.Service;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class PanelRegisterOrder extends javax.swing.JPanel {

    public PanelRegisterOrder() {
        initComponents();
        MongoDBConnection.connectDatabase();
        loadService();
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
    
    public void loadService(){
        MongoDBConnection.connectDatabase();
        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = MongoDBConnection.connectDatabase().withCodecRegistry(codecRegistry);
        MongoCollection<Service> collectionService = db.getCollection("Menu", Service.class); 
        
        List<Service> services = collectionService.find(new Document(), Service.class).into(new ArrayList<Service>());

        for (Service service : services) {
            cmb_Menu.addItem(service.getFood());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbDataCustomer = new javax.swing.JLabel();
        lblSN = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblCEllphone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTOS = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblCost1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFN1 = new javax.swing.JLabel();
        sp_sessions = new javax.swing.JSpinner();
        txt_lastName = new javax.swing.JTextField();
        txt_firstName = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txt_Cellphone = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Cost = new javax.swing.JTextField();
        txt_Note = new javax.swing.JTextField();
        cmb_Menu = new javax.swing.JComboBox<>();
        btn_Register = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calendarDate = new com.toedter.calendar.JDateChooser();
        txt_Hour = new javax.swing.JFormattedTextField();
        txt_costTotal = new javax.swing.JTextField();
        btn_calculate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDataCustomer.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lbDataCustomer.setForeground(new java.awt.Color(0, 0, 0));
        lbDataCustomer.setText("ORDER:");
        jPanel1.add(lbDataCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        lblSN.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblSN.setForeground(new java.awt.Color(0, 0, 0));
        lblSN.setText("Lastnames:");
        jPanel1.add(lblSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        lblId.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("C.I:");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 190, -1));

        lblCEllphone.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblCEllphone.setForeground(new java.awt.Color(0, 0, 0));
        lblCEllphone.setText("Cellphone:");
        jPanel1.add(lblCEllphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("E-mail:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 60, -1));

        lblTOS.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblTOS.setForeground(new java.awt.Color(0, 0, 0));
        lblTOS.setText("Food:");
        jPanel1.add(lblTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        lblCost.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblCost.setForeground(new java.awt.Color(0, 0, 0));
        lblCost.setText("Cost:");
        jPanel1.add(lblCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        lblCost1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblCost1.setForeground(new java.awt.Color(0, 0, 0));
        lblCost1.setText("Amount:");
        jPanel1.add(lblCost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TOTAL TO PAY:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        lblFN1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblFN1.setForeground(new java.awt.Color(0, 0, 0));
        lblFN1.setText("Fullnames:");
        jPanel1.add(lblFN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        sp_sessions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sp_sessions.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10.0d, 1.0d));
        jPanel1.add(sp_sessions, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, 30));

        txt_lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_lastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastNameKeyTyped(evt);
            }
        });
        jPanel1.add(txt_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 240, 30));

        txt_firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_firstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstNameActionPerformed(evt);
            }
        });
        txt_firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstNameKeyTyped(evt);
            }
        });
        jPanel1.add(txt_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 240, 30));

        txt_Id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, 30));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 10, 120));

        txt_Cellphone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Cellphone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CellphoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CellphoneKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 190, 30));

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 30));

        txt_Cost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CostActionPerformed(evt);
            }
        });
        txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CostKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 70, 40));

        txt_Note.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txt_Note.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NoteActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Note, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 280, 50));

        cmb_Menu.setBackground(new java.awt.Color(255, 153, 153));
        cmb_Menu.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cmb_Menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(cmb_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 260, 30));

        btn_Register.setBackground(new java.awt.Color(255, 102, 102));
        btn_Register.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Register.setForeground(new java.awt.Color(0, 0, 0));
        btn_Register.setText("REGISTER");
        btn_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Register.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_RegisterStateChanged(evt);
            }
        });
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
        jPanel1.add(btn_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 120, 40));

        btn_Cancel.setBackground(new java.awt.Color(255, 102, 102));
        btn_Cancel.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Cancel.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Date:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Hour of Attention:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 160, 30));
        jPanel1.add(calendarDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 140, 40));

        try {
            txt_Hour.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_Hour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HourActionPerformed(evt);
            }
        });
        txt_Hour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_HourKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_HourKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 50, 30));

        txt_costTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_costTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_costTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costTotalActionPerformed(evt);
            }
        });
        txt_costTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_costTotalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costTotalKeyTyped(evt);
            }
        });
        jPanel1.add(txt_costTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 70, 30));

        btn_calculate.setBackground(new java.awt.Color(255, 102, 102));
        btn_calculate.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_calculate.setForeground(new java.awt.Color(0, 0, 0));
        btn_calculate.setText("CALCULATE");
        btn_calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_calculateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_calculateMouseExited(evt);
            }
        });
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("$");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 20, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("$");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 20, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Note (Additional Instructions):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 240, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doc_Impresion1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 30, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 500));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("INVOICE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 428, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
    
    CustomerController customerController;
    customerController = new CustomerController("Orders");
        
    MongoCollection<Document> collection = MongoDBConnection.database.getCollection("Orders");
    Document doc = collection.find(eq("identification", txt_Id.getText())).first();
        
    if(doc == null){
        if(txt_Id.getText().length()<10 || txt_Cellphone.getText().length()<10){
            JOptionPane.showConfirmDialog(this,"The identification or telephone number is incomplete \n" + "The identification and telephone number must have 10 numbers","Warning",JOptionPane.WARNING_MESSAGE);     
        }else if(txt_firstName.getText().isEmpty() || txt_lastName.getText().isEmpty() || txt_Id.getText().isEmpty() || txt_Cellphone.getText().isEmpty() || txt_Email.getText().isEmpty()  || cmb_Menu.getSelectedItem().toString().isEmpty()  ||txt_Cost.getText().isEmpty()  ||txt_Note.getText().isEmpty()  ||formDate.format(calendarDate.getDate()).isEmpty()  ||txt_Hour.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Invalid Register \n" +"Some text fields are empty", "Error",JOptionPane.ERROR_MESSAGE);
    }else{
        int i =  JOptionPane.showConfirmDialog(this,"REGISTER ORDER?","Warning",JOptionPane.WARNING_MESSAGE);
        
            if(i==0){
                customerController.createToDatabase(customerController.RegisterAndBuildDocument(txt_firstName.getText(), 
                    txt_lastName.getText(),
                    txt_Id.getText(),
                    txt_Cellphone.getText(),
                    txt_Email.getText(), 
                    cmb_Menu.getSelectedItem().toString(), 
                    txt_Cost.getText(), 
                    txt_Note.getText(), 
                    formDate.format(calendarDate.getDate()), 
                    txt_Hour.getText()));
                    JOptionPane.showMessageDialog(this, "Data saved successfully");
                
                        txt_firstName.setText("");
                        txt_lastName.setText("");
                        txt_Id.setText("");
                        txt_Cellphone.setText("");
                        txt_Email.setText("");
                        txt_Cost.setText("");
                        txt_Note.setText("");
                        txt_Hour.setText("");
                
            }else if(i==1){
                this.setVisible(true);
            }
    }
        } 
        else{
           JOptionPane.showMessageDialog(this, "There is already a registered customer with the identification number\n "+txt_Id.getText()+" Enter again \n"); 
        }
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void txt_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstNameActionPerformed

    }//GEN-LAST:event_txt_firstNameActionPerformed

    private void txt_firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstNameKeyTyped
 
    char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Type only letters","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_firstNameKeyTyped

    private void txt_CellphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CellphoneKeyPressed
  
    }//GEN-LAST:event_txt_CellphoneKeyPressed

    private void txt_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyPressed

    }//GEN-LAST:event_txt_IdKeyPressed

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
       
    }//GEN-LAST:event_btn_CancelMouseEntered

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
       
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMouseEntered
       
    }//GEN-LAST:event_btn_RegisterMouseEntered

    private void btn_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMouseExited
       
    }//GEN-LAST:event_btn_RegisterMouseExited

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        int i =  JOptionPane.showConfirmDialog(this,"Do you want to cancel? The data has not been saved","Error",JOptionPane.WARNING_MESSAGE);
        if(i==0){
        txt_firstName.setText("");
        txt_lastName.setText("");
        txt_Id.setText("");
        txt_Cellphone.setText("");
        txt_Email.setText("");
        txt_Cost.setText("");
        txt_Note.setText("");
        txt_Hour.setText("");
        }else if(i==1){
            this.setVisible(true);
        }
    }//GEN-LAST:event_btn_CancelMousePressed

    private void txt_HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HourActionPerformed
        
    }//GEN-LAST:event_txt_HourActionPerformed

    private void txt_HourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyPressed
        ServiceController hour;
        hour = new ServiceController("Orders");
        if(hour.validateHour(txt_Hour.getText())== false){
         
        }
    }//GEN-LAST:event_txt_HourKeyPressed

    private void txt_HourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyTyped
    
    }//GEN-LAST:event_txt_HourKeyTyped

    private void txt_lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastNameKeyTyped

        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
        evt.consume();
        JOptionPane.showMessageDialog(this, "Type only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_lastNameKeyTyped

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

    private void txt_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyTyped
  

        int key = evt.getKeyChar();
        
        boolean onlyNumbers = key >= 48 && key <= 57;
        
        if(!onlyNumbers){
            evt.consume();
        }
        if(txt_Id.getText().length()>=10){
            JOptionPane.showMessageDialog(this, "The identification number must have 10 numbers","Warning",JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_IdKeyTyped

    private void txt_CellphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CellphoneKeyTyped
        int key = evt.getKeyChar();
        
        boolean onlyNumbers = key >= 48 && key <= 57;
        
        if(!onlyNumbers){
            evt.consume();
        }
        if(txt_Cellphone.getText().length()>=10){
            JOptionPane.showMessageDialog(this, "The phone number must have 10 numbers","Warning",JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_CellphoneKeyTyped

    private void btn_RegisterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_RegisterStateChanged
        
    }//GEN-LAST:event_btn_RegisterStateChanged

    private void txt_NoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NoteActionPerformed
        
    }//GEN-LAST:event_txt_NoteActionPerformed

    private void txt_CostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CostActionPerformed
       
    }//GEN-LAST:event_txt_CostActionPerformed

    private void txt_CostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostKeyPressed
        
    }//GEN-LAST:event_txt_CostKeyPressed

    private void txt_costTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costTotalActionPerformed
        
    }//GEN-LAST:event_txt_costTotalActionPerformed

    private void txt_costTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costTotalKeyPressed
        
    }//GEN-LAST:event_txt_costTotalKeyPressed

    private void txt_costTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costTotalKeyTyped
        char character = evt.getKeyChar();
        
        if(((character < '0' || character > '9')) && (character != KeyEvent.VK_BACK_SPACE)
            && (character != '.' || txt_costTotal.getText().contains(".") )){
            evt.consume();
        }
        else if(txt_costTotal.getText().length() == 5){
                evt.consume();
            }
    }//GEN-LAST:event_txt_costTotalKeyTyped

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed

    float cost;
    float numberSessions;
            DecimalFormat df = new DecimalFormat("#.00");

            cost = Float.parseFloat(txt_costTotal.getText());
            numberSessions = Float.parseFloat(sp_sessions.getValue().toString());
            float sum = cost * numberSessions;
        
            txt_Cost.setText(""+ df.format(sum));
    }//GEN-LAST:event_btn_calculateActionPerformed

    private void btn_calculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calculateMouseEntered
        
    }//GEN-LAST:event_btn_calculateMouseEntered

    private void btn_calculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calculateMouseExited
       
    }//GEN-LAST:event_btn_calculateMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmInvoice FrmInvoice = new FrmInvoice();
        this.setVisible(false);
        FrmInvoice.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_calculate;
    private com.toedter.calendar.JDateChooser calendarDate;
    public static javax.swing.JComboBox<String> cmb_Menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JLabel lbDataCustomer;
    private javax.swing.JLabel lblCEllphone;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCost1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFN1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSN;
    private javax.swing.JLabel lblTOS;
    private javax.swing.JSpinner sp_sessions;
    private javax.swing.JTextField txt_Cellphone;
    private javax.swing.JTextField txt_Cost;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JFormattedTextField txt_Hour;
    public javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Note;
    private javax.swing.JTextField txt_costTotal;
    public static javax.swing.JTextField txt_firstName;
    public javax.swing.JTextField txt_lastName;
    // End of variables declaration//GEN-END:variables
}
