
package ec.edu.espe.taxi.model;

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
    private long phoneNumber;
    private String birthDate;
    private String email;
    private ArrayList<Travel> travels;
    private float outstandingBalance;

    @Override
    public String toString() {
        return "Traveler{" + "id=" + getId() + ", name=" + getName() + ", phoneNumber=" + getPhoneNumber() + ", birthDate=" + getBirthDate() + ", email=" + getEmail() + ", travels=" + getTravels() + ", outstandingBalance=" + getOutstandingBalance() + '}';
    }

    
    
 public Traveler() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = 0;
        this.birthDate = "";
        this.email = "";
        this.travels = null;
        this.outstandingBalance = 0.0F;
    }

    public Traveler(int id, String name, long phoneNumber, String birthDate, String email, ArrayList<Travel> travels, float outstandingBalance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.travels = travels;
        this.outstandingBalance = outstandingBalance;
    }

    
   

   

    private static Scanner scan = new Scanner(System.in);

    /*public static void createPayments(MongoDatabase database) {
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
    }*/

   /* public static float computePvp(float base) {
        float iva;
        iva = base * 0.14F;
        return (base+iva);
    }*/

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
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the outstandingBalance
     */
    public float getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * @param outstandingBalance the outstandingBalance to set
     */
    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    /**
     * @return the scan
     */
    public static Scanner getScan() {
        return scan;
    }

    /**
     * @param aScan the scan to set
     */
    public static void setScan(Scanner aScan) {
        scan = aScan;
    }

    

}
