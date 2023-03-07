/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.model;

import ec.edu.espe.shopinventory_v2.model.ProductWithVAT;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Candy extends ProductWithVAT {

    private static final Candy candy = new Candy();
    private static final Scanner scan = new Scanner(System.in);

    @Override
    public Document createProduct() {
        System.out.println("----------------------");
        System.out.println("       ADD CANDY   ");
        System.out.println("----------------------");
        System.out.println("Enter the candy id: ");
        candy.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Insert the candy name: ");
        candy.setName(scan.nextLine());
        System.out.println("Insert the quantity: ");
        candy.setQuantity(scan.nextInt());
        System.out.println("Insert the price per unit of the candy: ");
        candy.setPricePerUnit(scan.nextFloat());
        candy.setPriceWithVAT(ProductWithVAT.computeVAT(candy.getPricePerUnit()));

        return new Document("_id", new ObjectId())
                .append("id", candy.getId())
                .append("name", candy.getName())
                .append("quantity", candy.getQuantity())
                .append("pricePerUnit", candy.getPricePerUnit())
                .append("priceWithVAT", candy.getPriceWithVAT());
    }

    @Override
    public int readProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      READ CANDY    ");
        System.out.println("----------------------");
        System.out.println("Enter the Candy id:");
        id = scan.nextInt();

        return id;
    }

    @Override
    public Candy updateProduct() {

        scan.nextLine();
        System.out.println("Insert a new Candy name: ");
        candy.setName(scan.nextLine());
        System.out.println("Insert a new Candy quantity: ");
        candy.setQuantity(scan.nextInt());
        System.out.println("Insert a new Candy price per unit: ");
        candy.setPricePerUnit(scan.nextFloat());
        candy.setPriceWithVAT(ProductWithVAT.computeVAT(candy.getPricePerUnit()));
        
        
        
        return candy;
    }

    @Override
    public int deleteProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      DELETE CANDY    ");
        System.out.println("----------------------");
        System.out.println("Enter the Candy id:");
        id = scan.nextInt();

        return id;

    }

}
