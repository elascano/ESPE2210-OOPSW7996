package ec.edu.espe.calculator.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolay Chillo, Gaman GeekLords at DCOO-ESPE
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
        float addend2 = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
            //testing negative values
        addend1 = -42.0F;
        addend2 = 28.99F;
        expResult = -13.01F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
            //testing positive values
        addend1 = 1.2F;
        addend2 = 2.4F;
        expResult = 3.6F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0F);
    }
    
    /**
     * Test of add method with negative values, of class BasicOperation.
     */
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -1.12F;
        float addend2 = -2.01F;
        BasicOperation instance = new BasicOperation();
        float expResult = -3.13F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtratehd = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.subtract(minuend, subtratehd);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplicand = 0.0F;
        float multiplier = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiply(multiplicand, multiplier);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float divisor = 1.0F;
        float dividend = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.divide(divisor, dividend);
        assertEquals(expResult, result, 0);
    }    
}
