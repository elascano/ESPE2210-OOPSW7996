
package ec.edu.espe.tax;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of computeIVA method, of class Tax.
     */
    @Test
    public void testComputeIVA_float_float() {
        System.out.println("computeIVA");
        float base = 1.0F;
        float ivaPercentage = 1.0F;
        float expResult = 1.0F;
        float result = Tax.computeIVA(base, ivaPercentage);
        assertEquals(expResult, result, 0);

    }


    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float monthSalary = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeRentTax(monthSalary);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of computeIVA method, of class Tax.
     */
    @Test
    public void testComputeIVA_float() {
        System.out.println("computeIVA");
        float base = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeIVA(base);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
