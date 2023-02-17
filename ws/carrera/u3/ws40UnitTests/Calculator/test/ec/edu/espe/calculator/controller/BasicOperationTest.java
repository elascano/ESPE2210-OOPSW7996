package ec.edu.espe.calculator.controller;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
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
        addend1 = 2.4F;
        addend2 = 1.2F;
        expResult = 3.6F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.000001F);
    }   

    
    /**
     * Test of add method with negative values, of class BasicOperation.
     */
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -1.0F;
        float addend2 = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 1.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        addend1 = -0.5F;
        addend2 = -56.0F;
        expResult = -56.5F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }
    
    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 16.5F;
        float subtrahend = 16.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.substract(minuend, subtrahend);
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
        float divider = 0.0F;
        float divisor = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.divide(divider, divisor);
        assertEquals(expResult, result, 0);
    }
    
}
