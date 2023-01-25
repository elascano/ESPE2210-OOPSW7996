package ec.edu.espe.exam2.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam2.model.ProgrammingLanguages;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Alex_22
 */
public class MongoDBManagement {

    public static void saveLanguague(ProgrammingLanguages programmingLanguages) {
        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient = MongoClient.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2_Programming_Languages");

            try {
                MongoCollection<Document> languagueCollection = database.getCollection("Programming_Languages");

                Document programmingLanguagesNew = new Document("_id", new ObjectId())
                        .append("id", enteredLanguages.getId())
                        .append("nameOfTheProgrammingLanguage", enteredLanguages.getNameOfTheProgrammingLanguage())
                        .append("yearOfCreation", enteredLanguages.getYearOfCreation()
                                .append("nameOfTheCreator", enteredLanguages.getNameOfTheCreator()));

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }

    }
}
