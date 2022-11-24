package fashionstore.view;

//Import libraries and classes
import com.google.gson.Gson;
import java.util.Scanner;
import fashionstore.model.Calendar;
import fashionstore.model.Catalogue;
import fashionstore.model.ClothModel;
import fashionstore.model.DeadlineDate;
import fashionstore.model.FashionDesigner;
import fashionstore.model.Measurement;
import fashionstore.model.Order;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class FashionStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====\tGroup #5\t=====");
        System.out.println("===== Pythons =====");
        //Variable Declaration
        int option;
        int id;
        String customerName = "";
        long phoneNumber;
        Measurement measurement;
        int orderCounter = 0;

        double neck, chest, shoulder, arm, hip, waist, leg;

        Scanner scan = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<Order>();

        do {
            //Menu Creation
            System.out.println("===================================");
            System.out.println("\t\tMenu:");
            System.out.println("1. Create a new order");
            System.out.println("2. Print all orders");
            System.out.println("3. Export as JSON file");
            System.out.println("4. Exit");

            System.out.println("Enter an option: ");
            option = scan.nextInt();
            //Menu Validation
            while (option > 4) {
                System.out.println("Option invalid, Enter an option: ");
                option = scan.nextInt();
            }

            try { //exceptions
                switch (option) {
                    case 1 -> {
                        System.out.println("Enter the Order Id:");
                        id = scan.nextInt();
                        System.out.println("Enter the Customer Name:");
                        customerName = scan.next();
                        System.out.println("Enter the phone number:");
                        phoneNumber = scan.nextLong();
                        System.out.println("Measurements:");
                        System.out.println("Enter the neck measurement:");
                        neck = scan.nextDouble();
                        System.out.println("Enter the chest measurement:");
                        chest = scan.nextDouble();
                        System.out.println("Enter the shoulder measurement:");
                        shoulder = scan.nextDouble();
                        System.out.println("Enter the arm measurement:");
                        arm = scan.nextDouble();
                        System.out.println("Enter the hip measurement:");
                        hip = scan.nextDouble();
                        System.out.println("Enter the waist measurement:");
                        waist = scan.nextDouble();
                        System.out.println("Enter the leg measurement:");
                        leg = scan.nextDouble();
                        
                        //Use of constructors
                        measurement = new Measurement(neck, chest, shoulder, arm, hip, waist, leg);
                        orders.add(new Order(id, customerName, phoneNumber, measurement));

                        orderCounter++;
                    }
                    case 2 -> {
                        //print section
                        if (!orders.isEmpty()) { 
                            System.out.println("================================");
                            System.out.println("Id\tCustomer Name\tPhone Number\tNeck\tChest\tShoulder\tArm\tHip\tWaist\tLeg");
                            for (int i = 0; i < orders.size(); i++) {
                                printOrder(orders, i);
                            }
                            System.out.println("================================");
                        } else {
                            System.out.println("There are no orders");
                        }
                    }
                    case 3 -> {
                        //Use of Gson library
                        String json = new Gson().toJson(orders);
                        //file creation
                        File orderRecord = new File("orderRecord.json");
                        try {
                            PrintWriter writer = new PrintWriter(new FileWriter(orderRecord, true));
                            writer.print(json);
                            writer.close();
                        } catch (IOException ex) { //Exception
                            Logger.getLogger(FashionStore.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Data type entered wasn't what was expected");
                scan.next();
            }

        } while (option < 4);

    }

    private static void printOrder(ArrayList<Order> orders, int position) {
        //Print orders
        System.out.print(orders.get(position).getId() + "\t\t");
        System.out.print(orders.get(position).getCustomerName() + "\t\t");
        System.out.print(orders.get(position).getPhoneNumber() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getNeckMeasurement() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getChestMeasurement() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getShoulderMeasurement() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getArmMeasurement() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getHipMeasurement() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getWaistMeasurement() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getLegMeasurement() + "\n");
    }

}
