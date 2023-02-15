package ec.espe.edu.unitTest.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
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
        addend2 = 28.99F;
        expResult = -13.01F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }
    
    /**
     * Test of add method, of class BasicOperation.
     */
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
        float minuhend = 10.0F;
        float sustrahend = 10.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.subtract(minuhend, sustrahend);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplying = 5.0F;
        float multiplier = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 25.0F;
        float result = instance.multiply(multiplying, multiplier);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of division method, of class BasicOperation.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float divisor = 10.0F;
        float diviser = 10.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 1.0F;
        float result = instance.division(divisor, diviser);
        assertEquals(expResult, result, 0);

    }
    
}
