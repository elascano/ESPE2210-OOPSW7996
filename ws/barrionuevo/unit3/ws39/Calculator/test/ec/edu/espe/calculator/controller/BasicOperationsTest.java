
package ec.edu.espe.calculator.controller;

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
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
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
     * Test of add method, of class BasicOperations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 71.53F;
        float addend2 = 7.1F;
        BasicOperations instance = new BasicOperations();
        float expResult = 78.63F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class BasicOperations.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float substraend = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.subtract(minuend, substraend);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class BasicOperations.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplicand = 0.0F;
        float multiplier = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.multiply(multiplicand, multiplier);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class BasicOperations.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float dividend = 0.0F;
        float divisor = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.divide(dividend, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
