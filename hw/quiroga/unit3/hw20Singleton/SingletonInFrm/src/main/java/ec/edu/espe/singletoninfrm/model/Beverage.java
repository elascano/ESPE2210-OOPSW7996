
package ec.edu.espe.singletoninfrm.model;

import ec.edu.espe.shopinventory_v2.model.ProductWithVAT;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Beverage extends ProductWithVAT {

    private static final Beverage beverage = new Beverage();
    private static final Scanner scan = new Scanner(System.in);

    @Override
    public Document createProduct() {
        System.out.println("----------------------");
        System.out.println("       ADD BEVERAGE   ");
        System.out.println("----------------------");
        System.out.println("Enter the Beverage id: ");
        beverage.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Insert the Beverage name: ");
        beverage.setName(scan.nextLine());
        System.out.println("Insert the quantity: ");
        beverage.setQuantity(scan.nextInt());
        System.out.println("Insert the price per unit of the Beverage: ");
        beverage.setPricePerUnit(scan.nextFloat());
        beverage.setPriceWithVAT(ProductWithVAT.computeVAT(beverage.getPricePerUnit()));

        return new Document("_id", new ObjectId())
                .append("id", beverage.getId())
                .append("name", beverage.getName())
                .append("quantity", beverage.getQuantity())
                .append("pricePerUnit", beverage.getPricePerUnit())
                .append("priceWithVAT", beverage.getPriceWithVAT());
    }

    @Override
    public int readProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("    READ BEVERAGE   ");
        System.out.println("----------------------");
        System.out.println("Enter the Beverage id:");
        id = scan.nextInt();

        return id;
    }

    @Override
    public Beverage updateProduct() {

        scan.nextLine();
        System.out.println("Insert a new beverage name: ");
        beverage.setName(scan.nextLine());
        System.out.println("Insert a new beverage quantity: ");
        beverage.setQuantity(scan.nextInt());
        System.out.println("Insert a new beverage price per unit: ");
        beverage.setPricePerUnit(scan.nextFloat());
        beverage.setPriceWithVAT(ProductWithVAT.computeVAT(beverage.getPricePerUnit()));
        
        return beverage;
    }

    @Override
    public int deleteProduct() {
        int id = 0;

        System.out.println("----------------------");
        System.out.println("    DELETE BEVERAGE    ");
        System.out.println("----------------------");
        System.out.println("Enter the Beverage id:");
        id = scan.nextInt();

        return id;

    }

}
