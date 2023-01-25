/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.model;

import java.util.Scanner;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Grain extends Product {

    private static final Grain grain = new Grain();
    private static final Scanner scan = new Scanner(System.in);

    @Override
    public  Document createProduct() {
        System.out.println("----------------------");
        System.out.println("       ADD GRAIN   ");
        System.out.println("----------------------");
        System.out.println("Enter the grain id: ");
        grain.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Insert the grain name: ");
        grain.setName(scan.nextLine());
        System.out.println("Insert the quantity: ");
        grain.setQuantity(scan.nextInt());
        System.out.println("Insert the price per unit of the grain: ");
        grain.setPricePerUnit(scan.nextFloat());

        return new Document("_id", new ObjectId())
                .append("id", grain.getId())
                .append("name", grain.getName())
                .append("quantity", grain.getQuantity())
                .append("pricePerUnit", grain.getPricePerUnit());
    }

    @Override
    public int readProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      READ GRAIN    ");
        System.out.println("----------------------");
        System.out.println("Enter the Grain id:");
        id = scan.nextInt();
        
        return id;
    }

    @Override
    public Grain updateProduct() {
        
        scan.nextLine();
        System.out.println("Insert a new Grain name: ");
        grain.setName(scan.nextLine());
        System.out.println("Insert a new Grain quantity: ");
        grain.setQuantity(scan.nextInt());
        System.out.println("Insert a new Grain price per unit: ");
        grain.setPricePerUnit(scan.nextFloat());

        return grain;
    }

    @Override
    public int deleteProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      DELETE GRAIN    ");
        System.out.println("----------------------");
        System.out.println("Enter the Grain id:");
        id = scan.nextInt();

        return id;

    }

}
