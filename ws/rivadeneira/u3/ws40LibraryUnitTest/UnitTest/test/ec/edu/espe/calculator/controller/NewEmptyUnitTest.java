
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
public class NewEmptyUnitTest {
    
    public NewEmptyUnitTest() {
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
            addend1 = dataFormat.getAddend1();
            addend2 = dataFormat.getAddend2();
            expResult = dataFormat.getExpResult();
            result = instance.add(addend1, addend2);
            assertEquals(expResult, result, 0);
        }
    }
}    

   