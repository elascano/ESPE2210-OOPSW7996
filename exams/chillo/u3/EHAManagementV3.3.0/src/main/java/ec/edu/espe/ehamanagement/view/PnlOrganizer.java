
package ec.edu.espe.ehamanagement.view;

import com.mongodb.client.MongoCollection;
import java.awt.BorderLayout;


/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class PnlOrganizer extends javax.swing.JPanel {
  
    private final MongoCollection materialsCollection;
    
    /**
     * Creates new form PnlAgend
     * @param collection
     */
    public PnlOrganizer(MongoCollection collection) {
        materialsCollection = collection;
        initComponents();
        initOrganizerTable();
    }
    
    private void initOrganizerTable(){
        PnlOrganizerTable pnlOrganizerTable = new PnlOrganizerTable(materialsCollection);
        pnlOrganizerTable.setSize(747,523);
        pnlOrganizerTable.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(pnlOrganizerTable,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
        
    }
    
    private void iniOrganizerAddMaterial(){
        PnlOrganizerAddNewMaterial pnlOrganizerAddNewMaterial = new PnlOrganizerAddNewMaterial(materialsCollection);
        pnlOrganizerAddNewMaterial.setSize(713,518);
        pnlOrganizerAddNewMaterial.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(pnlOrganizerAddNewMaterial,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
         
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
        pnlContent = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAddMaterial = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(52, 122, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORGANIZER MENU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(52, 122, 52));
        jPanel4.setForeground(new java.awt.Color(17, 39, 75));
        jPanel4.setToolTipText("");

        btnAddMaterial.setBackground(new java.awt.Color(112, 172, 61));
        btnAddMaterial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/add_1.png"))); // NOI18N
        btnAddMaterial.setText("Add Material");
        btnAddMaterial.setBorder(null);
        btnAddMaterial.setBorderPainted(false);
        btnAddMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddMaterial.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddMaterial.setIconTextGap(13);
        btnAddMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMaterialMouseClicked(evt);
            }
        });
        btnAddMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMaterialActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(112, 172, 61));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/back.png"))); // NOI18N
        btnBack.setText("Back to Organizer");
        btnBack.setToolTipText("Back to Materials Organizer Table");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBack.setIconTextGap(16);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked

    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        initOrganizerTable();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMaterialActionPerformed
        iniOrganizerAddMaterial();
    }//GEN-LAST:event_btnAddMaterialActionPerformed

    private void btnAddMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMaterialMouseClicked
        
    }//GEN-LAST:event_btnAddMaterialMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMaterial;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}