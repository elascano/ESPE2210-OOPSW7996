/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortingProgramExam.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.SortingProgramExam.model.ListNumbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ListNumbersController {

    private MongoDatabase mongoDatabase = ConnectionDatabase.mongodb;

    private MongoCollection<Document> mongoCollection;

    public ListNumbersController() {
        this.mongoCollection = mongoDatabase.getCollection("strategyJuan");
    }

    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(ListNumbers listNumbers) {
        Document document = new Document();
        document.append("unsorted", Arrays.toString(listNumbers.getListOfNumbersDisordered()));
        document.append("size", listNumbers.getSizeOfListOfNumbers());
        document.append("sort algorithm", listNumbers.getSortAlgorithm());
        document.append("InsertionSort", Arrays.toString(listNumbers.getListOfNumberOrdered()));

        return document;
    }

}
