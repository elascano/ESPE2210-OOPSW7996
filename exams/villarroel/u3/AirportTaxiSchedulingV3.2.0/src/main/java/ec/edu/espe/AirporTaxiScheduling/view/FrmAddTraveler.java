package ec.edu.espe.AirporTaxiScheduling.view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.AirporTaxiScheduling.controller.TravelerdbController;
import ec.edu.espe.AirporTaxiScheduling.model.Traveler;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FrmAddTraveler extends javax.swing.JFrame {

          public FrmAddTraveler() {
                    initComponents();
          }

          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
          private void initComponents() {

                    buttonGroup1 = new javax.swing.ButtonGroup();
                    jLabel1 = new javax.swing.JLabel();
                    btnBack = new javax.swing.JButton();
                    txtId = new javax.swing.JTextField();
                    txtPhoneNumber = new javax.swing.JTextField();
                    spDay = new javax.swing.JSpinner();
                    spYear = new javax.swing.JSpinner();
                    jLabel2 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    jLabel4 = new javax.swing.JLabel();
                    txtEmail = new javax.swing.JTextField();
                    txtNameAndSurname = new javax.swing.JTextField();
                    spMonth = new javax.swing.JSpinner();
                    btCreate = new javax.swing.JButton();
                    btClean = new javax.swing.JButton();
                    jLabel5 = new javax.swing.JLabel();
                    jLabel6 = new javax.swing.JLabel();
                    jLabel7 = new javax.swing.JLabel();
                    jLabel8 = new javax.swing.JLabel();
                    jLabel9 = new javax.swing.JLabel();
                    tbHotmail = new javax.swing.JToggleButton();
                    tbGmail = new javax.swing.JToggleButton();
                    jLabel10 = new javax.swing.JLabel();
                    jLabel11 = new javax.swing.JLabel();
                    lbEmail = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setResizable(false);

                    jLabel1.setText("AÑADIR PASAJERO");

                    btnBack.setText("<REGRESAR");
                    btnBack.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnBackActionPerformed(evt);
                              }
                    });

                    txtId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    txtId.setToolTipText("Ingrese el Id del pasajero que desee buscar :)");
                    txtId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
                    txtId.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txtIdActionPerformed(evt);
                              }
                    });
                    txtId.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtIdKeyTyped(evt);
                              }
                    });

                    txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    txtPhoneNumber.setToolTipText("Solo 10 digitos");
                    txtPhoneNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
                    txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txtPhoneNumberActionPerformed(evt);
                              }
                    });
                    txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtPhoneNumberKeyTyped(evt);
                              }
                    });

                    spDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
                    spDay.setToolTipText("");
                    spDay.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        spDayKeyTyped(evt);
                              }
                    });

                    spYear.setModel(new javax.swing.SpinnerNumberModel(2000, 1900, 2100, 1));
                    spYear.setToolTipText("");
                    spYear.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        spYearKeyTyped(evt);
                              }
                    });

                    jLabel2.setText("MES");

                    jLabel3.setText("DIA");

                    jLabel4.setText("AÑO");

                    txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    txtEmail.setToolTipText("Solo la primera parte del E-mail");
                    txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
                    txtEmail.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txtEmailActionPerformed(evt);
                              }
                    });

                    txtNameAndSurname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    txtNameAndSurname.setToolTipText("Primero el nombre, despues el Apellido");
                    txtNameAndSurname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
                    txtNameAndSurname.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txtNameAndSurnameActionPerformed(evt);
                              }
                    });
                    txtNameAndSurname.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtNameAndSurnameKeyTyped(evt);
                              }
                    });

                    spMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
                    spMonth.setToolTipText("");
                    spMonth.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        spMonthKeyTyped(evt);
                              }
                    });

                    btCreate.setText("CREAR");
                    btCreate.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btCreateActionPerformed(evt);
                              }
                    });

                    btClean.setText("LIMPIAR");
                    btClean.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btCleanActionPerformed(evt);
                              }
                    });

                    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                    jLabel5.setText("ID");

                    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                    jLabel6.setText("Nombre y Apellido");

                    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                    jLabel7.setText("Numero de telefono");

                    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                    jLabel8.setText("E-Mail");

                    jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                    jLabel9.setText("Cumpleaños");

                    buttonGroup1.add(tbHotmail);
                    tbHotmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotmail.jpg"))); // NOI18N
                    tbHotmail.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        tbHotmailActionPerformed(evt);
                              }
                    });

                    buttonGroup1.add(tbGmail);
                    tbGmail.setForeground(new java.awt.Color(0, 204, 204));
                    tbGmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gmail.jpg"))); // NOI18N
                    tbGmail.setSelected(true);
                    tbGmail.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        tbGmailActionPerformed(evt);
                              }
                    });

                    jLabel10.setText("Gmail");

                    jLabel11.setText("Hotmail");

                    lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                    lbEmail.setText("@gmail.com");

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel6)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtNameAndSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(51, 51, 51)
                                                            .addComponent(jLabel5)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btnBack)
                                                            .addGap(151, 151, 151)
                                                            .addComponent(jLabel1))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(27, 27, 27)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addComponent(jLabel9)
                                                                                                    .addGap(19, 19, 19)
                                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                              .addGroup(layout.createSequentialGroup()
                                                                                                                        .addGap(30, 30, 30)
                                                                                                                        .addComponent(jLabel3))
                                                                                                              .addComponent(spDay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                          .addComponent(btCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                              .addGroup(layout.createSequentialGroup()
                                                                                                                        .addGap(80, 80, 80)
                                                                                                                        .addComponent(jLabel2))
                                                                                                              .addGroup(layout.createSequentialGroup()
                                                                                                                        .addGap(65, 65, 65)
                                                                                                                        .addComponent(spMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                    .addGap(41, 41, 41)
                                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                              .addGroup(layout.createSequentialGroup()
                                                                                                                        .addGap(56, 56, 56)
                                                                                                                        .addComponent(jLabel4))
                                                                                                              .addGroup(layout.createSequentialGroup()
                                                                                                                        .addGap(40, 40, 40)
                                                                                                                        .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addGap(152, 152, 152)
                                                                                                    .addComponent(btClean, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel7)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel8)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addComponent(tbGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addGap(60, 60, 60)
                                                                                                    .addComponent(tbHotmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addGap(9, 9, 9)
                                                                                                    .addComponent(jLabel10)
                                                                                                    .addGap(87, 87, 87)
                                                                                                    .addComponent(jLabel11))
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                        .addContainerGap(46, Short.MAX_VALUE))
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel1)
                                                  .addComponent(btnBack))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel5))
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel6)
                                                  .addComponent(txtNameAndSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel10)
                                                  .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(tbGmail)
                                                  .addComponent(tbHotmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel8)
                                                  .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel3)
                                                  .addComponent(jLabel2)
                                                  .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(spDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(spMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(btClean, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(btCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35))
                    );

                    pack();
                    setLocationRelativeTo(null);
          }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
              AirportTaxiScheduling airportTaxiScheduling;
              airportTaxiScheduling = new AirportTaxiScheduling();
              this.setVisible(false);
              airportTaxiScheduling.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
              int validNumber = evt.getKeyChar();
              boolean number = validNumber >= 48 && validNumber <= 57;
              if (!number) {
                        evt.consume();
              }
              if (txtId.getText().length() >= 7) {
                        evt.consume();
              }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

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

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameAndSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameAndSurnameActionPerformed
    }//GEN-LAST:event_txtNameAndSurnameActionPerformed

    private void txtNameAndSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameAndSurnameKeyTyped
              int key = evt.getKeyChar();
              boolean letters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key == 32);
              if (!letters) {
                        evt.consume();
              }
    }//GEN-LAST:event_txtNameAndSurnameKeyTyped

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
              if (txtId.getText().isEmpty() || txtNameAndSurname.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error, algunos campos estan vacios ");
              } else {
                        if (txtPhoneNumber.getText().length() < 9) {
                                  JOptionPane.showMessageDialog(null, "Numero de telefono ingresado esta incorrecto, vuelva a ingresar");
                        } else {
                                  MongoClient mongoClient = TravelerdbController.conection();
                                  MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
                                  MongoCollection<Document> collection = database.getCollection("Travelers");
                                  Bson filter = Filters.and(Filters.all("id", Integer.valueOf(txtId.getText())));
                                  MongoCursor<Document> cursor = collection.find(filter).iterator();
                                  if (collection.find(filter).first() == null) {
                                            Traveler traveler = new Traveler();
                                            traveler.setId(Integer.valueOf(txtId.getText()));
                                            traveler.setName(txtNameAndSurname.getText());
                                            traveler.setPhoneNumber(Integer.valueOf(txtPhoneNumber.getText()));
                                            if (tbGmail.isSelected() == true) {
                                                      String gmail = "@gmail.com";
                                                      traveler.setMail(txtEmail.getText() + gmail);
                                            } else {
                                                      String hotmail = "@hotmail.com";
                                                      traveler.setMail(txtEmail.getText() + hotmail);
                                            }
                                            traveler.setBirthdayDay((int) spDay.getValue());
                                            traveler.setBirthdayMonth((int) spMonth.getValue());
                                            traveler.setYear((int) spYear.getValue());
                                            TravelerdbController.uploadDocumentMdb(traveler);
                                            cleanPanel();
                                            JOptionPane.showMessageDialog(null, "Pasajero Creado Exitosamente");

                                  } else {
                                            JOptionPane.showMessageDialog(null, "La Id ya se encuentra registrada");
                                  }

                        }
              }
    }//GEN-LAST:event_btCreateActionPerformed

    private void spDayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spDayKeyTyped
              int validNumber = evt.getKeyChar();
              boolean number = validNumber >= 48 && validNumber <= 57;
              if (!number) {
                        evt.consume();
              }
              if (txtPhoneNumber.getText().length() >= 2) {
                        evt.consume();
              }
    }//GEN-LAST:event_spDayKeyTyped

    private void spMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spMonthKeyTyped
              int validNumber = evt.getKeyChar();
              boolean number = validNumber >= 48 && validNumber <= 57;
              if (!number) {
                        evt.consume();
              }
              if (txtPhoneNumber.getText().length() >= 2) {
                        evt.consume();
              }
    }//GEN-LAST:event_spMonthKeyTyped

    private void spYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spYearKeyTyped
              int validNumber = evt.getKeyChar();
              boolean number = validNumber >= 48 && validNumber <= 57;
              if (!number) {
                        evt.consume();
              }
              if (txtPhoneNumber.getText().length() >= 4) {
                        evt.consume();
              }
    }//GEN-LAST:event_spYearKeyTyped

    private void btCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanActionPerformed
              cleanPanel();
    }//GEN-LAST:event_btCleanActionPerformed

          private void tbHotmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHotmailActionPerformed
                    lbEmail.setText("@hotmail.com");
          }//GEN-LAST:event_tbHotmailActionPerformed

          private void tbGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbGmailActionPerformed
                    lbEmail.setText("@gmail.com");
          }//GEN-LAST:event_tbGmailActionPerformed

          /**
           * @param args the command line arguments
           */
          public static void main(String args[]) {

                    try ( MongoClient mongoClient = TravelerdbController.conection()) {
                              MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
                              JOptionPane.showMessageDialog(null, "Conection successfully");
                              java.awt.EventQueue.invokeLater(new Runnable() {
                                        public void run() {
                                                  new FrmAddTraveler().setVisible(true);
                                        }
                              });
                    } catch (InputMismatchException me) {
                              JOptionPane.showMessageDialog(null, "Error al tratar de conectarse: " + me);
                    }
          }

          private void cleanPanel() {
                    txtId.setText("");
                    txtNameAndSurname.setText("");
                    txtPhoneNumber.setText("");
                    txtEmail.setText("");
                    spDay.setValue(1);
                    spMonth.setValue(1);
                    spYear.setValue(2000);
                    tbGmail.setSelected(true);
                    lbEmail.setText("@gmail.com");

          }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton btClean;
          private javax.swing.JButton btCreate;
          private javax.swing.JButton btnBack;
          private javax.swing.ButtonGroup buttonGroup1;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel10;
          private javax.swing.JLabel jLabel11;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JLabel jLabel5;
          private javax.swing.JLabel jLabel6;
          private javax.swing.JLabel jLabel7;
          private javax.swing.JLabel jLabel8;
          private javax.swing.JLabel jLabel9;
          private javax.swing.JLabel lbEmail;
          private javax.swing.JSpinner spDay;
          private javax.swing.JSpinner spMonth;
          private javax.swing.JSpinner spYear;
          private javax.swing.JToggleButton tbGmail;
          private javax.swing.JToggleButton tbHotmail;
          private javax.swing.JTextField txtEmail;
          private javax.swing.JTextField txtId;
          private javax.swing.JTextField txtNameAndSurname;
          private javax.swing.JTextField txtPhoneNumber;
          // End of variables declaration//GEN-END:variables
}
