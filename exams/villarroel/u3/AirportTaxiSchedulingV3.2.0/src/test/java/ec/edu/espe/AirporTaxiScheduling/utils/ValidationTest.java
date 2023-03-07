package ec.edu.espe.AirporTaxiScheduling.utils;

import ec.edu.espe.AirporTaxiScheduling.model.IdValidatorClass;
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
public class ValidationTest {

          public ValidationTest() {
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
           * Test of IdValidation method, of class Validation.
           */
          @Test
          public void testIdValidation() {
                    System.out.println("IdValidation");
                    ArrayList<IdValidatorClass> valuesTestList = new ArrayList<IdValidatorClass>();
                    valuesTestList = FileManager.readJsonIdValidator(valuesTestList, "testValuesForIdValidation.json");
                    for (int i = 0; i < valuesTestList.size(); i++) {
                              String idValidator = valuesTestList.get(i).getId();
                              boolean expResult = valuesTestList.get(i).isValidator();
                              boolean result = Validation.IdValidation(idValidator);
                              assertEquals(expResult, result);
                    }
          }

}
