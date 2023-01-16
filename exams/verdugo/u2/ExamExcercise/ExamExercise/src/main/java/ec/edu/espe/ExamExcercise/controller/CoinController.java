/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.espe.ExamExcercise.controller;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.ExamExcercise.model.Coin;
import org.bson.Document;
import org.bson.types.ObjectId;
/**
 *
 * @author w_ver
 */
public class CoinController {
    static public MongoClient conection(){
        String uri = "mongodb+srv://verdugong:espe123@examexercise.g7jxmjt.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        return mongoClient;
    }
    
    static public void uploadDocumentMdb(Coin coin){
        MongoClient mongoClient = CoinController.conection();
        MongoDatabase database = mongoClient.getDatabase("ExamExcercise");
        String status = "done";
        MongoCollection<Document> collection = database.getCollection("Coin");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", coin.getId())
                .append("value", coin.getValue())
                .append("status", status);

        collection.insertOne(inspection);
    }
    
    
}
