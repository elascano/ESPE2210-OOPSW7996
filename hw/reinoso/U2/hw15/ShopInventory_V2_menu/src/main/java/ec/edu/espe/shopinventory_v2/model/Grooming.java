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
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Grooming extends ProductWithVAT{

    private static final Grooming grooming = new Grooming();
    private static final Scanner scan = new Scanner(System.in);

    @Override
    public  Document createProduct() {
        System.out.println("----------------------");
        System.out.println("      ADD GROOMING    ");
        System.out.println("----------------------");
        System.out.println("Enter the grooming id: ");
        grooming.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Insert the grooming name: ");
        grooming.setName(scan.nextLine());
        System.out.println("Insert the quantity: ");
        grooming.setQuantity(scan.nextInt());
        System.out.println("Insert the price per unit of the grooming: ");
        grooming.setPricePerUnit(scan.nextFloat());

        return new Document("_id", new ObjectId())
                .append("id", grooming.getId())
                .append("name", grooming.getName())
                .append("quantity", grooming.getQuantity())
                .append("pricePerUnit", grooming.getPricePerUnit());
    }

    @Override
    public int readProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      READ GROOMING    ");
        System.out.println("----------------------");
        System.out.println("Enter the Grooming id:");
        id = scan.nextInt();
        
        return id;
    }

    @Override
    public Grooming updateProduct() {
        
        scan.nextLine();
        System.out.println("Insert a new Grooming name: ");
        grooming.setName(scan.nextLine());
        System.out.println("Insert a new Grooming quantity: ");
        grooming.setQuantity(scan.nextInt());
        System.out.println("Insert a new Grooming price per unit: ");
        grooming.setPricePerUnit(scan.nextFloat());

        return grooming;
    }

    @Override
    public int deleteProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("   DELETE GROOMING    ");
        System.out.println("----------------------");
        System.out.println("Enter the Grooming id:");
        id = scan.nextInt();

        return id;

    }

}
