package ec.edu.espe.tax;
import java.time.LocalDate;

 /**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computeGreenTax(float cylinderCapacity, int carYear) {
        float greenTax;
        int currentYear = LocalDate.now().getYear();
        int yearsOfAntiguaty = currentYear - carYear;
        float cylinderValue = 0.0F;
        float antiguityPercentage = 0.0F;

        if (cylinderCapacity <= 1500) {
            cylinderValue = 0.00F;
        } 
        else if (cylinderCapacity > 1500 && cylinderCapacity <= 2000) {
            cylinderValue = 0.08F;
        } 
        else if (cylinderCapacity > 2000 && cylinderCapacity <= 2500) {
            cylinderValue = 0.09F;
        } 
        else if (cylinderCapacity > 2500 && cylinderCapacity <= 3000) {
            cylinderValue = 0.11F;
        } 
        else if (cylinderCapacity > 3000 && cylinderCapacity <= 3500) {
            cylinderValue = 0.12F;
        }
        else if (cylinderCapacity > 3500 && cylinderCapacity <= 4000) {
            cylinderValue = 0.24F;
        }
        else if (cylinderCapacity > 4000) {
            cylinderValue = 0.35F;
        }

        if (yearsOfAntiguaty < 5) {
            antiguityPercentage = 0;
        }
        else if (yearsOfAntiguaty >= 5 && yearsOfAntiguaty <= 10) {
            antiguityPercentage = 0.05F;
        }
        else if (yearsOfAntiguaty > 10 && yearsOfAntiguaty <= 15) {
            antiguityPercentage = 0.10F;
        }
        else if (yearsOfAntiguaty > 15 && yearsOfAntiguaty <= 20) {
            antiguityPercentage = 0.15F;
        }
        else if (yearsOfAntiguaty > 20) {
            antiguityPercentage = 0.20F;
        }

        greenTax = ((cylinderCapacity - 1500) * cylinderValue) * (1 + antiguityPercentage);
        return greenTax;
    }

    public static float computeRentTax(float monthlySalary) {

        float anualSalary = 0;
        float iessContribution = 0;
        float rentTax = 0;
        float surplusTax = 0;
        float basicTax = 0;
        float surplus = 0;
        anualSalary = monthlySalary * 12;
        iessContribution = (monthlySalary * 0.095F) * 12;
        if (anualSalary >= 0 && anualSalary <= 11310) {
            surplus = 11310;

        } else if (anualSalary > 11310 && anualSalary <= 14410) {
            surplus = 14410;
            surplusTax = 0.05F;
        } else if (anualSalary > 14410 && anualSalary <= 18010) {
            surplus = 18010;
            surplusTax = 0.1F;
            basicTax = 155;
        } else if (anualSalary > 18010 && anualSalary <= 21630) {
            surplus = 21630;
            surplusTax = 0.12F;
            basicTax = 515;
        } else if (anualSalary > 21630 && anualSalary <= 31630) {
            surplus = 31630;
            surplusTax = 0.15F;
            basicTax = 949.40F;
        } else if (anualSalary > 31630 && anualSalary <= 41630) {
            surplus = 41630;
            surplusTax = 0.2F;
            basicTax = 2449.40F;
        } else if (anualSalary > 41630 && anualSalary <= 51630) {
            surplus = 51630;
            surplusTax = 0.25F;
            basicTax = 4449.39F;
        } else if (anualSalary > 51630 && anualSalary <= 61630) {
            surplus = 61630;
            surplusTax = 0.3F;
            basicTax = 6949.39F;
        } else if (anualSalary > 61630 && anualSalary <= 100000) {
            surplus = 100000;
            surplusTax = 0.35F;
            basicTax = 9949.39F;
        } else if (anualSalary > 100000) {
            surplusTax = 0.37F;
            basicTax = 23378.88F;

        }
        rentTax = ((surplus - anualSalary) * surplusTax) + basicTax;
        rentTax = (rentTax + iessContribution);
        return rentTax;
    }

    public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F; //this information must be centrallizer somewe
        return iva;
    }
}
