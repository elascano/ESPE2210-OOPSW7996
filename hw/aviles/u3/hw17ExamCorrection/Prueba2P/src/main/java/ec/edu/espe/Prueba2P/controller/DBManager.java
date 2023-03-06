package ec.edu.espe.Prueba2P.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.InputMismatchException;
import ec.edu.espe.Prueba2P.model.Client;
import java.awt.event.KeyEvent;
import static java.util.Locale.filter;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class DBManager {
    
    public static void enterLetters(KeyEvent evt) {                                 

        int key = evt.getKeyChar();

        boolean capitalLetters = key >= 65 && key <= 90;
        boolean lowercase = key >= 97 && key <= 122;
        boolean spaceBar = key == 32;

        if (!(lowercase || capitalLetters || spaceBar)) {
            evt.consume();
        }
    }  
    
    public static void enterValue(KeyEvent evt,JTextField txt) {                                      
        int key = evt.getKeyChar();

        boolean numbers = ((key >= 48 && key <= 57) || key==46);

        if (!numbers) {
            evt.consume();
        }

        if (txt.getText().trim().length() == 4) {
            evt.consume();
        }
    }
    
    public static void enterNRC(KeyEvent evt,JTextField txt) {                                      
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }

        if (txt.getText().trim().length() == 6) {
            evt.consume();
        }
    }
    
    public static void enterID(KeyEvent evt,JTextField txt) {                                      
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }

        if (txt.getText().trim().length() == 10) {
            evt.consume();
        }
    }
    
    public static Client findData (int id){
        Client client = null;
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Client");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);

                MongoCollection<Document> collection = database.getCollection("Client1");
                Bson filter = Filters.and(Filters.gt("id", 0));
                        
                
                String clientName;
                int clientNRC;
                double clientValue;
                int clientId;
                
                
                
                Document newClient = new Document("id", id);
                filter = Filters.and(Filters.in("id", id));
                newClient = collection.find(filter).first();

                clientName = newClient.getString("name");
                clientNRC = newClient.getInteger("nrc");
                clientValue = newClient.getDouble("value");
                clientId = newClient.getInteger("id");

                client = new Client(clientName, clientNRC, clientValue, clientId);


                
                
                
            } catch (MongoException me) {
            }
            
        }
        return client;
        
    }
    
    

    
    public static void createData (Client client){
        
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Client");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                MongoCollection<Document> collection = database.getCollection("Client1");
                
                Document newClient = new Document("name",client.getName());
                newClient.append("nrc",client.getNrc());
                newClient.append("value", client.getValue());
                newClient.append("id",client.getId());
                collection.insertOne(newClient);
                
            } catch (MongoException me) {
            }
 
        }
    }
    
    public static void updateData (Client client){    
        int id = 0;
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Client");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
 
                MongoCollection<Document> collection = database.getCollection("Client1");
                Bson filter = Filters.and(Filters.gt("id", 0));

                
                id = client.getId();
                collection.updateOne(new Document("id",id),new Document("$set",new Document("name",client.getName())));
                collection.updateOne(new Document("id",id),new Document("$set",new Document("nrc",client.getNrc())));
                collection.updateOne(new Document("id",id),new Document("$set",new Document("value",client.getValue())));
            } catch (MongoException me) {
            }
 
        }
    }
    
    public static void deleteData (int id){
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Client");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
 
                MongoCollection<Document> collection = database.getCollection("Client1");
                Bson filter = Filters.and(Filters.gt("id", 0));
                
                collection.deleteOne(Filters.eq("id",id));
                
 
            } catch (MongoException me) {
            }
 
        }
    }
}