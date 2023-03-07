package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.Operation;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class BasicOperationTest {

    public BasicOperationTest() {
    }

    ArrayList<Operation> operations = new ArrayList<>();

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        operations = FileManager.readJson(operations, "addTestCases.json");
        System.out.println("add");
        for (int i = 0; i < operations.size(); i++) {
            double addend1 = operations.get(i).getValue1();
            double addent2 = operations.get(i).getValue2();;
            double expResult = operations.get(i).getExpectedValue();;
            double result = BasicOperation.add(addend1, addent2);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        double addend1 = -56.88;
        double addent2 = -235.00;
        double expResult = -291.88;
        double result = BasicOperation.add(addend1, addent2);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() {

        operations = FileManager.readJson(operations, "addTestCases.json");
        System.out.println("substract");
        for (int i = 0; i < operations.size(); i++) {
            double minuend = operations.get(i).getValue1();
            double subtrahend = operations.get(i).getValue2();
            double expResult = operations.get(i).getExpectedValue();
            double result = BasicOperation.substract(minuend, subtrahend);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {

        operations = FileManager.readJson(operations, "addTestCases.json");
        System.out.println("multiply");
        for (int i = 0; i < operations.size(); i++) {
            double multiplicand = operations.get(i).getValue1();
            double muliplier = operations.get(i).getValue2();
            double expResult = operations.get(i).getExpectedValue();
            double result = BasicOperation.multiply(multiplicand, muliplier);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        operations = FileManager.readJson(operations, "addTestCases.json");
        System.out.println("divide");
        for (int i = 0; i < operations.size(); i++) {
            double dividend = operations.get(i).getValue1();
            double divisor = operations.get(i).getValue2();
            double expResult = operations.get(i).getExpectedValue();
            double result = BasicOperation.divide(dividend, divisor);
            assertEquals(expResult, result, 0);
        }
    }
}
