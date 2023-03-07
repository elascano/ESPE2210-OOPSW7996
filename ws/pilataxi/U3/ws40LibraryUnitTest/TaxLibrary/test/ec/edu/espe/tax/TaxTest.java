
package ec.edu.espe.tax;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float netIncome = 3.0F;
        float expenses = 2.0F;
        float iessDeduction = 5.0F;
        float expResult = 1.0F;
        float result = Tax.computeRentTax(netIncome, expenses, iessDeduction);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computIva method, of class Tax.
     */
    @Test
    public void testComputIva_float() {
        System.out.println("computIva");
        float base = 25.0F;
        float expResult = 3.0F;
        float result = Tax.computIva(base);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
