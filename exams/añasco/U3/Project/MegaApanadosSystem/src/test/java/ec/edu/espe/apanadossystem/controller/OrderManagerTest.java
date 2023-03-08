
package ec.edu.espe.apanadossystem.controller;

import ec.edu.espe.apanadossystem.model.Food;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class OrderManagerTest {
    
    public OrderManagerTest() {
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
     * Test of initialiceTableAndCombo method, of class OrderManager.
     */
    @Test
    public void testInitialiceTableAndCombo() {
        System.out.println("initialiceTableAndCombo");
        JTable tblMenu = null;
        JComboBox<String> comboMenu = null;
        OrderManager.initialiceTableAndCombo(tblMenu, comboMenu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The widgets are not initialiced");
    }

    /**
     * Test of initialiceSpinner method, of class OrderManager.
     */
    @Test
    public void testInitialiceSpinner() {
        System.out.println("initialiceSpinner");
        JSpinner spiAmount = null;
        OrderManager.initialiceSpinner(spiAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The spinner is not initialice.");
    }

    /**
     * Test of Add method, of class OrderManager.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        JSpinner spiAmount = null;
        JComboBox<String> comboMenu = null;
        ArrayList<Food> foodOrdered = null;
        ArrayList<Food> expResult = null;
        ArrayList<Food> result = OrderManager.Add(spiAmount, comboMenu, foodOrdered);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Tha action add was not succesfully.");
    }

    /**
     * Test of initialiceTable method, of class OrderManager.
     */
    @Test
    public void testInitialiceTable() {
        System.out.println("initialiceTable");
        JTable tblOrder = null;
        ArrayList<Food> foodOrdered = null;
        JLabel txtTotal = null;
        OrderManager.initialiceTable(tblOrder, foodOrdered, txtTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The table was not initialice.");
    }

    /**
     * Test of enterLetters method, of class OrderManager.
     */
    @Test
    public void testEnterLetters() {
        System.out.println("enterLetters");
        KeyEvent evt = null;
        OrderManager.enterLetters(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("Yo don't enter letters.");
    }

    /**
     * Test of enterNumbers method, of class OrderManager.
     */
    @Test
    public void testEnterNumbers() {
        System.out.println("enterNumbers");
        KeyEvent evt = null;
        JTextField txt = null;
        OrderManager.enterNumbers(evt, txt);
        // TODO review the generated test code and remove the default call to fail.
        fail("You Don't enter numbers.");
    }

    /**
     * Test of validateID method, of class OrderManager.
     */
    @Test
    public void testValidateID() {
        System.out.println("validateID");
        String id = "1725850868";
        boolean expResult = false;
        boolean result = OrderManager.validateID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Your ID is not correct.");
    }
    
    @Test
    public void testValidateID2() {
        System.out.println("validateID");
        String id = "1753951027";
        boolean expResult = true;
        boolean result = OrderManager.validateID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Your ID is not correct.");
    }
    
    @Test
    public void testValidateID3() {
        System.out.println("validateID");
        String id = "172285";
        boolean expResult = false;
        boolean result = OrderManager.validateID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Your ID is not correct.");
    }

    /**
     * Test of validateEmail method, of class OrderManager.
     */
    @Test
    public void testValidateEmail() {
        System.out.println("validateEmail");
        String email = "domelindsay@gmail.com";
        boolean expResult = true;
        boolean result = OrderManager.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The email is incorrect");
    }
    
    @Test
    public void testValidateEmail2() {
        System.out.println("validateEmail");
        String email = "sira3999@gmail.com";
        boolean expResult = true;
        boolean result = OrderManager.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The email is incorrect");
    }
    
    @Test
    public void testValidateEmail3() {
        System.out.println("validateEmail");
        String email = "2455@example.com";
        boolean expResult = false;
        boolean result = OrderManager.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The email is incorrect");
    }
    

    /**
     * Test of enterCardNumbers method, of class OrderManager.
     */
    @Test
    public void testEnterCardNumbers() {
        System.out.println("enterCardNumbers");
        KeyEvent evt = null;
        JTextField txt = null;
        OrderManager.enterCardNumbers(evt, txt);
        // TODO review the generated test code and remove the default call to fail.
        fail("You don't enter card numbers");
    }

    /**
     * Test of enterCVCNumbers method, of class OrderManager.
     */
    @Test
    public void testEnterCVCNumbers() {
        System.out.println("enterCVCNumbers");
        KeyEvent evt = null;
        JTextField txt = null;
        OrderManager.enterCVCNumbers(evt, txt);
        // TODO review the generated test code and remove the default call to fail.
        fail("You don't enter cvc numbers");
    }

    /**
     * Test of enterExpidedDate method, of class OrderManager.
     */
    @Test
    public void testEnterExpidedDate() {
        System.out.println("enterExpidedDate");
        KeyEvent evt = null;
        JTextField txtExpiredDate = null;
        OrderManager.enterExpidedDate(evt, txtExpiredDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("You don't enter expided date.");
    }

    /**
     * Test of validateDate method, of class OrderManager.
     */
    @Test
    public void testValidateDate() {
        System.out.println("validateDate");
        String date = "01/03/2023";
        boolean expResult = true;
        boolean result = OrderManager.validateDate(date);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of validateDate method, of class OrderManager.
     */
    @Test
    public void testValidateDate2() {
        System.out.println("validateDate");
        String date = "02/03/2023";
        boolean expResult = true;
        boolean result = OrderManager.validateDate(date);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of validateDate method, of class OrderManager.
     */
    @Test
    public void testValidateDate3() {
        System.out.println("validateDate");
        String date = "28/02/2023";
        boolean expResult = true;
        boolean result = OrderManager.validateDate(date);
        assertEquals(expResult, result);
        
    }
    
}
