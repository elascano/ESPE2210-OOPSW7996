package ec.edu.espe.AirporTaxiScheduling.model;

import ec.edu.espe.AirporTaxiScheduling.utils.FileManager;
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
public class TarifSingletonTest {

          public TarifSingletonTest() {
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
           * Test of totalTarif method, of class TarifSingleton.
           */
          @Test
          public void testTotalTarif() {
                    System.out.println("totalTarif");

                    TarifSingleton instance = TarifSingleton.getInstance();
                    ArrayList<TarifSingleton> valuesTestList = new ArrayList<TarifSingleton>();
                    valuesTestList = FileManager.readJsonTarif(valuesTestList, "testValuesForObtainTarif.json");
                    for (int i = 0; i < valuesTestList.size(); i++) {
                              float kilometer = valuesTestList.get(i).getKilometerNumber();
                              float expResult = valuesTestList.get(i).getKilometerValue();
                              float result = instance.totalTarif(kilometer);
                              assertEquals(expResult, result, 0);
                    }
          }

}
