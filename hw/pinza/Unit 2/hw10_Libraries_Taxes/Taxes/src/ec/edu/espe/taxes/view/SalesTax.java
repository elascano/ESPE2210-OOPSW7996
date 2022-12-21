package ec.edu.espe.taxes.view;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Product;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n\t=============MENU=============");
        System.out.println("\t   HW10 - Juan Pinza - O.O.P.");
        System.out.println("\t==============================");
        System.out.println("1) Calculate the V.A.T of a product");
        System.out.println("2) Calculate Green Tax");
        System.out.println("3) Calculate Rent Tax");
        System.out.println("\t> Please, select an option: ");
        int menuOption = scan.nextInt();
        switch (menuOption) {
            case 1:
                float value;
                System.out.println("Enter the name of the product: ");
                scan.nextLine();
                String nameOfTheProduct = scan.nextLine();
                System.out.println("Enter the ID of the product: ");
                int idOfTheProduct = scan.nextInt();
                System.out.println("Enter the price of the product: ");
                value = scan.nextFloat();
                System.out.println("The V.A.T value is -> " + Tax.computeIva(value));
                Product product = new Product(idOfTheProduct, nameOfTheProduct, value, value + Tax.computeIva(value));
                System.out.println("Product ->" + product);
                break;
            case 2:
                System.out.println("To calculate the Green Taxes you have to pay:");
                System.out.println("Enter the Cylinder Capacity: ");
                float cylinderCapacity = scan.nextFloat();
                System.out.println("Enter the years of your car: ");
                float yearsOfTheCar = scan.nextFloat();
                float totalToPay = Tax.computeGreenTax(cylinderCapacity, yearsOfTheCar);
                System.out.println("The total for Green Taxes is -> $" + totalToPay);
                break;
            case 3:
                System.out.println("To calculate the Rent Taxes you have to pay:");
                System.out.println("Enter your Monthly Salary: ");
                float monthlySalary = scan.nextFloat();
                System.out.println("Enter your Monthly Expenses: ");
                float monthlyExpenses = scan.nextFloat();
                float totalRentTaxes = Tax.computeRentTax(monthlySalary, monthlyExpenses);
                System.out.println("The total for Rent Taxes is -> $" + totalRentTaxes);
                break;
            default:
                System.err.println("The option you're trying to choose, doesn't exist");
                break;
        }

    }
}
