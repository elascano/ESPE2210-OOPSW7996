/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Hw09Vehicle.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import ec.edu.espe.Hw09Vehicle.model.Vehicle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class FileManagement {
    private static Scanner imputEscan = new Scanner(System.in);
    
    public static void addVehicle(ArrayList<Vehicle> vehicleList) {
        File vehicleListFile = new File("vehicleList.json");
        Gson gson = new Gson();
        JsonArray vehicleListJsArray = new JsonArray();
        for (int i = 0; i < vehicleList.size(); i++) {
            vehicleListJsArray.add(gson.toJsonTree(vehicleList.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(vehicleListFile, false));
            writer.print(vehicleListJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<Vehicle> loadVehicle() {
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        Gson gson = new Gson();
        JsonArray vehicleListJsArray = new JsonArray();
        File vehicleJson = new File("vehicleList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("vehicleList.json"));
            String lineOfTheFile = "";
            String json = "";
            while ((lineOfTheFile = reader.readLine()) != null) {
                json += lineOfTheFile;
            }

            vehicleListJsArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < vehicleListJsArray.size(); i++) {
                vehicleList.add(i, gson.fromJson(vehicleListJsArray.get(i), Vehicle.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return vehicleList;
    }
public static void updateVehicle(ArrayList<Vehicle> vehicleList) {
        Boolean backOption = false;
        int idVehicleForUpdate = findVehicle(vehicleList);
        if (idVehicleForUpdate != -1) {
            do {
                System.out.println("******Uptade Menu******");
                System.out.println("1.The Id of Vehicle");
                System.out.println("2.The Make of Vehicle");
                System.out.println("3.The Model of Vehicle");
                System.out.println("4.The Cc of Vehicle");
                System.out.println("5.Back to menu");
                System.out.println("Imput, what do you change: ");
                switch (imputEscan.nextInt()) {

                    case 1:
                        System.out.print("Imput Id of Cable: ");
                        vehicleList.get(idVehicleForUpdate).setId(imputEscan.nextInt());
                        break;
                    case 2:
                        System.out.print("Imput the make of Vehicle: ");
                        vehicleList.get(idVehicleForUpdate).setMake(imputEscan.next());                   
                        break;
                    case 3:
                        System.out.print("Imput the Model of Vehicle: ");
                        vehicleList.get(idVehicleForUpdate).setModel(imputEscan.next());                    
                        break;
                    case 4:
                        System.out.print("Imput the  Cc of Vehicle: ");
                        vehicleList.get(idVehicleForUpdate).setCc(imputEscan.nextFloat()); 
                        break;
                    case 5:
                        backOption = true;
                        break;
                    default:
                        System.out.println("Wrong option");
                        break;
                }
            } while (!backOption);
        }
    }
    
    
    public static void readVehicle(ArrayList<Vehicle> vehicle) {
        if (vehicle.size() != 0) {
            System.out.println("-----------Vehicle List---------");
            for (int i = 0; i < vehicle.size(); i++) {

                System.out.println(vehicle.get(i));
            }
        } else {
            System.out.println("No Vehicle");
        }
    }
    public static int findVehicle(ArrayList<Vehicle> vehicleList) {
        int id;
        int idSimilitudevehicle = -1;
        if (vehicleList.size() != 0) {
            System.out.println("Imput the ID number of vehicle: ");
            id = imputEscan.nextInt();
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getId()== id) {
                    idSimilitudevehicle = i;
                }
            }
            if (idSimilitudevehicle == -1) {
                System.out.println("--------Vehicle not found--------");
            }
        } else {
            System.out.println("--------Don't have Vehicle--------");
        }
        return idSimilitudevehicle;
    }

    public static void deleteVehicle(ArrayList<Vehicle> vehicleList) {
        int idVehicle = findVehicle(vehicleList);
        int choice; 
                if(idVehicle!=-1){
                    System.out.println("Do to remove this Vehicle?");
                    System.out.println("1.Yes \n2.No");
                    choice = imputEscan.nextInt();
                    if(choice!=2){
                        vehicleList.remove(idVehicle);
                        System.out.println("The Vehicle has been removed 100%");
                    }
                }
    }
}
