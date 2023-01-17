
package com.mycompany.hw12database;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;//
import com.mongodb.client.model.Filters;
import ec.edu.espe.hw12DataBase.controller.DBManager;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Hw12DataBase {

    public static void main(String[] args) {
 
        int option = 0;
        do{
            System.out.println("\n==================================");
            System.out.println("1. Create data  ");
            System.out.println("2. Read data");
            System.out.println("3. Update data");
            System.out.println("4. Delete Data");
            System.out.println("5. Calculate and save total price of an order");
            System.out.println("6. Exit  ");
            System.out.println("==================================\n");
            option=DBManager.chooseOption(option);
            switch (option) {
                case 1:
                    DBManager.createData();
                    break;
                case 2:
                    DBManager.findData();
                    break;
                case 3:
                    DBManager.updateData();
                    break;
                case 4:
                    DBManager.deleteData();
                    break;
                case 5:
                    double totalPrice = 0;
                    totalPrice = DBManager.CalculateOrder();
                    DBManager.createOrder(totalPrice);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Incorrect");
                    break;
            }
        } while (option != 6);
 
    }
}
