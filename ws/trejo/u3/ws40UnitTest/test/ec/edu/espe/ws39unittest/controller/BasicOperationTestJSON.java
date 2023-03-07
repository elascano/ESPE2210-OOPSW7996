
package ec.edu.espe.ws39unittest.controller;

import ec.edu.espe.ws39unittest.model.TestValue;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class BasicOperationTestJSON {

    public BasicOperationTestJSON() {
    }
    
    TestValue testValue = new TestValue();
    ArrayList<TestValue> testValues = new ArrayList<TestValue>();
    

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        testValues = FileManager.readJson(testValues, "Addition Test File.json");
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("Addition " + (i + 1));
            double addend1 = testValues.get(i).getFirstValue();
            double addend2 = testValues.get(i).getSecondValue();
            BasicOperation instance = new BasicOperation();
            double expResult = testValues.get(i).getExpectedResult();
            double result = instance.add(addend1, addend2);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        testValues = FileManager.readJson(testValues, "Subtraction Test File.json");
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("Subtraction " + (i + 1));
            double minuend = testValues.get(i).getFirstValue();
            double subtraend = testValues.get(i).getSecondValue();
            BasicOperation instance = new BasicOperation();
            double expResult = testValues.get(i).getExpectedResult();
            double result = instance.subtract(minuend, subtraend);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        testValues = FileManager.readJson(testValues, "Multiply Test File.json");
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("Multiplication " + (i + 1));
            double multiplicand = testValues.get(i).getFirstValue();
            double multiplier = testValues.get(i).getSecondValue();
            BasicOperation instance = new BasicOperation();
            double expResult = testValues.get(i).getExpectedResult();
            double result = instance.multiply(multiplicand, multiplier);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        testValues = FileManager.readJson(testValues, "Divide Test File.json");
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("Division " + (i + 1));
            double dividend = testValues.get(i).getFirstValue();
            double divisor = testValues.get(i).getSecondValue();
            BasicOperation instance = new BasicOperation();
            double expResult = testValues.get(i).getExpectedResult();
            double result = instance.divide(dividend, divisor);
            assertEquals(expResult, result, 0);
        }
    }

}
