package ec.edu.espe.calculator.view;

import ec.espe.edu.calculator.model.USTax;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        float price;
        float priceWithIVA;
        float taxPercentage;
        price = 10.2F;
        
        USTax tax = USTax.getInstance();
        taxPercentage = tax.getIvaPercentage();
        priceWithIVA = tax.computeSalesTotal(price);
        
        System.out.println("Current tax -> " + taxPercentage);
        System.out.println("PRICE WITHOUT IVA ->"  + price);
        System.out.println("PRICE WITH IVA ->"  + priceWithIVA);
        
        tax.setIvaPercentage(0.12F);
        taxPercentage = tax.getIvaPercentage();
        priceWithIVA = tax.computeSalesTotal(price);
        System.out.println("Current tax -> " + taxPercentage);
        System.out.println("PRICE WITHOUT IVA ->"  + price);
        System.out.println("PRICE WITH IVA ->"  + priceWithIVA);
    }
}
