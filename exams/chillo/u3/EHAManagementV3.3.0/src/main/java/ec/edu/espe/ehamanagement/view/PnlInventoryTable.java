package ec.edu.espe.ehamanagement.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.Inventory;
import ec.edu.espe.ehamanagement.controller.InventoryReportGenerator;
import ec.edu.espe.ehamanagement.model.Product;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class PnlInventoryTable extends javax.swing.JPanel {
    private final MongoCollection productsCollection;
    private final MongoCollection materialsCollection;
    private final MongoCollection userCollection;
    private final DefaultTableModel tableModel;
    private final  ArrayList <Product> readedProducts ;
    /**
     * Creates new form PnlShowFindInformation
     * @param collectionProducts
     * @param collectionMaterials
     * @param collectionUser
     */
    public PnlInventoryTable(MongoCollection collectionProducts, MongoCollection collectionMaterials, MongoCollection collectionUser) {
        initComponents();
        productsCollection = collectionProducts;
        materialsCollection = collectionMaterials;
        userCollection = collectionUser;
        readedProducts = Inventory.readInventory(productsCollection);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Cost");
        tableModel.addColumn("Quantity");
        this.tblInventory.setModel(tableModel);
        btnSearch.setEnabled(false);
        refreshTable();
        txtSearch.setEnabled(true);
        btnSearch.setEnabled(false);
        tblInventory.setEnabled(false);
    }
    
    private void initPnlInventoryUpdateAndDeleteProduct(int id){
        PnlInventoryUpdateAndDeleteProduct.setIdToUpdate(id);
        PnlInventoryUpdateAndDeleteProduct pnlInventoryUpdateAndDeleleProduct = new PnlInventoryUpdateAndDeleteProduct(productsCollection, materialsCollection, userCollection);
        pnlInventoryUpdateAndDeleleProduct.setSize(713,528);
        pnlInventoryUpdateAndDeleleProduct.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(pnlInventoryUpdateAndDeleleProduct, pnlInventoryUpdateAndDeleleProduct);
        pnlContent.revalidate();
        pnlContent.repaint();
        
    }
    
    private void cleanTable() {
        int row = tblInventory.getRowCount();
        for (int i = row - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    }
    private void refreshTable(){
        ArrayList <Product> stockOrders =  InventoryReportGenerator.filterProducts(readedProducts, "stock");
        ArrayList <Product> shortageOrders = InventoryReportGenerator.filterProducts(readedProducts, "shortage");
        if(!readedProducts.isEmpty()){
            if (rbtnAllProducts.isSelected()) {
                cleanTable();
                lblTableTitle.setText("All Products");
                fillTable(readedProducts);
            } else if (rbtnProductsStock.isSelected()) {
                lblTableTitle.setText("Products in Stock");
                cleanTable();
                fillTable( stockOrders);
            } else if (rbtnProductsInShortage.isSelected()) {
                lblTableTitle.setText("Products in Shortage");
                cleanTable();
                fillTable(shortageOrders);
            }
        }else{
            JOptionPane.showMessageDialog(this, "There´s no products in your inventory", "Empty Inventory", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
     private void fillTable(ArrayList <Product> products){
        for(Product product: products){
                String[] information = new String[4];
                information[0]= String.valueOf(product.getId());
                information[1] = product.getName();
                information [2] = String.valueOf(product.getProductionCost());
                information [3] = String.valueOf(product.getQuantity());
                tableModel.addRow(information);
            }
    }
    
    

    private void validateFields() {

        if (!txtSearch.getText().isEmpty() && !txtSearch.getText().equals("Search...")) {
            btnSearch.setEnabled(true);
        } else {
            btnSearch.setEnabled(false);
        }
    }
    private void pictureWarningSearch() {
        lblPictureWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblPictureWarning.setText("");
    }

    public void pictureWhiteSearch() {
        lblPictureWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblPictureWarning.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupProducts = new javax.swing.ButtonGroup();
        btnGroupSearch = new javax.swing.ButtonGroup();
        pnlContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        rbtnAllProducts = new javax.swing.JRadioButton();
        rbtnProductsStock = new javax.swing.JRadioButton();
        rbtnProductsInShortage = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblTableTitle = new javax.swing.JLabel();
        rbtnByID = new javax.swing.JRadioButton();
        rbtnByName = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSearch = new javax.swing.JButton();
        lblPictureWarning = new javax.swing.JLabel();
        lblTextWarning = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        tblInventory.setBackground(new java.awt.Color(199, 123, 213));
        tblInventory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblInventory.setForeground(new java.awt.Color(80, 59, 108));
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
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
        tblInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblInventory.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tblInventory);

        rbtnAllProducts.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupProducts.add(rbtnAllProducts);
        rbtnAllProducts.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtnAllProducts.setSelected(true);
        rbtnAllProducts.setText("All Products");
        rbtnAllProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAllProductsActionPerformed(evt);
            }
        });

        rbtnProductsStock.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupProducts.add(rbtnProductsStock);
        rbtnProductsStock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtnProductsStock.setText("Products in stock");
        rbtnProductsStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnProductsStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProductsStockActionPerformed(evt);
            }
        });

        rbtnProductsInShortage.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupProducts.add(rbtnProductsInShortage);
        rbtnProductsInShortage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtnProductsInShortage.setText("Products in shortage");
        rbtnProductsInShortage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnProductsInShortage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProductsInShortageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");

        lblTableTitle.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTableTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTableTitle.setText("All Products");

        rbtnByID.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupSearch.add(rbtnByID);
        rbtnByID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnByID.setSelected(true);
        rbtnByID.setText("By ID");
        rbtnByID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnByID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnByIDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnByIDMousePressed(evt);
            }
        });
        rbtnByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnByIDActionPerformed(evt);
            }
        });

        rbtnByName.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupSearch.add(rbtnByName);
        rbtnByName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnByName.setText("By Name");
        rbtnByName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnByName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnByNameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnByNameMousePressed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setText("Search...");
        txtSearch.setBorder(null);
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSearchMousePressed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        btnSearch.setBackground(new java.awt.Color(129, 87, 154));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTextWarning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblTextWarning.setForeground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product");

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTableTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addComponent(rbtnAllProducts)
                                .addGap(31, 31, 31)
                                .addComponent(rbtnProductsStock)
                                .addGap(33, 33, 33)
                                .addComponent(rbtnProductsInShortage)
                                .addGap(55, 55, 55))
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnByID)
                                    .addComponent(rbtnByName))
                                .addGap(33, 33, 33)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPictureWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTextWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTableTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnProductsStock)
                    .addComponent(rbtnProductsInShortage)
                    .addComponent(rbtnAllProducts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31))
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(rbtnByID)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTextWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPictureWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbtnByName))
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnByIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnByIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = txtSearch.getText();
        if (rbtnByID.isSelected() && Inventory.existsProduct(productsCollection, "id", Integer.valueOf(search))) {
            int id;
            id = Integer.valueOf(search);
            initPnlInventoryUpdateAndDeleteProduct(id);
  
        } else if (rbtnByName.isSelected() && Inventory.existsProduct(productsCollection, "name", search)) {
            int id;
            id = Integer.parseInt(String.valueOf(Inventory.getValueFromProduct(productsCollection, "name",search,"id")));
            initPnlInventoryUpdateAndDeleteProduct(id);
        } else {
            JOptionPane.showMessageDialog(this, "Product not found", "Search failed", JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        
    }//GEN-LAST:event_btnSearchMouseClicked

    private void txtSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMousePressed
        if (txtSearch.getText().equals("Search...")) {
            txtSearch.setText("");
        }

    }//GEN-LAST:event_txtSearchMousePressed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char character = evt.getKeyChar();
        if (txtSearch.getText().equals("Search...")) {
            lblTextWarning.setText(" requiered to search");
            pictureWarningSearch();
        }else{
            if (rbtnByName.isSelected() && !Character.isLetter(character) && (character != KeyEvent.VK_BACK_SPACE && character != KeyEvent.VK_SPACE)) 
            {
                evt.consume();
                pictureWarningSearch();
                lblTextWarning.setText(character + " is not accepted here!");
            }else{
                if (rbtnByID.isSelected() && !Character.isDigit(character) && (character != KeyEvent.VK_BACK_SPACE )) {
                    evt.consume();
                    pictureWarningSearch();
                    lblTextWarning.setText(character + " is not accepted here!");
                }else{

                    lblTextWarning.setText("");
                    pictureWhiteSearch();

                }
            }
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        validateFields();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void rbtnByIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnByIDMouseClicked
        txtSearch.setText("Search...");
        if (txtSearch.getText().equals("Search...")||txtSearch.getText().equals("")) {
            lblTextWarning.setText(" requiered to search");
            pictureWarningSearch();
        } else {
            lblTextWarning.setText("");
        }
    }//GEN-LAST:event_rbtnByIDMouseClicked

    private void rbtnByIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnByIDMousePressed
        txtSearch.setText("Search...");
        if (txtSearch.getText().isEmpty()) {
            txtSearch.setText("Search...");
        }
    }//GEN-LAST:event_rbtnByIDMousePressed

    private void rbtnByNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnByNameMouseClicked
        txtSearch.setText("Search...");
        if (txtSearch.getText().equals("Search...")) {
            lblTextWarning.setText(" requiered to search");
            pictureWarningSearch();
        } else {
            lblTextWarning.setText("");
        }
    }//GEN-LAST:event_rbtnByNameMouseClicked

    private void rbtnByNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnByNameMousePressed
        txtSearch.setText("Search...");
        if (txtSearch.getText().isEmpty()) {
            txtSearch.setText("Search...");
        }
    }//GEN-LAST:event_rbtnByNameMousePressed

    private void rbtnProductsInShortageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProductsInShortageActionPerformed
        refreshTable();
    }//GEN-LAST:event_rbtnProductsInShortageActionPerformed

    private void rbtnProductsStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProductsStockActionPerformed
         refreshTable();
    }//GEN-LAST:event_rbtnProductsStockActionPerformed

    private void rbtnAllProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAllProductsActionPerformed
         refreshTable();
    }//GEN-LAST:event_rbtnAllProductsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupSearch;
    private javax.swing.ButtonGroup btnGrupProducts;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPictureWarning;
    private javax.swing.JLabel lblTableTitle;
    private javax.swing.JLabel lblTextWarning;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JRadioButton rbtnAllProducts;
    private javax.swing.JRadioButton rbtnByID;
    private javax.swing.JRadioButton rbtnByName;
    private javax.swing.JRadioButton rbtnProductsInShortage;
    private javax.swing.JRadioButton rbtnProductsStock;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
