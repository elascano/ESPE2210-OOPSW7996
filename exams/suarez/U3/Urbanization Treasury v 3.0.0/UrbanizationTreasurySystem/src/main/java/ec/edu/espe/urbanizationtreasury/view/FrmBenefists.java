package ec.edu.espe.urbanizationtreasury.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.urbanizationtreasury.controller.Controller;
import ec.edu.espe.urbanizationtreasury.controller.MathOperation;
import ec.edu.espe.urbanizationtreasury.controller.PaymentController;
import ec.edu.espe.urbanizationtreasury.model.*;
import ec.edu.espe.urbanizationtreasury.utils.IdValidationException;
import static ec.edu.espe.urbanizationtreasury.view.FrmNewPayment.resident;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class FrmBenefists extends javax.swing.JFrame {

    /**
     * Creates new form FrmBenefists
     */
    DefaultTableModel model = new DefaultTableModel();
    private static final Resident resident = new Resident();
    public static final PaymentController paymentController = new PaymentController();
    public static final MathOperation mathOperation = new MathOperation();
    public static final MinimumAmountDue aliquotValue = MinimumAmountDue.getInstance(30.0F);

    public FrmBenefists() {
        initComponents();
        mostTable();
    }

    private void mostTable() {

        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Batch");
        model.addColumn("Payment");
        model.addColumn("Payment type");
        model.addColumn("Information");
        this.table.setModel(model);
        
        cbMonth.addItem("-Selecciona-");
        cbMonth.addItem("Enero");
        cbMonth.addItem("Febrero");
        cbMonth.addItem("Marzo");
        cbMonth.addItem("Abril");
        cbMonth.addItem("Mayo");
        cbMonth.addItem("Junio");
        cbMonth.addItem("Julio");
        cbMonth.addItem("Agosto");
        cbMonth.addItem("Septiembre");
        cbMonth.addItem("Octubre");
        cbMonth.addItem("Noviembre");
        cbMonth.addItem("Dicembre");
        
        cbMounthNumber.addItem("1");
        cbMounthNumber.addItem("2");
        cbMounthNumber.addItem("3");
        cbMounthNumber.addItem("4");
        cbMounthNumber.addItem("5");
        cbMounthNumber.addItem("6");
        cbMounthNumber.addItem("7");
        cbMounthNumber.addItem("8");
        cbMounthNumber.addItem("9");
        cbMounthNumber.addItem("10");
        cbMounthNumber.addItem("11");
        cbMounthNumber.addItem("12");

    }
    
    public void enableSearchBottom() {
        if (!txtId.getText().isEmpty() && !cbMonth.getSelectedItem().toString().equals("-Selecciona-")) {
            btmSearch.setEnabled(true);
        } else {
            btmSearch.setEnabled(false);
        }
    }
    
    public String insertData(MongoDatabase database, String paymentType, ArrayList<String> documentWithPayments) {

        String[] infoTable = new String[6];

        String month = cbMonth.getSelectedItem().toString();
        String document = "";
        Gson gson = new Gson();
        float totalPayment = 0;

        MongoCollection<Document> collection = database.getCollection("Residents");
        MongoCollection<Document> collection2 = database.getCollection(paymentType);
        Bson filter = Filters.eq("id", resident.getId());
        Bson filter2 = Filters.eq("id", resident.getId());
        filter2 = Filters.eq("month", month);
        Document query = collection.find(Filters.and(filter)).first();
        MongoCursor<Document> cursor2 = collection2.find(filter).iterator();

        document = query.toJson();

        TypeToken<Resident> type = new TypeToken<Resident>() {
        };
        TypeToken<Payment> type2 = new TypeToken<Payment>() {
        };

        Resident residentData = gson.fromJson(document, type.getType());

        while (cursor2.hasNext()) {
            documentWithPayments.add(cursor2.next().toJson());
        }

        for (int i = 0; i < documentWithPayments.size(); i++) {

            Payment paymentData = gson.fromJson(documentWithPayments.get(i), type2.getType());
            totalPayment = (totalPayment + paymentData.getPayment()) / (documentWithPayments.size() - 1);
        }

        int batch = residentData.getBatch();

        infoTable[0] = Long.toString(residentData.getId());
        infoTable[1] = residentData.getName();
        infoTable[2] = Integer.toString(batch);
        infoTable[3] = "Total = " + Float.toString(totalPayment);
        infoTable[4] = paymentType;

        if (totalPayment <= aliquotValue.getMinimunValue()) {
            infoTable[5] = "Not applicable";
        }
        if (totalPayment >= aliquotValue.getMinimunValue()) {
            infoTable[5] = "Applicable";
        }

        model.addRow(infoTable);

        return infoTable[5];

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btmSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btmBack = new javax.swing.JButton();
        jlBenefist = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbMounthNumber = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnCaculateAmount = new javax.swing.JButton();
        lbCalculator = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmQuit = new javax.swing.JMenuItem();
        mnuResident = new javax.swing.JMenu();
        mnitNewResident = new javax.swing.JMenuItem();
        mnuitResidentInformation = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuitDeleteResident = new javax.swing.JMenuItem();
        mnuPrintResident1 = new javax.swing.JMenuItem();
        mnuPayment = new javax.swing.JMenu();
        mnuitNewPayment = new javax.swing.JMenuItem();
        mnuItDeletePayment = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuitBenefist = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuitFrequentQuestions = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Benefists");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Insert your Id for know if you have benefists");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Id:");

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

        btmSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmSearch.setText("Search");
        btmSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSearchActionPerformed(evt);
            }
        });

        jLabel8.setText("*Only if you paid more than 80 dollars (the minimum to pay) in each payments, you can apply for benefist.");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        btmBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmBack.setText("Back");
        btmBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBackActionPerformed(evt);
            }
        });

        jlBenefist.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Mes:");

        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });
        cbMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbMonthKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Seleccionar el número de mes:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Calcular el monto a pagar");

        btnCaculateAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCaculateAmount.setText("Calcular");
        btnCaculateAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaculateAmountActionPerformed(evt);
            }
        });

        lbCalculator.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(293, 293, 293))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btmSearch))
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jlBenefist))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btmBack)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(394, 394, 394)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(cbMounthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(btnCaculateAmount)
                                    .addComponent(lbCalculator))
                                .addGap(79, 79, 79))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMounthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmSearch)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnCaculateAmount)))
                .addGap(18, 18, 18)
                .addComponent(lbCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jlBenefist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmBack)
                .addGap(19, 19, 19))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu3.setText("UrbanizationTreasury");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        jMenu3.add(itmAbout);

        itmQuit.setText("Quit");
        itmQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmQuitActionPerformed(evt);
            }
        });
        jMenu3.add(itmQuit);

        jMenuBar1.add(jMenu3);

        mnuResident.setText("Residente");

        mnitNewResident.setText("Nuevo Residente");
        mnitNewResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitNewResidentActionPerformed(evt);
            }
        });
        mnuResident.add(mnitNewResident);

        mnuitResidentInformation.setText("Informacion del Residente");
        mnuitResidentInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitResidentInformationActionPerformed(evt);
            }
        });
        mnuResident.add(mnuitResidentInformation);

        jMenuItem2.setText("Editar Residente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuResident.add(jMenuItem2);

        mnuitDeleteResident.setText("Eliminar Residente");
        mnuitDeleteResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitDeleteResidentActionPerformed(evt);
            }
        });
        mnuResident.add(mnuitDeleteResident);

        mnuPrintResident1.setText("Imprimir Residentes");
        mnuPrintResident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrintResident1ActionPerformed(evt);
            }
        });
        mnuResident.add(mnuPrintResident1);

        jMenuBar1.add(mnuResident);

        mnuPayment.setText("Payment");

        mnuitNewPayment.setText("New Payment");
        mnuitNewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitNewPaymentActionPerformed(evt);
            }
        });
        mnuPayment.add(mnuitNewPayment);

        mnuItDeletePayment.setText("Eliminar Pago");
        mnuItDeletePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItDeletePaymentActionPerformed(evt);
            }
        });
        mnuPayment.add(mnuItDeletePayment);

        jMenuBar1.add(mnuPayment);

        jMenu4.setText("Extra");

        mnuitBenefist.setText("Benefist");
        mnuitBenefist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitBenefistActionPerformed(evt);
            }
        });
        jMenu4.add(mnuitBenefist);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        mnuitFrequentQuestions.setText("Preguntas Frecuentes");
        mnuitFrequentQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitFrequentQuestionsActionPerformed(evt);
            }
        });
        jMenu5.add(mnuitFrequentQuestions);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btmSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSearchActionPerformed
        // TODO add your handling code here:
        String aliquot = "Aliquots", cardPayment = "CardPayment", controllPayment = "ControllPayment", extraordinaryPayment = "ExtraordinaryPayment", name = "";
        boolean existResident = true;
        ArrayList<String> documentWithPayments = new ArrayList<>();

        String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");

            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                String info = "";
                String info1 = "";
                String info2 = "";
                String info3 = "";

                String id = txtId.getText();
                resident.setId(Long.parseLong(id));
                existResident = Controller.noRepeatRecident(database, resident, existResident);

                try {

                    Controller.validateTheId(id);

                    if (existResident == true) {

                        info = insertData(database, aliquot, documentWithPayments);
                        info1 = insertData(database, cardPayment, documentWithPayments);
                        info2 = insertData(database, controllPayment, documentWithPayments);
                        info3 = insertData(database, extraordinaryPayment, documentWithPayments);

                        if (info.equals("Applicable") && info1.equals("Applicable")
                                && info2.equals("Applicable") && info3.equals("Applicable")) {

                            jlBenefist.setText("The resident apply to the benefist");
                        } else {
                            jlBenefist.setText("The resident not apply to the benefist");
                        }

                        txtId.setText("");

                    }
                    if (existResident == false) {
                        JOptionPane.showMessageDialog(this, "Resident not found", "Warning on finding data", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IdValidationException ive) {
                    JOptionPane.showMessageDialog(this, "Invalid Id",
                            "Warning on input data", JOptionPane.WARNING_MESSAGE);
                    txtId.setText("");
                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }//GEN-LAST:event_btmSearchActionPerformed

    private void btmBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBackActionPerformed
        // TODO add your handling code here:
        UrbanizationTreasury backBtm = new UrbanizationTreasury();
        backBtm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btmBackActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        // TODO add your handling code here:
        FrmAbout frmAbout;
        frmAbout = new FrmAbout();
        this.setVisible(false);
        frmAbout.setVisible(true);
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmQuitActionPerformed
        // TODO add your handling code here:
        FrmPassword frmPassword;
        frmPassword = new FrmPassword();
        this.setVisible(false);
        frmPassword.setVisible(true);
    }//GEN-LAST:event_itmQuitActionPerformed

    private void mnuitNewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitNewPaymentActionPerformed
        // TODO add your handling code here:
        FrmNewPayment newPay = new FrmNewPayment();
        newPay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitNewPaymentActionPerformed

    private void mnuitBenefistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitBenefistActionPerformed
        // TODO add your handling code here:
        FrmBenefists benefists = new FrmBenefists();
        benefists.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitBenefistActionPerformed

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        // TODO add your handling code here:
        enableSearchBottom();
    }//GEN-LAST:event_cbMonthActionPerformed

    private void cbMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbMonthKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMonthKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        enableSearchBottom();
    }//GEN-LAST:event_txtIdKeyTyped

    private void mnuItDeletePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItDeletePaymentActionPerformed
        // TODO add your handling code here:
        FrmDeletePayment editPayment = new FrmDeletePayment();
        editPayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuItDeletePaymentActionPerformed

    private void mnuitFrequentQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitFrequentQuestionsActionPerformed
        // TODO add your handling code here:
        FrmFrequentQuestions frecuentQuestions = new FrmFrequentQuestions();
        frecuentQuestions.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_mnuitFrequentQuestionsActionPerformed

    private void btnCaculateAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaculateAmountActionPerformed
        mathOperation.CalculateAmount(cbMounthNumber, lbCalculator);
    }//GEN-LAST:event_btnCaculateAmountActionPerformed

    private void mnitNewResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitNewResidentActionPerformed
        // TODO add your handling code here:
        FrmNewResident newResident1 = new FrmNewResident();
        newResident1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnitNewResidentActionPerformed

    private void mnuitResidentInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitResidentInformationActionPerformed
        // TODO add your handling code here:
        FrmResidentInformation residentInfo = new FrmResidentInformation();
        residentInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitResidentInformationActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        FrmEditResident editResident = new FrmEditResident();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuitDeleteResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitDeleteResidentActionPerformed
        // TODO add your handling code here:
        FrmDeleteResident editResident = new FrmDeleteResident();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitDeleteResidentActionPerformed

    private void mnuPrintResident1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrintResident1ActionPerformed
        // TODO add your handling code here:
        FrmViewResidents editResident = new FrmViewResidents();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuPrintResident1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBenefists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBenefists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBenefists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBenefists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmBenefists().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmBack;
    private javax.swing.JButton btmSearch;
    private javax.swing.JButton btnCaculateAmount;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbMounthNumber;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBenefist;
    private javax.swing.JLabel lbCalculator;
    private javax.swing.JMenuItem mnitNewResident;
    private javax.swing.JMenuItem mnuItDeletePayment;
    private javax.swing.JMenu mnuPayment;
    private javax.swing.JMenuItem mnuPrintResident1;
    private javax.swing.JMenu mnuResident;
    private javax.swing.JMenuItem mnuitBenefist;
    private javax.swing.JMenuItem mnuitDeleteResident;
    private javax.swing.JMenuItem mnuitFrequentQuestions;
    private javax.swing.JMenuItem mnuitNewPayment;
    private javax.swing.JMenuItem mnuitResidentInformation;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
