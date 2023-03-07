
package ec.edu.espe.fashionStore.controller;

import ec.edu.espe.fashionstore.model.Measurement;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ControllerMeasurementTest {
    
    public ControllerMeasurementTest() {
    }

    @Test
    public void testCalculateProductionCost() {
        System.out.println("calculateProductionCost");
        Measurement measurement = null;
        float expResult = 0.0F;
        float result = ControllerMeasurement.calculateProductionCost(measurement);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
