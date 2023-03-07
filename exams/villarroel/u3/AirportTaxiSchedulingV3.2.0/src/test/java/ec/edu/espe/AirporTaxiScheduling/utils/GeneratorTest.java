package ec.edu.espe.AirporTaxiScheduling.utils;

import ec.edu.espe.AirporTaxiScheduling.model.ObtainIdClass;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class GeneratorTest {

    public GeneratorTest() {
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
           * Test of obtainIdTraveler method, of class Generator.
           */
          @Test
          public void testObtainIdTraveler() {
                    System.out.println("obtainIdTraveler");
                    ArrayList<ObtainIdClass> valuesTestList = new ArrayList<ObtainIdClass>();
                    valuesTestList = FileManager.readJsonId(valuesTestList, "testValuesForObtainId.json");
                    for (int i = 0; i < valuesTestList.size(); i++) {
                              String obtainId = valuesTestList.get(i).getObtainId();
                              int expResult = valuesTestList.get(i).getId();
                              int result = Generator.obtainIdTraveler(obtainId);
                              assertEquals(expResult, result);
                    }
                  
          }

}