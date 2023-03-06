package ec.edu.espe.shopinventory_v2.model;

import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Vegetable extends Product {

    private static final Vegetable vegetable = new Vegetable();
    private static final Scanner scan = new Scanner(System.in);

    @Override
    public  Document createProduct() {
        System.out.println("----------------------");
        System.out.println("       ADD VEGETABLE   ");
        System.out.println("----------------------");
        System.out.println("Enter the vegetable id: ");
        vegetable.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Insert the vegetable name: ");
        vegetable.setName(scan.nextLine());
        System.out.println("Insert the quantity: ");
        vegetable.setQuantity(scan.nextInt());
        System.out.println("Insert the price per unit of the vegetable: ");
        vegetable.setPricePerUnit(scan.nextFloat());

        return new Document("_id", new ObjectId())
                .append("id", vegetable.getId())
                .append("name", vegetable.getName())
                .append("quantity", vegetable.getQuantity())
                .append("pricePerUnit", vegetable.getPricePerUnit());
    }

    @Override
    public int readProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      READ VEGETABLE    ");
        System.out.println("----------------------");
        System.out.println("Enter the Vegetable id:");
        id = scan.nextInt();
        
        return id;
    }

    @Override
    public Vegetable updateProduct() {
        
        scan.nextLine();
        System.out.println("Insert a new Vegetable name: ");
        vegetable.setName(scan.nextLine());
        System.out.println("Insert a new Vegetable quantity: ");
        vegetable.setQuantity(scan.nextInt());
        System.out.println("Insert a new Vegetable price per unit: ");
        vegetable.setPricePerUnit(scan.nextFloat());

        return vegetable;
    }

    @Override
    public int deleteProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      DELETE VEGETABLE    ");
        System.out.println("----------------------");
        System.out.println("Enter the Vegetable id:");
        id = scan.nextInt();

        return id;

    }

}
