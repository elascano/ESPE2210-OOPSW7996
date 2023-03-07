/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.tax;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
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
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva_float_float() {
        System.out.println("computeIva");
        float base = 10.0F;
        float ivaPercentage = 0.12F;
        float expResult = 11.2F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeGreenTax method, of class Tax.
     */
    @Test
    public void testComputeGreenTax() {
        System.out.println("computeGreenTax");
        int numberOfCylindrical = 0;
        LocalDate purchaseDate = null;
        float expResult = 0.0F;
        float result = Tax.computeGreenTax(numberOfCylindrical, purchaseDate);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float monthlySalary = 0.0F;
        float costs = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeRentTax(monthlySalary, costs);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva_float() {
        System.out.println("computeIva");
        float base = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeIva(base);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
