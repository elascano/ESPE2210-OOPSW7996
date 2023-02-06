package ec.edu.espe.tax;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author Karla Ansatuña
 */
public class Tax {

    public static float computeIva(float value, float ivaPercentage) {
        float iva;
        iva = value * ivaPercentage;
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(iva));
    }

    public static float computeGreenTax(int cylinder, int carYear) {
        LocalDate currentDate = LocalDate.now();
        int currentYear;
        int antiquityOfTheCar;
        float greenTax;
        float sectionOfCylinder;
        float sectionOfAntiquity;

        currentYear = currentDate.getYear();
        antiquityOfTheCar = currentYear - carYear;
        sectionOfCylinder = calculateSectionOfCylinder(cylinder);
        sectionOfAntiquity = calculateSectionOfAntiquity(antiquityOfTheCar);
        greenTax = (cylinder - 1500) * sectionOfCylinder * (1 + sectionOfAntiquity);

        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(greenTax));
    }

    public static float computeRentTax(float netIncome, float totalExpenses, float monthSalary, float socialSecurity) {
        float anualSalary;
        float basicTax = 0;
        float percentageOfSurplusTax = 0;
        float basicFraction = 0;
        float rentTax;
        float taxOfSurplusFraction;
        float taxBase;
        float surplusFraction;
        anualSalary = monthSalary * 12;
        //Base Imponible=ingreso neto - gastos - IESS
        taxBase = netIncome - totalExpenses - socialSecurity;
        if (taxBase >= 0 && taxBase <= 11310) {
            basicFraction = 0;
            basicTax = 0;
            percentageOfSurplusTax = 0.00F;
        } else if (taxBase > 11310 && taxBase <= 14410) {
            basicFraction = 11310.01F;
            basicTax = 0;
            percentageOfSurplusTax = 0.05F;
        } else if (taxBase > 14410 && taxBase <= 18010) {
            basicFraction = 14410.01F;
            basicTax = 155;
            percentageOfSurplusTax = 0.10F;
        } else if (taxBase > 18010 && taxBase <= 21630) {
            basicFraction = 18010.01F;
            basicTax = 515;
            percentageOfSurplusTax = 0.12F;
        } else if (taxBase > 21630 && taxBase <= 31630) {
            basicFraction = 21630.01F;
            basicTax = 949.4F;
            percentageOfSurplusTax = 0.15F;
        } else if (taxBase > 31630 && taxBase <= 41630) {
            basicFraction = 31630.01F;
            basicTax = 2449.4F;
            percentageOfSurplusTax = 0.20F;
        } else if (taxBase > 41630 && taxBase <= 51630) {
            basicFraction = 41630.01F;
            basicTax = 4449.4F;
            percentageOfSurplusTax = 0.25F;
        } else if (taxBase > 51630 && taxBase <= 61630) {
            basicFraction = 51630.01F;
            basicTax = 6949.4F;
            percentageOfSurplusTax = 0.30F;
        } else if (taxBase > 61630 && taxBase <= 100000) {
            basicFraction = 61630.01F;
            basicTax = 9949.4F;
            percentageOfSurplusTax = 0.35F;
        } else if (taxBase > 100000) {
            basicTax = 100000.01F;
            basicTax = 23379;
            percentageOfSurplusTax = 0.37F;
        }
        surplusFraction = taxBase - basicFraction;
        taxOfSurplusFraction = surplusFraction * percentageOfSurplusTax;
        rentTax = taxOfSurplusFraction + basicTax;

        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(rentTax));
    }

    public static float computeIva(float value) {
        float iva;
        iva = value * 0.12F;
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(iva));
    }

    public static float calculateSectionOfCylinder(int cylinder) {
        float sectionOfCylinder = 0;
        if (cylinder < 1500) {
            sectionOfCylinder = 0.00F;
        } else {
            if (cylinder >= 1501 && cylinder <= 2000) {
                sectionOfCylinder = 0.08F;
            } else {
                if (cylinder >= 2001 && cylinder <= 2500) {
                    sectionOfCylinder = 0.09F;
                } else {
                    if (cylinder >= 2501 && cylinder <= 3000) {
                        sectionOfCylinder = 0.11F;
                    } else {
                        if (cylinder >= 3001 && cylinder <= 3500) {
                            sectionOfCylinder = 0.12F;
                        } else {
                            if (cylinder >= 3501 && cylinder <= 4000) {
                                sectionOfCylinder = 0.24F;
                            } else {
                                if (cylinder < 4000) {
                                    sectionOfCylinder = 0.35F;
                                }

                            }
                        }
                    }
                }
            }
        }
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(sectionOfCylinder));
    }

    public static float calculateSectionOfAntiquity(int carYear) {
        float sectionOfAntiquity = 0.00F;
        if (carYear < 5) {
            sectionOfAntiquity = 0.00F;
        } else {

            if (carYear >= 5 && carYear <= 10) {
                sectionOfAntiquity = 0.05F;
            } else {

                if (carYear >= 11 && carYear <= 15) {
                    sectionOfAntiquity = 0.10F;
                } else {

                    if (carYear >= 16 && carYear <= 20) {
                        sectionOfAntiquity = 0.15F;
                    } else {
                        if (carYear > 20) {
                            sectionOfAntiquity = 0.20F;
                        }
                    }
                }
            }
        }
   DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(sectionOfAntiquity));
    }
}
