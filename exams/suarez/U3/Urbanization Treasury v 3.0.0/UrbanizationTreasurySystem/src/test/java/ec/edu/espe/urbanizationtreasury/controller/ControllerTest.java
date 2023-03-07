package ec.edu.espe.urbanizationtreasury.controller;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.urbanizationtreasury.model.Payment;
import ec.edu.espe.urbanizationtreasury.model.Resident;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joela
 */
public class ControllerTest {
    
    public ControllerTest() {
    }

    /**
     * Test of noRepeatRecident method, of class Controller.
     */
    @Test
    public void testNoRepeatRecident() {
        System.out.println("noRepeatRecident");
        MongoDatabase database = null;
        Resident resident = null;
        boolean existResident = false;
        boolean expResult = false;
        boolean result = Controller.noRepeatRecident(database, resident, existResident);
        assertEquals(expResult, result);
    }

    /**
     * Test of readMongo method, of class Controller.
     */
    @Test
    public void testReadMongo() {
        System.out.println("readMongo");
        MongoDatabase database = null;
        Resident resident = null;
        String month = "";
        String expResult = "";
        String result = Controller.readMongo(database, resident, month);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateTheId method, of class Controller.
     */
    @Test
    public void testValidateTheId() throws Exception {
        System.out.println("validateTheId");
        String id = "1722263009";
        Controller.validateTheId(id);
    }

    /**
     * Test of enterPayments method, of class Controller.
     */
    @Test
    public void testEnterPayments() {
        System.out.println("enterPayments");
        MongoDatabase database = null;
        Payment payment = null;
        Payment paymentTypeSelect = null;
        Controller.enterPayments(database, payment, paymentTypeSelect);
    }
    
}
