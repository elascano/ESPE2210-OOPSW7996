/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.ws39unittest.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add 1");
        double addend1 = 0.0F;
        double addend2 = 0.0F;
        BasicOperation instance = new BasicOperation();
        double expResult = 0.0F;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
        System.out.println("add 2");
        addend1 = -42.0F;
        addend2 = 28.99F;
        expResult = -13.01F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double minuend = 0.0F;
        double substraend = 0.0F;
        BasicOperation instance = new BasicOperation();
        double expResult = 0.0F;
        double result = instance.subtract(minuend, substraend);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double multiplicand = 0.0F;
        double multiplier = 0.0F;
        BasicOperation instance = new BasicOperation();
        double expResult = 0.0F;
        double result = instance.multiply(multiplicand, multiplier);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double dividend = 0.0F;
        double divisor = 1.0F;
        BasicOperation instance = new BasicOperation();
        double expResult = 0.0F;
        double result = instance.divide(dividend, divisor);
        assertEquals(expResult, result, 0);
    }
    
}
