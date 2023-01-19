/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2p.controller;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.awt.HeadlessException;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;



/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class MongoCRUD {
    Gson gson = new Gson();
    
    public static MongoCollection getCollection() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://fsquiroga:4321@cluster0.d2ga7nb.mongodb.net/test");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("EXAM2P");
        MongoCollection<Document> cityCollection = database.getCollection("City");

        return cityCollection;
    }
    
    
    public static boolean addCity(int cityID, String cityName, int cityPopulation, MongoCollection<Document> cityCollection) throws HeadlessException, NumberFormatException {
        boolean flag = false;
        Bson filter = Filters.eq("id", cityID);
        Document query = cityCollection.find(Filters.and(filter)).first();

        if (query != null) {
            flag = false;
        } else if (query == null) {
            Document cityDoc = new Document("_id", new ObjectId())
                    .append("id", cityID)
                    .append("name", cityName)
                    .append("population", cityPopulation);

            cityCollection.insertOne(cityDoc);

            flag = true;
        }
        
        return flag;
    }
    
    
}



