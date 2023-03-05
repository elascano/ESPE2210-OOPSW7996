package ec.espe.edu.Singleton.controller;

import ec.espe.edu.Singleton.model.USTax;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        USTax tax = USTax.getInstace();
        System.out.println("Total Sales: " + tax.salesTotal());
    }
}
