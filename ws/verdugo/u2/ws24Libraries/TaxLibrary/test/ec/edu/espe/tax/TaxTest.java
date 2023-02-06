
package ec.edu.espe.tax;

import static org.junit.Assert.*;
import org.junit.Test;

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
        float base = 10.0F;
        float ivaPercentage = 0.12F;
        float expResult = 1.1999999F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of computeGreenTax method, of class Tax.
     */
    @Test
    public void testComputeGreenTax() {
        System.out.println("computeGreenTax");
        int cylinderNumber = 2500;
        int antiquityInYears = 2001;
        boolean isHybrid = false;
        float expResult = 108.0F;
        float result = Tax.computeGreenTax(cylinderNumber, antiquityInYears, isHybrid);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float netIncome = 2500.0F;
        float expenses = 10500.0F;
        float iessDeduction = 992.5F;
        float expResult = 0.0F;
        float result = Tax.computeRentTax(netIncome, expenses, iessDeduction);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva_float() {
        System.out.println("computeIva");
        float base = 12.0F;
        float expResult = 1.44F;
        float result = Tax.computeIva(base);
        assertEquals(expResult, result, 0);
        
    }
    
}
