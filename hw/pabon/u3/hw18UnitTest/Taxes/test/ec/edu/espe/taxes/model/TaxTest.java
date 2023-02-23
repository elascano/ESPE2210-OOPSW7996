package ec.edu.espe.taxes.model;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class TaxTest {
    
    public TaxTest() {
    }

    @Test
    public void testComputeIva_float() {
        System.out.println("computeIva");
        float base = 52.4012F;
        float ivaPercentage = 12.0F;
        float expResult = 628.814F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);

    }


    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 145.0F;
        float expResult = 17.4F;
        float result = Tax.computeIva(base);
        assertEquals(expResult, result, 0);

    }


    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float salary = 0.0F;
        float spent = 0.00F;
        float expResult = 0.0F;
        float result = Tax.computeRentTax(salary, spent);
        assertEquals(expResult, result, 0);

    }
    
}
