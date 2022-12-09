package ec.edu.espe.BusSimulator.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.BusSimulator.model.Bus;
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
    
    public static ArrayList<Bus> read(ArrayList<Bus> buses, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Bus>> type = new TypeToken<ArrayList<Bus>>() {
                };
                buses = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("A new file has been created");
        } catch (IOException ex) {
            System.out.println("The file could not be read");
        }
        return buses;
    }

    public static boolean validateId(int id) {
        ArrayList<Bus> buses = new ArrayList<>();
        buses = read(buses, "BusesFile.json");
        Bus bus = new Bus();

        for (int i = 0; i < buses.size(); i++) {
            bus = buses.get(i);
            if (id == bus.getId()) {
                return true;
            }
        }
        return false;

    }
    
    public static void save(ArrayList<Bus> buses, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(buses);

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
    
    public static void addBus(ArrayList<Bus> buses) {

        Scanner scan = new Scanner(System.in);
        Bus bus;
        int id;
        String color;
        int capacity;

            System.out.print("Enter the id of the Bus---> ");
            id = scan.nextInt();
            while (validateId(id)) {
                System.out.print("The id already exists. Try again");
                id = scan.nextInt();
            }
            scan.nextLine();
            System.out.print("Enter the color of Bus---> ");
            color = scan.nextLine();

            System.out.print("Enter the capacity of Bus--->");
            capacity = scan.nextInt();

            bus = new Bus(id, color, capacity);
            
            buses.add(bus);
        
    }

    public static int find(ArrayList<Bus> buses, int id, String fileName) {

        Bus busFind = new Bus();

        for (int i = 0; i < buses.size(); i++) {
            busFind = buses.get(i);
            if (id == busFind.getId()) {
                return i;
            }
        }
        
        
        return -1;
    }

    public static void delete(ArrayList<Bus> buses, int position) {
        try {
            buses.remove(position);
        } catch (Exception e) {
            System.out.println("COULD NOT DELETE THE BUS");
        }
        System.out.println("PERFECT, BUS DELETED");
    }

    public static void update(ArrayList<Bus> buses, int position) {
        try {

            Scanner sc = new Scanner(System.in);
            Bus bus;
            int id;
            String color;
            int capacity;
            
            Bus newData = new Bus();
            newData = buses.get(position);

            
            System.out.println("New Data");
            
            System.out.println("\nID\t\tCOLOR\t\tCAPACITY");
            printLine(newData);
            
            System.out.println("Enter the new color for the bus");
            color = sc.nextLine();

            System.out.println("Enter the new capacity for the bus");
            capacity = sc.nextInt();
            
            newData.setColor(color);
            newData.setCapacity(capacity);
            
        }catch (Exception e) {
            System.out.println("COULD NOT MODIFY THE DATA");
        }
    }
    
    public static void printLine(Bus bus) {
        int id = bus.getId();
        String color = bus.getColor();
        int capacity = bus.getCapacity();
        System.out.println(id + "\t\t" + color + "\t\t" + capacity);

    }
    
    public static void printList(ArrayList<Bus> buses) {
        Bus newData = new Bus();

        for (int i = 0; i < buses.size(); i++) {
            newData = buses.get(i);
            printLine(newData);
        }
    }
    
    
   
}
