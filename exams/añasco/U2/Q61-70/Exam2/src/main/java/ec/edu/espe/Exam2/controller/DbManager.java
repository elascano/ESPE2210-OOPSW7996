/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exam2.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Exam2.view.FrmAddCountry;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class DbManager extends DataPersistance{
    private MongoClient mongoClient;
    private MongoDatabase database;
    
    public DbManager() {
        mongoClient = null;
        database = null;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }
    
    public void connect(String uri, String dataBaseName){
        try{
            setMongoClient(MongoClients.create(uri));
            setDatabase(getMongoClient().getDatabase(dataBaseName));
            System.out.println("Connected successfully to server.");
             
        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
    }

    @Override
    public void insert(String collectionName, String json) {
        FrmAddCountry frmAddCountry;
            frmAddCountry = new FrmAddCountry();
        try{
            MongoCollection collection = getDatabase().getCollection(collectionName);
            Document document = Document.parse(json);    
            collection.insertOne(document);
            JOptionPane.showMessageDialog(frmAddCountry, "The document was successfully register at the data base.");
             
        }catch(MongoException me){
            JOptionPane.showMessageDialog(frmAddCountry, "An error occurred while attempting to insert" + me);
            
        }
    }
    
    @Override
    public ArrayList read(String collectionName){
        MongoCollection collection;
        ArrayList<String> documents = new ArrayList<>();
        
        try {
            collection = getDatabase().getCollection(collectionName);

            MongoCursor<Document> cursor = collection.find().iterator();

            while (cursor.hasNext()) {                    
            documents.add(cursor.next().toJson());
            }
            
            cursor.close();

        } catch (Exception e) {
            System.out.println("");
            
        }
    return documents; 
    }
}
