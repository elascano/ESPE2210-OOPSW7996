package ec.edu.espe.uscalculator.view;

import ec.edu.espe.uscalculator.controller.USTax;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.salesTotal(); 
    }
}
