package com.mycompany.consolemongodb;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import espe.edu.espe.students.utils.NegativeValuesException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class ConsoleMongoDB {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean end = false, correctOption;
        int option;
        String uri = "mongodb+srv://casalazar22:oop@cluster0.k8k6u34.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

 

                MongoCollection collection = database.getCollection("students");
                
                while (!end) {
                    System.out.println("-------Menu-------");
                    System.out.println("1.Add a student");
                    System.out.println("2.Delete a student");
                    System.out.println("3.Edite a student");
                    System.out.println("4.Print students");
                    System.out.println("5.Exit");
                    do{
                        try{
                            correctOption = false;
                            System.out.print("Enter a option: ");
                            option = read.nextInt();
                            switch(option){
                                case 1 ->{
                                    addStudent(collection);
                                }
                                case 2->{
                                    deleteStudent(collection);
                                }
                                case 3->{
                                    editeStudent(collection);
                                }
                                case 4->{
                                    printStudents(collection);
                                }
                                case 5->{
                                    end = true;
                                }
                                default->{
                                    System.out.println("Please enter a opcion [1,5]");
                                }
                            }
                            getFinalGrades(database, collection);
                            
                        }catch(InputMismatchException ime){
                            correctOption = true;
                            System.out.println("Please enter a whole number");
                            read.next();
                        }
                    }while(correctOption);
                }
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    private static void getFinalGrades(MongoDatabase database, MongoCollection collection) {
        MongoCollection finalGrades = database.getCollection("finalGrades");
        ArrayList grades = new ArrayList();
        finalGrades.drop();
        
        MongoCursor cursor = collection.find().iterator();
        
        try {
            while (cursor.hasNext()) {
                Document student = (Document) cursor.next();
                Document studentGrade = new Document("_id",(int) student.get("_id"));
                studentGrade.append("name", student.get("name"));
                double finalGrade =((double)student.get("firstPartial")+(double)student.get("secondPartial")+(double)student.get("thirdPartial"))/3;
                finalGrade=Math.round(finalGrade*100);
                finalGrade=finalGrade/100;
                studentGrade.append("finalGrade", finalGrade);
                grades.add(studentGrade);
            }
        } finally {
            cursor.close();
        }
        finalGrades.insertMany(grades);
    }

    private static void deleteStudent(MongoCollection collection) {
        int id;
        id=readOfId();
        Bson filter = Filters.and(Filters.eq("_id", id));
        collection.deleteOne(filter);
        System.out.println("Deleted student");
    }

    private static void printStudents(MongoCollection collection) {
        MongoCursor cursor = collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }
        } finally {
            cursor.close();
        }
    }

    private static void addStudent(MongoCollection collection) {
        Document studentAdded = readOfStudent();
        try {
            collection.insertOne(studentAdded);
            System.out.println("Successfully inserted student. \n");
        } catch (MongoWriteException mwe) {
            if (mwe.getError().getCategory().equals(ErrorCategory.DUPLICATE_KEY)) {
                System.out.println("Document with that id already exists");
            }
        }
    }

    private static void editeStudent(MongoCollection collection) {
        Scanner read = new Scanner(System.in);
        int id;
        id=readOfId();
        Bson filter = Filters.and(Filters.eq("_id", id));
        Document studentEdited = new Document();
        String name;
        float firstPartial, secondPartial ,thirdPartial;
        System.out.print("Insert student's name: ");
        name=read.nextLine();
        studentEdited.append("name", name);
        firstPartial=readOfGrade("Insert the grade of the student's first partial: ");
        studentEdited.append("firstPartial", firstPartial);
        secondPartial=readOfGrade("Insert the grade of the student's second partial: ");
        studentEdited.append("secondPartial", secondPartial);
        thirdPartial=readOfGrade("Insert the grade of the student's third partial: ");
        studentEdited.append("thirdPartial", thirdPartial);
        collection.updateOne(new Document("_id",id),new Document("$set",studentEdited));
        System.out.println("Updated student");
    }
    
    public static void validateTheId(int id) throws NegativeValuesException {
        if (id < 0) {
            throw new NegativeValuesException("Please enter a positive number");
        }
    }
    
    public static void validateTheGrade(float grade) throws NegativeValuesException {
        if (grade < 0 || grade>20) {
            throw new NegativeValuesException("Please enter number in the range [0,20]");
        }
    }
    
    private static int readOfId() {
        Scanner read = new Scanner(System.in);
        int id = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print("Insert student's id: ");
                id = read.nextInt();
                validateTheId(id);
            } catch (InputMismatchException ime) {
                correctReading = true;
                System.out.println("Please enter a whole number");
                read.next();
            } catch(NegativeValuesException nve){
                correctReading = true;
                System.out.println(nve.getMessage());
            }
        } while (correctReading);
        return id;
    }
    
    private static float readOfGrade(String messageOfReading) {
        Scanner read = new Scanner(System.in);
        float grade = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print(messageOfReading);
                grade = read.nextFloat();
                validateTheGrade(grade);
            } catch (InputMismatchException ime) {
                correctReading = true;
                System.out.println("Please enter a number");
                read.next();
            } catch(NegativeValuesException nve){
                correctReading = true;
                System.out.println(nve.getMessage());
            }
        } while (correctReading);
        grade = Math.round(grade*100);
        grade = grade/100;
        return grade;
    }

    private static Document readOfStudent() {
        Scanner read = new Scanner(System.in);
        Document studentAdded = new Document();
        int id;
        String name;
        float firstPartial, secondPartial ,thirdPartial;
        
        id=readOfId();
        studentAdded.append("_id", id);
        System.out.print("Insert student's name: ");
        name=read.nextLine();
        studentAdded.append("name", name);
        firstPartial=readOfGrade("Insert the grade of the student's first partial: ");
        studentAdded.append("firstPartial", firstPartial);
        secondPartial=readOfGrade("Insert the grade of the student's second partial: ");
        studentAdded.append("secondPartial", secondPartial);
        thirdPartial=readOfGrade("Insert the grade of the student's third partial: ");
        studentAdded.append("thirdPartial", thirdPartial);
        return studentAdded;
    }
}
