package ec.edu.espe.urbanizationtreasury.controller;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joela
 */
public class MathOperationTest {
    
    public MathOperationTest() {
    }

    /**
     * Test of CalculateAmount method, of class MathOperation.
     */
    @Test
    public void testCalculateAmount() {
        System.out.println("CalculateAmount");
        JComboBox<String> cbMounthNumber = null;
        JLabel lbCalculator = null;
        MathOperation instance = new MathOperation();
        instance.CalculateAmount(cbMounthNumber, lbCalculator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicationMonths method, of class MathOperation.
     */
    @Test
    public void testMultiplicationMonths() {
        System.out.println("multiplicationMonths");
        float amountpayable = 0.0F;
        float monthNumber = 0.0F;
        MathOperation instance = new MathOperation();
        float expResult = 0.0F;
        float result = instance.multiplicationMonths(amountpayable, monthNumber);
        assertEquals(expResult, result, 0);
    }
    
}
