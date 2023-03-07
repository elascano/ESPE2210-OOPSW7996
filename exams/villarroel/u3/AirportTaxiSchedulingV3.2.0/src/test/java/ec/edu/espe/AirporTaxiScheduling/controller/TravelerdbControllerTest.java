package ec.edu.espe.AirporTaxiScheduling.controller;

import ec.edu.espe.AirporTaxiScheduling.model.Traveler;
import ec.edu.espe.AirporTaxiScheduling.model.TravelerTest;
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
public class TravelerdbControllerTest {

          public TravelerdbControllerTest() {
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
           * Test of findDocumentdb method, of class TravelerdbController.
           */
          @Test
          public void testFindDocumentdb() {
                    System.out.println("findDocumentdb");
                    ArrayList<TravelerTest> valuesTestList = new ArrayList<TravelerTest>();
                    valuesTestList = FileManager.readJsonTraveler(valuesTestList, "testValuesForTraveler.json");
                    for (int i = 0; i < valuesTestList.size(); i++) {
                              Traveler traveler = new Traveler();
                              int idFinder = valuesTestList.get(i).getIdFinder();
                              Traveler expResult = valuesTestList.get(i).getTraveler();
                              Traveler result = TravelerdbController.findDocumentdb(traveler, idFinder);
                              assertEquals(expResult, result);

                    }

          }

          
}
