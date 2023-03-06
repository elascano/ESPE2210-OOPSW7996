
package ec.edu.espe.TaxCalculator.view;

import ec.edu.espe.Tax.model.USTax;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class TaxCalculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.TotalSales();
    }
    
}
