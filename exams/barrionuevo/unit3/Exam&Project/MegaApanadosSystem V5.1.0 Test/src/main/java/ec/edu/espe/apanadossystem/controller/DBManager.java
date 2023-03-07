
package ec.edu.espe.apanadossystem.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.apanadossystem.model.Customer;
import ec.edu.espe.apanadossystem.model.Order;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class DBManager {

    public static Order saveOrder(boolean posibleToContinue, JTextField txtAddres, JTextField txtCellPhone, JTextField txtEmail, JTextField txtID, JTextField txtName, JLabel txtTotal,Boolean cash) {
        long collectionSize;
        int id;
        Order order = null;
        Customer customer;
        if (posibleToContinue) {
            String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("Project");
                try {
                    Bson command = new BsonDocument("ping", new BsonInt64(1));
                    Document commandResult = database.runCommand(command);
                    System.out.println("Connected successfully to server.");
                    MongoCollection<Document> collection = database.getCollection("Order");

                    collectionSize = collection.countDocuments();
                    id = (int) (collectionSize + 1);

                    order = new Order(id, txtName.getText(), txtEmail.getText(), Integer.parseInt(txtID.getText()), Double.parseDouble(txtTotal.getText()),cash);

                    Document newOrder = new Document("id", id);
                    newOrder.append("name", txtName.getText());
                    newOrder.append("email", txtEmail.getText());
                    newOrder.append("ID", Integer.parseInt(txtID.getText()));
                    newOrder.append("totalPrice", Double.parseDouble(txtTotal.getText()));
                    collection.insertOne(newOrder);

                } catch (MongoException me) {
                }
            }

            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("Project");
                try {
                    Bson command = new BsonDocument("ping", new BsonInt64(1));
                    Document commandResult = database.runCommand(command);
                    System.out.println("Connected successfully to server.");
                    MongoCollection<Document> collection = database.getCollection("CustomerBillingData");

                    collectionSize = collection.countDocuments();
                    id = (int) (collectionSize + 1);

                    customer = new Customer(txtName.getText(), txtEmail.getText(), Integer.parseInt(txtID.getText()), txtAddres.getText(), Integer.parseInt(txtCellPhone.getText()));

                    Document newCustomer = new Document("id", id);
                    newCustomer.append("name", txtName.getText());
                    newCustomer.append("email", txtEmail.getText());
                    newCustomer.append("ID", Integer.parseInt(txtID.getText()));
                    newCustomer.append("Addres", txtAddres.getText());
                    newCustomer.append("CellPhoneNumber", Integer.parseInt(txtCellPhone.getText()));

                    collection.insertOne(newCustomer);

                } catch (MongoException me) {
                }
            }
        }
        return order;
        
        
    }
    
    
    
    
    
}
