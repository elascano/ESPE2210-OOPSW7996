package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaxTest {
    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 132.0F;
        float ivaPercentage = 0.12F;
        float expResult = 15.84F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float monthlySalary = 340.0F;
        float expResult = 0.0F;
        float result = Tax.computeRentTax(monthlySalary);
        assertEquals(expResult, result, 0);
    }
    
}
