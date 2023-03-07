/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.calculator.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
        addend1 = 0.0F;
        addend2 = 0.0F;
        expResult = 0.0F;
        result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 0.0F;
        float substrahend = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.substract(minuend, substrahend);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplicand = 0.0F;
        float multiplier = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiplication(multiplicand, multiplier);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        float dividend = 0.0F;
        float divisor = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.division(dividend, divisor);
        assertEquals(expResult, result, 0);
    }
    
}
