package ec.edu.espe.tax;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author Alejandro Cuadrado, DeveloperBears,DCCO-ESPE
 */
public class TaxTest {
    @Test
    public void testComputeIva_float_float() {
        System.out.println("computeIva");
        float base = 50.8F;
        float ivaPercentage = 0.12F;
        float expResult = 6.096F;
        float result = Tax.computeIva(base, ivaPercentage);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testComputeIva_float() {
        System.out.println("computeIva");
        float base = 60.2F;
        float expResult = 7.224F;
        float result = Tax.computeIva(base);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testComputerGreenTax() {
        System.out.println("computerGreenTax");
        float cylinderCapacity = 2800.0F;
        int yearOfTheCar = 2018;
        String typeOfCar = "gas";
        float expResult = 150.15F;
        float result = Tax.computerGreenTax(cylinderCapacity, yearOfTheCar, typeOfCar);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testComputerRentTax() {
        System.out.println("computerRentTax");
        float monthSalary = 5800.5F;
        float expResult = 20587.3F;
        float result = Tax.computerRentTax(monthSalary);
        assertEquals(expResult, result, 0);
    }
}