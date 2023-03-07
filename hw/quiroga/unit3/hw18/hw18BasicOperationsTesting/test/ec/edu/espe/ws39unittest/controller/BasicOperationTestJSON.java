/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.ws39unittest.controller;

import ec.edu.espe.ws39unittest.model.TestValue;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class BasicOperationTestJSON {

    FileManager file = new FileManager();
    ArrayList<TestValue> testValues = new ArrayList<TestValue>();
    String additionTestFile = "Addition Test File";
    String subtractionTestFile = "Subtraction Test File";
    String multiplyTestFile = "Multiply Test File";
    String divideTestFile = "Divide Test File";

    public BasicOperationTestJSON() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        testValues = file.readJson(testValues, additionTestFile);
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("addition " + i + 1);
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
        testValues = file.readJson(testValues, subtractionTestFile);
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("addition " + i + 1);
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
        testValues = file.readJson(testValues, additionTestFile);
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("addition " + i + 1);
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
        testValues = file.readJson(testValues, divideTestFile);
        for (int i = 0; i < testValues.size(); i++) {
            System.out.println("addition " + i + 1);
            double dividend = testValues.get(i).getFirstValue();
            double divisor = testValues.get(i).getSecondValue();
            BasicOperation instance = new BasicOperation();
            double expResult = testValues.get(i).getExpectedResult();
            double result = instance.divide(dividend, divisor);
            assertEquals(expResult, result, 0);
        }
    }

}
