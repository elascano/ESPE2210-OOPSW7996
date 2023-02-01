
package ec.edu.espe.shopinventory_v2.model;

import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Meat extends ProductWithVAT {

    private static final Meat meat = new Meat();
    private static final Scanner scan = new Scanner(System.in);

    @Override
    public Document createProduct() {
        System.out.println("----------------------");
        System.out.println("       ADD MEAT   ");
        System.out.println("----------------------");
        System.out.println("Enter the meat id: ");
        meat.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Insert the meat name: ");
        meat.setName(scan.nextLine());
        System.out.println("Insert the quantity: ");
        meat.setQuantity(scan.nextInt());
        System.out.println("Insert the price per unit of the meat: ");
        meat.setPricePerUnit(scan.nextFloat());
        meat.setPriceWithVAT(ProductWithVAT.computeVAT(meat.getPricePerUnit()));

        return new Document("_id", new ObjectId())
                .append("id", meat.getId())
                .append("name", meat.getName())
                .append("quantity", meat.getQuantity())
                .append("pricePerUnit", meat.getPricePerUnit())
                .append("priceWithVAT", meat.getPriceWithVAT());
    }

    @Override
    public int readProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      READ MEAT    ");
        System.out.println("----------------------");
        System.out.println("Enter the Meat id:");
        id = scan.nextInt();

        return id;
    }

    @Override
    public Meat updateProduct() {

        scan.nextLine();
        System.out.println("Insert a new Meat name: ");
        meat.setName(scan.nextLine());
        System.out.println("Insert a new Meat quantity: ");
        meat.setQuantity(scan.nextInt());
        System.out.println("Insert a new Meat price per unit: ");
        meat.setPricePerUnit(scan.nextFloat());
        meat.setPriceWithVAT(ProductWithVAT.computeVAT(meat.getPricePerUnit()));
        
        
        
        return meat;
    }

    @Override
    public int deleteProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("      DELETE MEAT    ");
        System.out.println("----------------------");
        System.out.println("Enter the Meat id:");
        id = scan.nextInt();

        return id;

    }

}
