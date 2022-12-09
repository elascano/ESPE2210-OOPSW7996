package ec.edu.espe.TruckSimulator.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.TruckSimulator.model.Truck;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class FileManager {
    
    public static ArrayList<Truck> read(ArrayList<Truck> trucks, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line = "";
                while ((line = br.readLine()) != null) {
                    fromJson = line;
                    TypeToken<ArrayList<Truck>> type = new TypeToken<ArrayList<Truck>>() {
                    };
                    trucks = gson.fromJson(fromJson, type.getType());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("A new file has been created");
        } catch (IOException ex) {
            System.out.println("The file could not be read");
        }
        return trucks;
    }

    public static boolean validateId(int id) {
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks = read(trucks, "TrucksFile.json");
        Truck truck = new Truck();

        for (int i = 0; i < trucks.size(); i++) {
            truck = trucks.get(i);
            if (id == truck.getId()) {
                return true;
            }
        }
        return false;

    }
    
    public static void save(ArrayList<Truck> trucks, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(trucks);

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void addTruck(ArrayList<Truck> trucks) {

        Scanner scan = new Scanner(System.in);
        Truck truck;
        int id;
        String color;
        String brand;

            System.out.print("Enter the id of the Truck---> ");
            id = scan.nextInt();
            while (validateId(id)) {
                System.out.print("The id already exists. Try again");
                id = scan.nextInt();
            }
            scan.nextLine();
            System.out.print("Enter the color of Truck---> ");
            color = scan.nextLine();

            System.out.print("Enter the Brand of Truck--->");
            brand = scan.nextLine();

            truck = new Truck(id, color, brand);
            
            trucks.add(truck);
        
    }

    public static int find(ArrayList<Truck> trucks, int id, String fileName) {

        Truck truckFind = new Truck();

        for (int i = 0; i < trucks.size(); i++) {
            truckFind = trucks.get(i);
            if (id == truckFind.getId()) {
                return i;
            }
        }
        
        
        return -1;
    }

    public static void delete(ArrayList<Truck> trucks, int position) {
        try {
            trucks.remove(position);
        } catch (Exception e) {
            System.err.println("COULD NOT DELETE THE TRUCK");
        }
        System.out.println("PERFECT, TRUCK DELETED");
    }

    public static void update(ArrayList<Truck> trucks, int position) {
        try {

            Scanner sc = new Scanner(System.in);
            Truck truck;
            int id;
            String color;
            String brand;
            
            Truck newData = new Truck();
            newData = trucks.get(position);

            
            System.out.println("New Data");
            
            System.out.println("\nID\t\tCOLOR\t\tBRAND");
            printLine(newData);
            
            System.out.println("Enter the new Color for the truck");
            color = sc.nextLine();

            System.out.println("Enter the new Brand for the truck");
            brand = sc.nextLine();
            
            newData.setColor(color);
            newData.setBrand(brand);
            
        }catch (Exception e) {
            System.out.println("COULD NOT MODIFY THE DATA");
        }
    }
    
    public static void printLine(Truck truck) {
        int id = truck.getId();
        String color = truck.getColor();
        String brand = truck.getBrand();
        System.out.println(id + "\t\t" + color + "\t\t" + brand);

    }
    
    public static void printList(ArrayList<Truck> trucks) {
        Truck newData = new Truck();

        for (int i = 0; i < trucks.size(); i++) {
            newData = trucks.get(i);
            printLine(newData);
        }
    }
    
}
