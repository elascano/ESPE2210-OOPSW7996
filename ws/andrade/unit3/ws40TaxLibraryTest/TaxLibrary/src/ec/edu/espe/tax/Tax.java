package ec.edu.espe.tax;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO-ESPE
 */
public class Tax {
    

    public static double computeIva(double base, double ivaPercentage) {
        double iva;
        iva = base * ivaPercentage;
        return Math.round(iva * 100.0) / 100.0;
    }

    public static double computeIva(double base) {
        double iva;
        iva = base * 0.12F;
        return Math.round(iva * 100.0) / 100.0;
    }

    public static double computeRentTax(double monthlySalary, double costs) {

        double value;
        double iessContribution = (monthlySalary * 0.0945F) * 12;
        value = (monthlySalary * 12) - iessContribution - costs;

        if (value <= 11310.00F) {
            value = value * 0;
        }
        if (value > 11310.00F && value <= 14410.00F) {
            value = (value - 11310.00F) * 0.05F;
        }
        if (value > 14410.00F && value <= 18010.00F) {
            value = ((value - 14410.00F) * 0.10F) + 155.00F;
        }
        if (value > 18010.00F && value <= 21630.00F) {
            value = ((value - 18010.00F) * 0.12F) + 515.00F;
        }
        if (value > 21630.00F && value <= 31630.00F) {
            value = ((value - 21630.00F) * 0.15F) + 949.40F;
        }
        if (value > 31630.00F && value <= 41630.00F) {
            value = ((value - 31630.00F) * 0.20F) + 2449.40F;
        }
        if (value > 41630.00F && value <= 51630.00F) {
            value = ((value - 41630.00F) * 0.25F) + 4449.40F;
        }
        if (value > 51630.00F && value <= 61630.00F) {
            value = ((value - 51630.00F) * 0.30F) + 6949.40F;
        }
        if (value > 61630.00F && value <= 100000.00F) {
            value = ((value - 51630.00F) * 0.35F) + 9949.40F;
        }
        if (value > 100000.00F) {
            value = ((value - 100000.00F) * 0.37F) + 23378.88F;
        }

        return Math.round(value * 100.0) / 100.0;

    }

}
