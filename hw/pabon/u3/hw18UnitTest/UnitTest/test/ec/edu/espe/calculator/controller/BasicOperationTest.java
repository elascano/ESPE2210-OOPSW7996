package ec.edu.espe.calculator.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 147.0015F;
        float addend2 = 12.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 159.0015F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
        addend1 =-42.0F;
        addend2=28.99F;
        expResult=-13.01F;
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
    

    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 0.0F;
        float susbtraend = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.substract(minuend, susbtraend);
        assertEquals(expResult, result, 0);

    }


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
