package ec.edu.espe.calculator.controller;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
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
        float addend1 = 1.0F;
        float addend2 = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 1.0F;
        float subtrahend = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplicand = 2.0F;
        float multiplicator = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.0F;
        float result = instance.multiply(multiplicand, multiplicator);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float divisor = 6.0F;
        float dividend = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.divide(divisor, dividend);
        assertEquals(expResult, result, 0);

    }
    
}
