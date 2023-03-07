package ec.edu.espe.AirporTaxiScheduling.controller;

import ec.edu.espe.AirporTaxiScheduling.model.Accounting;
import ec.edu.espe.AirporTaxiScheduling.utils.FileManager;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class AccountingControllerTest {

          /**
           * Test of calculateLostPercent method, of class AccountingController.
           */
          @Test
          public void testCalculateLostPercent() {
                    System.out.println("calculateLostPercent");
                    ArrayList<Accounting> valuesTestList = new ArrayList<Accounting>();
                    valuesTestList = FileManager.readJson(valuesTestList, "testValuesForCalculateTolal.json");
                    for (int i = 0; i < valuesTestList.size(); i++) {
                              float payedValues = valuesTestList.get(i).getPayedValues();
                              float outsValues = valuesTestList.get(i).getOutsValues();
                              float expResult = valuesTestList.get(i).getPercentageLost();
                              float result = AccountingController.calculateLostPercent(payedValues, outsValues);
                              assertEquals(expResult, result, 0);

                    }

          }

          /**
           * Test of calculateTotal method, of class AccountingController.
           */
          @Test
          public void testCalculateTotal() {
                    System.out.println("calculateTotal");
                    ArrayList<Accounting> valuesTestList = new ArrayList<Accounting>();
                   valuesTestList =  FileManager.readJson(valuesTestList, "testValuesForCalculateTolal.json");
                    for (int i = 0; i < valuesTestList.size(); i++) {
                              ArrayList<Float> values = valuesTestList.get(i).getValues();
                              float expResult = valuesTestList.get(i).getTotalValue();
                              float result = AccountingController.calculateTotal(values);
                              assertEquals(expResult, result, 0);
                    }

          }

}
