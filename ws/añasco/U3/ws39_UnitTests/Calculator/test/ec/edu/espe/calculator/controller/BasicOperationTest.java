package ec.edu.espe.calculator.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
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
        
        addend1 = -42.0F;
        addend2= 28.99F;
        expResult = -13.01F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
        addend1 = 1.2F;
        addend2= 2.4F;
        expResult = 3.6F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
    }
    
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -56.88F;
        float addend2 = -235.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = -291.88F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
         
    }
    
    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
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
        float dividend = 0.0F;
        float divisor = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.divide(dividend, divisor);
    }
    
}
