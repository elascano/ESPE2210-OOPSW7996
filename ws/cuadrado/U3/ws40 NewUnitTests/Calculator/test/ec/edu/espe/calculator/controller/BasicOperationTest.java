package ec.edu.espe.calculator.controller;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author Alejandro Cuadrado, DeveloperBears,DCCO-ESPE
 */
public class BasicOperationTest {
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
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplying = 8.0F;
        float multiplier = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 45.0F;
        float result = instance.multiply(multiplying, multiplier);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 59.0F;
        float divisor = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 10.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0);
    }
}