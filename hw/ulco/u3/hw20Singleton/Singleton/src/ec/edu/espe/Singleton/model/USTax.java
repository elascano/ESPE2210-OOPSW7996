package ec.edu.espe.Singleton.model;

import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public final class USTax {
    private float valueTax;
    private static USTax instance;

    private USTax(float value) {
        setValueTax(value);
    }

    public static USTax getInstance(float value) {
        if (getInstance() == null) {
            setInstance(new USTax(value));
        }
        return getInstance();
    }

    public float salesTotal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("            UTAH TAX           ");
        System.out.println("Enter the value of the product:");
        float Price=scan.nextFloat();
        float TotalValue =Price + (Price * (getValueTax() /100) );
        System.out.println("Tax-> " + getValueTax());
        System.out.println("The total value is: " + TotalValue);
        return TotalValue;
    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(USTax aInstance) {
        instance = aInstance;
    }

    /**
     * @return the instance
     */
    public static USTax getInstance() {
        return instance;
    }

    /**
     * @return the valueTax
     */
    public float getValueTax() {
        return valueTax;
    }

    /**
     * @param valueTax the valueTax to set
     */
    public void setValueTax(float valueTax) {
        this.valueTax = valueTax;
    }

}
