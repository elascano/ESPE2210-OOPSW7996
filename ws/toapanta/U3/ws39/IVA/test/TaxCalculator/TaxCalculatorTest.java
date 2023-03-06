/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TaxCalculator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class TaxCalculatorTest {
    
    public TaxCalculatorTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTax method, of class TaxCalculator.
     */
    @Test
    public void testCalculateTax() {
        System.out.println("calculateTax");
        double amount = 0.0;
        double expResult = 0.0;
        double result = TaxCalculator.calculateTax(amount);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of calculateTotalWithTax method, of class TaxCalculator.
     */
    @Test
    public void testCalculateTotalWithTax() {
        System.out.println("calculateTotalWithTax");
        double amount = 0.0;
        double expResult = 0.0;
        double result = TaxCalculator.calculateTotalWithTax(amount);
        assertEquals(expResult, result, 0);

    }
    
}
