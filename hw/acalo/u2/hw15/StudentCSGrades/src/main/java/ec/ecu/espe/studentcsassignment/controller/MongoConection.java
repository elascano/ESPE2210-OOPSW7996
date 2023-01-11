/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class MongoConection {
    public static void conection(){
        
        String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("oop");

                try {
                    System.out.println("Connected successfully to server.");

                    MongoCollection studentsCollection = database.getCollection("students");
                    //MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                    /*competitorsCollection.insertOne(competitor);
                    averagedTimeCollection.insertOne(averageCalculated);

                    System.out.println("\n..:: The competitor " + competitor.get("name") + " with id: {" + competitor.get("id") +"} has been added ::..");*/

                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
    }
}
