/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2.controller;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class DBConection {
Gson gson = new Gson();
    
    public static MongoCollection getCollection() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://darivadeneira7:MonOpp812.1@cluster0.yyvwtz7.mongodb.net/test");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Product");
        MongoCollection<Document> productCollection = database.getCollection("Lamps");

        return productCollection;
    }


    public static void addProduct(int productID, String productName, int productPrice, MongoCollection<Document> productCollection) throws HeadlessException, NumberFormatException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productID);
        Document query = productCollection.find(Filters.and(filter)).first();

        if (query != null) {
            flag = false;
        } else if (query == null) {
            Document productDoc = new Document("_id", new ObjectId())
                    .append("id", productID)
                    .append("name", productName)
                    .append("price", productPrice);

            productCollection.insertOne(productDoc);

            flag = true;
        }
        
      
    }
    
    public static boolean deleteProduct(int productID, MongoCollection<Document> productCollection) throws NumberFormatException, HeadlessException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productID);
        Document query = productCollection.find(Filters.and(filter)).first();

        if (query != null) {
            productCollection.deleteOne(filter);
            flag = true;
        } else if (query == null) {
            flag = false;
        }
        
        return flag;
    }
    
}  
 
