package ec.edu.espe.taxes.controller;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Product;
import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ProductController {
    public static void computeIvaTax(){
        Product productWithTax;
        float price;
        float salePrice;
        
        productWithTax = createProduct();
        price = productWithTax.getPrice();
        salePrice = Tax.computeIva(price) + price;
        productWithTax.setSalePrice(salePrice);
        System.out.print("> PRODUCT + IVA ->" + productWithTax.getSalePrice());
    }
    
    private static Product createProduct(){
        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in);
        int id;
        String description;
        float price;
        Product product;
        System.out.println("""
                          ----------- PRODUCT ----------
                            Enter the information below
                           """);
        System.out.print("ID -> ");
        id = keyboardScanner.nextInt();
        System.out.print("DESCRIPTION -> ");
        description = keyboardScanner.next();
        System.out.print("PRICE -> ");
        price = keyboardScanner.nextFloat();
        System.out.println("-----------------------------");
        product = new Product(id, description, price, 0);
        return product;
    }
}
