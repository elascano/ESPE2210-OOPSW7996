/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Q61.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.Q61.model.Keyboard;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class DBManager {
    public static void createData (Keyboard keyboard){
        
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2P");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                MongoCollection<Document> collection = database.getCollection("Q61");
                
                Document newClient = new Document("id",keyboard.getId());
                newClient.append("long",keyboard.getLongInCm());
                newClient.append("width", keyboard.getWidthInCm());
                collection.insertOne(newClient);
                
            } catch (MongoException me) {
            }
 
        }
    }
    
     public static void updateData (Keyboard keyboard){    
        int id = 0;
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2P");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                MongoCollection<Document> collection = database.getCollection("Q61");

                
                id = keyboard.getId();
                collection.updateOne(new Document("id",id),new Document("$set",new Document("long",keyboard.getLongInCm())));
                collection.updateOne(new Document("id",id),new Document("$set",new Document("width",keyboard.getWidthInCm())));
            } catch (MongoException me) {
            }
 
        }
    }
     
     
     public static void deleteData (int id){
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2P");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                MongoCollection<Document> collection = database.getCollection("Q61");
                
                collection.deleteOne(Filters.eq("id",id));
                
 
            } catch (MongoException me) {
            }
 
        }
    }
     
     
     
     public static Keyboard findData (int id){
        Keyboard keyboard = null;
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2P");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);

                MongoCollection<Document> collection = database.getCollection("Q61");
                Bson filter = Filters.and(Filters.gt("id", 0));
                        
                
                double longInCm;
                double widthInCm;
                

                
                
                
                Document newKeyboard = new Document("id", id);
                filter = Filters.and(Filters.in("id", id));
                newKeyboard = collection.find(filter).first();

                longInCm = newKeyboard.getDouble("long");
                widthInCm = newKeyboard.getDouble("width");

                keyboard = new Keyboard(id,longInCm,widthInCm);
            } catch (MongoException me) {
            }
            
        }
        return keyboard;
        
    }
    
    
    public static void enterEnterDouble(KeyEvent evt,JTextField txt) {                                        
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }
        
        if (txt.getText().trim().length() == 2) {
            txt.setText(txt.getText()+".");
        }

        if (txt.getText().trim().length() == 5) {
            evt.consume();
        }
    } 
    
    public static void enterEnterInt(KeyEvent evt,JTextField txt) {                                        
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }
        

        if (txt.getText().trim().length() == 5) {
            evt.consume();
        }
    } 
    
    
    public static void initialiceTableAndCombo(JTable tblMenu) {
        DefaultTableModel tblModel;
        String[] header = {"id","Long","Width"};
        tblModel = new DefaultTableModel (header,0);
        tblMenu.setModel(tblModel);
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2P");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
 
                MongoCollection<Document> collection = database.getCollection("Q61");
                Bson filter = Filters.and(Filters.gt("id", 0));
                MongoCursor<Document> cursor = collection.find(filter).iterator();
                
                int keyboardId = 0;
                double longInCm = 0;
                double widthInCm = 0;
                
                
                int id = 1;
                do {
                    Keyboard keyboard;
                    Document newKeyboard = new Document("id", id);
                    filter = Filters.and(Filters.in("id", id));
                    newKeyboard = collection.find(filter).first();
                    
                    keyboardId=newKeyboard.getInteger("id");
                    longInCm = newKeyboard.getDouble("long");
                    widthInCm = newKeyboard.getDouble("width");
                    keyboard = new Keyboard(keyboardId, longInCm, widthInCm);
                    Object[] obj = new Object[3];
                    obj[0] = keyboardId;
                    obj[1] = longInCm;
                    obj[2] = widthInCm;
                    tblModel.addRow(obj);
                    id += 1;

                    
                } while (id<=collection.countDocuments());
            } catch (MongoException me) {
            }
            
        }
        
        

    }
}
