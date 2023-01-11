/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.ecu.espe.studentcsassignment.model.Asignation;
import ec.ecu.espe.studentcsassignment.model.Assignment;
import ec.ecu.espe.studentcsassignment.model.Student;
import ec.ecu.espe.studentcsassignment.model.Enrollment;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class AssignmentsController {

    public static Document findAssignment(String name) {
        Document dataAssignment;
        String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");

            try {
                System.out.println("Connected successfully to server.");

                MongoCollection studentsCollection = database.getCollection("students");
                MongoCollection assignmentsCollection = database.getCollection("assignments");
                //MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                Bson filter = Filters.and(Filters.eq("name", name));
                dataAssignment = (Document) assignmentsCollection.find(filter).first();

                return dataAssignment;

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
        return null;
    }

    public static void addAssignment(Document assignment, String classroom) {
        Document dataAssignment;
        Document asignationDoc;
        Enrollment enrollment;
        String subjects[];
        Asignation asignation;
        ArrayList<Document> asignations= new ArrayList<>();
        double gradeDefault = 0.0;
        
        String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");

            try {
                System.out.println("Connected successfully to server.");

                MongoCollection assignmentsCollection = database.getCollection("assignments");
                MongoCollection enrollmentsCollection = database.getCollection("enrollmets");
                //MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                Bson filter = Filters.and(Filters.gt("studentId", 0));

                MongoCursor<Document> enrollments = enrollmentsCollection.find(filter).iterator();

                try {
                    while (enrollments.hasNext()) {
                        String studentsJson = enrollments.next().toJson();
                        enrollment = new Gson().fromJson(studentsJson,Enrollment.class);
                        subjects=enrollment.getSubjects();
                        
                        for (String subject : subjects) {
                            if(subject == null ? classroom == null : subject.equals(classroom)){
                                
                                asignationDoc = new Document().append("compliance", false)
                                                              .append("iddStudent", enrollment.getStudentId())
                                                              .append("grade", gradeDefault);
                                
                                asignations.add(asignationDoc);
                                
                            }
                        }
                    }
                    assignment.append("asignation", asignations);
                    assignmentsCollection.insertOne(assignment);
                } finally {
                    enrollments.close();
                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }

    }
}
