/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.model;

import java.util.Scanner;
import javax.swing.text.Document;

/**
 *
 * @author Labs-DCCO
 */
public class ConnectionMongo {

    private static final Scanner sc = new Scanner(System.in);

    public static void strategyPatternS(Sort sort) {
        String uri = "mongodb+srv://POO123:POO123@cluster0.oy9dpt8.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");
                MongoCollection<Document> studentCollection = database.getCollection("numbers");
                MongoCollection<Document> averagesCollection = database.getCollection("sorting");

                Document sortingDoc = insertDataNumbers(number);

                studentCollection.insertOne(sortnigDoc);
                System.out.println("New number has agragated: " + studentDoc.get("name"));

            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

