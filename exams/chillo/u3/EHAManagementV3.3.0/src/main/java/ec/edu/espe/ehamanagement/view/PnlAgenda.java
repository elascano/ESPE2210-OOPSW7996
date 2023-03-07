package ec.edu.espe.ehamanagement.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.PnlAgendaController;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class PnlAgenda extends javax.swing.JPanel {
    private final MongoCollection ordersCollection;
    /**
     * Creates new form PnlAgendaMenuOption
     * @param collection
     */
    public PnlAgenda(MongoCollection collection) {
        initComponents();
        ordersCollection = collection;
        PnlAgendaController.initPnlAgendaTable(this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrOrderTables = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btnAddOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnlWindow = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(980, 629));
        setPreferredSize(new java.awt.Dimension(980, 629));
        setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(126, 53, 2));
        jPanel2.setToolTipText("");

        btnAddOrder.setBackground(new java.awt.Color(183, 96, 9));
        btnAddOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/add.png"))); // NOI18N
        btnAddOrder.setText("Add Order");
        btnAddOrder.setBorder(null);
        btnAddOrder.setBorderPainted(false);
        btnAddOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOrderMouseClicked(evt);
            }
        });
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(183, 96, 9));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/back.png"))); // NOI18N
        btnBack.setText("Back to Agenda");
        btnBack.setToolTipText("Back to Agenda Table");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(126, 53, 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGENDA MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(126, 53, 2));
        jPanel4.setMaximumSize(new java.awt.Dimension(450, 32767));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlWindow.setBackground(new java.awt.Color(255, 255, 255));
        pnlWindow.setPreferredSize(new java.awt.Dimension(714, 523));

        javax.swing.GroupLayout pnlWindowLayout = new javax.swing.GroupLayout(pnlWindow);
        pnlWindow.setLayout(pnlWindowLayout);
        pnlWindowLayout.setHorizontalGroup(
            pnlWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlWindowLayout.setVerticalGroup(
            pnlWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(844, 844, 844)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PnlAgendaController.initPnlAgendaTable(this);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
       
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        PnlAgendaController.initPnlNewOrder(this);
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnAddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrderMouseClicked
        PnlAgendaController.initPnlNewOrder(this);
    }//GEN-LAST:event_btnAddOrderMouseClicked

    public MongoCollection getOrdersCollection() {
        return ordersCollection;
    }

    public ButtonGroup getBtnGrOrderTables() {
        return BtnGrOrderTables;
    }

    public JButton getBtnAddOrder() {
        return btnAddOrder;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public JPanel getPnlWindow() {
        return pnlWindow;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnGrOrderTables;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel pnlWindow;
    // End of variables declaration//GEN-END:variables
}