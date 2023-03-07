package ec.edu.espe.Tax.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIVA method, of class Tax.
     */
    @Test
    public void testComputeIVA() {
        System.out.println("computeIVA");
        float base = 210.12F;
        float expResult = 25.21F;
        float result = Tax.computeIVA(base);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeSurplusFractionTax method, of class Tax.
     */
    @Test
    public void testComputeSurplusFractionTax() {
        System.out.println("computeSurplusFractionTax");
        float monthlySalary = 1200.01F;
        float expResult = 0.49F;
        float result = Tax.computeSurplusFractionTax(monthlySalary);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float monthlySalary = 1850.01F;
        float surplusFractionTax = 1414.482F;
        float expResult = 2363.88F;
        float result = Tax.computeRentTax(monthlySalary, surplusFractionTax);
        assertEquals(expResult, result, 0);
    }
    
}
