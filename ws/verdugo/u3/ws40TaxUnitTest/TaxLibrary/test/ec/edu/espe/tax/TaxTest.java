
package ec.edu.espe.tax;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva_float_float() {
        System.out.println("computeIva");
        float base = -100.0F;
        float ivaPercentage = -0.12F;
        float expResult = 12.00F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float netIncome = -2500.00F;
        float expenses = -10500.00F;
        float iessDeduction = -992.25F;
        float expResult = -1.0F;
        float result = Tax.computeRentTax(netIncome, expenses, iessDeduction);
        assertEquals(expResult, result, 0);

    }
    
}
