package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIVA method, of class Tax.
     */
    @Test
    public void testComputeIVA_float_float() {
        System.out.println("computeIVA");
        float base = 100.0F;
        float ivaPercentage = 10.0F;
        float expResult = 10.0F;
        float result = Tax.computeIVA(base, ivaPercentage);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeGreenTax method, of class Tax.
     */
    @Test
    public void testComputeGreenTax() {
        System.out.println("computeGreenTax");
        float cylinderCapacity = 0.0F;
        int carYear = 0;
        String carType = "";
        float expResult = 0.0F;
        float result = Tax.computeGreenTax(cylinderCapacity, carYear, carType);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float monthSalary = 400.0F;
        float expResult = 0.0F;
        float result = Tax.computeRentTax(monthSalary);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeIVA method, of class Tax.
     */
    @Test
    public void testComputeIVA_float() {
        System.out.println("computeIVA");
        float base = 200.0F;
        float expResult = 24.0F;
        float result = Tax.computeIVA(base);
        assertEquals(expResult, result, 0);}
}
