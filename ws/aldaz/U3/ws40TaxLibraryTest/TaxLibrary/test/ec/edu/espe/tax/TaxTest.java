
package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }

    @Test
    public void testComputeIva_float_float() {
        System.out.println("computeIva");
        double base = 10.0;
        double ivaPercentage = 0.12;
        double expResult = 1.2;
        double result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeIva_float() {
        System.out.println("computeIva");
        double base = 10.0;
        double expResult = 1.2;
        double result = Tax.computeIva(base);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        double monthlySalary = 0.0F;
        double costs = 0.0F;
        double expResult = 0.0F;
        double result = Tax.computeRentTax(monthlySalary, costs);
        assertEquals(expResult, result, 0);
    }
    
}
