package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Salary;
import ec.edu.espe.taxes.model.Vehicle;
import java.util.Scanner;

/**
 *
 * @author Nicolay Chillo, Gaman GeekLords at DCOO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        float value;
        int option;
        String vehicleBrand;
        int cylinderCapacity;
        int yearsOfTheVehicle;
        boolean hybrid;
        float monthlySalary;
        float annualSalary;
        float valueOfEspecificTax;
        float adjustmentFactor;
        float surplusFractionTax;
                       
        Product product;
        Vehicle vehicle;
        Salary salary;
        
        Scanner scan = new Scanner(System.in);
     
        do {
            System.out.println("---------------------------");
            System.out.println("           Menu");
            System.out.println("---------------------------");
            System.out.println("1. IVA Tax");
            System.out.println("2. Green Tax");
            System.out.println("3. Rent Tax");
            System.out.println("4. Exit");
            System.out.println("Enter of the Option ");
            option = scan.nextInt();
                
                switch (option){
                    case 1:
                        System.out.println("------------------------------");
                        System.out.println("          IVA Tax");
                        System.out.println("------------------------------");
                        System.out.println("What is the Price of the Product?");
                        value = scan.nextFloat();
                        product = new Product(
                                1,
                                "Hammer", 
                                value ,
                                value + Tax.computeIVA(value));
                        System.out.println("Product --> " + product);
                        break;
                    case 2:
                         System.out.println("------------------------------");
                        System.out.println("           Green Tax");
                         System.out.println("------------------------------");
                        System.out.println("What is the Brand of your Vehicle?");
                        scan.nextLine();
                        vehicleBrand = scan.nextLine();
                        System.out.println("What is the Cylinder Capacity of your Vehicle?");
                        cylinderCapacity = scan.nextInt();
                        System.out.println("What are the Years of your Vehicle?");
                        yearsOfTheVehicle = scan.nextInt();
                        System.out.println("Is your Vehicle Hybrid? (true/false)");
                        hybrid = scan.nextBoolean();
                        valueOfEspecificTax = Tax.computeValueOfEspecificTax(cylinderCapacity);
                        adjustmentFactor = Tax.computeAdjustmentFactor(yearsOfTheVehicle, hybrid);
                        vehicle = new Vehicle(
                                vehicleBrand, 
                                cylinderCapacity, 
                                yearsOfTheVehicle, 
                                hybrid,
                                Tax.computeGreenTax(cylinderCapacity,valueOfEspecificTax, adjustmentFactor ));
                        System.out.println("Vehicle --> " + vehicle);
                        break;
                    case 3:
                         System.out.println("------------------------------");
                        System.out.println("            Rent Tax");
                         System.out.println("------------------------------");
                        System.out.println("What is your Monthly Salary?");
                        monthlySalary =  scan.nextFloat();
                        annualSalary = monthlySalary * 12;
                        surplusFractionTax = Tax.computeSurplusFractionTax(monthlySalary);
                        salary = new Salary(
                                monthlySalary, 
                                annualSalary, 
                                Tax.computeRentTax(monthlySalary, surplusFractionTax));
                        System.out.println("Salary --> " + salary);
                        break;
                    case 4:
                        break;
                }
        } while (option !=4 );    
    }   
}