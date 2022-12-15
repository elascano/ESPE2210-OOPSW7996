package ec.edu.espe.ws09.controller;
import ec.edu.espe.ws09.model.Customer;
import ec.edu.espe.ws09.model.Sandwich;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class InformationInput {
    public static Customer enterCustomerInfo(float total){
        Customer customer;
        int id;
        String name;
        String lastName;
        int phoneNumber;
        float cash;
        Scanner sc;
        boolean flag = false;
        
        sc = new Scanner(System.in);
        customer = new Customer();
        
        do{
            try{
                System.out.println("          Customer Information");
                System.out.print("Id---> ");
                id = sc.nextInt();
                System.out.print("Name---> ");
                name = sc.next();
                System.out.print("Lastname---> ");
                lastName = sc.next();
                System.out.print("Phone number---> ");
                phoneNumber = sc.nextInt();
                System.out.print("Cash---> ");
                cash = sc.nextInt();
                
                if(cash<total){
                    throw new NotEnoughCashException();
                }

                customer = new Customer(id, name, lastName, phoneNumber, cash);
                flag = true;
            }
            catch(InputMismatchException ex){
                System.out.println("You must enter an integer number");
                sc.nextLine();
            }
            catch(NotEnoughCashException ex){
                System.out.println("Not enough cash for the purchase.");
                sc.nextLine();
            }
        }while(flag !=true);
        return customer;
    }
    
    public static void enterProductInfo(ArrayList<Sandwich> sandwiches){
        Sandwich sandwich;
        int id;
        String name;
        boolean hasMeat;
        String typeOfMeat;
        float price;
        String option;
        Scanner sc;
        boolean flag = false;
        
        option = "";
        sc = new Scanner(System.in);
        sandwich = new Sandwich();
        
        do{
            try{
                System.out.println("               Sandwich Information");
                System.out.print("Id---> ");
                id = sc.nextInt();
                System.out.print("Name---> ");
                name = sc.next();
                System.out.print("Has meat(true/false)?---> ");
                hasMeat = sc.nextBoolean();
                if(hasMeat == true){
                    System.out.print("Kind of meat---> ");
                    typeOfMeat = sc.next();
                }else{
                    typeOfMeat = "none";
                }
                System.out.print("Price--->");
                price = sc.nextFloat();
                flag = true;

                sandwich = new Sandwich(id,name,hasMeat,typeOfMeat,price);
                sandwiches.add(sandwich);
                
                System.out.println("Do you wanna enter another sandwich (Yes/No)?");
                option = sc.next();
                System.out.println();
            }
            catch(Exception my_exception){
                System.out.println("Wrong imput data");
                sc.nextLine();
            }
        }while(flag !=true || option.equals("Yes") || option.equals("yes"));
    }
}
