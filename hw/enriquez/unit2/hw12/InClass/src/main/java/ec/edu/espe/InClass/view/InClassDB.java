
package ec.edu.espe.InClass.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.InClass.controller.DataBaseManager;
import ec.edu.espe.InClass.model.Teacher;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class InClassDB {

    public static void main(String[] args) {
        String uri = "mongodb+srv://Cheyli:1234@cheyli.gsvqzfd.mongodb.net/?retryWrites=true&w=majority";
        Scanner sc = new Scanner(System.in);
        Teacher teacher= new Teacher();
        int option = 0;

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("InClassDB");
            try {
                System.out.println("Connected successfully to server.");

                MongoCollection collectionTeacher = database.getCollection("Teacher");
                MongoCollection collectionTotalTutorship = database.getCollection("totalTutorships");

                while (option != 7) {
                    System.out.println("--------------HOMEWORK 12--------------");
                    System.out.println("\nInClass SIMULATOR");
                    System.out.println("Sheylee Enriquez - Developer Bears");
                    System.out.println("\n   MENU");
                    System.out.println("1. Add a new teacher.");
                    System.out.println("2. Show all the teachers.");
                    System.out.println("3. Delete a teacher.");
                    System.out.println("4. Find a teacher.");
                    System.out.println("5. Update the information of a teacher.");
                    System.out.println("6. Calculate the total of tutorships.");
                    System.out.println("7. Exit.");

                    System.out.print("Please choose an option: ");
                    try {
                        option = sc.nextInt();
                    } catch (Exception e) {
                        option = 0;
                    }
                    sc.nextLine();

                    switch (option) {
                        case 1 -> {
                            DataBaseManager.addTeacher(teacher, collectionTeacher);
                        }

                        case 2 -> {
                            DataBaseManager.printTeacher(collectionTeacher);

                        }

                        case 3 -> {
                            DataBaseManager.printTeacher(collectionTeacher);
                            DataBaseManager.deleteTeacher(collectionTeacher);

                        }

                        case 4 -> {

                            DataBaseManager.findTeacher(collectionTeacher);
                        }

                        case 5 -> {
                            DataBaseManager.printTeacher(collectionTeacher);
                            DataBaseManager.updateTeacher(collectionTeacher);

                        }

                        case 6 -> {
                            DataBaseManager.calculateTotalTutorships(collectionTeacher, collectionTotalTutorship);


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
