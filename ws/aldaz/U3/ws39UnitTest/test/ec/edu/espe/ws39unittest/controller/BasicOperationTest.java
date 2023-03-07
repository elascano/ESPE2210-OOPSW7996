
package ec.edu.espe.ws39unittest.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO_ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        double addend1 = 22.334;
        double addend2 = 56.5;
        double expResult = 78.834;
        double result = BasicOperation.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double minuend = 0.0;
        double subtrhend = 0.0;
        double expResult = 0.0;
        double result = BasicOperation.subtract(minuend, subtrhend);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double multiplicand = 0.0;
        double multiplier = 0.0;
        double expResult = 0.0;
        double result = BasicOperation.multiply(multiplicand, multiplier);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        double divisor = 0.0;
        double dividend = 0.0;
        double expResult = 0.0;
        double result = BasicOperation.divide(divisor, dividend);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
}
