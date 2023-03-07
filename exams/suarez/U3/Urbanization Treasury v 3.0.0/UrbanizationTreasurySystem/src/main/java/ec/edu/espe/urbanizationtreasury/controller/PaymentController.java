package ec.edu.espe.urbanizationtreasury.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.urbanizationtreasury.model.Payment;
import ec.edu.espe.urbanizationtreasury.model.Resident;
import ec.edu.espe.urbanizationtreasury.utils.IdValidationException;
import ec.edu.espe.urbanizationtreasury.view.FrmAccessCard;
import ec.edu.espe.urbanizationtreasury.view.FrmAccessControll;
import ec.edu.espe.urbanizationtreasury.view.FrmAliquot;
import ec.edu.espe.urbanizationtreasury.view.FrmDeletePayment;
import ec.edu.espe.urbanizationtreasury.view.FrmExtraordinaryPayment;
import static ec.edu.espe.urbanizationtreasury.view.FrmNewPayment.paymentList;
import static ec.edu.espe.urbanizationtreasury.view.FrmNewPayment.paymentTypeSelect;
import static ec.edu.espe.urbanizationtreasury.view.FrmNewPayment.resident;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author joela
 */
public class PaymentController {

    FrmDeletePayment deletePayment = new FrmDeletePayment();
    MathOperation mathOperations = new MathOperation();

    public void searchPaymentToDelete(boolean existResident, MongoDatabase database, JTextField txtId, JLabel jLName, JLabel jBatchNumber)
            throws NumberFormatException, HeadlessException, JsonSyntaxException {

        String document = "";
        Gson gson = new Gson();
        String id = txtId.getText();

        resident.setId(Long.parseLong(id));
        existResident = Controller.noRepeatRecident(database, resident, existResident);

        try {
            Controller.validateTheId(id);

            if (existResident == true) {
                MongoCollection<Document> collection = database.getCollection("Residents");
                Bson filter = Filters.eq("id", resident.getId());
                Document query = collection.find(Filters.and(filter)).first();
                document = query.toJson();
                TypeToken<Resident> type = new TypeToken<Resident>() {
                };
                Resident residentData = gson.fromJson(document, type.getType());

                jLName.setText(residentData.getName());
                jBatchNumber.setText(Integer.toString(residentData.getBatch()));

            } else {
                JOptionPane.showMessageDialog(this.deletePayment, "Resident not found", "Warning on finding data", JOptionPane.WARNING_MESSAGE);
                txtId.setText("");
            }
        } catch (IdValidationException ive) {
            JOptionPane.showMessageDialog(this.deletePayment, "Invalid Id",
                    "Warning on input data", JOptionPane.WARNING_MESSAGE);
            txtId.setText("");
        }

    }

    public void updatePaymentToDelete(String paymentType, MongoDatabase database, ArrayList<String> documentWithPayments, ButtonGroup bgPaymentType, JRadioButton aliquot, JRadioButton accesscontroll,
            JRadioButton accesscard, JRadioButton extraordinary, JComboBox<String> cbMonth, DefaultTableModel model)
            throws JsonSyntaxException, HeadlessException {

        Gson gson = new Gson();
        String[] info = new String[3];
        model.getDataVector().removeAllElements();

        String month = cbMonth.getSelectedItem().toString();

        paymentType = selectPaymentType(bgPaymentType, aliquot, accesscard, accesscontroll, extraordinary, paymentType);

        if (paymentType.equals("")) {
            JOptionPane.showMessageDialog(this.deletePayment, "Select a payment type",
                    "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
        if (!paymentType.equals("")) {

            MongoCollection collection2 = database.getCollection(paymentType);
            Bson filter = Filters.eq("id", resident.getId());
            filter = Filters.eq("month", month);
            MongoCursor<Document> cursor2 = collection2.find(filter).iterator();
            TypeToken<Payment> type = new TypeToken<Payment>() {
            };

            while (cursor2.hasNext()) {
                documentWithPayments.add(cursor2.next().toJson());
            }
            for (int j = 0; j < documentWithPayments.size(); j++) {

                System.out.println("" + documentWithPayments.get(j));
                Payment paymentData = gson.fromJson(documentWithPayments.get(j), type.getType());

                info[0] = Long.toString(resident.getId());
                info[1] = paymentData.getMonth();
                info[2] = Float.toString(paymentData.getPayment());

                model.addRow(info);
            }

        }
    }

    public String selectPaymentType(ButtonGroup bgPaymentType, JRadioButton aliquot, JRadioButton accesscard,
            JRadioButton accesscontroll, JRadioButton extraordinary, String paymentType) {

        bgPaymentType.add(aliquot);
        bgPaymentType.add(accesscard);
        bgPaymentType.add(accesscontroll);
        bgPaymentType.add(extraordinary);
        if (aliquot.isSelected()) {
            paymentType = "Aliquots";
        }
        if (accesscard.isSelected()) {
            paymentType = "CardPayment";
        }
        if (accesscontroll.isSelected()) {
            paymentType = "ControllPayment";
        }
        if (extraordinary.isSelected()) {
            paymentType = "ExtraordinaryPayment";
        }
        return paymentType;
    }

    public void addNewPayment(Payment payment, boolean existResident, MongoDatabase database, ButtonGroup bgPaymentType, Payment paymentTypeSelect, JRadioButton accesscard,
            JRadioButton accesscontroll, JRadioButton aliquot, JRadioButton extraordinary, JTextField txtId, JTextField txtPayment, JLabel jlBatch, JLabel jlName, JComboBox<String> cbMonth)
            throws HeadlessException, NumberFormatException, JsonSyntaxException {

        String document = "";
        Gson gson = new Gson();
        String id = txtId.getText();

        bgPaymentType.add(aliquot);
        bgPaymentType.add(accesscard);
        bgPaymentType.add(accesscontroll);
        bgPaymentType.add(extraordinary);

        if (aliquot.isSelected()) {
            paymentTypeSelect.setPaymentType("Aliquots");
        }
        if (accesscard.isSelected()) {
            paymentTypeSelect.setPaymentType("CardPayment");

        }
        if (accesscontroll.isSelected()) {
            paymentTypeSelect.setPaymentType("ControllPayment");

        }
        if (extraordinary.isSelected()) {
            paymentTypeSelect.setPaymentType("ExtraordinaryPayment");
        }

        payment.setIdPayment(Long.parseLong(id));
        resident.setId(Long.parseLong(id));
        existResident = Controller.noRepeatRecident(database, resident, existResident);

        if (cbMonth.getSelectedItem().toString().equals("-Selecciona-")) {
            JOptionPane.showMessageDialog(this.deletePayment, "Select a month",
                    "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
        if (!(cbMonth.getSelectedItem().toString().equals("-Selecciona-"))) {
            payment.setMonth(cbMonth.getSelectedItem().toString());
        }

        String paymentConvert = txtPayment.getText();
        payment.setPayment(Float.parseFloat(paymentConvert));

        if (paymentTypeSelect.getPaymentType().equals("")) {
            JOptionPane.showMessageDialog(this.deletePayment, "Select a payment type",
                    "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
        if (!paymentTypeSelect.getPaymentType().equals("")) {

            MongoCollection<Document> collection = database.getCollection("Residents");
            Bson filter = Filters.eq("id", resident.getId());
            Document query = collection.find(Filters.and(filter)).first();
            document = query.toJson();
            TypeToken<Resident> type = new TypeToken<Resident>() {
            };
            Resident residentData = gson.fromJson(document, type.getType());

            int batch = residentData.getBatch();

            try {
                Controller.validateTheId(id);

                if (!"-Selecciona-".equals(cbMonth.getSelectedItem().toString())
                        && residentData.getName().equals(jlName.getText()) && Integer.toString(batch).equals(jlBatch.getText())) {

                    if (existResident == true) {

                        paymentList.add(payment);
                    }
                    if (existResident == false) {
                        JOptionPane.showMessageDialog(this.deletePayment, "Resident not found", "Warning on finding data", JOptionPane.WARNING_MESSAGE);
                    }
                }

            } catch (IdValidationException ive) {
                JOptionPane.showMessageDialog(this.deletePayment, "Invalid Id",
                        "Warning on input data", JOptionPane.WARNING_MESSAGE);
                txtId.setText("");
            }

            if (!residentData.getName().equals(jlName.getText()) && !Integer.toString(batch).equals(jlBatch.getText())) {

                JOptionPane.showMessageDialog(this.deletePayment, "The batch number or name entered is incorrect",
                        "Warning on input data", JOptionPane.WARNING_MESSAGE);
                jlName.setText("");
                jlBatch.setText("");
            }

            txtId.setText("");
            txtPayment.setText("");
            cbMonth.setSelectedItem("-Selecciona-");
            jlName.setText("");
            jlBatch.setText("");

        }
    }

    public void paymentTypeSelected() throws HeadlessException {

        if (!paymentList.isEmpty()) {
            if (paymentTypeSelect.getPaymentType().equals("Aliquots")) {
                FrmAliquot paymentFrame = new FrmAliquot();
                paymentFrame.setVisible(true);
            }
            if (paymentTypeSelect.getPaymentType().equals("CardPayment")) {
                FrmAccessCard CardPaymentFrame = new FrmAccessCard();
                CardPaymentFrame.setVisible(true);
            }
            if (paymentTypeSelect.getPaymentType().equals("ControllPayment")) {
                FrmAccessControll ControllPaymentFrame = new FrmAccessControll();
                ControllPaymentFrame.setVisible(true);
            }
            if (paymentTypeSelect.getPaymentType().equals("ExtraordinaryPayment")) {
                FrmExtraordinaryPayment ExtraordinaryPaymentFrame = new FrmExtraordinaryPayment();
                ExtraordinaryPaymentFrame.setVisible(true);
            }
        }
        if (paymentList.isEmpty()) {
            JOptionPane.showMessageDialog(this.deletePayment, "The data was not added",
                    "Warning on adding data", JOptionPane.WARNING_MESSAGE);
        }
    }

}
