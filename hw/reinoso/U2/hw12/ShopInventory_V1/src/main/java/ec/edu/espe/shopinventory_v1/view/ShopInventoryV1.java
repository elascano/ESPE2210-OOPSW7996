package ec.edu.espe.shopinventory_v1.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.shopinventory_v1.model.Snack;
import ec.edu.espe.shopinventory_v1.utils.Menu;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class ShopInventoryV1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Snack snack = new Snack();
        Menu optionMenu = new Menu();
        optionMenu.Options();

        int menuOption = scan.nextInt();
        switch (menuOption) {
            case 1 -> snack.createProduct();
            case 2 -> snack.readProduct();
            case 3 -> snack.updateProduct();
            case 4 -> snack.deleteProduct();
            case 5 -> System.exit(0);
            default -> {
            }

        }

    }
}
