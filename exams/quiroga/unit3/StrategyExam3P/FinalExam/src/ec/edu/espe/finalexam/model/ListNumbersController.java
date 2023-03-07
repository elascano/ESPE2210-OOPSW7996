/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.finalexam.model;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.finalexam.model.ListNumbers;
import ec.edu.espe.finalexam.controller.ConnectionDatabase;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class ListNumbersController {

    private MongoDatabase mongoDatabase = ConnectionDatabase.getDB();

    private MongoCollection<Document> mongoCollection;

    public ListNumbersController() {
        this.mongoCollection = mongoDatabase.getCollection("arrayFrancisco");
    }

    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(ListNumbers listNumbers) {
        Document document = new Document();
        document.append("Unsorted", Arrays.toString(listNumbers.getListOfNumbersDisordered()));
        document.append("Size", listNumbers.getSizeOfListOfNumbers());
        document.append("Sort Algorithm", listNumbers.getSortAlgorithm());
        document.append("Sorted", Arrays.toString(listNumbers.getListOfNumberOrdered()));

        return document;
    }

}
