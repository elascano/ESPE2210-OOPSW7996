
package ec.edu.espe.TaxiDriverMaven.model;
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
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Salary {
    private ArrayList<TaxiDriver> travels;
    private float totalProfits;

    @Override
    public String toString() {
        return "TaxiDriver{" + " Travels=>" + travels + ", totalProfits=>" + totalProfits + '}';
    }

    public Salary(ArrayList<TaxiDriver> travels, float totalProfits) {
        this.travels = travels;
        this.totalProfits = totalProfits;
    }

    /**
     * @return the travels
     */
    public ArrayList<TaxiDriver> getTravels() {
        return travels;
    }

    /**
     * @param travels the travels to set
     */
    public void setTravels(ArrayList<TaxiDriver> travels) {
        this.travels = travels;
    }

    /**
     * @return the totalProfits
     */
    public float getTotalProfits() {
        return totalProfits;
    }

    /**
     * @param totalProfits the totalProfits to set
     */
    public void setTotalProfits(float totalProfits) {
        this.totalProfits = totalProfits;
    }

    private static Scanner scan = new Scanner(System.in);

    public static void createProfitsFile(MongoDatabase database) {
        Gson gson = new Gson();
        MongoCollection<Document> salariesCollection = database.getCollection("Salaries");
        MongoCollection<Document> salariesProfitsCollection = database.getCollection("SalariesProfits");
        ArrayList<TaxiDriver> salariesToPay = new ArrayList<>();
        float totalProfits=0;

        do {
            System.out.println("Enter the earnings:  ");
            FindIterable<Document> result = salariesCollection.find(Filters.eq("Profits: ", scan.nextInt()));

            result.forEach(document -> salariesToPay.add(gson.fromJson(document.toJson(), TaxiDriver.class)));
            scan.nextLine();
            System.out.println("Do you want to enter another travel?");
                System.out.println("1)YES");
                System.out.println("2)NO");
        } while (scan.nextInt() != 2);

        for (int i = 0; i < salariesToPay.size(); i++) {
             totalProfits+=computePvp(salariesToPay.get(i).getProfits());
        }



       Salary salary = new Salary(salariesToPay, totalProfits);

        Document customerDocument = Document.parse(gson.toJson(salary));
        salariesProfitsCollection.insertOne(customerDocument);
        System.out.println("The salary has been successfully created");
    }

    public static float computePvp(float base) {
        float iva;
        iva = base * 0.14F;
        return (base+iva);
    }
}
