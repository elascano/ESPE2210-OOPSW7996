
package ec.edu.espe.Singleton.view;

import ec.edu.espe.Singleton.model.USTax;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
        System.out.println("USTax ==>" + tax.salesTotal());
    }

}
