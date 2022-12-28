package ec.edu.espe.tax;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F;
        return iva;
    }

    public static float computeGreenTax(float cylinderCapacity, float yearsOfTheCar) {

        float taxBase = 0F;
        float adjustmentFactor = 0F;
        float totalToPay;

        if (cylinderCapacity <= 1500 || yearsOfTheCar < 5) {
            return 0.0F;
        } else {
            taxBase = calculateCylinderTaxBase(cylinderCapacity, taxBase);
            adjustmentFactor = calculateAdjustmentFactor(yearsOfTheCar, adjustmentFactor);
            totalToPay = ((cylinderCapacity - 1500) * taxBase) * (1 + adjustmentFactor);
            return totalToPay;
        }

    }

    public static float computeRentTax(float monthlySalary, float monthlyExpenses) {

        float yearNetIncome = monthlySalary * 12F;
        float yearExpenses = monthlyExpenses * 12F;
        float iessDeduction = yearNetIncome * 0.0945F;
        float taxBase = yearNetIncome - yearExpenses - iessDeduction;

        float totalOfTaxesToPay = calculateRentTax(taxBase);

        return totalOfTaxesToPay;

    }

    private static float calculateRentTax(float taxBase) {
        float rentTax = 0.0F;
        float surplus = 0.0F;
        if (taxBase >= 0 && taxBase <= 11300) {
            rentTax = 0.0F;
            return rentTax;
        } else if (taxBase >= 11310.01 && taxBase <= 14410) {
            surplus = 14410F - taxBase;
            rentTax = surplus * 0.05F;
            return rentTax;

        } else if (taxBase >= 14410.01 && taxBase <= 18010) {
            surplus = 18010F - taxBase;
            rentTax = surplus * 0.1F;
            return rentTax;

        } else if (taxBase >= 18010.01 && taxBase <= 21630) {
            surplus = 21630F - taxBase;
            rentTax = surplus * 0.12F;
            return rentTax;

        } else if (taxBase >= 21630.01 && taxBase <= 31630) {
            surplus = 31630F - taxBase;
            rentTax = surplus * 0.15F;
            return rentTax;

        } else if (taxBase >= 31630.01 && taxBase <= 41630) {
            surplus = 41630F - taxBase;
            rentTax = surplus * 0.2F;
            return rentTax;

        } else if (taxBase >= 41630.01 && taxBase <= 51630) {
            surplus = 51630F - taxBase;
            rentTax = surplus * 0.25F;
            return rentTax;

        } else if (taxBase >= 51630.01 && taxBase <= 61630) {
            surplus = 61630F - taxBase;
            rentTax = surplus * 0.3F;
            return rentTax;

        } else if (taxBase >= 61630.01 && taxBase <= 100000) {
            surplus = 100000F - taxBase;
            rentTax = surplus * 0.35F;
            return rentTax;
        } else if (taxBase > 100000) {
            rentTax = 0.37F;
            return rentTax;
        } else {
            return 0.0F;
        }
    }

    private static float calculateAdjustmentFactor(float yearsOfTheCar, float adjustmentFactor) {
        if (yearsOfTheCar >= 5) {
            adjustmentFactor = 0F;
        } else if (yearsOfTheCar >= 5 || yearsOfTheCar <= 10) {
            adjustmentFactor = 0.05F;
        } else if (yearsOfTheCar >= 11 || yearsOfTheCar <= 15) {
            adjustmentFactor = 0.1F;
        } else if (yearsOfTheCar >= 16 || yearsOfTheCar <= 20) {
            adjustmentFactor = 0.15F;
        } else if (yearsOfTheCar < 20) {
            adjustmentFactor = 0.20F;
        }
        return adjustmentFactor;
    }

    private static float calculateCylinderTaxBase(float cylinderCapacity, float taxBase) {
        if (1501 <= cylinderCapacity || cylinderCapacity <= 2000) {
            taxBase = 0.08F;
        } else if (2001 <= cylinderCapacity || cylinderCapacity <= 2500) {
            taxBase = 0.09F;
        } else if (2501 <= cylinderCapacity || cylinderCapacity <= 3000) {
            taxBase = 0.11F;
        } else if (3001 <= cylinderCapacity || cylinderCapacity <= 3500) {
            taxBase = 0.12F;
        } else if (3001 <= cylinderCapacity || cylinderCapacity <= 3500) {
            taxBase = 0.12F;
        } else if (3501 <= cylinderCapacity || cylinderCapacity <= 4000) {
            taxBase = 0.24F;
        } else if (cylinderCapacity < 4000) {
            taxBase = 0.35F;
        }
        return taxBase;
    }
}

