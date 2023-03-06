package ec.edu.espe.taxes.controller.test;

import ec.edu.espe.taxes.controller.controller;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class controllerTest {

    public controllerTest() {
    }

    /**
     * Test of computeIva method, of class controller.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 10.0F;
        float ivaPorcentage = 1.12F;
        float expResult = 11.2F;
        float result = controller.computeIva(base, ivaPorcentage);
        assertEquals(expResult, result, 0);

        base = 25.50000F;
        ivaPorcentage = 1.12F;
        expResult = 28.56F;
        result = controller.computeIva(base, ivaPorcentage);
    }

    /**
     * Test of computerGreenTax method, of class controller.
     */
    @Test
    public void testComputerGreenTax() {
        System.out.println("computerGreenTax");
        float cilindersc = 2500F;
        float cylinder = 0.8F;
        float age = 10.0F;
        float expResult = 8800.0F;
        float result = controller.computerGreenTax(cilindersc, cylinder, age);
        assertEquals(expResult, result, 0);

        cilindersc = 3500;
        cylinder = 0.12F;
        age = 15.0F;
        expResult = 0;
        result = controller.computerGreenTax(cilindersc, cylinder, age);
    }

}
