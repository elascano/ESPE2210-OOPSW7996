package ec.edu.espe.calculator.controller;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.calculator.model.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Gson gson = new Gson();
        BasicOperation instance = new BasicOperation();        
        Type listType = new TypeToken<List<TestCase>>(){}.getType();
        List<TestCase> testCases = new ArrayList<>();
        try {
            testCases = gson.fromJson(new FileReader("testCasesAdd.json"), listType);
        } catch (Exception e) {
            
        }        

        for (TestCase testCase : testCases) {
            float result = instance.add(testCase.getValue1(), testCase.getValue2());
            assertEquals(testCase.getExpectedResult(), result, 0);
        }
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Gson gson = new Gson();
        BasicOperation instance = new BasicOperation();        
        Type listType = new TypeToken<List<TestCase>>(){}.getType();
        List<TestCase> testCases = new ArrayList<>();
        try {
            testCases = gson.fromJson(new FileReader("testCasesSubtract.json"), listType);
        } catch (Exception e) {
            
        }        

        for (TestCase testCase : testCases) {
            float result = instance.subtract(testCase.getValue1(), testCase.getValue2());
            assertEquals(testCase.getExpectedResult(), result, 0);
        }
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Gson gson = new Gson();
        BasicOperation instance = new BasicOperation();        
        Type listType = new TypeToken<List<TestCase>>(){}.getType();
        List<TestCase> testCases = new ArrayList<>();
        try {
            testCases = gson.fromJson(new FileReader("testCasesMultiply.json"), listType);
        } catch (Exception e) {
            
        }        

        for (TestCase testCase : testCases) {
            System.out.println("Test");
            float result = instance.multiply(testCase.getValue1(), testCase.getValue2());
            assertEquals(testCase.getExpectedResult(), result, 0);
        }
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Gson gson = new Gson();
        BasicOperation instance = new BasicOperation();        
        Type listType = new TypeToken<List<TestCase>>(){}.getType();
        List<TestCase> testCases = new ArrayList<>();
        try {
            testCases = gson.fromJson(new FileReader("testCasesDivide.json"), listType);
        } catch (Exception e) {
            
        }        

        for (TestCase testCase : testCases) {
            System.out.println("prueba");
            float result = instance.divide(testCase.getValue1(), testCase.getValue2());
            assertEquals(testCase.getExpectedResult(), result, 0);
        }
    }
    
}
