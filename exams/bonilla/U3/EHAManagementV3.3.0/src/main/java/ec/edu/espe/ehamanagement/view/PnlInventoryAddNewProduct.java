package ec.edu.espe.ehamanagement.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.Inventory;
import ec.edu.espe.ehamanagement.controller.MaterialsOrganizer;
import ec.edu.espe.ehamanagement.model.Product;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.CostsCalculator;
import utils.DictionaryConversor;

/**
 *
 * @author Jairo Bonilla & Nahir Carrera, Gaman GeekLords, DCCO-ESPE
 */
    public class PnlInventoryAddNewProduct extends javax.swing.JPanel {
        private final DefaultTableModel tableModel;
        private final MongoCollection materialsCollection;
        private final MongoCollection productsCollection;
        private final MongoCollection userCollection;
        private DefaultComboBoxModel comboModel;
        /**
         * Creates new form PnlAddProductInventor
         * @param collectionMaterials
         * @param collectionProducts
     * @param collectionUser
         */
    public PnlInventoryAddNewProduct(MongoCollection collectionProducts,MongoCollection collectionMaterials,  MongoCollection collectionUser) {
        initComponents();
        materialsCollection = collectionMaterials;
        productsCollection = collectionProducts;
        userCollection = collectionUser;
        tableModel =  new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }};
        tableModel.addColumn("ID");
        tableModel.addColumn("Material");
        tableModel.addColumn("Quantity");
        this.tblMaterials.setModel(tableModel);
        txtADescription.setEnabled(true);
        txtADescription.setEditable(true);
        txtADescription.setLineWrap(true);
        txtADescription.setWrapStyleWord(true);
        validateFields();
        updateCbxMaterials(); 
    }   

    private boolean addProduct() throws ParseException{
        Product productToAdd = createProductToUpdate();
        if(!Inventory.existsProduct(productsCollection,"name", productToAdd.getName())){
            return Inventory.insertProduct(productsCollection,productToAdd);
        }else{
            JOptionPane.showMessageDialog(this, "There's already a product in your inventory named: "+ productToAdd.getName(), "Saved failed", JOptionPane.ERROR_MESSAGE); 
            return false;
        }
    }
    
    private Product createProductToUpdate() throws ParseException{
        String name = txtProductName.getText();
        float productionCost = 0.0F;
        String description = txtADescription.getText();
        int workingTime = (int) spnrWorkingTime.getValue();
        int quantity = (int) spnrQuantity.getValue();
        ArrayList materialsIds = getTableInfo("id", 0);
        ArrayList materialsQuantities = getTableInfo("quantity", 2);
        HashMap materials = DictionaryConversor.convertToDictionary(materialsIds, materialsQuantities);
        Product productToAdd;
        productToAdd = new Product(0, name, productionCost, description, materials, workingTime, quantity);
        float cost = CostsCalculator.computeTotalProductProductionCost(materialsCollection, userCollection, productToAdd);
        productToAdd.setProductionCost(cost);
        return productToAdd;
    }
    
    private ArrayList getTableInfo(String title, int column){
        int row = tblMaterials.getRowCount();
        ArrayList columnValues = new ArrayList();
        switch (title) {
            case "id" -> {
                for (int i = 0; i < row; i++) {
                    int value = Integer.valueOf(tblMaterials.getValueAt(i, column).toString());
                    columnValues.add(value);
                }
                return columnValues;
            }
            case "quantity" -> {
                for (int i = 0; i < row; i++) {
                    float value = Float.valueOf((tblMaterials.getValueAt(i, column).toString()));
                    columnValues.add(value);
                }
                return columnValues;
            }
            default -> {
                return columnValues;
            }
        }
    }
    

    private void addMaterialToProduct(){
        String material = String.valueOf(cbxMaterials.getSelectedItem());
        double quantity = Double.valueOf(String.valueOf(spnrNumberMaterial.getValue()));
        int id = findMaterialId(material);
        String[] information = new String[3];
        information[0] = String.valueOf(id);
        information[1] = material;
        information[2] = String.valueOf(quantity);
        tableModel.addRow(information);
    }
    
    private int findMaterialId(String material){
        int id  = Integer.parseInt(String.valueOf(MaterialsOrganizer.getValueFromMaterial(materialsCollection, "name", material, "id")));
        return id;
    }
    
    private void deleteMaterialFromProduct(){
        int row = tblMaterials.getSelectedRow();
        if (row >=0){
            tableModel.removeRow(row);
        }else{
            JOptionPane.showMessageDialog(this, "Select row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void updateCbxMaterials(){
       ArrayList materials;
       materials = MaterialsOrganizer.getAll(materialsCollection,"name");
       comboModel = new DefaultComboBoxModel(materials.toArray());
       cbxMaterials.setModel(comboModel);
    }
    
    private void cleanTableInfo(){
        int row =  tblMaterials.getRowCount();
        for(int i = row - 1; i >=0 ; i--){
            tableModel.removeRow(i);
        }
    }
    
    
    public void validateFields() {
        if (txtProductName.getText().isEmpty()) {
            lblNameWarning.setText("Field required");
            pictureWarningProduct();
        } else {
            lblNameWarning.setText("");
            pictureWhiteProduct();
        }
        if (txtADescription.getText().isEmpty()) {
            lblDescriptionWarning.setText("Field required");
            pictureWarningArea();
        } else {
            lblDescriptionWarning.setText("");
            pictureWhiteArea();
        }
        if(txtProductName.getText().isEmpty() || txtADescription.getText().isEmpty())
        {
            btnSave.setEnabled(false);
        }
        else
        {
            btnSave.setEnabled(true);
        }
    }
    
    private void cleanFields(){
        txtProductName.setText("");
        txtADescription.setText("");
        spnrQuantity.setValue(1);
        spnrWorkingTime.setValue(1);
        spnrNumberMaterial.setValue(0.1);
        cleanTableInfo();
    }
    
    
    public void pictureWarningProduct() {
        lblPictureNameWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png")));

        lblNameWarning.setText("");

    }

    public void pictureWhiteProduct() {
        lblPictureNameWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblNameWarning.setText("");
    }

    public void pictureWarningArea() {
        lblPictureDescriptionWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblDescriptionWarning.setText("");

    }

    public void pictureWhiteArea() {
        lblPictureDescriptionWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblDescriptionWarning.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbProductName2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lbProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblPictureNameWarning = new javax.swing.JLabel();
        lblNameWarning = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spnrQuantity = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnrWorkingTime = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtADescription = new javax.swing.JTextArea();
        cbxMaterials = new javax.swing.JComboBox<>();
        spnrNumberMaterial = new javax.swing.JSpinner();
        lbProductName1 = new javax.swing.JLabel();
        btnDeleteMaterial = new javax.swing.JButton();
        btnAddMaterial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterials = new javax.swing.JTable();
        lblDescriptionWarning = new javax.swing.JLabel();
        lblPictureDescriptionWarning = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(80, 59, 108));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbProductName2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbProductName2.setForeground(new java.awt.Color(255, 255, 255));
        lbProductName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProductName2.setText("New Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbProductName2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbProductName2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/Inventory.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(80, 59, 108));

        btnSave.setBackground(new java.awt.Color(129, 87, 154));
        btnSave.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbProductName.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbProductName.setText("Product's Name");

        txtProductName.setBackground(new java.awt.Color(255, 255, 255));
        txtProductName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtProductName.setBorder(null);
        txtProductName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProductNameMousePressed(evt);
            }
        });
        txtProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductNameKeyTyped(evt);
            }
        });

        lblNameWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblNameWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        spnrQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnrQuantity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spnrQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnrQuantityMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setText("Quantity: Units");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Working time: Hours");

        spnrWorkingTime.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnrWorkingTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spnrWorkingTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnrWorkingTimeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Description:");

        txtADescription.setBackground(new java.awt.Color(255, 255, 255));
        txtADescription.setColumns(20);
        txtADescription.setForeground(new java.awt.Color(80, 59, 108));
        txtADescription.setRows(5);
        txtADescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 59, 108), 2, true));
        txtADescription.setEnabled(false);
        txtADescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtADescriptionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtADescriptionMousePressed(evt);
            }
        });
        txtADescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtADescriptionKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtADescription);

        cbxMaterials.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMaterials.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxMaterials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxMaterialsMouseClicked(evt);
            }
        });
        cbxMaterials.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbxMaterialsKeyReleased(evt);
            }
        });

        spnrNumberMaterial.setModel(new javax.swing.SpinnerNumberModel(0.1f, 0.1f, null, 0.1f));
        spnrNumberMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spnrNumberMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnrNumberMaterialMouseClicked(evt);
            }
        });

        lbProductName1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbProductName1.setText("Materials");

        btnDeleteMaterial.setBackground(new java.awt.Color(129, 87, 154));
        btnDeleteMaterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDeleteMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/deleteIcon.png"))); // NOI18N
        btnDeleteMaterial.setText("Delete");
        btnDeleteMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMaterialActionPerformed(evt);
            }
        });

        btnAddMaterial.setBackground(new java.awt.Color(129, 87, 154));
        btnAddMaterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAddMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/addIcon.png"))); // NOI18N
        btnAddMaterial.setText("Add");
        btnAddMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMaterialActionPerformed(evt);
            }
        });

        tblMaterials.setBackground(new java.awt.Color(199, 123, 213));
        tblMaterials.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblMaterials.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblMaterials.setForeground(new java.awt.Color(80, 59, 108));
        tblMaterials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Material", "Quantity", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMaterials.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tblMaterials);

        lblDescriptionWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblDescriptionWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(cbxMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnrNumberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbProductName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtProductName)
                                .addComponent(lbProductName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPictureNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnrWorkingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(lblPictureDescriptionWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescriptionWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPictureNameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(spnrWorkingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescriptionWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblPictureDescriptionWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrNumberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProductName1))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int decision = JOptionPane.showConfirmDialog(this,"Are you sure you want to save this product?", "Add Product", JOptionPane.YES_NO_OPTION);
        switch(decision){
            case 0 -> {
            try {
                if(addProduct()){
                    cleanFields();
                    btnSave.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Your changes have been successfully saved!", "Added successfully to your Inventory", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(this, "Something went wrong. Failed to save this product", "Saved failed", JOptionPane.ERROR_MESSAGE);
                }        
            } catch (ParseException ex) {
                Logger.getLogger(PnlInventoryAddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtProductNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductNameMousePressed
        if(!btnSave.isEnabled()){
            validateFields();
        }

    }//GEN-LAST:event_txtProductNameMousePressed

    private void txtProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyReleased

    }//GEN-LAST:event_txtProductNameKeyReleased

    private void txtProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyTyped
        char character = evt.getKeyChar();
        if (!Character.isLetter(character) && (character != KeyEvent.VK_BACK_SPACE && character != KeyEvent.VK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
            pictureWarningProduct();
            lblNameWarning.setText(character + " is not accepted here!");

        } else {
            lblNameWarning.setText("");
            pictureWhiteProduct();
        }
    }//GEN-LAST:event_txtProductNameKeyTyped

    private void txtADescriptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtADescriptionMousePressed
        validateFields();
    }//GEN-LAST:event_txtADescriptionMousePressed

    private void cbxMaterialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMaterialsMouseClicked
        validateFields();
    }//GEN-LAST:event_cbxMaterialsMouseClicked

    private void cbxMaterialsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxMaterialsKeyReleased

    }//GEN-LAST:event_cbxMaterialsKeyReleased

    private void btnDeleteMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMaterialActionPerformed
        deleteMaterialFromProduct();
    }//GEN-LAST:event_btnDeleteMaterialActionPerformed

    private void btnAddMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMaterialActionPerformed
        addMaterialToProduct();
    }//GEN-LAST:event_btnAddMaterialActionPerformed

    private void txtADescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtADescriptionMouseClicked
       validateFields();
    }//GEN-LAST:event_txtADescriptionMouseClicked

    private void spnrNumberMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnrNumberMaterialMouseClicked
        validateFields();
    }//GEN-LAST:event_spnrNumberMaterialMouseClicked

    private void spnrQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnrQuantityMouseClicked
        validateFields();
    }//GEN-LAST:event_spnrQuantityMouseClicked

    private void spnrWorkingTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnrWorkingTimeMouseClicked
        validateFields();
    }//GEN-LAST:event_spnrWorkingTimeMouseClicked

    private void txtADescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescriptionKeyReleased
        validateFields();
    }//GEN-LAST:event_txtADescriptionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMaterial;
    public javax.swing.JButton btnDeleteMaterial;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxMaterials;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbProductName;
    private javax.swing.JLabel lbProductName1;
    private javax.swing.JLabel lbProductName2;
    private javax.swing.JLabel lblDescriptionWarning;
    private javax.swing.JLabel lblNameWarning;
    private javax.swing.JLabel lblPictureDescriptionWarning;
    private javax.swing.JLabel lblPictureNameWarning;
    private javax.swing.JSpinner spnrNumberMaterial;
    private javax.swing.JSpinner spnrQuantity;
    private javax.swing.JSpinner spnrWorkingTime;
    private javax.swing.JTable tblMaterials;
    private javax.swing.JTextArea txtADescription;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
