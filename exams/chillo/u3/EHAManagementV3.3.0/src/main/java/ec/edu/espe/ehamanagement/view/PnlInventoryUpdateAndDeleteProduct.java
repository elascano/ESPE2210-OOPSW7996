
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
public class PnlInventoryUpdateAndDeleteProduct extends javax.swing.JPanel {
    private static int idToUpdate;
    private final MongoCollection productsCollection;
    private final MongoCollection materialsCollection;
    private final MongoCollection userCollection;
    private final DefaultTableModel tableModel;
    private DefaultComboBoxModel comboModel;
    /**
     * Creates new form PnlMenu
     * @param collectionProducts
     * @param collectionMaterials
     * @param collectionUser
     */
    
    public PnlInventoryUpdateAndDeleteProduct(MongoCollection collectionProducts, MongoCollection collectionMaterials, MongoCollection collectionUser) {
        initComponents();
        productsCollection = collectionProducts;
        materialsCollection = collectionMaterials;
        userCollection = collectionUser;
        btnSave.setEnabled(false);
        tableModel =  new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }};
        tableModel.addColumn("ID");
        tableModel.addColumn("Material");
        tableModel.addColumn("Quantity");
        this.tblMaterials.setModel(tableModel);
        txtADescription.setLineWrap(true);
        txtADescription.setWrapStyleWord(true);
        openFields(false);
        updateCbxMaterials();
        writeFields();
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
    

    private boolean updateProduct(){
        String productsName;
        String newName;
        
        Product productToUpdate = createProductToUpdate();
        productsName = (String) Inventory.getValueFromProduct(productsCollection, "id", idToUpdate, "name");
        newName = productToUpdate.getName();
        
        lblProductionCost.setText(String.valueOf(productToUpdate.getProductionCost()));
        if(Inventory.existsProduct(productsCollection,"name",productToUpdate.getName())){
            if(productsName.equals(newName)){
                return Inventory.updateProduct(productsCollection,productToUpdate);
            }else{
                JOptionPane.showMessageDialog(this, "There's already a product in your inventory named: "+ productToUpdate.getName(), "Saved failed", JOptionPane.ERROR_MESSAGE); 
                return false;
            }
        }else{
            return Inventory.updateProduct(productsCollection,productToUpdate);
        }
    }
    
    private Product createProductToUpdate(){
        String name = txtProductName.getText();
        float productionCost = 0.0F;
        String description = txtADescription.getText();
        int workingTime = (int) spnrWorkingTime.getValue();
        int quantity = (int) spnrQuantity.getValue();
        ArrayList materialsIds = getTableInfo("id", 0);
        ArrayList materialsQuantities = getTableInfo("quantity", 2);
        HashMap materials = DictionaryConversor.convertToDictionary(materialsIds, materialsQuantities);
        Product productToAdd;
        productToAdd = new Product(getIdToUpdate(), name, productionCost, description, materials, workingTime, quantity);
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
    
    
    
    private int findMaterialId(String material){
        int id  = Integer.parseInt(String.valueOf(MaterialsOrganizer.getValueFromMaterial(materialsCollection, "name", material, "id")));
        return id;
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
    
    private boolean deleteProduct(){
           return Inventory.deleteProduct(productsCollection, getIdToUpdate());
    }
    public void validateFields() {
        if (txtProductName.getText().isEmpty()) {
            lblNameWarning.setText("This Field is required");
            pictureWarningProduct();
        } else {
            lblNameWarning.setText("");
            pictureWhiteProduct();
        }
        if (txtADescription.getText().isEmpty()) {
            lblDescriptionWarning.setText("This Field is required");
            pictureWarningArea();
        }else {
            lblDescriptionWarning.setText("");
            pictureWhiteArea();
        }
        if(txtProductName.getText().isEmpty() || txtADescription.getText().isEmpty()){
            btnSave.setEnabled(false);
        }else{
            btnSave.setEnabled(true);
        }
    }
    
    private void writeFields(){
        String name = (String) Inventory.getValueFromProduct(productsCollection, "id", getIdToUpdate(),"name");
        int quantity = Integer.valueOf(String.valueOf(Inventory.getValueFromProduct(productsCollection, "id", getIdToUpdate(),"quantity")));
        int workingTime = Integer.valueOf(String.valueOf(Inventory.getValueFromProduct(productsCollection,"id", getIdToUpdate(),"workingTime")));
        String description = (String) Inventory.getValueFromProduct(productsCollection,"id", getIdToUpdate(),"description");
        String productionCost = String.valueOf(Inventory.getValueFromProduct(productsCollection,"id", getIdToUpdate(),"cost"));
        ArrayList <Integer> materialsIds = (ArrayList <Integer>) Inventory.getValueFromProduct(productsCollection,"id", getIdToUpdate(),"materialsIds");
        ArrayList <Float> materialsQuantities = (ArrayList <Float>) Inventory.getValueFromProduct(productsCollection, "id", getIdToUpdate(), "materialsQuantities");
        
        txtProductName.setText(name);
        spnrQuantity.setValue(quantity);
        spnrWorkingTime.setValue(workingTime);
        txtADescription.setText(description);
        lblProductionCost.setText(productionCost);
        
        for (int i = 0; i < materialsIds.size(); i++){
            int id = materialsIds.get(i);
            String[] information = new String[3];
            information[0] = String.valueOf(id);
            information[1] = String.valueOf(Inventory.getValueFromProduct(materialsCollection,"id",id, "name"));
            information[2] = String.valueOf(materialsQuantities.get(i));
            tableModel.addRow(information);
        }
    }
    
    private void openFields(boolean active){
           txtProductName.setEditable(active);
           spnrQuantity.setEnabled(active);
           spnrWorkingTime.setEnabled(active);
           txtADescription.setEditable(active);
           cbxMaterials.setEnabled(active);
           spnrNumberMaterial.setEnabled(active);
           btnAddMaterial.setEnabled(active);
           btnDeleteMaterial.setEnabled(active);
           btnUpdate.setEnabled(!active); 
           tblMaterials.setCellSelectionEnabled(!active);
    }
    
    public void pictureWarningProduct() {
        lblPictureNameWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png")));

        lblPictureNameWarning.setText("");

    }

    public void pictureWhiteProduct() {
        lblPictureNameWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblPictureNameWarning.setText("");
    }

    public void pictureWarningArea() {
        lblPictureDescriptionWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblPictureDescriptionWarning.setText("");

    }

    public void pictureWhiteArea() {
        lblPictureDescriptionWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblPictureDescriptionWarning.setText("");
    }
    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        lbProductName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnrWorkingTime = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxMaterials = new javax.swing.JComboBox<>();
        spnrNumberMaterial = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterials = new javax.swing.JTable();
        btnAddMaterial = new javax.swing.JButton();
        btnDeleteMaterial = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lbWorkingTime = new javax.swing.JLabel();
        lbQuantity = new javax.swing.JLabel();
        lblSearchProduct = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblWriteTextArea = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblPictureNameWarning = new javax.swing.JLabel();
        lblNameWarning = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblProductionCost = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbProductName1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtADescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblPictureDescriptionWarning = new javax.swing.JLabel();
        lblDescriptionWarning = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnrQuantity = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        lbProductName.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbProductName.setText("Product's Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Working time: Hours");

        spnrWorkingTime.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnrWorkingTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbxMaterials.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        jScrollPane2.setViewportView(tblMaterials);

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

        btnSave.setBackground(new java.awt.Color(129, 87, 154));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
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

        lbWorkingTime.setBackground(new java.awt.Color(51, 204, 0));
        lbWorkingTime.setForeground(new java.awt.Color(102, 255, 0));

        lbQuantity.setBackground(new java.awt.Color(51, 204, 0));
        lbQuantity.setForeground(new java.awt.Color(102, 255, 0));

        lblWriteTextArea.setText("zcxczxczxcxzcxzcxzc");

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

        jPanel1.setBackground(new java.awt.Color(80, 59, 108));

        btnUpdate.setBackground(new java.awt.Color(199, 123, 213));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(199, 123, 213));
        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
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
                .addGap(52, 52, 52)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        lblNameWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblNameWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jPanel2.setBackground(new java.awt.Color(80, 59, 108));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cost: $");

        lblProductionCost.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblProductionCost.setForeground(new java.awt.Color(255, 255, 255));
        lblProductionCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductionCost.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductionCost, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblProductionCost))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/product.png"))); // NOI18N

        lbProductName1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbProductName1.setText("Materials");

        txtADescription.setBackground(new java.awt.Color(255, 255, 255));
        txtADescription.setColumns(20);
        txtADescription.setForeground(new java.awt.Color(80, 59, 108));
        txtADescription.setRows(5);
        txtADescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 59, 108), 2, true));
        txtADescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtADescriptionMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtADescription);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Description:");

        lblDescriptionWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblDescriptionWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setText("Quantity: Units");

        spnrQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnrQuantity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel5))
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                                .addComponent(cbxMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnrNumberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPictureDescriptionWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescriptionWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                                .addComponent(btnAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbProductName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtProductName)
                                            .addComponent(lbProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnlContentLayout.createSequentialGroup()
                                                .addComponent(lblPictureNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spnrWorkingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(spnrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbWorkingTime)))
                                .addGap(2, 2, 2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addGap(235, 235, 235)
                        .addComponent(lblWriteTextArea)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(lblSearchProduct))
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(lbQuantity)))))
                .addGap(76, 76, 76))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbProductName))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnlContentLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblNameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbWorkingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblPictureNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(lblWriteTextArea)))
                                .addGap(104, 104, 104)
                                .addComponent(lblSearchProduct)
                                .addGap(22, 22, 22)
                                .addComponent(lbQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(spnrWorkingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblPictureDescriptionWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                            .addComponent(lblDescriptionWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnrNumberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProductName1))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        int decision = JOptionPane.showConfirmDialog(this,"Are you sure you want to update this product?", "Update Product", JOptionPane.YES_NO_OPTION);
        switch(decision){
            case 0 -> {
                if(updateProduct()){
                    JOptionPane.showMessageDialog(this, "Your changes have been successfully saved!", "Updated successfully", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(this, "Something went wrong. Failed to save you changes in this product", "Updated failed", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMaterialActionPerformed
        deleteMaterialFromProduct();
    }//GEN-LAST:event_btnDeleteMaterialActionPerformed

    private void cbxMaterialsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxMaterialsKeyReleased

    }//GEN-LAST:event_cbxMaterialsKeyReleased

    private void cbxMaterialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMaterialsMouseClicked

    }//GEN-LAST:event_cbxMaterialsMouseClicked

    private void txtProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyReleased
    
    }//GEN-LAST:event_txtProductNameKeyReleased

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked

    }//GEN-LAST:event_btnUpdateMouseClicked

   
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        openFields(true);
        validateFields();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int decision = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this order?", "Delete Order", JOptionPane.YES_NO_OPTION);
        switch (decision){
            case 0 -> {
            if(deleteProduct()){
                openFields(false);
                btnUpdate.setEnabled(false);
                btnSave.setEnabled(false);
                btnDeleteMaterial.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Order deleted successfully!", "Deleted successfully", JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtProductNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductNameMousePressed
        if(!btnUpdate.isEnabled()){
            validateFields();
        }
        
    }//GEN-LAST:event_txtProductNameMousePressed

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

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
    
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void txtADescriptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtADescriptionMousePressed

    }//GEN-LAST:event_txtADescriptionMousePressed

    private void btnAddMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMaterialActionPerformed
        addMaterialToProduct();
    }//GEN-LAST:event_btnAddMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMaterial;
    private javax.swing.JButton btnDelete;
    public javax.swing.JButton btnDeleteMaterial;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxMaterials;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbProductName;
    private javax.swing.JLabel lbProductName1;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbWorkingTime;
    private javax.swing.JLabel lblDescriptionWarning;
    private javax.swing.JLabel lblNameWarning;
    private javax.swing.JLabel lblPictureDescriptionWarning;
    private javax.swing.JLabel lblPictureNameWarning;
    private javax.swing.JLabel lblProductionCost;
    private javax.swing.JLabel lblSearchProduct;
    private javax.swing.JLabel lblWriteTextArea;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JSpinner spnrNumberMaterial;
    private javax.swing.JSpinner spnrQuantity;
    private javax.swing.JSpinner spnrWorkingTime;
    private javax.swing.JTable tblMaterials;
    private javax.swing.JTextArea txtADescription;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables

 
}
