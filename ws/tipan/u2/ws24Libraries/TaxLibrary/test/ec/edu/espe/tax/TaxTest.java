package ec.edu.espe.tax;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class TaxTest {

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva_float_float() {
        System.out.println("computeIva");
        float base = 235.0F;
        float ivaPercentage = 0.12F;
        float expResult = 28.2F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);

    }

    
}