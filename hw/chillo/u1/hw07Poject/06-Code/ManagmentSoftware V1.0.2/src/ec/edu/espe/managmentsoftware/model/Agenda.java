/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managmentsoftware.model;

import com.google.gson.Gson;
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
    public static int getAgendaMenuChosenOption(Scanner scannerKeyboard){
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
        
        
  public static void addOrders(Scanner scannerKeyboard){
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
  
      public static void writeOrderToFile(Order orderToWrite){
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
     private static ArrayList<Order> readOrdersFromFile(){
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
              System.err.println("\t\tThere are not orders in your agenda");
          }


      } catch (FileNotFoundException ex) {
          Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
      }
      return orderListFromFile;
  }
    private static void printOrder(Order order){
        
        System.out.format("""
                                              NEW ORDER
                               __________________   __________________
                           .-/|                   |                   |-.
                           ||||                   |                   ||||
                           ||||        ID         |    DESCRIPTION    ||||
                           |||| %1s               |                   ||||
                           ||||       NAME        | %1s               ||||
                           |||| %1s               |                   ||||
                           ||||      PLACE        |                   ||||
                           |||| %1s               |    IS DELIVERED   ||||
                           ||||                   |                   ||||
                           ||||                   | %1s               ||||
                           ||||                   |                   ||||
                           ||||__________________ | __________________||||
                           ||/=================== | =================== ||
                           `--------------------~___~-------------------''
                           """,order.getId(), order.getClientName(), order.getDeliveryDate(), order.getDeliveryPlace(), order.getDescription(), order.getIsDelivered());
    }
}
