/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.ws23.view;

import ec.edu.espe.ws23.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class SalesTax {
    
    public static void main(String[] args) {
        
        float value;
        value = 15.24F; //deberia venir del usuario
        Product product = new Product(1,"Hammer",value,Tax.computeIva(value));
        System.out.println("Product -->"+product);
        
    }
    
}
