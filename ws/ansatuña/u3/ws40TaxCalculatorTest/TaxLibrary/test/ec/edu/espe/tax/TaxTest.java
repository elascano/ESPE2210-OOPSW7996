/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.tax;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
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
        float value = 125.0F;
        float ivaPercentage = 0.12F;
        float expResult = 15.0F;
        float result = Tax.computeIva(value, ivaPercentage);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeGreenTax method, of class Tax.
     */
    @Test
    public void testComputeGreenTax() {
        System.out.println("computeGreenTax");
        int cylinder = 2600;
        int carYear = 2001;
        float expResult = 145.2F;
        float result = Tax.computeGreenTax(cylinder, carYear);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float netIncome = 25000.0F;
        float totalExpenses = 10500.0F;
        float monthSalary = 2083.33F;
        float socialSecurity = 992.5F;
        float expResult = 109.87F;
        float result = Tax.computeRentTax(netIncome, totalExpenses, monthSalary, socialSecurity);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva_float() {
        System.out.println("computeIva");
        float value = 125.0F;
        float expResult = 15.0F;
        float result = Tax.computeIva(value);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculateSectionOfCylinder method, of class Tax.
     */
    @Test
    public void testCalculateSectionOfCylinder() {
        System.out.println("calculateSectionOfCylinder");
        int cylinder = 2500;
        float expResult = 0.09F;
        float result = Tax.calculateSectionOfCylinder(cylinder);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculateSectionOfAntiquity method, of class Tax.
     */
    @Test
    public void testCalculateSectionOfAntiquity() {
        System.out.println("calculateSectionOfAntiquity");
        int carYear = 2015;
        float expResult = 0.05F;
        float result = Tax.calculateSectionOfAntiquity(carYear);
        assertEquals(expResult, result, 0);
    }
    
}
