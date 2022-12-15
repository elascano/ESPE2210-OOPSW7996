package ec.edu.espe.VehicleRegistration.controller;

import com.google.gson.Gson;
import ec.edu.espe.VehicleRegistration.model.Vehicle;
import ec.edu.espe.VehicleRegistration.utils.EnterIdException;
import ec.edu.espe.VehicleRegistration.utils.EnterKilometresException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FileManager {
    
     public static void readjson() throws FileNotFoundException, IOException {
        File doc = new File("VehicleList.json");
        doc.createNewFile();
        FileReader freader = new FileReader(doc);
        char[] i = new char[100];
        freader.read(i);
        for (char j : i) {
            System.out.print(j);
        }
        freader.close();
    }

    public static void addvehicle(Scanner scan, Vehicle vehicle, ArrayList<Vehicle> vehicles, String fileName) {
        int id;
        String color;
        long kilometre;
        boolean enterid;
        
        do {
            try {
                try {
                    enterid = false;
                    System.out.println("Enter Id");
                    id = scan.nextInt();
                    vehicle.setId(id);
                    if (id < 1 || id > 999999) {
                        throw new EnterIdException("");
                    }
                } catch (EnterIdException e) {
                    System.out.println("Id invalido 1 a 99999");
                    enterid = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("ERROR!! Write numbers please");
                scan.next();
                enterid = true;
            }
        } while (enterid);
        
        System.out.println("Enter Color");
        color = scan.next();
        vehicle.setColor(color);
        
        do {
            try {
                try {
                    enterid = false;
                    System.out.println("Enter Kilometres");
                    kilometre = scan.nextInt();
                    vehicle.setKilometre(kilometre);
                    if (kilometre < 1 || kilometre > 200000) {
                        throw new EnterKilometresException();
                    }
                } catch (EnterKilometresException e) {
                    System.out.println("Error" + e.getMessage());
                    enterid = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("ERROR!! Write numbers please");
                scan.next();
                enterid = true;
            }
        } while (enterid);
        
        vehicles.add(vehicle);
        
        Gson gson = new Gson();
        String json = gson.toJson(vehicles);
        
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
            System.out.println("---Printer added successfully---");
            
        } catch (FileNotFoundException e) {
            System.out.println("!!ERROR");
        } catch (IOException e) {
            System.out.println();
        }
    }

 public static void readVehicles(ArrayList<Vehicle> vehicles) {

        Vehicle vehicle = new Vehicle();
        for (int i = 0; i < vehicles.size(); i++) {
            vehicle = vehicles.get(i);
            int id = vehicle.getId();
            String color = vehicle.getColor();
            long Kilometre = vehicle.getKilometre();
            System.out.println("===========================");
            System.out.println("         VEHICLE");
            System.out.println("ID-->\t" + id);
            System.out.println("COLOR-->\t" + color);
            System.out.println("KILOMETRE-->\t" + Kilometre);
        }
    }

}
