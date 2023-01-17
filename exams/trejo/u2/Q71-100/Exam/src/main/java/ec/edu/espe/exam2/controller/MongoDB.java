package ec.edu.espe.exam2.controller;


import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;

import com.mongodb.client.MongoDatabase;

import java.util.Scanner;

import org.bson.Document;

import org.bson.types.ObjectId;

import ec.edu.espe.exam2.model.ProgrammingLanguages;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class MongoDB {

    private static final Scanner scanner = new Scanner(System.in);

    public static void saveLanguague(ProgrammingLanguages enteredprogramming) {

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2_Programming_Languages");
            try {
                MongoCollection<Document> languaguesCollection = database.getCollection("Programming_Languages");

                Document programming = new Document("_id", new ObjectId())
                        .append("id", enteredprogramming.getId())
                        .append("nameOfTheProgrammingLanguage", enteredprogramming.getNameOfTheProgrammingLanguage())
                        .append("yearOfCreation", enteredprogramming.getYearOfCreation())
                        .append("nameOfTheCreator", enteredprogramming.getNameOfTheCreator());
                
                languaguesCollection.insertOne(programming);

                

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    

}
