package ec.edu.espe.Singleton.view;

import ec.edu.espe.Singleton.model.USTax;

public class Calculator {
    public static void main(String args[ ]) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}

