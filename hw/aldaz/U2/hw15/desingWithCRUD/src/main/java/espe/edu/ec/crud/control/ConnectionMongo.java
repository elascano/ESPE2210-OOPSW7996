package espe.edu.ec.crud.control;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import espe.edu.ec.crud.model.Average;
import espe.edu.ec.crud.model.Student;
import org.bson.conversions.Bson;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO_ESPE
 */
public class ConnectionMongo {

    private static final Scanner sc = new Scanner(System.in);

    public static void insertStudent(Student student) {
        String uri = "mongodb+srv://POO123:POO123@cluster0.oy9dpt8.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");
                MongoCollection<Document> studentCollection = database.getCollection("students");
                MongoCollection<Document> averagesCollection = database.getCollection("averages");

                Document studentDoc = insertDataStudent(student);
                //Document average = calculateAverageStudent(studentDoc);

                studentCollection.insertOne(studentDoc);
                //averagesCollection.insertOne(average);
                System.out.println("New student has agragated: " + studentDoc.get("name"));

            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void findStudent() {
        int id;
        String uri = "mongodb+srv://POO123:POO123@cluster0.oy9dpt8.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");

                MongoCollection<Document> collection = database.getCollection("students");

                System.out.print("\nEnter the id to find: ");
                id = sc.nextInt();

                Bson filter = Filters.eq("id", id);
                try
                {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Student --> " + doc.toJson());

                } catch (Exception e)
                {
                    System.out.println("Data not found");
                }

            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updateStudent() {
        
        String uri = "mongodb+srv://POO123:POO123@cluster0.oy9dpt8.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");

                MongoCollection studentCollection = database.getCollection("students");
                MongoCollection averageCollection = database.getCollection("averages");

                System.out.print("\nEnter the id to update: ");
                int id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                
                Student student = updateLocalStudent();                
                Bson studentUpdates = Updates.combine(
                        Updates.set("id", student.getId()),
                        Updates.set("password", student.getPassword()),
                        Updates.set("age", student.getMail()),
                        Updates.set("grades", student.getGrades()));
                
                Average average = updateLocalAverage(student);
                Bson averageUpdates = Updates.combine(
                        Updates.set("id", student.getId()),
                        Updates.set("password", student.getPassword()),
                        Updates.set("averages", average.getAverage()));

                studentCollection.updateOne(filter, studentUpdates);
                averageCollection.updateOne(filter, averageUpdates);

                System.out.println("Data has been updated");

            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
    
    private static Average updateLocalAverage(Student student) {
        Average average = new Average();
        average.setId(student.getId());
        average.setStudentPassword(student.getPassword());
        double averageTotal = 0;

        for (int i = 0; i < student.getGrades().size(); i++)
        {
            averageTotal = averageTotal + student.getGrades().get(i);
        }
        
        averageTotal = averageTotal/student.getGrades().size();
        
        average.setAverage(averageTotal);
        return average;
    }

    private static Student updateLocalStudent() {
        Student student = new Student();
        
        System.out.print("\nEnter the new id: ");
        student.setId(sc.nextInt());
        System.out.print("Enter the new age: ");
        student.setMail(sc.nextLine());
        sc.nextLine();
        System.out.print("Enter the new name: ");
        student.setPassword(sc.nextLine());
        boolean exit = false;
        int option;
        double grade = 0;
        while (!exit)
        {
            System.out.print("Enter a grade: ");
            grade = sc.nextFloat();
            student.getGrades().add(grade);
            System.out.println("Do you want to enter another grade?\n1. Yes\n2. No");
            option = sc.nextInt();
            while (option > 2 || option < 1)
            {
                System.out.println("Incorrect Value, enter again: ");
                option = sc.nextInt();
            }
            if (option == 2)
            {
                exit = true;
            }
        }
        return student;
    }

    public static void deleteStudent() {
        int id;
        String uri = "mongodb+srv://POO123:POO123@cluster0.oy9dpt8.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");

                MongoCollection studentCollection = database.getCollection("students");
                MongoCollection averageCollection = database.getCollection("averages");

                System.out.print("\nEnter the id to delete: ");
                id = sc.nextInt();

                Bson filter = Filters.eq("id", id);

                studentCollection.deleteOne(filter);
                averageCollection.deleteOne(filter);

                System.out.println("Data has been deleted");

            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    private static Document insertDataStudent(Student student) {

        return new Document("_id", new ObjectId())
                .append("id", student.getId())
                .append("password", student.getPassword())
                .append("age", student.getMail())
                .append("Date of Birth", student.getDateOfBirth());
    }

    private static Document calculateAverageStudent(Document studentDoc) {
        Gson gson = new Gson();
        Average average = new Average();
        String grades;
        average.setStudentPassword(studentDoc.getString("password"));
        average.setId(studentDoc.getInteger("id"));

        grades = studentDoc.toJson();
        TypeToken<Student> type = new TypeToken<Student>() {
        };
        Student student = gson.fromJson(grades, type.getType());
        double averageTotal = 0;

        for (int i = 0; i < student.getGrades().size(); i++)
        {
            averageTotal = averageTotal + student.getGrades().get(i);
        }
        averageTotal = averageTotal / student.getGrades().size();
        average.setAverage(averageTotal);
        return new Document("_id", new ObjectId())
                .append("id", average.getId())
                .append("password", average.getStudentPassword())
                .append("average", average.getAverage());
    }

}
