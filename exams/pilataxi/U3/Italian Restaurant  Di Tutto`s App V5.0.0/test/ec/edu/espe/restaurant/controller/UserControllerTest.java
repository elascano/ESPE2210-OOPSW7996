package ec.edu.espe.restaurant.controller;

import ec.edu.espe.restaurant.controller.UserController;
import ec.edu.espe.restaurant.model.User;
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

public class UserControllerTest {
    
    public UserControllerTest() {
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
     * Test of buildDocumentUser method, of class UserController.
     */
    @Test
    public void testBuildDocumentUser() {
        System.out.println("buildDocumentUser");
        User user = null;
        UserController instance = null;
        Document expResult = null;
        Document result = instance.buildDocumentUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
