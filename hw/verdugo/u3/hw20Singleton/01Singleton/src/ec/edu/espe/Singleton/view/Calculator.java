
package ec.edu.espe.Singleton.view;

import ec.edu.espe.Singleton.model.UthaTax;
import java.util.Scanner;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("01 Singleton / Sebastian Verdugo");
        System.out.println("");
        UthaTax tax = UthaTax.getInstance(0.0485F);
        UthaTax tax1 = UthaTax.getInstance(0.0F);

        System.out.println("Ingress the value of the product: ");
        Scanner inputData = new Scanner(System.in);

        float value = inputData.nextFloat();
        System.out.println("Utha Tax: " + tax.getTaxValue());

        System.out.println("Value adding the Utha Tax; " + tax1.salesTotal(value));
    }

}
