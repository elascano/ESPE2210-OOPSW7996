/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.tax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class TaxTest {

    public TaxTest() {
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva_float_float() {
        System.out.println("computeIva");
        float base = 130.0F;
        float ivaPercentage = 0.12F;
        float expResult = 15.6F;
        float result = Tax.computeIva(base, ivaPercentage);

        assertEquals(expResult, result, 0);

    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() {
        System.out.println("computeRentTax");
        float monthSalary = 10000F;
        float expResult = 23378.88F;
        float result = Tax.computeRentTax(monthSalary);
        assertEquals(expResult, result, 0);

    }

}
