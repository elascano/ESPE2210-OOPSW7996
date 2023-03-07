package ec.edu.espe.urbanizationtreasury.controller;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.urbanizationtreasury.model.Payment;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author joela
 */
public class PaymentControllerTest {
    
    public PaymentControllerTest() {
    }

    /**
     * Test of searchPaymentToDelete method, of class PaymentController.
     */
    @Test
    public void testSearchPaymentToDelete() {
        System.out.println("searchPaymentToDelete");
        boolean existResident = false;
        MongoDatabase database = null;
        JTextField txtId = null;
        JLabel jLName = null;
        JLabel jBatchNumber = null;
        PaymentController instance = new PaymentController();
        instance.searchPaymentToDelete(existResident, database, txtId, jLName, jBatchNumber);
    }

    /**
     * Test of updatePaymentToDelete method, of class PaymentController.
     */
    @Test
    public void testUpdatePaymentToDelete() {
        System.out.println("updatePaymentToDelete");
        String paymentType = "";
        MongoDatabase database = null;
        ArrayList<String> documentWithPayments = null;
        ButtonGroup bgPaymentType = null;
        JRadioButton aliquot = null;
        JRadioButton accesscontroll = null;
        JRadioButton accesscard = null;
        JRadioButton extraordinary = null;
        JComboBox<String> cbMonth = null;
        DefaultTableModel model = null;
        PaymentController instance = new PaymentController();
        instance.updatePaymentToDelete(paymentType, database, documentWithPayments, bgPaymentType, aliquot, accesscontroll, accesscard, extraordinary, cbMonth, model);

    }

    /**
     * Test of selectPaymentType method, of class PaymentController.
     */
    @Test
    public void testSelectPaymentType() {
        System.out.println("selectPaymentType");
        ButtonGroup bgPaymentType = null;
        JRadioButton aliquot = null;
        JRadioButton accesscard = null;
        JRadioButton accesscontroll = null;
        JRadioButton extraordinary = null;
        String paymentType = "";
        PaymentController instance = new PaymentController();
        String expResult = "";
        String result = instance.selectPaymentType(bgPaymentType, aliquot, accesscard, accesscontroll, extraordinary, paymentType);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNewPayment method, of class PaymentController.
     */
    @Test
    public void testAddNewPayment() {
        System.out.println("addNewPayment");
        Payment payment = null;
        boolean existResident = false;
        MongoDatabase database = null;
        ButtonGroup bgPaymentType = null;
        Payment paymentTypeSelect = null;
        JRadioButton accesscard = null;
        JRadioButton accesscontroll = null;
        JRadioButton aliquot = null;
        JRadioButton extraordinary = null;
        JTextField txtId = null;
        JTextField txtPayment = null;
        JLabel jlBatch = null;
        JLabel jlName = null;
        JComboBox<String> cbMonth = null;
        PaymentController instance = new PaymentController();
        instance.addNewPayment(payment, existResident, database, bgPaymentType, paymentTypeSelect, accesscard, accesscontroll, aliquot, extraordinary, txtId, txtPayment, jlBatch, jlName, cbMonth);
    }

    /**
     * Test of paymentTypeSelected method, of class PaymentController.
     */
    @Test
    public void testPaymentTypeSelected() {
        System.out.println("paymentTypeSelected");
        PaymentController instance = new PaymentController();
        instance.paymentTypeSelected();
    }
    
}
