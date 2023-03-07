/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.espe.edu.unitTest.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuhend = 0.0F;
        float sustrahend = 0.0F;
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
        float multiplying = 0.0F;
        float multiplier = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiply(multiplying, multiplier);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of division method, of class BasicOperation.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float divisor = 0.0F;
        float diviser = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.division(divisor, diviser);
        assertEquals(expResult, result, 0);

    }
    
}
