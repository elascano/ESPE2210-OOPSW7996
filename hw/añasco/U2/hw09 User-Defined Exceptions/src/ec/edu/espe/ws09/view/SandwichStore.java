package ec.edu.espe.ws09.view;
import static ec.edu.espe.ws09.controller.MoneyManager.calculateTotalPurchase;
import static ec.edu.espe.ws09.controller.InformationInput.enterCustomerInfo;
import static ec.edu.espe.ws09.controller.InformationInput.enterProductInfo;
import static ec.edu.espe.ws09.controller.MoneyManager.calculateChange;
import ec.edu.espe.ws09.model.Customer;
import ec.edu.espe.ws09.model.Sandwich;
import java.util.ArrayList;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class SandwichStore {
    public static void main(String[] args) {
        Customer customer;
        ArrayList<Sandwich> sandwiches;
        float total;
        float change;
        
        customer = new Customer();
        sandwiches = new ArrayList<>();
        
        System.out.println("==================================================");
        enterProductInfo(sandwiches);
        total = calculateTotalPurchase(sandwiches);
        System.out.println("Your total is ---> " + total);
        System.out.println("==================================================");
        customer = enterCustomerInfo(total);
        System.out.println("==================================================");
        createBill(sandwiches,customer);
        System.out.println("==================================================");
    }
    
    public static void createBill(ArrayList<Sandwich> sandwiches, Customer customer){
        float total;
        float change;
        
        total = calculateTotalPurchase(sandwiches);
        change = calculateChange(customer, total);
        
        System.out.println("                     Bill");
        System.out.println("Name: "+customer.getName());
        System.out.println("Last name: "+customer.getLastName());
        System.out.println("Id: "+customer.getId());
        System.out.println("Phone number: "+customer.getPhoneNumber());
        System.out.println("--------------------------------------------------");
        System.out.println("Id"+"\t\t"+"Name"+"\t\t"+"Price");
        System.out.println("--------------------------------------------------");
        for (Sandwich sandwich : sandwiches) {
            System.out.println(sandwich.getId()+"\t\t"+sandwich.getName()+"\t\t"+sandwich.getPrice()+"\t\t");
        }
        System.out.println("Total--> "+total);
        System.out.println("Cash--> "+customer.getCash());
        System.out.println("Change-->"+change);
        
    }
}
