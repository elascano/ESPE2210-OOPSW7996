/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.calculator.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 23.44445F;
        float addend2 = 12.1119F;
        BasicOperation instance = new BasicOperation();
        float expResult = 35.56F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 10.0F;
        float substrahend = 3.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.0F;
        float result = instance.substract(minuend, substrahend);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float multiplicand = 5.0F;
        float multiplicator = 4.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 20.0F;
        float result = instance.multiply(multiplicand, multiplicator);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float dividend = 20.0F;
        float divisor = 4.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 5.0F;
        float result = instance.divide(dividend, divisor);
        assertEquals(expResult, result, 0);
        
    }
    
}
