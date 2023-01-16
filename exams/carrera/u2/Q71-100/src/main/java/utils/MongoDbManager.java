/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author kevin
 */
public class MongoDbManager {
    public static MongoCollection connectToCollection(String uri, String dataBase, String collection){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase mongoDatabase = mongoClient.getDatabase(dataBase);
        System.out.println("-> Connected successfully to server " + dataBase + "/" + collection);
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(collection);
        return mongoCollection;   
    }
   public static boolean insert(MongoCollection collection, ArrayList keys, ArrayList values){
        Object documentId  = values.get(0);
        boolean existence;
        existence = findDocument(collection,"id", (int)documentId);
        if(!existence){
            Document document = new Document("_id", new ObjectId());
            for (int i = 0; i< keys.size(); i++){
                document.append((String) keys.get(i),values.get(i));
            }
            collection.insertOne(document);
            System.out.println("-> Inserted successfully");
            return true;
        }else{
            System.out.println("-> Insertion failed");
            System.out.println("A document with id: " + documentId + " already exists");
            System.out.println("You cannot enter another document with the same id");
            return false;
        }
    }
   
   public static ArrayList <String> readAll(MongoCollection collection, String key){
        ArrayList <String> readedValues = new ArrayList();
        String document;
        Bson filter = Filters.and(Filters.gt("id", 0));
        Document projectionDocument = new Document("_id", 0).append(key, 1);
        try(MongoCursor<Document> cursor = collection.find(filter).projection(projectionDocument).iterator()) {
            if(cursor.hasNext()){
                while(cursor.hasNext()){
                    document =  cursor.next().toJson().replaceFirst(key,"").replaceFirst(" ","").replaceAll("[{}:"+"\"\""+"]", "");
                    readedValues.add(document);
                }
            }else{
                System.out.println("-> There is no documents in the database, or database doesn't exists");
            }
        }
        return readedValues;
    }
 public static boolean findDocument(MongoCollection collection, String key,  Object value){
        Document projectionDocument = new Document("_id", 0);
        Bson filter = Filters.and(Filters.all(key, value));
        MongoCursor<Document> cursor = collection.find(filter).projection(projectionDocument).iterator();
        if(cursor.hasNext()){
            return true;
        }else{
            System.out.println("-> Document not found");
            return false;
        }
    }
         
}
