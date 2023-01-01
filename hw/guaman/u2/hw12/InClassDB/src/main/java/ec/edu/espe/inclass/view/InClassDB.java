package ec.edu.espe.inclass.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.inclass.controller.DataBaseManager;
import ec.edu.espe.inclass.model.Course;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class InClassDB {

    public static void main(String[] args) {
        String uri = "mongodb+srv://user:1234@cluster0.uz5ahnb.mongodb.net/?retryWrites=true&w=majority";
        Scanner sc = new Scanner(System.in);
        Course course = new Course();
        int option = 0;

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("InClassDB");
            try {
                System.out.println("Connected successfully to server.");

                MongoCollection collectionCourse = database.getCollection("course");
                MongoCollection collectionTotalStudents = database.getCollection("totalStudents");

                while (option != 7) {
                    System.out.println("\nInClass APP SIMULATOR");
                    System.out.println("Alexander Guaman - Developer Bears");
                    System.out.println("\n\tMAIN MENU - COURSE");
                    System.out.println("1. Add a new course");
                    System.out.println("2. Show all courses");
                    System.out.println("3. Delete a course");
                    System.out.println("4. Find a course");
                    System.out.println("5. Update a course");
                    System.out.println("6. Calculate total students");
                    System.out.println("7. Exit");

                    System.out.print("Choose an option: ");
                    try {
                        option = sc.nextInt();
                    } catch (Exception e) {
                        option = 0;
                    }
                    sc.nextLine();

                    switch (option) {
                        case 1 -> {
                            DataBaseManager.addCourse(course, collectionCourse);
                        }

                        case 2 -> {
                            DataBaseManager.printCourses(collectionCourse);

                        }

                        case 3 -> {
                            DataBaseManager.printCourses(collectionCourse);
                            DataBaseManager.deleteCourse(collectionCourse);

                        }

                        case 4 -> {

                            DataBaseManager.findCourse(collectionCourse);
                        }

                        case 5 -> {
                            DataBaseManager.printCourses(collectionCourse);
                            DataBaseManager.updateCourse(collectionCourse);

                        }

                        case 6 -> {
                            DataBaseManager.calculateTotalStudents(collectionCourse, collectionTotalStudents);


                        }

                        case 7 ->
                            System.out.println("See you...");

                        default ->
                            System.out.println("Error: Invalid option try again.");
                    }

                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }


}
