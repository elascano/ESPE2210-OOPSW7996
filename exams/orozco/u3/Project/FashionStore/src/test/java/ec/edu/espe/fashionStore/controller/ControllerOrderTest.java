
package ec.edu.espe.fashionStore.controller;

import ec.edu.espe.fashionstore.model.Order;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ControllerOrderTest {
    
    public ControllerOrderTest() {
    }

    @Test
    public void testCreateOrder() {
        System.out.println("CreateOrder");
        Order order = null;
        ControllerOrder.CreateOrder(order);
        fail("The test case is a prototype.");
    }
    
}
