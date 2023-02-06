package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computIva method, of class Tax.
     */
    @Test
    public void testComputIva() {
        System.out.println("computIva");
        float base = -12555F;
        float ivaPercentage = -0.12F;
        float expResult = -1.00F;
        float result = Tax.computIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float netIncome = -25000.00F;
        float expenses = -10500.00F;
        float iessDeduction = -992.25F;
        float expResult = -1.00F;
        float result = Tax.computeRentTax(netIncome, expenses, iessDeduction);
        assertEquals(expResult, result, 0);
    }
    
}
