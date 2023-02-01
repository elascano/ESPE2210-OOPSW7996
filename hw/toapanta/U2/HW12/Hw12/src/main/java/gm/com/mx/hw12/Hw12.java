package gm.com.mx.hw12;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.students.utils.NegativeValuesException;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Hw12 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean end = false, correctOption;
        int option;
        String uri = "mongodb+srv://oop:oop2003@cluster0.orrbl25.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("opp");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = (Document) database.runCommand(command);
                System.out.println("Connected successfully to server.");

                MongoCollection collection = database.getCollection("students");

                while (!end) {
                    System.out.println("-------Menu-------");
                    System.out.println("1.Add a student");
                    System.out.println("2.Delete a student");
                    System.out.println("3.Edite a student");
                    System.out.println("4.Print students");
                    System.out.println("5.Exit");
                    do {
                        try{
                            correctOption = false;
                            System.out.print("Enter a option: ");
                            option = console.nextInt();
                            switch(option){
                                case 1:{
                                    addStudent(collection);
                                }
                                case 2:{
                                    deleteStudent(collection);
                                }
                                case 3:{
                                    editeStudent(collection);
                                }
                                case 4:{
                                }
                                case 5:{
                                }
                                default:{
                                    System.out.println("The option does not exist");
                                }
                            }
                        
                        }
                    } while (correctOption);
                }

                //to print some documents, I must use a loop: for, for each, while
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    public static void validateTheId(int id) throws NegativeValuesException {
        if (id < 0) {
            throw new NegativeValuesException("Please enter a positive number");
        }
    }
    
    public static void validateAge(int age) throws NegativeValuesException {
        if (age < 0) {
            throw new NegativeValuesException("Please enter a positive number");
        }
    }
    private static int readOfAge() {
    Scanner console = new Scanner(System.in);
    int age = 0;
    boolean correctReading;
    do {
            try {
                correctReading = false;
                System.out.print("Insert age: ");
                age = console.nextInt();
                validateAge(age);
            } catch (InputMismatchException ime) {
                correctReading = true;
                System.out.println("Please enter a whole number");
                console.next();
            } catch(NegativeValuesException nve){
                correctReading = true;
                System.out.println(nve.getMessage());
            }
        } while (correctReading);
        return age;
    
    }
    
    private static int readOfId() {
    Scanner console = new Scanner(System.in);
    int id = 0;
    boolean correctReading;
    do {
            try {
                correctReading = false;
                System.out.print("Insert student's id: ");
                id = console.nextInt();
                validateTheId(id);
            } catch (InputMismatchException ime) {
                correctReading = true;
                System.out.println("Please enter a whole number");
                console.next();
            } catch(NegativeValuesException nve){
                correctReading = true;
                System.out.println(nve.getMessage());
            }
        } while (correctReading);
        return id;
    
    }
    
    
    public static Document readOfStudent(){
        Scanner console = new Scanner(System.in);
        Document studentAdded = new Document();
        int id;
        String  name;
        int age;
        
        id=readOfId();
        age=readOfAge();
        studentAdded.append("_id", id);
        System.out.println("Insert student's name: ");
        name=console.nextLine();
        studentAdded.append("name", name);
        studentAdded.append("age", age);
        return studentAdded;
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
    
    private static void deleteStudent(MongoCollection collection) {
        int id;
        id=readOfId();
        Bson filter = Filters.and(Filters.eq("_id", id));
        collection.deleteOne(filter);
        System.out.println("Deleted student");
    }
    
    private static void editeStudent(MongoCollection collection) {
        Scanner console = new Scanner(System.in);
        int id;
        int age;
        id=readOfId();
        Bson filter = Filters.and(Filters.eq("_id", id));
        Document studentEdited = new Document();
        String name;
        age = readOfAge();
        System.out.print("Insert student's name: ");
        name=console.nextLine();
        studentEdited.append("name", name);
    }
}

