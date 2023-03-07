
package ec.edu.espe.shopinventory_v2.model;

import ec.edu.espe.shopinventory_v2.model.ProductWithVAT;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Grooming extends ProductWithVAT {

    private static final Grooming grooming = new Grooming();
    private static final Scanner scan = new Scanner(System.in);

    @Override
    public Document createProduct() {
        System.out.println("----------------------");
        System.out.println("       ADD GROOMING   ");
        System.out.println("----------------------");
        System.out.println("Enter the Grooming id: ");
        grooming.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Insert the Grooming name: ");
        grooming.setName(scan.nextLine());
        System.out.println("Insert the quantity: ");
        grooming.setQuantity(scan.nextInt());
        System.out.println("Insert the price per unit of the Grooming: ");
        grooming.setPricePerUnit(scan.nextFloat());
        grooming.setPriceWithVAT(ProductWithVAT.computeVAT(grooming.getPricePerUnit()));

        return new Document("_id", new ObjectId())
                .append("id", grooming.getId())
                .append("name", grooming.getName())
                .append("quantity", grooming.getQuantity())
                .append("pricePerUnit", grooming.getPricePerUnit())
                .append("priceWithVAT", grooming.getPriceWithVAT());
    }

    @Override
    public int readProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("    READ GROOMING   ");
        System.out.println("----------------------");
        System.out.println("Enter the Grooming id:");
        id = scan.nextInt();

        return id;
    }

    @Override
    public Grooming updateProduct() {

        scan.nextLine();
        System.out.println("Insert a new grooming name: ");
        grooming.setName(scan.nextLine());
        System.out.println("Insert a new grooming quantity: ");
        grooming.setQuantity(scan.nextInt());
        System.out.println("Insert a new grooming price per unit: ");
        grooming.setPricePerUnit(scan.nextFloat());
        grooming.setPriceWithVAT(ProductWithVAT.computeVAT(grooming.getPricePerUnit()));
        
        return grooming;
    }

    @Override
    public int deleteProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("    DELETE GROOMING    ");
        System.out.println("----------------------");
        System.out.println("Enter the Grooming id:");
        id = scan.nextInt();

        return id;

    }

}
