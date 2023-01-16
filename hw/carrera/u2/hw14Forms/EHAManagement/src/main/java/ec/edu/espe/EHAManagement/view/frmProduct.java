/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.EHAManagement.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class frmProduct extends javax.swing.JFrame {

    /**
     * Creates new form frmProduct
     */
    public frmProduct() {
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

        pnlInput = new javax.swing.JPanel();
        lblProduct = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        spnrQuantity = new javax.swing.JSpinner();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescription = new javax.swing.JTextArea();
        lblWorkingTime = new javax.swing.JLabel();
        lblMaterials = new javax.swing.JLabel();
        cmbMaterials = new javax.swing.JComboBox<>();
        spnrMaterial = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAMaterials = new javax.swing.JTextArea();
        btnAddMaterial = new javax.swing.JButton();
        sldrWorkingTime = new javax.swing.JSlider();
        pnlButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInput.setBackground(new java.awt.Color(255, 255, 255));
        pnlInput.setForeground(new java.awt.Color(0, 0, 0));
        pnlInput.setToolTipText("");

        lblProduct.setBackground(new java.awt.Color(246, 211, 227));
        lblProduct.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        lblProduct.setForeground(new java.awt.Color(232, 123, 167));
        lblProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduct.setText("New Product");
        lblProduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 123, 167), 2, true));

        lblText.setBackground(new java.awt.Color(199, 206, 234));
        lblText.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblText.setForeground(new java.awt.Color(237, 136, 177));
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setLabelFor(txtName);
        lblText.setText("Name");
        lblText.setToolTipText("");
        lblText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 152, 194), 2, true));
        lblText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtName.setBackground(new java.awt.Color(246, 211, 227));
        txtName.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setToolTipText("Product's name");
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(131, 217, 220));
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");
        lblQuantity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 217, 220), 2, true));

        spnrQuantity.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        spnrQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spnrQuantity.setBorder(null);
        spnrQuantity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblDescription.setBackground(new java.awt.Color(255, 255, 255));
        lblDescription.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(201, 151, 198));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Description");
        lblDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 151, 198), 2, true));

        txtADescription.setBackground(new java.awt.Color(219, 193, 218));
        txtADescription.setColumns(20);
        txtADescription.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txtADescription.setForeground(new java.awt.Color(255, 255, 255));
        txtADescription.setRows(5);
        txtADescription.setBorder(null);
        jScrollPane1.setViewportView(txtADescription);

        lblWorkingTime.setBackground(new java.awt.Color(255, 255, 255));
        lblWorkingTime.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblWorkingTime.setForeground(new java.awt.Color(186, 219, 158));
        lblWorkingTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorkingTime.setText("Working Time");
        lblWorkingTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 219, 158), 2, true));

        lblMaterials.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblMaterials.setForeground(new java.awt.Color(169, 188, 229));
        lblMaterials.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaterials.setText("Used Materials");
        lblMaterials.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 188, 229), 2, true));

        cmbMaterials.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material1", "Material 2", "Material 3", "Material 4" }));

        spnrMaterial.setModel(new javax.swing.SpinnerNumberModel(0.1f, 0.1f, null, 0.1f));
        spnrMaterial.setBorder(null);

        txtAMaterials.setBackground(new java.awt.Color(222, 228, 242));
        txtAMaterials.setColumns(10);
        txtAMaterials.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txtAMaterials.setForeground(new java.awt.Color(255, 255, 255));
        txtAMaterials.setRows(5);
        txtAMaterials.setToolTipText("Materials List");
        txtAMaterials.setBorder(null);
        jScrollPane2.setViewportView(txtAMaterials);

        btnAddMaterial.setBackground(new java.awt.Color(143, 163, 212));
        btnAddMaterial.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnAddMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMaterial.setText("Add +");

        sldrWorkingTime.setBackground(new java.awt.Color(255, 255, 255));
        sldrWorkingTime.setForeground(new java.awt.Color(186, 219, 158));
        sldrWorkingTime.setMajorTickSpacing(1);
        sldrWorkingTime.setMaximum(10);
        sldrWorkingTime.setMinorTickSpacing(1);
        sldrWorkingTime.setPaintLabels(true);
        sldrWorkingTime.setPaintTicks(true);
        sldrWorkingTime.setSnapToTicks(true);

        javax.swing.GroupLayout pnlInputLayout = new javax.swing.GroupLayout(pnlInput);
        pnlInput.setLayout(pnlInputLayout);
        pnlInputLayout.setHorizontalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputLayout.createSequentialGroup()
                                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInputLayout.createSequentialGroup()
                                .addComponent(lblWorkingTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sldrWorkingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInputLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(spnrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                        .addComponent(btnAddMaterial)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                                    .addComponent(cmbMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(spnrMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlInputLayout.setVerticalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblProduct)
                .addGap(12, 12, 12)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity)
                    .addComponent(cmbMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddMaterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescription)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sldrWorkingTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWorkingTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlButtons.setBackground(new java.awt.Color(255, 255, 255));

        btnSave.setBackground(new java.awt.Color(246, 211, 227));
        btnSave.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);

        btnCancel.setBackground(new java.awt.Color(246, 211, 227));
        btnCancel.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(244, 152, 194));
        btnCancel.setText("Cancel");

        btnClean.setBackground(new java.awt.Color(246, 211, 227));
        btnClean.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnClean.setForeground(new java.awt.Color(244, 152, 194));
        btnClean.setText("Clean");

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlButtonsLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char character = evt.getKeyChar();
        if(!(Character.isAlphabetic(character) || (character == KeyEvent.VK_BACK_SPACE) || (character == KeyEvent.VK_DELETE ))){
            JOptionPane.showMessageDialog(this,character+ " is not valid for names","Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_txtNameKeyTyped

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
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMaterial;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbMaterials;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblMaterials;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblWorkingTime;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlInput;
    private javax.swing.JSlider sldrWorkingTime;
    private javax.swing.JSpinner spnrMaterial;
    private javax.swing.JSpinner spnrQuantity;
    private javax.swing.JTextArea txtADescription;
    private javax.swing.JTextArea txtAMaterials;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
