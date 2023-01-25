
package ec.edu.espe.TaxiDriverMaven.controller;
import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.TaxiDriverMaven.model.TaxiDriver;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class DataBaseManager {
    private static final Scanner scan = new Scanner(System.in);

        public static void enterTaxiDriver(ArrayList<TaxiDriver> taxiDriver, TaxiDriver taxiDrivers, int position[]) {
        String driversName;
        int id;
        String numberOfId;
        String taxisPlate;
        int year, month,day;
        String travelsDate;
        Float profits;
        System.out.println("====================================");
        System.out.println("       ENTER TAXI DRIVER DATA       ");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the driver's name: ");
        driversName = scan.nextLine();
        taxiDrivers.setDriversName(driversName);
        System.out.println("");
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Enter the id: ");
        numberOfId = scan.nextLine();
        scan.nextLine();
        System.out.println("====================================");

        String regex = "\\d{10}";

        while (numberOfId.matches(regex) == false) {
            System.out.println(">>The number is: " + numberOfId);
            System.out.println(">>Is the above id valid? " + numberOfId.matches(regex));
            System.out.println(">>The number is must to be 10 numbers");
            
            System.out.println("====================================");
            System.out.println("Enter the id: ");
            numberOfId = scan.nextLine();
            scan.nextLine();
            System.out.println("====================================");
        }

        id = Integer.parseInt(numberOfId);
        
        taxiDrivers.setId(id);

        System.out.println("====================================");
        System.out.println("Enter the taxi's plate: ");
        taxisPlate = scan.nextLine();
        taxiDrivers.setTaxisPlate(taxisPlate);
        System.out.println("");
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Enter the date of the travel: ");
        System.out.print("year=>");
        year = scan.nextInt();
        scan.nextLine();
        System.out.print("month=>");
        month = scan.nextInt();
        scan.nextLine();
        System.out.print("day=>");
        day = scan.nextInt();
        scan.nextLine();
        taxiDrivers.setTravelsDate(travelsDate=(year+"/"+month+"/"+day));
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Enter the profits: ");
        profits = scan.nextFloat();
        taxiDrivers.setProfits(0);
        System.out.println("");
        System.out.println("====================================");
        
        taxiDrivers = new TaxiDriver(id, driversName, taxisPlate,travelsDate, profits);
        taxiDriver.add(taxiDrivers);

    }
    public static void createFile(TaxiDriver taxiDriver, MongoDatabase database) {
        MongoCollection<Document> taxiDriversCollection = database.getCollection("taxiDriver");
        Gson gson = new Gson();

        String jsonString = gson.toJson(taxiDriver);
        Document document = Document.parse(jsonString);
        taxiDriversCollection.insertOne(document);

    }

    public static void readFileDataBase(MongoDatabase database) {
        MongoCollection collection = database.getCollection("taxiDriver");

        Bson filter = Filters.and(Filters.gt("taxiDriver", 0)); 
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

    public static void updateFile(MongoDatabase database) {
        MongoCollection<Document> taxiDriversCollection = database.getCollection("taxiDriver");
        int id;
        Boolean exit = false;

        System.out.println("Enter the ID of the Taxi Driver that you want to update: ");
        id = scan.nextInt();
        FindIterable<Document> result = taxiDriversCollection.find(Filters.eq("id", id));

        if (result.first() != null) {
            do {
                System.out.println("======UPDATE FILE======");
                System.out.println("1)Taxi Driver's ID");
                System.out.println("2)Taxi Driver's name");
                System.out.println("3)Taxi's plate");
                System.out.println("4)Travel's date");
                System.out.println("5)Profits");
                System.out.println("6)Return <---");
                System.out.println("Enter what you want to change?");
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("Enter the new ID: ");
                        taxiDriversCollection.updateOne(result.first(), Updates.set("id", scan.nextInt()));

                        break;
                    case 2:
                        scan.nextLine();
                        System.out.println("Enter the new driver's name: ");
                        taxiDriversCollection.updateOne(result.first(), Updates.set("driversName", scan.nextLine()));
                        break;
                    case 3:
                        scan.nextLine();
                        System.out.println("Enter the new taxi's plate: ");
                        taxiDriversCollection.updateOne(result.first(), Updates.set("taxisPlate", scan.nextLine()));
                        break;
                    case 4:
                        scan.nextLine();
                        int year,month,day;
                        String dateOfTravel;
                        System.out.println("Enter the new date of the travel: ");
                        System.out.print("Year==>");
                        year = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Month==>");
                        month = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Day==>");
                        day = scan.nextInt();
                        scan.nextLine();
                        dateOfTravel = (year + "-" + month + "-" + day);
                        taxiDriversCollection.updateOne(result.first(), Updates.set("travelsDate", dateOfTravel));    
                        break;

                    case 5:
                        scan.nextLine();
                        System.out.println("Enter the new profits: ");
                        taxiDriversCollection.updateOne(result.first(), Updates.set("profits", scan.nextFloat()));
                        break;
                    case 6:
                        exit = true;
                        break;

                }

            } while (!exit);
        } else {
            System.out.println("Nonexistent ID===>ID: " + result.first());
        }
    }

    public static void deleteFile(MongoDatabase database) {
        MongoCollection<Document> taxiDriversCollection = database.getCollection("taxiDriver");

        System.out.println("Enter the ID of the Taxi Driver that you want to delete: ");
        FindIterable<Document> result = taxiDriversCollection.find(Filters.eq("id", scan.nextInt()));
        int option;
        if (result.first() != null) {
            System.out.println("Are you sure to remove this Taxi Driver?");
                System.out.println("1)YES");
                System.out.println("2)NO");
            option = scan.nextInt();
            if (option != 2) {
                taxiDriversCollection.deleteOne(result.first());
                System.out.println("The Taxi Driver has been successfully removed");
            }
        } else {
            System.out.println("Nonexistent ID===>ID: " + result.first());
        }
    }

    public static ArrayList<TaxiDriver> loadFileDatabase(ArrayList<TaxiDriver> taxiDrivers, MongoDatabase database) {
        Gson gson = new Gson();
        MongoCollection<Document> booksCollection = database.getCollection("taxiDriver");
        FindIterable<Document> result = booksCollection.find(Filters.gt("id", 0));
        result.forEach(d -> taxiDrivers.add(gson.fromJson(d.toJson(), TaxiDriver.class)));
        return taxiDrivers;
    }

}
