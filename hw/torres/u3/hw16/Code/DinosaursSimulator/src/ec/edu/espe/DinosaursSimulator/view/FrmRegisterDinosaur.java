package ec.edu.espe.DinosaursSimulator.view;

import static ec.edu.espe.DinosaursSimulator.controller.ButtonHover.hoverGrow;
import static ec.edu.espe.DinosaursSimulator.controller.ButtonIcon.adjustButtonIcon;
import ec.edu.espe.DinosaursSimulator.controller.DBManager;
import ec.edu.espe.DinosaursSimulator.controller.SoundPlayer;
import ec.edu.espe.DinosaursSimulator.model.Dinosaur;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class FrmRegisterDinosaur extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public FrmRegisterDinosaur() {
        initComponents();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Age");
        this.jTable1.setModel(model);
        adjustButtonIcon(btnBack);
        hoverGrow(btnBack);
        transparentButton(false);
    }
    
    public void transparentButton(boolean button) {

        btnBack.setOpaque(button);
        btnBack.setContentAreaFilled(button);
        btnBack.setBorderPainted(button);

    }
    
    private void addToTable(Dinosaur dinosaur) {
        //Product product = new Product();
        dinosaur.setName(txtName.getText());
        dinosaur.setId(Integer.parseInt(txtId.getText()));
        dinosaur.setAge(Integer.parseInt(txtAge.getText()));

        Object[] dataProduct = new Object[4];
        dataProduct[0] = dinosaur.getId();
        dataProduct[1] = dinosaur.getName();
        dataProduct[2] = dinosaur.getAge();
        model.addRow(dataProduct);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/DinosaursSimulator/images/backButton.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/DinosaursSimulator/images/velociraptor.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 150, 180));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 540, 115));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, 23));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 124, 250, 23));
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 163, 250, 23));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 140, 60));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 50));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 120, 50));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/DinosaursSimulator/images/RegisterDino.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //validateId();
        Dinosaur enteredDinosaur = new Dinosaur();
        Dinosaur product = new Dinosaur();
        int id = Integer.parseInt(txtId.getText());
        enteredDinosaur.setId(id);

        System.out.println("id" + enteredDinosaur.getId());

        product = DBManager.find(enteredDinosaur);

        txtName.setText(String.valueOf(product.getName()));

        txtAge.setText(String.valueOf(product.getAge()));

        addToTable(enteredDinosaur);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateDataProduct();
        Dinosaur enteredDinosaur = new Dinosaur();
        enteredDinosaur.setId(Integer.parseInt(txtId.getText()));
        enteredDinosaur.setName(txtName.getText());
        enteredDinosaur.setAge(Integer.parseInt(txtAge.getText()));

        DBManager.save(enteredDinosaur);

        emptyFields();

        ///addToTable();
        //FrmActionsOfTheManager fmrActionsOfTheManager = new FrmActionsOfTheManager();
        //fmrActionsOfTheManager.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int idInitial = id();
        validateId();
        Dinosaur enteredProduct = new Dinosaur();
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        enteredProduct.setName(name);
        enteredProduct.setId(id);
        enteredProduct.setAge(age);

        DBManager.update(idInitial, enteredProduct);

        emptyFields();
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        validateId();

        Dinosaur enteredProduct = new Dinosaur();
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        enteredProduct.setName(name);
        enteredProduct.setId(id);
        enteredProduct.setAge(age);

        DBManager.delete(enteredProduct);

        emptyFields();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmWelcomePresentation login = new FrmWelcomePresentation();
        login.setVisible(true);
        this.setVisible(false);
                SoundPlayer.playSound("enter.wav");

    }//GEN-LAST:event_btnBackActionPerformed
    
    private int id() {
        int id = Integer.parseInt(txtId.getText());
        return id;
    }

    private void emptyFields() {
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");

    }

    public void validateDataProduct() throws HeadlessException {
        // TODO add your handling code here:

        if (txtName.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "You must enter the product name");
        }

        if (txtId.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "You must enter the unit product");
        }

        if (txtAge.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "You must enter the Amount product");
        }

        try {
            if ((Integer.valueOf(txtId.getText())) == 0) {
                JOptionPane.showMessageDialog(null, "Enter a valid Id");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter a valid Id");
        }

    }

    public void validateId() throws HeadlessException {
        // TODO add your handling code here:

        if (txtId.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "You must enter the product Id");
        }

    }
    
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
            java.util.logging.Logger.getLogger(FrmRegisterDinosaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterDinosaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterDinosaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterDinosaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegisterDinosaur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
