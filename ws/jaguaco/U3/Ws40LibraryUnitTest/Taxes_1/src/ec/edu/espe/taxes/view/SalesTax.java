package ec.edu.espe.taxes.view;

import ec.espe.edu.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.controller.controller;
import ec.espe.edu.taxes.model.RentTax;
import ec.espe.edu.taxes.model.Vehicle;
import java.util.Scanner;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class SalesTax {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Product product;
        Vehicle vehicle;
        RentTax renttax;
        int choice;               
        do{
        menuOption();
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                float ivaporcentage = 0.12F;
            System.out.println("-------Value of a product plus VAT-------");
            System.out.println("-> Id of the product ");
            int id = sc.nextInt();
            System.out.println("->Description of the product:");
            String description = sc.next();
            System.out.println("->Product value in $:");
            float value = sc.nextFloat();
            product = new Product ( id, description, value,  value + controller.computeIva(value, ivaporcentage));
            System.out.println("Description -->" + product); 
                break;
            case 2:
                System.out.println("------Value of the green tax-------");
                System.out.println("""
                                   You have a motorized land transport vehicle with a cylinder capacity greater 
                                   than 1500cc.and your vehicle is more than 5 years old?
                                   Options:
                                   1. true
                                   2. false
                                       """);
                int vehicl = sc.nextInt();
                if(vehicl == 1){
                    float cylindersection;
                    float cylinder;
                    float age;
                    printCylinder();
                    cylindersection = sc.nextFloat();
                    System.out.println("What is your cylinder");
                    cylinder = sc.nextFloat();
                    printAge();
                    age = sc.nextFloat();  
                    
                   vehicle = new Vehicle(cylindersection, cylinder, age, controller.computerGreenTax(cylinder, cylinder, age));
                    System.out.println("Vehicle -->" + vehicle);
                    break;
                }
                if(vehicl != 1){
                   printDontPay();
                   break;
                }
                break;
            case 3:
                System.out.println("------Value of the green tax-------");
                System.out.println("""
                                   Do you receive a salary greater than $11.310,00?
                                   1. True
                                   2. False
                                   """);
                int salary = sc.nextInt();
                if(salary == 1){
                        float personalsalary, rentax,cost , expense,basicfraction, surplusfraction,surplusfractiontax,fractiontax,basicfractiontax;
                        System.out.println("Calculate tax base");
                        System.out.println("Write your salary:");
                        personalsalary = sc.nextFloat();
                        System.out.println("Write your costs");
                        cost = sc.nextFloat();
                        System.out.println("Write your expenses");
                        expense = sc.nextFloat();
                        calculatedNetIncome(personalsalary,cost,expense);
                        System.out.println("Net Income --> " + calculatedNetIncome(personalsalary, cost, expense));
                        System.out.println("Write your basic fraction according to the following table:");
                        printTable();
                        basicfraction = sc.nextFloat();
                        surplusfraction= calculatedNetIncome(personalsalary, cost, expense)-basicfraction;
                        System.out.println("Surplus Fraction-->" + surplusfraction);
                        System.out.println("Write your surplus fraction in decimales according to the following table:");
                        printTable();
                        fractiontax=sc.nextFloat();
                        surplusfractiontax(surplusfraction,fractiontax);
                        System.out.println("Sur Plus Fraction Tax -->" + surplusfractiontax(surplusfraction, fractiontax));
                        System.out.println("write your basic fraction tax according to the following table:");
                        printTable();
                        basicfractiontax = sc.nextFloat();
                        rentax = surplusfractiontax(surplusfraction, fractiontax)+basicfractiontax;
                        renttax = new RentTax( personalsalary,cost,expense,basicfraction,fractiontax,rentax + Tax.rentTax(rentax));
                        System.out.println("Rent Tax -->" + renttax);
                    break;
                }
                if(salary != 1){
                    printDontPay();
                   break;
                }
                break;
            
            
        }
        }while(choice!=4);
            close();
                   
    }
    
    public static void menuOption(){
        System.out.println("                Menu Option");
        System.out.println("1. Calculate the value of a product with VAT ");
        System.out.println("2. Calculate the value of the green tax");
        System.out.println("3. Calculate the amount of rent tax");
        System.out.println("4. Exit");
    }
    public static void close(){
     System.out.println("""
        *********************************
        *  Program closed successfully  *
        *       Come back soon :)       *
        *********************************""");
    }

    public static float greentaxcalculated(float cylinder, float cylindersection, float age) {
        float cylinderfinal = cylinder-1500;
        float cylindersectionfinal = cylinderfinal*cylindersection;
        float greentax = cylindersectionfinal*age;
        return greentax;
    }

    private static void printCylinder() {
        System.out.println("Write your percentage according to the cylinder section table");
        System.out.println("1. 1.501 - 2.000 cc --> 0.08");
        System.out.println("2. 2.001 - 2.500 cc --> 0.09");
        System.out.println("3. 2.501 - 3.000 cc --> 0.11");
        System.out.println("4. 3.001 - 3.500 cc --> 0.12");
        System.out.println("5. 3.501 - 4.000 cc --> 0.24");
        System.out.println("6. > 4001 cc --> 0.35");
    }

    private static void printAge() {
    System.out.println("Write your percentage according to the age table");
    System.out.println("1. 5 - 10  --> 1.05");
    System.out.println("2. 11 - 15 --> 1.10");
    System.out.println("3. 16 - 20 --> 1.15");
    System.out.println("4. > 20 -->  1.20");        
    }

    private static void printDontPay() {
        System.out.println("***********************************************");
        System.out.println("*  Sorry, you don't need to pay this tax :)   *");
        System.out.println("***********************************************");
    }

    private static float calculatedNetIncome(float personalsalary, float cost, float expense) {
        float netincome;
        netincome= personalsalary-cost-expense;
        return netincome;
    }

    private static void printTable() {
        System.out.println("""
                            ____________________________________________________________________________
                           | Basic Fraction |  Excess Up   |  Surplus Fraction Tax | Basic Fraction Tax |
                           |   11.310,01    |   14.410,00  |       5%  = 0.05      |        0           |
                           |   14.410,01    |   18.010,00  |       10% = 0.10      |       155          |
                           |   18.010,01    |   21.630,00  |       12% = 0.12      |       515          |
                           |   21.630,01    |   31.630,00  |       15% = 0.15      |       949          |
                           |   31.630,01    |   41.630,00  |       20% = 0.20      |      2.449         |   
                           |   41.630,01    |   51.630,00  |       25% = 0.25      |      4.449         |
                           |   51.630,01    |   61.630,00  |       30% = 0.30      |      6.949         |
                           |   61.630,01    |   100.000,00 |       35% = 0.35      |      9.949         |
                           |   100.000,01   |    Onwards   |       37% = 0.37      |      23.379        |
                           |________________|______________|_______________________|____________________|
                           """);
    }

    private static float surplusfractiontax(float surplusfraction, float fractiontax) {
        float tax;
        tax = surplusfraction*fractiontax;
        return tax;
    }
    
}
