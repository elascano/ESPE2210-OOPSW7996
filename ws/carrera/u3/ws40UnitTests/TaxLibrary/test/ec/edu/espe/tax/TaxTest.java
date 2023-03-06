package ec.edu.espe.tax;


import java.text.ParseException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeNatualPersonIncomeTax method, of class Tax.
     */
    @Test
    public void testComputeNatualPersonIncomeTax() throws ParseException {
        System.out.println("computeNatualPersonRentTax");
        float annualSalary = 23000.0F;
        float personalExpenses = 1000.0F;
        float withholdings = 50.0F;
        float expResult = 104.90F;
        float result = Tax.computeNatualPersonIncomeTax(annualSalary, personalExpenses, withholdings);
        assertEquals(expResult, result, 0);
    }
    /**
     * Test of computeNatualPersonIncomeTax with negative numbersmethod, of class Tax.
     */
    @Test
    public void testComputeNatualPersonNegativeIncomeTax() throws ParseException {
        System.out.println("computeNatualPersonRentTax");
        float annualSalary = -23000.0F;
        float personalExpenses = 1000.0F;
        float withholdings = 50.0F;
        float expResult = 0.0F;
        float result = Tax.computeNatualPersonIncomeTax(annualSalary, personalExpenses, withholdings);
        assertEquals(expResult, result, 0);
    }
    

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() throws ParseException {
        System.out.println("computeIva");
        float base = 25.3F;
        float ivaPercentage = 0.12F;
        float expResult = 28.34F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
    }
    /**
     * Test of computeIva method with Negative Numbers, of class Tax.
     */
    @Test
    public void testComputeNegativeIva() throws ParseException {
        System.out.println("computeIva");
        float base = -15.0F;
        float ivaPercentage = 0.12F;
        float expResult = 0.0F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
    }
    
}
