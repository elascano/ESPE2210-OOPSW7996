package ec.edu.espe.Singleton.view;

import ec.edu.espe.Singleton.model.USTax;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance(4.7F);
        tax.salesTotal();
    }
}
