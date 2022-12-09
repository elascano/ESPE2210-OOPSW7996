package fashionstore.view;

//Import libraries and classes
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.util.Scanner;
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
        int[] orderNumber = new int[1];
        int idFinder;
        int ordersPosition;

        Scanner scan = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<Order>();

        //Reading saved orders from JSON file
        orders = readFile(orders);

        do {
            //Menu Creation
            System.out.println("===================================");
            System.out.println("\t\tMenu:");
            System.out.println("1. Create a new order");
            System.out.println("2. Edit Order");
            System.out.println("3. Delete Order");
            System.out.println("4. Print all orders");
            System.out.println("5. Exit");

            System.out.println("Enter an option: ");
            option = scan.nextInt();
            //Menu Validation
            while (option > 5) {
                System.out.println("Option invalid, Enter an option: ");
                option = scan.nextInt();
            }

            try { //exceptions
                switch (option) {
                    case 1 -> {
                        createOrder(orders);
                        fixId(orders);
                        exportOrders(orders);
                    }
                    case 2 -> {
                        if (orders.isEmpty()) {
                            System.out.println("There are no orders");
                        } else {
                            do {
                                System.out.println("Enter the id of the order you want to change");
                                idFinder = scan.nextInt();
                                ordersPosition = searchId(orders, idFinder);
                            } while (ordersPosition == -1);
                            System.out.println(orders.get(ordersPosition));
                            editOrder(orders, ordersPosition);
                            fixId(orders);
                            exportOrders(orders);
                        }
                    }
                    case 3 -> {
                        if (orders.isEmpty()) {
                            System.out.println("There are no orders");
                        } else {
                            do {
                                System.out.println("Enter the id of the order you want to delete");
                                idFinder = scan.nextInt();
                                ordersPosition = searchId(orders, idFinder);
                            } while (ordersPosition == -1);
                            deleteOrder(orders, ordersPosition);
                            fixId(orders);
                            exportOrders(orders);
                        }
                    }
                    case 4 -> {
                        //print section
                        if (!orders.isEmpty()) {
                            System.out.println("=================================================================================================================");
                            System.out.println("Id\tCustomer Name\tPhone Number\tNeck\tChest\tShoulder\tArm\tHip\tWaist\tLeg");
                            for (int i = 0; i < orders.size(); i++) {
                                printOrders(orders, i);
                            }
                            System.out.println("=================================================================================================================");
                        } else {
                            System.out.println("There are no orders");
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Data type entered wasn't what was expected");
                scan.next();
            }

        } while (option < 5);

    }

    private static void deleteOrder(ArrayList<Order> orders, int ordersPosition) {
        int option;
        Scanner scan = new Scanner(System.in);

        System.out.println(orders.get(ordersPosition));
        System.out.println("Are you sure you want to delete this order?\n1. YES\n2. NO");
        System.out.println("Choose an option (type 1 or 2)");
        option = scan.nextInt();
        while (option > 2) {
            System.out.println("Option invalid, Enter an option: ");
            option = scan.nextInt();
        }
        if (option == 1) {
            orders.remove(ordersPosition);
            System.out.println("Order removed");
        }        

    }

    private static void exportOrders(ArrayList<Order> orders) {
        //Use of Gson library
        String json = new Gson().toJson(orders);
        //file creation
        try {
            FileWriter orderRecord = new FileWriter("orderRecord.json");
            orderRecord.write(json);
            orderRecord.close();
        } catch (IOException ex) { //Exception
            Logger.getLogger(FashionStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static ArrayList<Order> readFile(ArrayList<Order> orders) throws JsonSyntaxException {
        String json = "";
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("orderRecord.json"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<Order>> type = new TypeToken<ArrayList<Order>>() {
                };
                orders = gson.fromJson(json, type);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FashionStore.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FashionStore.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }

    private static void createOrder(ArrayList<Order> orders) {
        Scanner scan = new Scanner(System.in);
        int id;
        String customerName;
        long phoneNumber;
        Measurement measurement;
        id = orders.size();
        System.out.println("Order Id:\t" + id);
        System.out.println("Enter the Customer Name:");
        customerName = scan.next();
        System.out.println("Enter the phone number:");
        phoneNumber = scan.nextLong();

        measurement = new Measurement();
        addMeasurement(measurement);

        orders.add(new Order(id, customerName, phoneNumber, measurement));
    }

    private static void addMeasurement(Measurement measurement) {
        Scanner scan = new Scanner(System.in);
        int option;
        double neck, chest, shoulder, arm, hip, waist, leg;

        System.out.println("===\tMeasurements\t===");
        do {
            System.out.println("1. Neck measurement");
            System.out.println("2. Chest measurement");
            System.out.println("3. Shoulder measurement");
            System.out.println("4. Arm measurement");
            System.out.println("5. Hip measurement");
            System.out.println("6. Waist measurement");
            System.out.println("7. Leg measurement");
            System.out.println("8. Review measurements");
            System.out.println("9. Save measurements and return to main menu");

            System.out.println("Enter an option: ");
            option = scan.nextInt();
            //Menu Validation
            while (option > 9) {
                System.out.println("Option invalid, Enter an option: ");
                option = scan.nextInt();
            }

            switch (option) {
                case 1 -> {
                    System.out.println("Enter the neck measurement:");
                    neck = scan.nextDouble();
                    measurement.setNeckMeasurement(neck);
                }
                case 2 -> {
                    System.out.println("Enter the chest measurement:");
                    chest = scan.nextDouble();
                    measurement.setChestMeasurement(chest);
                }
                case 3 -> {
                    System.out.println("Enter the shoulder measurement:");
                    shoulder = scan.nextDouble();
                    measurement.setShoulderMeasurement(shoulder);
                }
                case 4 -> {
                    System.out.println("Enter the arm measurement:");
                    arm = scan.nextDouble();
                    measurement.setArmMeasurement(arm);
                }
                case 5 -> {
                    System.out.println("Enter the hip measurement:");
                    hip = scan.nextDouble();
                    measurement.setHipMeasurement(hip);
                }
                case 6 -> {
                    System.out.println("Enter the waist measurement:");
                    waist = scan.nextDouble();
                    measurement.setWaistMeasurement(waist);
                }
                case 7 -> {
                    System.out.println("Enter the leg measurement:");
                    leg = scan.nextDouble();
                    measurement.setLegMeasurement(leg);
                }
                case 8 -> {
                    System.out.println(measurement);
                }

            }

        } while (option < 9);

    }

    private static void printOrders(ArrayList<Order> orders, int position) {
        //Print orders
        System.out.print(orders.get(position).getId() + "\t");
        System.out.print(orders.get(position).getCustomerName() + "\t\t");
        System.out.print(orders.get(position).getPhoneNumber() + "\t");
        System.out.print(orders.get(position).getMeasurement().getNeckMeasurement() + "\t");
        System.out.print(orders.get(position).getMeasurement().getChestMeasurement() + "\t");
        System.out.print(orders.get(position).getMeasurement().getShoulderMeasurement() + "\t\t");
        System.out.print(orders.get(position).getMeasurement().getArmMeasurement() + "\t");
        System.out.print(orders.get(position).getMeasurement().getHipMeasurement() + "\t");
        System.out.print(orders.get(position).getMeasurement().getWaistMeasurement() + "\t");
        System.out.print(orders.get(position).getMeasurement().getLegMeasurement() + "\n");
    }

    private static int searchId(ArrayList<Order> orders, int idFinder) {
        boolean validator = true;
        int ordersPosition = -1;
        for (int i = 0; i < orders.size(); i++) {
            if (idFinder == orders.get(i).getId()) {
                validator = false;
                ordersPosition = i;
            }
        }
        if (validator) {
            System.out.println("Id entered does not exist.");
        }
        return ordersPosition;
    }

    private static void editOrder(ArrayList<Order> orders, int ordersPosition) {
        Scanner scan = new Scanner(System.in);
        Order orderEdited = orders.get(ordersPosition);
        int option;
        String customerName;
        long phoneNumber;
        Measurement measurement = orders.get(ordersPosition).getMeasurement();

        do {
            System.out.println("===================================");
            System.out.println("===\tEdit Order\t===");
            System.out.println("1. Edit customer's name");
            System.out.println("2. Edit Phone Number");
            System.out.println("3. Edit measurement");
            System.out.println("4. Review changes");
            System.out.println("5. Exit");
            System.out.println("Enter an option:");
            option = scan.nextInt();
            while (option > 9) {
                System.out.println("Option invalid, Enter an option: ");
                option = scan.nextInt();
            }

            switch (option) {
                case 1 -> {
                    System.out.println("Enter the Customer Name:");
                    customerName = scan.next();
                    orderEdited.setCustomerName(customerName);
                    orders.set(ordersPosition, orderEdited);
                }
                case 2 -> {
                    System.out.println("Enter the phone number:");
                    phoneNumber = scan.nextLong();
                    orderEdited.setPhoneNumber(phoneNumber);
                    orders.set(ordersPosition, orderEdited);
                }
                case 3 -> {
                    addMeasurement(measurement);
                    orderEdited.setMeasurement(measurement);
                    orders.set(ordersPosition, orderEdited);
                }
                case 4 -> {
                    System.out.println(orders.get(ordersPosition));
                }
            }
        } while (option < 5);
    }
    
    private static void fixId(ArrayList<Order> orders){
        Order orderEdited;
        for (int i = 0; i < orders.size(); i++) {
            orderEdited = orders.get(i);
            orderEdited.setId(i);
            orders.set(i, orderEdited);
        }
    }

}
