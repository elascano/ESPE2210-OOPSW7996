
package ec.edu.espe.LibrarySimulatorWithMayben.model;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Traveler {

    private int id;
    private String name;
    private ArrayList<Travel> travels;
    private float totalToPay;

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", travels=" + travels + ", totalToPay=" + totalToPay + '}';
    }

    public Traveler(int id, String name, ArrayList<Travel> travels, float totalToPay) {
        this.id = id;
        this.name = name;
        this.travels = travels;
        this.totalToPay = totalToPay;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the travels
     */
    public ArrayList<Travel> getTravels() {
        return travels;
    }

    /**
     * @param travels the travels to set
     */
    public void setTravels(ArrayList<Travel> travels) {
        this.travels = travels;
    }

    /**
     * @return the totalToPay
     */
    public float getTotalToPay() {
        return totalToPay;
    }

    /**
     * @param totalToPay the totalToPay to set
     */
    public void setTotalToPay(float totalToPay) {
        this.totalToPay = totalToPay;
    }

    private static Scanner scan = new Scanner(System.in);

    public static void createPayments(MongoDatabase database) {
        Gson gson = new Gson();
        MongoCollection<Document> travelsCollection = database.getCollection("Travels");
        MongoCollection<Document> travelersPaymentsCollection = database.getCollection("TravelerPayments");
        int id;
        String name;
        ArrayList<Travel> travelsToPay = new ArrayList<Travel>();
        float totalToPay=0;
        System.out.println("What is the id number of the traveler?");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the name of the traveler?");
        name = scan.nextLine();
        
        do {
            System.out.println("What is Id of the travel that he/she took?");
            FindIterable<Document> result = travelsCollection.find(Filters.eq("id", scan.nextInt()));
           
            result.forEach(document -> travelsToPay.add(gson.fromJson(document.toJson(), Travel.class)));
            scan.nextLine();
            System.out.println("Do you want to enter another travel?");
            System.out.println("1.Yes 2.No");
        } while (scan.nextInt() != 2);
        
        for (int i = 0; i < travelsToPay.size(); i++) {
             totalToPay+=computePvp(travelsToPay.get(i).getPrice());
        }
        
        
       
       Traveler customer = new Traveler(id, name, travelsToPay, totalToPay);
        
        Document customerDocument = Document.parse(gson.toJson(customer));
        travelersPaymentsCollection.insertOne(customerDocument);
        System.out.println("The payment has been successfully created");
    }

    public static float computePvp(float base) {
        float iva;
        iva = base * 0.14F;
        return (base+iva);
    }

}
