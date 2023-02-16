package ec.edu.espe.calculator.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.json.JSONArray;
import org.json.JSONObject;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class BasicOperationTest {

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() throws IOException {
        File file = new File("testAdd.json");
        String json = new String(Files.readAllBytes(file.toPath()));
        JSONArray testCases = new JSONArray(json);

        for (int i = 0; i < testCases.length(); i++) {
            JSONObject testCase = testCases.getJSONObject(i);
            float addend1 = testCase.getFloat("addend1");
            float addend2 = testCase.getFloat("addend2");
            BasicOperation instance = new BasicOperation();
            float expectedResult = testCase.getFloat("result");
            float result = instance.add(addend1, addend2);
            assertEquals(expectedResult, result, 0);
        }
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() throws IOException {
        File file = new File("testSubtract.json");
        String json = new String(Files.readAllBytes(file.toPath()));
        JSONArray testCases = new JSONArray(json);

        for (int i = 0; i < testCases.length(); i++) {
            JSONObject testCase = testCases.getJSONObject(i);
            float minuend = testCase.getFloat("minuend");
            float subtrahend = testCase.getFloat("subtrahend");
            BasicOperation instance = new BasicOperation();
            float expectedResult = testCase.getFloat("difference");
            float result = instance.subtract(minuend, subtrahend);
            assertEquals(expectedResult, result, 0);
        }
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() throws IOException {
        File file = new File("testMultiply.json");
        String json = new String(Files.readAllBytes(file.toPath()));
        JSONArray testCases = new JSONArray(json);

        for (int i = 0; i < testCases.length(); i++) {
            JSONObject testCase = testCases.getJSONObject(i);
            float multiplicand = testCase.getFloat("multiplicand");
            float multiplier = testCase.getFloat("multiplier");
            BasicOperation instance = new BasicOperation();
            float expectedResult = testCase.getFloat("product");
            float result = instance.multiply(multiplicand, multiplier);
            assertEquals(expectedResult, result, 0);
        }
    }

    /**
     * Test of division method, of class BasicOperation.
     */
    @Test
    public void testDivision() throws IOException {
        File file = new File("testDivision.json");
        String json = new String(Files.readAllBytes(file.toPath()));
        JSONArray testCases = new JSONArray(json);

        for (int i = 0; i < testCases.length(); i++) {
            JSONObject testCase = testCases.getJSONObject(i);
            float dividend = testCase.getFloat("dividend");
            float divisor = testCase.getFloat("divisor");
            BasicOperation instance = new BasicOperation();
            float expectedResult = testCase.getFloat("quotient");
            float result = instance.division(dividend, divisor);
            assertEquals(expectedResult, result, 0);
        }
    }

}
