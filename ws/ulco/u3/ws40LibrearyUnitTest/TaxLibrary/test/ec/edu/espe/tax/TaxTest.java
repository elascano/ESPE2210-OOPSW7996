
package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }
  

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 20.0F;
        float ivaPercentage = 0.12F;
        float expResult = 2.39F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0.399999F);
     
    }
    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float monthlySalary = 4501.0F;
        float expResult = 9234.7F;
        float result = Tax.computeRentTax(monthlySalary);
        assertEquals(expResult, result, 0.79F);
      
    }
    
}
