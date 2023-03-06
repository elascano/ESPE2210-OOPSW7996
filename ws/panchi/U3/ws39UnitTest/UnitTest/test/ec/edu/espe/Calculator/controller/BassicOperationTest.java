package ec.edu.espe.Calculator.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class BassicOperationTest {
    
    public BassicOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class BassicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BassicOperation instance = new BassicOperation();
        float expResult = 0.0F;
        float result = instance.add();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class BassicOperation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        BassicOperation instance = new BassicOperation();
        float expResult = 0.0F;
        float result = instance.substract();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplication method, of class BassicOperation.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        BassicOperation instance = new BassicOperation();
        float expResult = 0.0F;
        float result = instance.multiplication();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class BassicOperation.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        BassicOperation instance = new BassicOperation();
        float expResult = 0.0F;
        float result = instance.division();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
