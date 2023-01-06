/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.shopinventory_v2.model.Candy;
import ec.edu.espe.shopinventory_v2.utils.Menu;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Juan Pinza, Search Engine Bandits , DCCO-ESPE
 */
public class ShopInventory_V2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Candy candy = new Candy();
        Menu optionMenu = new Menu();
        optionMenu.Options();

        int menuOption = scan.nextInt();
        switch (menuOption) {
            case 1:
                candy.createProduct();
                break;
            case 2:
                candy.readProduct();
                break;
            case 3:
                candy.updateProduct();
                break;
            case 4:
                candy.deleteProduct();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;

        }

    }
}
