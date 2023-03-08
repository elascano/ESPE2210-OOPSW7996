/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.apanadossystem.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class TaxCalculatorControllerTest {
    
    public TaxCalculatorControllerTest() {
    }

    /**
     * Test of CalculateTotalPrice method, of class TaxCalculatorController.
     */
    @Test
    public void testCalculateTotalPrice() {
        System.out.println("CalculateTotalPrice");
        float price = 23.4F;
        float expResult = 26.21F;
        float result = TaxCalculatorController.CalculateTotalPrice(price);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateTaxValue method, of class TaxCalculatorController.
     */
    @Test
    public void testCalculateTaxValue() {
        System.out.println("CalculateTaxValue");
        float price = 3.0F;
        float expResult = 0.36F;
        float result = TaxCalculatorController.CalculateTaxValue(price);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
