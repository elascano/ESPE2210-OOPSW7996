package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.UtahTax;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class calculator {

    public static void main(String args[]) {
        float price, priceIva;
        UtahTax utahTax;
        UtahTax utahTax2;
        
        utahTax = UtahTax.getInstance();
        utahTax.modifyIva(4.7F);
        utahTax2 = UtahTax.getInstance(); //try the only one instance of UtahTax
        
        price = 159.90f;        
        priceIva = price + price * utahTax2.getIvaPersentage()/100;              
        
        System.out.println("    price:\t" + price);
        System.out.println("Utah  iva:\t" + utahTax2.getIvaPersentage() + "%");
        System.out.println("price+iva:\t" + priceIva);
    }
}