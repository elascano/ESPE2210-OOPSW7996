/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.calculator.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.calculator.model.DataFormat;
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
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
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
        float expResult;
        float result;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("AdditionTestCases.json"));
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
            addend1=dataFormat.getValue1();
            addend2=dataFormat.getValue2();
            expResult=dataFormat.getExpResult();
            result=instance.add(addend1, addend2);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        BasicOperation instance = new BasicOperation();
        float minuend;
        float substrahend;
        float expResult;
        float result;

        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("SubstractTestCases.json"));
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
            minuend=dataFormat.getValue1();
            substrahend=dataFormat.getValue2();
            expResult=dataFormat.getExpResult();
            result=instance.substract(minuend, substrahend);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        BasicOperation instance = new BasicOperation();
        float multiplicand;
        float multiplicator;
        float expResult;
        float result;
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
            multiplicand=dataFormat.getValue1();
            multiplicator=dataFormat.getValue2();
            expResult=dataFormat.getExpResult();
            result=instance.multiply(multiplicand, multiplicator);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        BasicOperation instance = new BasicOperation();
        float dividend;
        float divisor;
        float expResult;
        float result;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("DivisionTestCases.json"));
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
            dividend=dataFormat.getValue1();
            divisor=dataFormat.getValue2();
            expResult=dataFormat.getExpResult();
            result=instance.divide(dividend, divisor);
            assertEquals(expResult, result, 0);
        }
    }

}
