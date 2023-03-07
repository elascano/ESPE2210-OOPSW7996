package ec.edu.espe.restaurant.controller;

import ec.edu.espe.restaurant.controller.CustomerController;
import org.bson.Document;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class CustomerControllerTest {
    
    public CustomerControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RegisterAndBuildDocument method, of class CustomerController.
     */
    @Test
    public void testRegisterAndBuildDocument() {
        System.out.println("RegisterAndBuildDocument");
        String firstName = "";
        String lastName = "";
        String identification = "";
        String cellphone = "";
        String email = "";
        String typeOfService = "";
        String cost = "";
        String timeOfTreatment = "";
        String date = "";
        String hourOfAttention = "";
        CustomerController instance = null;
        Document expResult = null;
        Document result = instance.RegisterAndBuildDocument(firstName, lastName, identification, cellphone, email, typeOfService, cost, timeOfTreatment, date, hourOfAttention);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTotalCost method, of class CustomerController.
     */
    @Test
    public void testCalculateTotalCost() {
        System.out.println("calculateTotalCost");
        double cost = 20;
        double sessions = 2;
        CustomerController instance = null;
        double expResult = 40;
        double result = instance.calculateTotalCost(20, 2);
        assertEquals(40, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
