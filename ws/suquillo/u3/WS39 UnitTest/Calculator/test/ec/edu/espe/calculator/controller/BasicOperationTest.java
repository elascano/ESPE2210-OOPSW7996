package ec.edu.espe.calculator.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }
    
    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAddNegative() {
        System.out.println("add");
        float addend1 = -56.88F;
        float addend2 = -235.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = -291.88F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
        addend1 = -42.0F;
        addend2 = -28.99F;
        expResult = -70.99F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    
        addend1 = 1.2F;
        addend2 = 2.4F;
        expResult = 3.60F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.000001F);
    }

    /**
     * Test of substrac method, of class BasicOperation.
     */
    @Test
    public void testSubstrac() {
        System.out.println("substrac");
        float minuend = 0.0F;
        float susbtraend = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.substrac(minuend, susbtraend);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float miltiplicand = 0.0F;
        float multiplier = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiply(miltiplicand, multiplier);
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
        assertEquals(expResult, result, 0);
    }
    
}
