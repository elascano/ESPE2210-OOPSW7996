/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.Tax;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class TaxLibraryTest {
    
    public TaxLibraryTest() {
    }

    /**
     * Test of computerIva method, of class TaxLibrary.
     */
    @Test
    public void testComputerIva_float_float() {
        System.out.println("computerIva");
        float base = 0.12F;
        float ivaPercentage = 30.999999F;
        float expResult = 3.71999988F;
        float result = TaxLibrary.computerIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of computerIva method, of class TaxLibrary.
     */
    @Test
    public void testComputerIva_float() {
        System.out.println("computerIva");
        float base = 100F;
        float expResult = 12.0F;
        float result = TaxLibrary.computerIva(base);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of computerGreenTax method, of class TaxLibrary.
     */
    @Test
    public void testComputerGreenTax() {
        System.out.println("computerGreenTax");
        float cylinderCapacity = 0.0F;
        int antiquity = 0;
        float expResult = 0.0F;
        float result = TaxLibrary.computerGreenTax(cylinderCapacity, antiquity);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAgeFactor method, of class TaxLibrary.
     */
    @Test
    public void testCalculateAgeFactor() {
        System.out.println("calculateAgeFactor");
        int antiquity = 0;
        float expResult = 0.0F;
        float result = TaxLibrary.calculateAgeFactor(antiquity);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeRentTax method, of class TaxLibrary.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float mothSalary = 0.0F;
        float expResult = 0.0F;
        float result = TaxLibrary.computeRentTax(mothSalary);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
