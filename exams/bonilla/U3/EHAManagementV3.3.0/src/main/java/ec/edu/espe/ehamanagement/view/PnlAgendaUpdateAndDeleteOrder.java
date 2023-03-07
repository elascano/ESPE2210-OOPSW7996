package ec.edu.espe.ehamanagement.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.Agenda;
import ec.edu.espe.ehamanagement.model.Order;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class PnlAgendaUpdateAndDeleteOrder extends javax.swing.JPanel {
    public static int idToUpdate;
    private final MongoCollection ordersCollection;
    
    /**
     * Creates new form PnlOrderInformation
     * @param collection
     */
    public PnlAgendaUpdateAndDeleteOrder(MongoCollection collection) {
        initComponents();
        btnSave.setEnabled(false);
        txtADescription.setLineWrap(true);
        txtADescription.setWrapStyleWord(true);
        ordersCollection = collection;
        writeFields();
        openFields(false);
    }
    
    /**
     * @return the idToUpdate
     */
    public static int getIdToUpdate() {
        return idToUpdate;
    }

    /**
     * @param aIdToUpdate the idToUpdate to set
     */
    public static void setIdToUpdate(int aIdToUpdate) {
        idToUpdate = aIdToUpdate;
    }

    private boolean updateOrder(){
        Order orderToUpdate = createOrderToUpdate();
        return Agenda.updateOrder(ordersCollection,orderToUpdate);
    }
    
    private Order createOrderToUpdate(){
        Order orderToUpdate;
        String clientName = txtClientName.getText();
        String deliveryPlace = txtDeliveryPlace.getText();
        String deliveryDate = cbxDeliveryMonth.getSelectedItem() + "/"+ cbxDeliveryDay.getSelectedItem() + "/" + cbxDeliveryYear.getSelectedItem();
        boolean delivered;
        if (chbxDelivered.isSelected()){
            delivered = true;
        }else{
            delivered= false;
        }
        String description = txtADescription.getText();
        orderToUpdate =  new Order(getIdToUpdate(), clientName, deliveryPlace, deliveryDate, description, delivered);
        return orderToUpdate;
    }
    
    private boolean deleteOrder(){
        return Agenda.deleteOrder(ordersCollection, getIdToUpdate());
    }
   
    
    private void validateFields(){
        if(txtClientName.getText().equals("client's  name"))
        {
            lblTextWarningClient.setText("this area is required");
            pictureWarningClient();
        }else{
            pictureWhiteClient();
            lblTextWarningClient.setText("");
        }
        if(txtDeliveryPlace.getText().equals("216 Newbury Street"))
        {
            lblTextWarningPlace.setText("this area is required");
            pictureWarningPlace();
        }else{
            pictureWhitePlace();
            lblTextWarningPlace.setText("");
        }
        
        if(txtADescription.getText().equals("Product's description"))
        {
            pictureWarningDescription();
        }
        else
        {
            pictureWhiteDescription();
        }
        if(txtDeliveryPlace.getText().equals("216 Newbury Street")|| txtADescription.getText().equals("Product's description")|| txtADescription.getText().isEmpty()||txtClientName.getText().equals("client's  name")
            || txtDeliveryPlace.getText().isEmpty()|| txtClientName.getText().isEmpty())
        {
            btnSave.setEnabled(false);
        }
        else
        {
            btnSave.setEnabled(true);
        }
    }
    private void restartFields(){
        if(txtClientName.getText().isEmpty()){
                txtClientName.setText("client's  name");
                txtClientName.setForeground(Color.gray);
            }
        if(txtDeliveryPlace.getText().isEmpty()){
                txtDeliveryPlace.setText("216 Newbury Street");
                txtDeliveryPlace.setForeground(Color.gray);
               
            }
        if(txtADescription.getText().isEmpty()){
                txtADescription.setText("Product's description");
                txtADescription.setForeground(Color.gray);
                
            }
    }
    
    private void openFields(boolean active){
        txtClientName.setEditable(active);
        cbxDeliveryYear.setEnabled(active);
        cbxDeliveryMonth.setEnabled(active);
        cbxDeliveryDay.setEnabled(active);
        txtDeliveryPlace.setEditable(active);
        chbxDelivered.setEnabled(active);
        txtADescription.setEditable(active);
        btnUpdate.setEnabled(!active); 
    }
    
    private void writeFields(){
        String clientName = (String) Agenda.getValueFromOrder(ordersCollection,"id", getIdToUpdate(), "clientName");
        String deliveryPlace = (String) Agenda.getValueFromOrder(ordersCollection,"id", getIdToUpdate(), "deliveryPlace");
        String deliveryDate = (String) Agenda.getValueFromOrder(ordersCollection, "id", getIdToUpdate(), "deliveryDate");
        String[] Date = deliveryDate.split("/");
        String deliveryMonth = Date[0];
        String deliveryDay = Date[1];
        String deliveryYear = Date[2];
        boolean isDelivered = Boolean.parseBoolean(String.valueOf(Agenda.getValueFromOrder(ordersCollection, "id", getIdToUpdate(), "isDelivered")));
        String description = (String) Agenda.getValueFromOrder(ordersCollection, "id", getIdToUpdate(), "description");
        
        txtClientName.setText(clientName);
        txtDeliveryPlace.setText(deliveryPlace);
        cbxDeliveryMonth.setSelectedItem(deliveryMonth);
        cbxDeliveryDay.setSelectedItem(deliveryDay);
        cbxDeliveryYear.setSelectedItem(deliveryYear);
        if(isDelivered){
            txtDelivered.setForeground(Color.green);
            txtDelivered.setText("Yes");
            chbxDelivered.setSelected(true);
        }else if(!isDelivered){
            txtDelivered.setForeground(Color.red);
            txtDelivered.setText("No");
            chbxDelivered.setSelected(false);
        }
        txtADescription.setText(description);
    }
    

    private void pictureWarningDescription() {
        lblPictureWrningDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblPictureWrningDes.setText("");
    }

    private void pictureWhiteDescription() {
        lblPictureWrningDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblPictureWrningDes.setText("");
    }
    private void pictureWarningClient() {
        lblpictureWarningClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblpictureWarningClient.setText("");
    }

    private void pictureWhiteClient() {
        lblpictureWarningClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblpictureWarningClient.setText("");
    }
    private void pictureWarningPlace() {
        lblPictureWarningPlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblPictureWarningPlace.setText("");
    }

    private void pictureWhitePlace() {
        lblPictureWarningPlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblPictureWarningPlace.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlOrderInformation = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtDeliveryPlace = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        chbxDelivered = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        cbxDeliveryMonth = new javax.swing.JComboBox<>();
        cbxDeliveryDay = new javax.swing.JComboBox<>();
        cbxDeliveryYear = new javax.swing.JComboBox<>();
        lblpictureWarningClient = new javax.swing.JLabel();
        lblTextWarningClient = new javax.swing.JLabel();
        lblPictureWarningPlace = new javax.swing.JLabel();
        lblTextWarningPlace = new javax.swing.JLabel();
        lblPictureWrningDes = new javax.swing.JLabel();
        txtDelivered = new javax.swing.JLabel();

        PnlOrderInformation.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Client Name ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setText("Description :");

        txtADescription.setColumns(20);
        txtADescription.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtADescription.setRows(5);
        txtADescription.setText("Product's description");
        txtADescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 22, 2), 2, true));
        txtADescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtADescriptionMousePressed(evt);
            }
        });
        txtADescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtADescriptionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtADescription);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Delivery Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Delivery Place ");

        txtClientName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClientName.setText("client's  name");
        txtClientName.setBorder(null);
        txtClientName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtClientName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtClientNameMousePressed(evt);
            }
        });
        txtClientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClientNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClientNameKeyTyped(evt);
            }
        });

        txtDeliveryPlace.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDeliveryPlace.setText("216 Newbury Street");
        txtDeliveryPlace.setBorder(null);
        txtDeliveryPlace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDeliveryPlaceMousePressed(evt);
            }
        });
        txtDeliveryPlace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeliveryPlaceKeyReleased(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        chbxDelivered.setBackground(new java.awt.Color(255, 255, 255));
        chbxDelivered.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chbxDelivered.setText("Delivered");
        chbxDelivered.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbxDelivered.setEnabled(false);
        chbxDelivered.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbxDeliveredMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(126, 53, 2));

        btnUpdate.setBackground(new java.awt.Color(252, 154, 11));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(252, 154, 11));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(32, 32, 32))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/calendar.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(126, 53, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnSave.setBackground(new java.awt.Color(252, 154, 11));
        btnSave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cbxDeliveryMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxDeliveryMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Dicember" }));
        cbxDeliveryMonth.setBorder(null);
        cbxDeliveryMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxDeliveryMonth.setEnabled(false);

        cbxDeliveryDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxDeliveryDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbxDeliveryDay.setBorder(null);
        cbxDeliveryDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxDeliveryDay.setEnabled(false);

        cbxDeliveryYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxDeliveryYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cbxDeliveryYear.setBorder(null);
        cbxDeliveryYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxDeliveryYear.setEnabled(false);

        lblTextWarningClient.setForeground(new java.awt.Color(255, 0, 0));

        lblTextWarningPlace.setForeground(new java.awt.Color(255, 0, 0));

        txtDelivered.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDelivered.setText("Yes");

        javax.swing.GroupLayout PnlOrderInformationLayout = new javax.swing.GroupLayout(PnlOrderInformation);
        PnlOrderInformation.setLayout(PnlOrderInformationLayout);
        PnlOrderInformationLayout.setHorizontalGroup(
            PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                        .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSave))
                                .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                                    .addComponent(cbxDeliveryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                    .addComponent(cbxDeliveryDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(cbxDeliveryYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator3)
                                .addComponent(txtDeliveryPlace)
                                .addComponent(jSeparator4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2)
                                .addComponent(jLabel5)
                                .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                                    .addComponent(chbxDelivered)
                                    .addGap(17, 17, 17)
                                    .addComponent(txtDelivered))
                                .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPictureWrningDes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtClientName))
                            .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                                .addComponent(lblpictureWarningClient, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTextWarningClient, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                                .addComponent(lblPictureWarningPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTextWarningPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PnlOrderInformationLayout.setVerticalGroup(
            PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlOrderInformationLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpictureWarningClient, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTextWarningClient, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxDeliveryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDeliveryDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDeliveryYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeliveryPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTextWarningPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(lblPictureWarningPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbxDelivered)
                            .addComponent(txtDelivered))
                        .addGap(1, 1, 1)
                        .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(lblPictureWrningDes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlOrderInformationLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(PnlOrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlOrderInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlOrderInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        openFields(true);
        validateFields();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int decision = JOptionPane.showConfirmDialog(this,"Are you sure you want to update this order?", "Update Order", JOptionPane.YES_NO_OPTION);
        switch(decision){
            case 0 -> {
                if(updateOrder()){
                    JOptionPane.showMessageDialog(this, "Your changes have been successfully saved!", "Updated successfully", JOptionPane.INFORMATION_MESSAGE);
                } else{
                   JOptionPane.showMessageDialog(this, "Something went wrong. Failed to save you changes in this order", "Updated failed", JOptionPane.ERROR_MESSAGE); 
                }        
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int decision = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this order?", "Delete Order", JOptionPane.YES_NO_OPTION);
        switch (decision){
            case 0 -> {
            if(deleteOrder()){
                openFields(false);
                btnUpdate.setEnabled(false);
                btnSave.setEnabled(false);
                btnDelete.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Order deleted successfully!", "Deleted successfully", JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtClientNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClientNameMousePressed
        if(!btnUpdate.isEnabled()){
            restartFields();
            if(txtClientName.getText().equals("client's  name"))
            {
                txtClientName.setText("");
                txtClientName.setForeground(Color.black);
            }
            validateFields();

        }
        
    }//GEN-LAST:event_txtClientNameMousePressed

    private void txtDeliveryPlaceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeliveryPlaceMousePressed
        if(!btnUpdate.isEnabled()){
            restartFields();
            if(txtDeliveryPlace.getText().equals("216 Newbury Street"))
            {
                txtDeliveryPlace.setText("");
                txtDeliveryPlace.setForeground(Color.black);
            }
            validateFields();
        }
    }//GEN-LAST:event_txtDeliveryPlaceMousePressed

    private void txtADescriptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtADescriptionMousePressed
        if(!btnUpdate.isEnabled()){
            restartFields();
            if(txtADescription.getText().equals("Product's description"))
            {
                txtADescription.setText("");
                txtADescription.setForeground(Color.black);
            }  
            validateFields();
        }
        
        
    }//GEN-LAST:event_txtADescriptionMousePressed

    private void txtClientNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientNameKeyReleased
        
    }//GEN-LAST:event_txtClientNameKeyReleased

    private void txtDeliveryPlaceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeliveryPlaceKeyReleased
         if (txtClientName.getText().equals("client's  name")) {
            lblTextWarningClient.setText("this area is required");
            pictureWarningClient();
        } 
        validateFields();
    }//GEN-LAST:event_txtDeliveryPlaceKeyReleased

    private void txtADescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescriptionKeyReleased
         if (txtClientName.getText().equals("client's  name")) {
            lblTextWarningClient.setText("this area is required");
            pictureWarningClient();
        } 
        validateFields();
    }//GEN-LAST:event_txtADescriptionKeyReleased

    private void txtClientNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientNameKeyTyped
        char character = evt.getKeyChar();
            if (!Character.isLetter(character) && (character != KeyEvent.VK_BACK_SPACE && character != KeyEvent.VK_SPACE)) {
                evt.consume();
                pictureWarningClient();
                lblTextWarningClient.setText(character + " is not accepted here!");

            } else {
                lblTextWarningClient.setText("");
                pictureWhiteClient();
            } 
    }//GEN-LAST:event_txtClientNameKeyTyped

    private void chbxDeliveredMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDeliveredMousePressed
        if(!btnUpdate.isEnabled()){
            if(!chbxDelivered.isSelected()){
                txtDelivered.setForeground(Color.green);
                txtDelivered.setText("Yes");
            }else{
                txtDelivered.setForeground(Color.red);
                txtDelivered.setText("No");
            }
        }
    }//GEN-LAST:event_chbxDeliveredMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlOrderInformation;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxDeliveryDay;
    private javax.swing.JComboBox<String> cbxDeliveryMonth;
    private javax.swing.JComboBox<String> cbxDeliveryYear;
    private javax.swing.JCheckBox chbxDelivered;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblPictureWarningPlace;
    private javax.swing.JLabel lblPictureWrningDes;
    private javax.swing.JLabel lblTextWarningClient;
    private javax.swing.JLabel lblTextWarningPlace;
    private javax.swing.JLabel lblpictureWarningClient;
    public javax.swing.JTextArea txtADescription;
    public javax.swing.JTextField txtClientName;
    private javax.swing.JLabel txtDelivered;
    private javax.swing.JTextField txtDeliveryPlace;
    // End of variables declaration//GEN-END:variables





}
