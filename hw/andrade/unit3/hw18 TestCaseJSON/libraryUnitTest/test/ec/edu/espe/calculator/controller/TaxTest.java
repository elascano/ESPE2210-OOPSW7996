package ec.edu.espe.calculator.controller;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
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
     * Test of computeIva method, of class TaxOperation.
     */
    @Test
    public void testComputeIva_double_double() {
        System.out.println("computeIva");
        double base = 15.0;
        double ivaPercentage = 0.24;
        double expResult = 18.6;
        double result = TaxOperation.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of computeIva method, of class TaxOperation.
     */
    @Test
    public void testComputeIva_float() {
        System.out.println("computeIva");
        double base = 0.0;
        double expResult = 0.0;
        double result = TaxOperation.computeIva(base);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of computeRentTax method, of class TaxOperation.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        double salary = 31253.37;
        double costs = 2000.00;
        double expResult = 111290.5538;
        double result = TaxOperation.computeRentTax(salary, costs);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of computeGreenTax method, of class TaxOperation.
     */
    @Test
    public void testComputeGreenTax() {
        System.out.println("computeGreenTax");
        int cilindricalNumber = 0;
        LocalDate purchaseDate = LocalDate.now();
        float expResult = 0.0F;
        float result = TaxOperation.computeGreenTax(cilindricalNumber, purchaseDate);
        assertEquals(expResult, result, 0);

    }

}
