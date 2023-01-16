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
import com.mongodb.client.model.Filters;
import static ec.ecu.espe.studentcsassignment.controller.MongoConection.*;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class StudentsController {
    public static void LonInClassrooms(String classroonName){
        conection();
    }
    
    public static Document findStudent(String name){
        Document dataStudent;
        String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("Project");

                try {
                    System.out.println("Connected successfully to server.");

                    MongoCollection studentsCollection = database.getCollection("students");
                    //MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                    Bson filter = Filters.and(Filters.eq("name", name));
                    dataStudent = (Document) studentsCollection.find(filter).first();
                    
                    return dataStudent;
                    
                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
        return null;
    }
}
