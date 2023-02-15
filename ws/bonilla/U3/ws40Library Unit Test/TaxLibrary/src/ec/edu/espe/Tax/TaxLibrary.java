package ec.edu.espe.Tax;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class TaxLibrary {

    public static float computerIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    public static float computerIva(float base)
    {
        float iva;
        iva=base*0.12F;
        return iva;
    }

    //[(b-1500)t](1+FA)
    public static float computerGreenTax(float cylinderCapacity, int antiquity) {

        float cylinderSection = 0;
        float stretchOfSeniority;
        stretchOfSeniority = calculateAgeFactor(antiquity);
        float greenTax;

        if (cylinderCapacity < 1500) {
            cylinderSection = 0.00F;
        } else {
            if (cylinderCapacity > 1500 & cylinderCapacity < 2001) {
                cylinderSection = 0.08F;
            } else {
                if (cylinderCapacity > 2000 & cylinderCapacity < 2501) {
                    cylinderSection = 0.09F;
                } else {
                    if (cylinderCapacity > 2500 & cylinderCapacity < 3001) {
                        cylinderSection = 0.11F;
                    } else {
                        if (cylinderCapacity > 3000 & cylinderCapacity < 3501) {
                            cylinderSection = 0.12F;
                        } else {
                            if (cylinderCapacity > 3500 & cylinderCapacity < 4001) {
                                cylinderSection = 0.24F;
                            } else {
                                if (cylinderCapacity > 4000) {
                                    cylinderSection = 0.35F;
                                }
                            }
                        }
                    }
                }
            }
        }
        greenTax = ((cylinderCapacity - 1500) * cylinderSection) * stretchOfSeniority;
        return greenTax;

    }

    public static float calculateAgeFactor(int antiquity) {
        float numberOfYears = (2022 - antiquity);
        float ageFactor = 0;
        if (numberOfYears < 5) {
            ageFactor = 1.00F;
        } else {
            if (numberOfYears >= 5 & numberOfYears <= 10) {
                ageFactor = 1.05F;
            } else {
                if (numberOfYears >= 11 & numberOfYears <= 15) {
                    ageFactor = 1.10F;
                } else {
                    if (numberOfYears >= 16 & numberOfYears <= 20) {
                        ageFactor = 1.15F;
                    } else {
                        if (numberOfYears > 20 & numberOfYears < 2021) {
                            ageFactor = 1.20F;
                        } else {
                            if (numberOfYears == 2021) {
                                ageFactor = 0.80F;
                            }
                        }

                    }
                }
            }
        }
        return ageFactor;

    }

    public static float computeRentTax(float mothSalary) {
        float annualSalary;
        annualSalary = mothSalary * 12;
        float rentTax = 0;
        if (annualSalary <= 11310.00F) {
            System.out.println("do not pay income tax");
        }
        if (annualSalary > 11310.00F && annualSalary <= 14410.00F) {
            rentTax = (14410.00F - annualSalary) * 0.05F;
        }
        if (annualSalary > 14410.00f && annualSalary <= 18010.00F) {
            rentTax = (18010.00F - annualSalary) * 0.10F;
        }
        if (annualSalary > 18010.00F && annualSalary <= 21630.00F) {
            rentTax = (21630.00F - annualSalary) * 0.12F;
        }
        if (annualSalary > 21630.01 && annualSalary <= 31630.00F) {
            rentTax = (31630.00F - annualSalary * 0.15F);
        }
        if (annualSalary > 31630.00F && annualSalary <= 41630.00) {
            rentTax = (41630.00F - annualSalary * 0.20F);
        }
        if (annualSalary > 41630.00 && annualSalary <= 51630.00) {
            rentTax = (51630.00F - annualSalary * 0.25F);
        }
        if (annualSalary > 51630.00 && annualSalary <= 61630.00F) {
            rentTax = (51630.00F - annualSalary * 0.30F);
        }
        if (annualSalary > 61630.00F && annualSalary <= 61630.01) {
            rentTax = (51630.00F - annualSalary * 0.35F);
        }
        if (annualSalary > 61630.02F && annualSalary <= 100000.00) {
            rentTax = (51630.00F - annualSalary * 0.37F);
        }
        return rentTax;
    }

}
