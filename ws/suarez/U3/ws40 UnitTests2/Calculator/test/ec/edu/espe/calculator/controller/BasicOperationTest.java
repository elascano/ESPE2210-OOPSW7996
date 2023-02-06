package ec.edu.espe.calculator.controller;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class BasicOperationTest {


    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 7.0F;
        float addend2 = 6.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 13.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 8.5F;
        float subtrahend = 4.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.0F;
        float result = instance.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplying = 8.0F;
        float multiplier = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 40.0F;
        float result = instance.multiply(multiplying, multiplier);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of division method, of class BasicOperation.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 50.0F;
        float divisor = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 10.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0);

    }

}
