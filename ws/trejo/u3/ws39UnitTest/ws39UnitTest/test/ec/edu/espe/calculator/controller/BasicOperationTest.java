
package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.Add;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Add addEntered = null;
        Add expResult = null;
        Add result = BasicOperation.add(addEntered);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = BasicOperation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplicand = 0.0F;
        float multiplier = 0.0F;
        float expResult = 0.0F;
        float result = BasicOperation.multiply(multiplicand, multiplier);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float dividend = 0.0F;
        float divisior = 0.0F;
        float expResult = 0.0F;
        float result = BasicOperation.divide(dividend, divisior);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
