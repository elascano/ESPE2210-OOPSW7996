package ec.edu.espe.calculator.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.calculator.model.DataFormat;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class BasicOperationTest {

    public BasicOperationTest() {
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
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BasicOperation instance = new BasicOperation();
        float addend1;
        float addend2;
        float expSum;
        float sum;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("AddTestCase.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found, you need to create it");
        } catch (IOException ex) {
            System.out.println("The file can't be read");
        }

        for (DataFormat dataFormat : data) {
            addend1 = dataFormat.getAddend1();
            addend2 = dataFormat.getAddend2();
            expSum = dataFormat.getExpSum();
            sum = instance.add(addend1, addend2);
            assertEquals(expSum, sum, 0);
        }
    }
    
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        BasicOperation instance = new BasicOperation();
        float minuend;
        float subtrahend;
        float expDifference;
        float difference;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("SubtractTestCase.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found, you need to create it");
        } catch (IOException ex) {
            System.out.println("The file can't be read");
        }

        for (DataFormat dataFormat : data) {
            minuend = dataFormat.getMinuend();
            subtrahend = dataFormat.getSubtrahend();
            expDifference = dataFormat.getExpDifference();
            difference = instance.subtract(minuend, subtrahend);
            assertEquals(expDifference, difference, 0);
        }
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        BasicOperation instance = new BasicOperation();
        float multiplicand;
        float multiplier;
        float expProduct;
        float product;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MultiplyTestCase.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found, you need to create it");
        } catch (IOException ex) {
            System.out.println("The file can't be read");
        }

        for (DataFormat dataFormat : data) {
            multiplicand = dataFormat.getMultiplicand();
            multiplier = dataFormat.getMultiplier();
            expProduct = dataFormat.getExpProduct();
            product = instance.multiply(multiplicand, multiplier);
            assertEquals(expProduct, product, 0);
        }
    }
    
    @Test
    public void testDivide() {
        System.out.println("divide");
        BasicOperation instance = new BasicOperation();
        float dividend;
        float divisor;
        float expQuotient;
        float quotient;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("DivideTestCase.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found, you need to create it");
        } catch (IOException ex) {
            System.out.println("The file can't be read");
        }

        for (DataFormat dataFormat : data) {
            dividend = dataFormat.getDividend();
            divisor = dataFormat.getDivisor();
            expQuotient = dataFormat.getExpQuotient();
            quotient = instance.divide(dividend, divisor);
            assertEquals(expQuotient, quotient, 0);
        }
    }
      
}
