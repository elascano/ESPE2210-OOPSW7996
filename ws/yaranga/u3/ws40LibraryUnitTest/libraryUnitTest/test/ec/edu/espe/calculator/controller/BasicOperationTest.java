package ec.edu.espe.calculator.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
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
        double addend1 = 1.00;
        double addent2 = 2.00;
        double expResult = 3.00;
        double result = BasicOperation.add(addend1, addent2);
        assertEquals(expResult, result, 0);

        addend1 = 1.2;
        addent2 = 2.4;
        expResult = 3.6;
        result = BasicOperation.add(addend1, addent2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        double addend1 = -56.88;
        double addent2 = -235.00;
        double expResult = -291.88;
        double result = BasicOperation.add(addend1, addent2);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        double minuend = 2.0;
        double subtrahend = 3.0;
        double expResult = -1.0;
        double result = BasicOperation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double multiplicand = 0.0;
        double muliplier = 0.0;
        double expResult = 0.0;
        double result = BasicOperation.multiply(multiplicand, muliplier);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double dividend = 0.0;
        double divisor = 1.0;
        double expResult = 0.0;
        double result = BasicOperation.divide(dividend, divisor);
        assertEquals(expResult, result, 0);

    }

}
