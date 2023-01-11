package ec.edu.espe.ehamanagement.view;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class EHAManagement extends javax.swing.JFrame {

    /**
     * Creates new form EHAManagement
     */
    public EHAManagement() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        mnuEHAManagement = new javax.swing.JMenuBar();
        itmQuit = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuProfile = new javax.swing.JMenu();
        itmProfileView = new javax.swing.JMenuItem();
        itmUpdateProfile = new javax.swing.JMenuItem();
        mnuInventory = new javax.swing.JMenu();
        itmProductsList = new javax.swing.JMenuItem();
        itmSearchProduct = new javax.swing.JMenuItem();
        itmAddProduct = new javax.swing.JMenuItem();
        itmUpdateProduct = new javax.swing.JMenuItem();
        itmDeleteProduct = new javax.swing.JMenuItem();
        mnuAgenda = new javax.swing.JMenu();
        itmOrdersList = new javax.swing.JMenuItem();
        itmSearchOrder = new javax.swing.JMenuItem();
        itmAddOrder = new javax.swing.JMenuItem();
        itmUpdateOrder = new javax.swing.JMenuItem();
        itmDeleteOrder = new javax.swing.JMenuItem();
        mnuMaterialsOrganizer = new javax.swing.JMenu();
        itmMaterialsList = new javax.swing.JMenuItem();
        itmSearchMaterial = new javax.swing.JMenuItem();
        itmAddMaterial = new javax.swing.JMenuItem();
        itmDeleteMaterial = new javax.swing.JMenuItem();
        itmUpdateMaterial = new javax.swing.JMenuItem();
        mnuReports = new javax.swing.JMenu();
        mnuInventoryReport = new javax.swing.JMenu();
        itmProductsInStock = new javax.swing.JMenuItem();
        itmProductsInShortage = new javax.swing.JMenuItem();
        mnuAgendaReport = new javax.swing.JMenu();
        itmPendingOrders = new javax.swing.JMenuItem();
        itmCompletedOrders = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entre Hilos & Algodón Management Software");

        jPanel1.setBackground(new java.awt.Color(246, 211, 227));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Creator: Nahir Carrera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170))
        );

        itmQuit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itmQuit.setText("Entre Hilos & Algodón MS");

        itmAbout.setText("About");
        itmAbout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        itmQuit.add(itmAbout);

        jMenuItem1.setText("Quit");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itmQuit.add(jMenuItem1);

        mnuEHAManagement.add(itmQuit);

        mnuProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuProfile.setText("Profile");

        itmProfileView.setText("Profile view");
        mnuProfile.add(itmProfileView);

        itmUpdateProfile.setText("Update profile");
        mnuProfile.add(itmUpdateProfile);

        mnuEHAManagement.add(mnuProfile);

        mnuInventory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuInventory.setText("Inventory");

        itmProductsList.setText("Inventory - Products List");
        mnuInventory.add(itmProductsList);

        itmSearchProduct.setText("Search Product");
        mnuInventory.add(itmSearchProduct);

        itmAddProduct.setText("Add Product");
        mnuInventory.add(itmAddProduct);

        itmUpdateProduct.setText("Update Product");
        mnuInventory.add(itmUpdateProduct);

        itmDeleteProduct.setText("Delete Product");
        mnuInventory.add(itmDeleteProduct);

        mnuEHAManagement.add(mnuInventory);

        mnuAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuAgenda.setText("Agenda");

        itmOrdersList.setText("Agenda - Orders List");
        mnuAgenda.add(itmOrdersList);

        itmSearchOrder.setText("Search Order");
        mnuAgenda.add(itmSearchOrder);

        itmAddOrder.setText("Add Order");
        mnuAgenda.add(itmAddOrder);

        itmUpdateOrder.setText("Update Order");
        mnuAgenda.add(itmUpdateOrder);

        itmDeleteOrder.setText("Delete Order");
        mnuAgenda.add(itmDeleteOrder);

        mnuEHAManagement.add(mnuAgenda);

        mnuMaterialsOrganizer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuMaterialsOrganizer.setText("Materials Organizer");

        itmMaterialsList.setText("Organizar - Materials List");
        mnuMaterialsOrganizer.add(itmMaterialsList);

        itmSearchMaterial.setText("Search Material");
        mnuMaterialsOrganizer.add(itmSearchMaterial);

        itmAddMaterial.setText("Add Material");
        mnuMaterialsOrganizer.add(itmAddMaterial);

        itmDeleteMaterial.setText("Delete Material");
        mnuMaterialsOrganizer.add(itmDeleteMaterial);

        itmUpdateMaterial.setText("Update Material");
        mnuMaterialsOrganizer.add(itmUpdateMaterial);

        mnuEHAManagement.add(mnuMaterialsOrganizer);

        mnuReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuReports.setText("Reports");

        mnuInventoryReport.setText("Inventory Report");

        itmProductsInStock.setText("Products in stock");
        mnuInventoryReport.add(itmProductsInStock);

        itmProductsInShortage.setText("Products in shortage");
        mnuInventoryReport.add(itmProductsInShortage);

        mnuReports.add(mnuInventoryReport);

        mnuAgendaReport.setText("Agenda Report");

        itmPendingOrders.setText("Pending Orders");
        mnuAgendaReport.add(itmPendingOrders);

        itmCompletedOrders.setText("Completed Orders");
        mnuAgendaReport.add(itmCompletedOrders);

        mnuReports.add(mnuAgendaReport);

        mnuEHAManagement.add(mnuReports);

        mnuHelp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuHelp.setText("Help");

        jMenuItem15.setText("Report issue");
        mnuHelp.add(jMenuItem15);

        mnuEHAManagement.add(mnuHelp);

        setJMenuBar(mnuEHAManagement);

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

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        FrmAbout frmAbout;
        frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        EHAManagement frmEHAManagement;
        frmEHAManagement = new EHAManagement();
        frmEHAManagement.itmAbout.setEnabled(false);
    }//GEN-LAST:event_itmAboutActionPerformed

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
            java.util.logging.Logger.getLogger(EHAManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EHAManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EHAManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EHAManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EHAManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmAddMaterial;
    private javax.swing.JMenuItem itmAddOrder;
    private javax.swing.JMenuItem itmAddProduct;
    private javax.swing.JMenuItem itmCompletedOrders;
    private javax.swing.JMenuItem itmDeleteMaterial;
    private javax.swing.JMenuItem itmDeleteOrder;
    private javax.swing.JMenuItem itmDeleteProduct;
    private javax.swing.JMenuItem itmMaterialsList;
    private javax.swing.JMenuItem itmOrdersList;
    private javax.swing.JMenuItem itmPendingOrders;
    private javax.swing.JMenuItem itmProductsInShortage;
    private javax.swing.JMenuItem itmProductsInStock;
    private javax.swing.JMenuItem itmProductsList;
    private javax.swing.JMenuItem itmProfileView;
    private javax.swing.JMenu itmQuit;
    private javax.swing.JMenuItem itmSearchMaterial;
    private javax.swing.JMenuItem itmSearchOrder;
    private javax.swing.JMenuItem itmSearchProduct;
    private javax.swing.JMenuItem itmUpdateMaterial;
    private javax.swing.JMenuItem itmUpdateOrder;
    private javax.swing.JMenuItem itmUpdateProduct;
    private javax.swing.JMenuItem itmUpdateProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuAgenda;
    private javax.swing.JMenu mnuAgendaReport;
    private javax.swing.JMenuBar mnuEHAManagement;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuInventory;
    private javax.swing.JMenu mnuInventoryReport;
    private javax.swing.JMenu mnuMaterialsOrganizer;
    private javax.swing.JMenu mnuProfile;
    private javax.swing.JMenu mnuReports;
    // End of variables declaration//GEN-END:variables
}
