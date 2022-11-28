package ec.edu.espe.managmentsoftware.model;

import com.google.gson.Gson;
import ec.edu.espe.managmentsoftware.view.ManagmentSoftware;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Agenda {
    private static int getMenuChosenOption(Scanner scannerKeyboard){
    int chosenAgendaMenuOption; 
        try{
            System.out.println("""
                                      ______________________________________________________
                                     /                                                     / 
                                 (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                      /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                     (       "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE     (
                                      )                         AGENDA                       )
                                     (      --------------------      -----------------     (
                                      )    | 1. Add New Order   |    | 2. Order List   |     )
                                            --------------------      -----------------     (                                                      (
                                      )             ----------------------------             )
                                     (             |   3. Back to Main Menu     |           (
                                      )             ----------------------------             )
                                     (                                                      (
                                     / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                                 (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                      /______________________________________________________/
                                                      WHAT DO YOU WANT TO DO? 
                               """);

             chosenAgendaMenuOption = scannerKeyboard.nextInt();
        }catch(InputMismatchException error){
            return 5;
        }
    return chosenAgendaMenuOption; 
    }
        
    public static void runMenu(Scanner scannerKeyboard){
        int chosenAgendaMenuOption;
        chosenAgendaMenuOption = Agenda.getMenuChosenOption(scannerKeyboard);
            switch(chosenAgendaMenuOption){
                case 1-> {
                    addOrders(scannerKeyboard);
                    runMenu(scannerKeyboard);
                    break;
                }
                case 2->{
                    ArrayList<Order> ordersList  = readOrdersFromFile();
                    printOrdersTable(ordersList);
                    runMenu(scannerKeyboard);
                    break;
                }
                case 3->{
                    ManagmentSoftware.runMainMenu(scannerKeyboard);
                }
                default->{
                    System.err.println("""
                                           \n--------- DEAR USER ----------
                                                 ENTER A VALID NUMBER
                                           ------------------------------\n""");
                    runMenu(scannerKeyboard);    
                    break;
                }
            }
    }
    private static void addOrders(Scanner scannerKeyboard){
        int id;
        String clientName;
        String deliveryDate;
        String deliveryPlace;
        String description;
        boolean isDelivered;
        Order newOrder;
        boolean wantToAddOrder; 
        try{
            do {
                System.out.println("""
                                       \n____||________||_________||________||____
                                       ----||--------||---------||--------||---- 
                                                        NEW ORDER""");
                System.out.print("\t\tID:  "); 
                id = scannerKeyboard.nextInt();
                System.out.print("\t\tClient Name: "); 
                clientName = scannerKeyboard.next();
                System.out.print("\t\tDelivery Date: ");
                deliveryDate = scannerKeyboard.next();
                System.out.print("\t\tDelivery Place: ");
                deliveryPlace = scannerKeyboard.next();
                System.out.print("\t\tDescription");
                description = scannerKeyboard.next();
                System.out.println("""
                                       \n____||________||_________||________||____
                                       ----||--------||---------||--------||---- """);
                isDelivered = false;
                newOrder = new Order(id, clientName, deliveryDate, deliveryPlace, description, isDelivered); 
                printOrder(newOrder);
                writeOrderToFile(newOrder);
                System.out.println("\t\tDo you wanna add other order? true/false");
                wantToAddOrder = scannerKeyboard.nextBoolean();
            }while(wantToAddOrder == true);

        }catch(InputMismatchException error){
            System.err.println("""
                               \n     ---------  DEAR USER  ---------
                                          ENTER VALID INFORMATION
                                      -------------------------------
                               """);
        }
    }

    private static void writeOrderToFile(Order orderToWrite){
        ArrayList<Order> readedOrdersFromFile  = readOrdersFromFile(); 
        try(FileWriter fileWriter = new FileWriter("./orderDataBase.json");){
            Gson gson = new Gson();
            String orderToFile;

            for (Order order: readedOrdersFromFile){
                orderToFile = gson.toJson(order);
                fileWriter.write(orderToFile + "\n");
            }  
            orderToFile = gson.toJson(orderToWrite);
            fileWriter.write(orderToFile + "\n");
            System.out.println("\n---------------------  DEAR USER  -------------------------");
            System.out.println("\t\tOrder ingresed to the System" );
            System.out.println(orderToWrite);
            System.out.println("-----------------------------------------------------------\n");
        }catch (IOException ex) {
            Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ArrayList<Order> readOrdersFromFile(){
        File orderDataBase = new File ("./orderDataBase.json");
        ArrayList<Order> orderListFromFile  = new ArrayList<>();
        Scanner scOrderDataBase;
        try {
            scOrderDataBase = new Scanner(orderDataBase);
            Order orderFromFile;
            Gson gson = new Gson();
            if(scOrderDataBase.hasNext()){
               while(scOrderDataBase.hasNextLine()){
               orderFromFile = gson.fromJson(scOrderDataBase.nextLine(), Order.class);
               orderListFromFile.add(orderFromFile);
                }    
            }else{
                System.err.println("\tThere are not more orders in your agenda");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderListFromFile;
    }
    private static void printOrder(Order order){

        System.out.format("""
                                              ORDER ID %2s
                                           DELIVERED: %2s
                               __________________   __________________
                           .-/|                   |                   |-.
                           |||| CLIENT NAME       |                   ||||
                           |||| %1s               
                           |||| DELIVERY DATE     |                   ||||
                           |||| %1s               
                           |||| DELIVERY PLACE    |                   ||||
                           |||| %1s               
                           |||| DESCRIPTION       |                   ||||
                           |||| %1s               
                           ||||                   |                   ||||
                           ||||                   |                   ||||
                           ||||__________________ | __________________||||
                           ||/=================== | =================== ||
                           `--------------------~___~-------------------''
                           """,order.getId(), order.getIsDelivered(), order.getClientName(), order.getDeliveryDate(), order.getDeliveryPlace(), order.getDescription());
    }

    public static void printOrdersTable(ArrayList<Order> ordersList){

        System.out.println("\t\t\t ORDERS LIST");    
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.printf("   %10s %20s %20s %10s", "ID", "CLIENT NAME", "DELIVERY DATE", "IS DELIVERED");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------|");
        for (Order order: ordersList){
            if(order.getIsDelivered() == false)
            System.out.format("   %10s %20s %20s %10s", order.getId(), order.getClientName(),order.getDeliveryDate(), order.getIsDelivered());
            System.out.println();
            System.out.println("|--------------------------------------------------------------------------|");
        }
        System.out.println("""
                                   ____||________||_________||________||_________||________||_________||_______
                                   ----||--------||---------||--------||---------||--------||---------||-------\n """);
    }
}
