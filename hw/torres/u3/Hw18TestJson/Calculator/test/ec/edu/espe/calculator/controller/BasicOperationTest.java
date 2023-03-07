package ec.edu.espe.calculator.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.calculator.model.DataFormat.DataFormat;

import java.io.BufferedReader;
import java.io.File;
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
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
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
    
    @Test
    public void testAdd() {
        System.out.println("add");
        BasicOperation instance = new BasicOperation();
        float addend1;
        float addend2;
        float expSum;
        float Sum;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("AddTestCases.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("*** THE FILE DOESN'T EXIST, IT WILL BE CREATED ***");
        } catch (IOException ex) {
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }

        for (DataFormat dataFormat : data) {
            addend1 = dataFormat.getValue1();
            addend2 = dataFormat.getValue2();
            expSum = dataFormat.getExpResult();
            Sum = instance.add(addend1, addend2);
            assertEquals(expSum, Sum, 0);
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
            BufferedReader br = new BufferedReader(new FileReader("SubtractTestCases.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("*** THE FILE DOESN'T EXIST, IT WILL BE CREATED ***");
        } catch (IOException ex) {
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }

        for (DataFormat dataFormat : data) {
            minuend = dataFormat.getValue1();
            subtrahend = dataFormat.getValue2();
            expDifference = dataFormat.getExpResult();
            difference = instance.subtract(minuend, subtrahend);
            assertEquals(expDifference, difference, 0);
        }
    }
    
    
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        BasicOperation instance = new BasicOperation();
        float multiplicand;
        float multiplicator;
        float expProduct;
        float product;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MultiplyTestCases.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("*** THE FILE DOESN'T EXIST, IT WILL BE CREATED ***");
        } catch (IOException ex) {
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }

        for (DataFormat dataFormat : data) {
            multiplicand = dataFormat.getValue1();
            multiplicator = dataFormat.getValue2();
            expProduct = dataFormat.getExpResult();
            product = instance.multiply(multiplicand, multiplicator);
            assertEquals(expProduct, product, 0);
        }
    }
    
    @Test
    public void testDivide() {
        System.out.println("divide");
        BasicOperation instance = new BasicOperation();
        float divisor;
        float dividend;
        float expQuotient;
        float quotient;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("DivideTestCases.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("*** THE FILE DOESN'T EXIST, IT WILL BE CREATED ***");
        } catch (IOException ex) {
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }

        for (DataFormat dataFormat : data) {
            divisor = dataFormat.getValue1();
            dividend = dataFormat.getValue2();
            expQuotient = dataFormat.getExpResult();
            quotient = instance.divide(divisor, dividend);
            assertEquals(expQuotient, quotient, 0);
        }
    }

}
