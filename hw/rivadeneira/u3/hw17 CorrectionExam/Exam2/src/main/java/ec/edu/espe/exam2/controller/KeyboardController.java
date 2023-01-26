/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2.controller;



import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import java.awt.HeadlessException;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class KeyboardController {

    public static void addProduct(int productId, String productName, int productPrice, MongoCollection<Document> productCollection) throws HeadlessException, NumberFormatException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productId);
        Document query = productCollection.find(Filters.and(filter)).first();

        if (query != null) {
            flag = false;
        } else if (query == null) {
            Document productDoc = new Document("_id", new ObjectId())
                    .append("id", productId)
                    .append("name", productName)
                    .append("price", productPrice);

            productCollection.insertOne(productDoc);

            flag = true;
        }
        
      
    }

}

