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
import ec.edu.espe.exam2.utils.MongoConnection;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class ProgrammingLanguagesController {

    private static final Scanner scanner = new Scanner(System.in);

   

        public static void saveLanguages(ProgrammingLanguages enteredprogramming) {
        MongoCollection<Document> languaguesCollection = MongoConnection.connectMongo();
        
        Document programming = new Document("_id", new ObjectId())
                .append("id", enteredprogramming.getId())
                .append("nameOfTheProgrammingLanguage", enteredprogramming.getNameOfTheProgrammingLanguage())
                .append("yearOfCreation", enteredprogramming.getYearOfCreation())
                .append("nameOfTheCreator", enteredprogramming.getNameOfTheCreator());

        languaguesCollection.insertOne(programming);
    }

}
