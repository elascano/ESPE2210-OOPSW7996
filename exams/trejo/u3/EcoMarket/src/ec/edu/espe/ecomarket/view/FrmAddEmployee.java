package ec.edu.espe.ecomarket.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.toedter.calendar.JDateChooser;
import ec.edu.espe.ecomarket.controller.EmployeeController;
import ec.edu.espe.ecomarket.controller.Connection;
import ec.edu.espe.ecomarket.controller.IdentificationCardController;
import ec.edu.espe.ecomarket.model.Position;
import ec.edu.espe.ecomarket.model.Employee;
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
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class FrmAddEmployee extends javax.swing.JFrame {

    public class centerFrame extends javax.swing.JFrame {

        public centerFrame() {
            initComponents();

            setLocationRelativeTo(null);
        }
    }

    SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
    private EmployeeController stylistController;

    public String getDate(JDateChooser jdDate) {
        if (jdDate.getDate() != null) {
            return formDate.format(jdDate.getDate());
        } else {
            return null;
        }

    }

    /**
     * Creates new form AddEmployee
     */
    public FrmAddEmployee() {
        initComponents();
        Connection.connectionDataBase();
        stylistController = new EmployeeController();
        loadServicesComboBox();

    }

    public void loadServicesComboBox() {

        //-------
        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Position> collectionServices = db.getCollection("services", Position.class);
        List<Position> services = collectionServices.find(new Document(), Position.class).into(new ArrayList<Position>());

        for (Position service : services) {
            comboBoxServices.addItem(service.getName());
        }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentification = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        bntBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxServices = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Cedula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 53, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Número");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        txtIdentification.setToolTipText("only numbers");
        txtIdentification.setBorder(null);
        txtIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificationActionPerformed(evt);
            }
        });
        txtIdentification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificationKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 179, -1));

        txtName.setToolTipText("please first name and last name");
        txtName.setBorder(null);
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 179, -1));

        txtNumber.setToolTipText("only numbers");
        txtNumber.setBorder(null);
        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 179, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Sueldo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 60, -1));

        txtPayment.setBorder(null);
        jPanel1.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 387, 20));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel8.setText("Empleado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 260, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 179, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 179, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 179, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 179, 10));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Crear");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        bntBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntBack.setText("Volver");
        bntBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBackActionPerformed(evt);
            }
        });
        jPanel1.add(bntBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HuertoEcoMarketIcon.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Servicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 71, -1));
        jPanel1.add(comboBoxServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 190, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Dirección");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 71, 20));

        txtAddress.setBorder(null);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 387, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String identificationCard;
        String name;
        String number;
        double payment;
        boolean validateId = true;
        String service;
        String address;

        identificationCard = txtIdentification.getText();
        name = txtName.getText();
        number = txtNumber.getText();
        payment = Integer.parseInt(txtPayment.getText());
        service = comboBoxServices.getSelectedItem().toString();
        address = txtAddress.getText();

        validateId = IdentificationCardController.validateID(identificationCard);

        if (validateId == false) {
            emptyFieldsId();
            System.out.printf("The entered ID is incorrect");
            JOptionPane.showMessageDialog(null, "La cedula ingresada es incorrecta, ingrese de nuevo");

        }

        if (validateId == true) {
            Employee stylist = new Employee(identificationCard, name, number, payment, service, address);

            stylistController.create(stylistController.buildDocument(stylist));
            Document result = stylistController.read(stylistController.buildDocument(stylist));
            if (result != null) {
                JOptionPane.showMessageDialog(null, "Creado con exito");
                emptyFields();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema");
            }

        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void emptyFieldsId() {

        txtIdentification.setText("");

    }

    private void emptyFields() {

        txtIdentification.setText("");
        txtName.setText("");
        txtNumber.setText("");
        txtPayment.setText("");
        txtAddress.setText("");
        comboBoxServices.setToolTipText("");

    }

    private void bntBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBackActionPerformed
        FrmHuertoEcoMarketMenu frmStylesirelia;
        frmStylesirelia = new FrmHuertoEcoMarketMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntBackActionPerformed

    private void txtIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificationActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();
        boolean letters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key == 32);
        if (!letters) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
        String value = txtNumber.getText();
        int legth = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtNumber.setEditable(true);
            if (legth > 10) {

                JOptionPane.showMessageDialog(this, "El numero tiene 10 digitos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtNumber.setText("");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtNumber.setText("");
        }
    }//GEN-LAST:event_txtNumberKeyTyped

    private void txtIdentificationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificationKeyTyped
        String value = txtIdentification.getText();
        int legth = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtIdentification.setEditable(true);
            if (legth > 10) {

                JOptionPane.showMessageDialog(this, "Cédula debe tener 10 digitos", "Advertencia", JOptionPane.WARNING_MESSAGE);

                txtIdentification.setText(" ");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);

            txtIdentification.setText(" ");
        }
    }//GEN-LAST:event_txtIdentificationKeyTyped

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmAddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBack;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> comboBoxServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
