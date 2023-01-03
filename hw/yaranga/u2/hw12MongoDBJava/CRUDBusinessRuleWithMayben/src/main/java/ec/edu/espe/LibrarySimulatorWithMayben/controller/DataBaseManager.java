package ec.edu.espe.LibrarySimulatorWithMayben.controller;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.LibrarySimulatorWithMayben.model.Travel;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class DataBaseManager {

    private static Scanner scan = new Scanner(System.in);

    public static void createOperation(Travel travel, MongoDatabase database) {
        MongoCollection<Document> travelsCollection = database.getCollection("Travels");
        Gson gson = new Gson();

        String jsonString = gson.toJson(travel);
        Document document = Document.parse(jsonString);
        travelsCollection.insertOne(document);

    }

    public static void readToDataBase(MongoDatabase database) {
        MongoCollection collection = database.getCollection("Travels");

        Bson filter = Filters.and(Filters.gt("id", 0)); 
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        System.out.println("-->" + collection.find(filter).iterator());

        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
    }

    public static void updateOperation(MongoDatabase database) {
        MongoCollection<Document> travelsCollection = database.getCollection("Travels");
        int id;
        Boolean exit = false;

        System.out.println("Enter the id of the number to search");
        id = scan.nextInt();
        FindIterable<Document> result = travelsCollection.find(Filters.eq("id", id));

        if (result.first() != null) {
            do {
                System.out.println("******Uptade Menu******");
                System.out.println("1.Id");
                System.out.println("2.Driver");
                System.out.println("3.Address");
                System.out.println("4.Date of occurrence");
                System.out.println("5.Price");
                System.out.println("6.Back <---");
                System.out.println("What do you want to change?");
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("What is the new Id?");
                        travelsCollection.updateOne(result.first(), Updates.set("id", scan.nextInt()));

                        break;
                    case 2:
                        scan.nextLine();
                        System.out.println("Who is the new driver");
                        travelsCollection.updateOne(result.first(), Updates.set("driver", scan.nextLine()));
                        break;
                    case 3:
                        scan.nextLine();
                        System.out.println("What is the new address?");
                        travelsCollection.updateOne(result.first(), Updates.set("address", scan.nextLine()));
                        break;
                    case 4:
                        scan.nextLine();
                        int year,month,day;
                        String dateOfOcurrence;
                        System.out.println("What is the Date of occurrence");
                        System.out.print("year->");
                        year = scan.nextInt();
                        scan.nextLine();
                        System.out.print("month->");
                        month = scan.nextInt();
                        scan.nextLine();
                        System.out.print("day->");
                        day = scan.nextInt();
                        scan.nextLine();
                        dateOfOcurrence = (year + "/" + month + "/" + day);
                        travelsCollection.updateOne(result.first(), Updates.set("dateOfOcurrence", dateOfOcurrence));    
                        break;
                    case 5:
                        scan.nextLine();
                        System.out.println("What is the new price?");
                        travelsCollection.updateOne(result.first(), Updates.set("price", scan.nextFloat()));
                        break;
                    case 6:
                        exit = true;
                        break;

                }

            } while (!exit);
        } else {
            System.out.println("The id doesn't exist: id-->" + result.first());
        }
    }

    public static void deleteOperation(MongoDatabase database) {
        MongoCollection<Document> travelsCollection = database.getCollection("Travels");

        System.out.println("Enter the id of the number to search");
        FindIterable<Document> result = travelsCollection.find(Filters.eq("id", scan.nextInt()));
        int option;
        if (result.first() != null) {
            System.out.println("Are you sure to remove this travel?");
            System.out.println("1.Yes , 2.No");
            option = scan.nextInt();
            if (option != 2) {
                travelsCollection.deleteOne(result.first());
                System.out.println("The travel has been successfully removed");
            }
        } else {
            System.out.println("The id doesn't exist: id-->" + result.first());
        }
    }

    public static ArrayList<Travel> loadFromDatabase(ArrayList<Travel> travels, MongoDatabase database) {
        Gson gson = new Gson();
        MongoCollection<Document> booksCollection = database.getCollection("Travels");
        FindIterable<Document> result = booksCollection.find(Filters.gt("id", 0));
        result.forEach(d -> travels.add(gson.fromJson(d.toJson(), Travel.class)));
        return travels;
    }

}
