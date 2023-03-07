package ec.edu.espe.AirporTaxiScheduling.view;
import ec.edu.espe.AirporTaxiScheduling.controller.TaxiDriverdbController;
import ec.edu.espe.AirporTaxiScheduling.model.TaxiDriver;
import ec.edu.espe.AirporTaxiScheduling.utils.Validation;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class FrmAddTaxiDriver extends javax.swing.JFrame {

          /**
           * Creates new form FrmAddDriver
           */
          public FrmAddTaxiDriver() {
                    initComponents();
          }

          /**
           * This method is called from within the constructor to initialize the
           * form. WARNING: Do NOT modify this code. The content of this method
           * is always regenerated by the Form Editor.
           */
          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
          private void initComponents() {

                    buttonGroup1 = new javax.swing.ButtonGroup();
                    buttonGroup2 = new javax.swing.ButtonGroup();
                    jLabel1 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    jLabel4 = new javax.swing.JLabel();
                    jLabel5 = new javax.swing.JLabel();
                    jLabel6 = new javax.swing.JLabel();
                    jLabel7 = new javax.swing.JLabel();
                    jLabel8 = new javax.swing.JLabel();
                    jLabel9 = new javax.swing.JLabel();
                    jLabel11 = new javax.swing.JLabel();
                    jLabel12 = new javax.swing.JLabel();
                    jLabel13 = new javax.swing.JLabel();
                    txtName = new javax.swing.JTextField();
                    txtPhoneNumber = new javax.swing.JTextField();
                    spnAge = new javax.swing.JSpinner();
                    cmbAdress = new javax.swing.JComboBox<>();
                    txtCI = new javax.swing.JTextField();
                    txtEmail = new javax.swing.JTextField();
                    cmbGender = new javax.swing.JComboBox<>();
                    cmbVehicleMarck = new javax.swing.JComboBox<>();
                    txtVehiclePlate = new javax.swing.JTextField();
                    btnBack = new javax.swing.JButton();
                    btnRegister = new javax.swing.JButton();
                    cmbVehicleYear = new javax.swing.JComboBox<>();
                    tbHotmail = new javax.swing.JToggleButton();
                    tbGmail = new javax.swing.JToggleButton();
                    lbEmail = new javax.swing.JLabel();
                    jLabel2 = new javax.swing.JLabel();
                    jLabel10 = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setResizable(false);

                    jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
                    jLabel1.setText("AÑADIR CONDUCTOR");

                    jLabel3.setText("Nombre:");

                    jLabel4.setText("Numero de telefono:");

                    jLabel5.setText("Edad:");

                    jLabel6.setText("Direccion:");

                    jLabel7.setText("C.I:");

                    jLabel8.setText("Email:");

                    jLabel9.setText("Genero:");

                    jLabel11.setText("Marca del vehiculo");

                    jLabel12.setText("Placa del vehiculo");

                    jLabel13.setText("Año del vehiculo:");

                    txtName.setToolTipText("Ingrese su nombre y su apellido");
                    txtName.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txtNameActionPerformed(evt);
                              }
                    });
                    txtName.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtNameKeyTyped(evt);
                              }
                    });

                    txtPhoneNumber.setToolTipText("ingrese los 10 digitos de su numero de telefono");
                    txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtPhoneNumberKeyTyped(evt);
                              }
                    });

                    spnAge.setModel(new javax.swing.SpinnerNumberModel(18, 16, 100, 1));

                    cmbAdress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quito", "Ibarra", "Riombamba", "Pifo", "Puembo", "Tumbaco", "Sangolqui", "Calderon", "Carcelen", "Carapungo" }));

                    txtCI.setToolTipText("Ingrese los 10 digitos de su cedula");
                    txtCI.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txtCIActionPerformed(evt);
                              }
                    });
                    txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtCIKeyTyped(evt);
                              }
                    });

                    txtEmail.setToolTipText("Ingrese la primera parte de su e-mail, se autocomplementara");

                    cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Famale", "Male", "Other" }));
                    cmbGender.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        cmbGenderActionPerformed(evt);
                              }
                    });

                    cmbVehicleMarck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Nissan", "Jac", "Cherry", "Other" }));

                    txtVehiclePlate.setToolTipText("Ingrese la placa de su vehiculo");

                    btnBack.setText("<REGRESAR");
                    btnBack.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnBackActionPerformed(evt);
                              }
                    });

                    btnRegister.setText("ACEPTAR");
                    btnRegister.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnRegisterActionPerformed(evt);
                              }
                    });

                    cmbVehicleYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

                    buttonGroup2.add(tbHotmail);
                    tbHotmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotmail.jpg"))); // NOI18N
                    tbHotmail.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        tbHotmailActionPerformed(evt);
                              }
                    });

                    buttonGroup2.add(tbGmail);
                    tbGmail.setForeground(new java.awt.Color(0, 204, 204));
                    tbGmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gmail.jpg"))); // NOI18N
                    tbGmail.setSelected(true);
                    tbGmail.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        tbGmailActionPerformed(evt);
                              }
                    });

                    lbEmail.setText("@gmail.com");

                    jLabel2.setText("Gmail");

                    jLabel10.setText("Hotmail");

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBack)
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jLabel1)
                                                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel11)
                                                                                .addComponent(jLabel12)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(jLabel9))
                                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(cmbVehicleYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtVehiclePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(cmbVehicleMarck, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnRegister)))
                                                            .addGroup(layout.createSequentialGroup()
                                                                      .addComponent(jLabel8)
                                                                      .addGap(51, 51, 51)
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(tbGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                      .addGap(18, 18, 18)
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(tbHotmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                          .addComponent(jLabel3)
                                                                                          .addComponent(jLabel5)
                                                                                          .addComponent(jLabel6)
                                                                                          .addComponent(jLabel7))
                                                                                .addGap(51, 51, 51))
                                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(cmbAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addGap(109, 109, 109)
                                                                                .addComponent(jLabel10)))))
                                        .addContainerGap(43, Short.MAX_VALUE))
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(btnBack)
                                                  .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel7))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel3))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel4)
                                                  .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel5)
                                                  .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel6)
                                                  .addComponent(cmbAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel2)
                                                  .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(tbGmail)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(jLabel8)
                                                                      .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel9)
                                                                      .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel11)
                                                                      .addComponent(cmbVehicleMarck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel12)
                                                                      .addComponent(txtVehiclePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel13)
                                                                      .addComponent(cmbVehicleYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(btnRegister))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(tbHotmail)
                                                            .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18))
                    );

                    pack();
                    setLocationRelativeTo(null);
          }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
              AirportTaxiScheduling airportTaxiSheduling = new AirportTaxiScheduling();
              airportTaxiSheduling.setVisible(true);
              this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
              String[] Datos = new String[10];
              if (txtCI.getText().isEmpty() || txtName.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() || txtVehiclePlate.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, complete los campos vacios");
              } else {
                        if (txtCI.getText().length() == 10) {
                                  if (Validation.IdValidation(txtCI.getText())) {
                                            if (txtPhoneNumber.getText().length() < 9) {
                                                      JOptionPane.showMessageDialog(null, "Numero de telefono ingresado esta incorrecto, vuelva a ingresar");
                                            } else {
                                                      Datos[0] = txtCI.getText();
                                                      Datos[1] = txtName.getText();
                                                      Datos[2] = txtPhoneNumber.getText();
                                                      Datos[3] = spnAge.getValue().toString();
                                                      Datos[4] = cmbAdress.getSelectedItem().toString();
                                                      Datos[6] = cmbGender.getSelectedItem().toString();
                                                      Datos[7] = cmbVehicleMarck.getSelectedItem().toString();
                                                      Datos[8] = txtVehiclePlate.getText();
                                                      Datos[9] = cmbVehicleYear.getSelectedItem().toString();

                                                      if (tbGmail.isSelected() == true) {
                                                                String email = "@gmail.com";
                                                                Datos[5] = (txtEmail.getText() + email);
                                                      } else {
                                                                String email = "@hotmail.com";
                                                                Datos[5] = (txtEmail.getText() + email);
                                                      }
                                                      TaxiDriver driver = new TaxiDriver(Datos[0], Datos[1], Long.parseLong(Datos[2]), Datos[3], Datos[4], Datos[5], Datos[6], Datos[7], Datos[8], Datos[9]);
                                                      TaxiDriverdbController.insertDriver(driver);
                                                      JOptionPane.showMessageDialog(this, "Conductor agragado exitosamente");
                                                      cleanPanel();
                                            }
                                  } else {
                                            JOptionPane.showMessageDialog(null, "La cedula ingresada fue invalida");
                                  }

                        } else {
                                  JOptionPane.showMessageDialog(null, "La cedula ingresada es incorrecta");
                        }
              }


     }//GEN-LAST:event_btnRegisterActionPerformed

          public void cleanPanel() {
                    txtCI.setText("");
                    txtName.setText("");
                    txtPhoneNumber.setText("");
                    txtEmail.setText("");
                    txtVehiclePlate.setText("");
                    cmbAdress.setSelectedIndex(0);
                    cmbGender.setSelectedIndex(0);
                    cmbVehicleMarck.setSelectedIndex(0);
                    cmbVehicleYear.setSelectedIndex(0);
                    spnAge.setValue(18);
          }

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
              char characterTyped = evt.getKeyChar();

              if ((Character.isLetter(characterTyped)) || (Character.isWhitespace(characterTyped)) || (Character.isISOControl(characterTyped))) {
                        txtName.setEditable(true);
              } else {
                        txtName.setEditable(false);
              }
     }//GEN-LAST:event_txtNameKeyTyped

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIActionPerformed
    }//GEN-LAST:event_txtCIActionPerformed

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
              int validNumber = evt.getKeyChar();
              boolean number = validNumber >= 48 && validNumber <= 57;
              if (!number) {
                        evt.consume();
              }
              if (txtCI.getText().length() >= 10) {
                        evt.consume();
              }
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
              int validNumber = evt.getKeyChar();
              boolean number = validNumber >= 48 && validNumber <= 57;
              if (!number) {
                        evt.consume();
              }
              if (txtPhoneNumber.getText().length() >= 10) {
                        evt.consume();
              }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

          private void tbGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbGmailActionPerformed
                    lbEmail.setText("@gmail.com");
          }//GEN-LAST:event_tbGmailActionPerformed

          private void tbHotmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHotmailActionPerformed
                    lbEmail.setText("@hotmail.com");
          }//GEN-LAST:event_tbHotmailActionPerformed

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
                              java.util.logging.Logger.getLogger(FrmAddTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(FrmAddTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(FrmAddTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(FrmAddTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                                        new FrmAddTaxiDriver().setVisible(true);
                              }
                    });
          }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton btnBack;
          private javax.swing.JButton btnRegister;
          private javax.swing.ButtonGroup buttonGroup1;
          private javax.swing.ButtonGroup buttonGroup2;
          private javax.swing.JComboBox<String> cmbAdress;
          private javax.swing.JComboBox<String> cmbGender;
          private javax.swing.JComboBox<String> cmbVehicleMarck;
          private javax.swing.JComboBox<String> cmbVehicleYear;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel10;
          private javax.swing.JLabel jLabel11;
          private javax.swing.JLabel jLabel12;
          private javax.swing.JLabel jLabel13;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JLabel jLabel5;
          private javax.swing.JLabel jLabel6;
          private javax.swing.JLabel jLabel7;
          private javax.swing.JLabel jLabel8;
          private javax.swing.JLabel jLabel9;
          private javax.swing.JLabel lbEmail;
          private javax.swing.JSpinner spnAge;
          private javax.swing.JToggleButton tbGmail;
          private javax.swing.JToggleButton tbHotmail;
          private javax.swing.JTextField txtCI;
          private javax.swing.JTextField txtEmail;
          private javax.swing.JTextField txtName;
          private javax.swing.JTextField txtPhoneNumber;
          private javax.swing.JTextField txtVehiclePlate;
          // End of variables declaration//GEN-END:variables
}