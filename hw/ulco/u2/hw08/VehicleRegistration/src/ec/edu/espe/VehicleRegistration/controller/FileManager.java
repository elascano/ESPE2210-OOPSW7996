package ec.edu.espe.VehicleRegistration.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.VehicleRegistration.model.Vehicle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class FileManager {

    public static ArrayList<Vehicle> read(ArrayList<Vehicle> vehicles, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Vehicle>> type = new TypeToken<ArrayList<Vehicle>>() {
                };
                vehicles = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("!Creating file!");
        } catch (IOException ex) {
            System.out.println("!There is nothing to read!");
        }
        return vehicles;
    }

    public static void addvehicle(ArrayList<Vehicle> vehicles, Scanner scan, String fileName) {
        Vehicle vehicle = new Vehicle();

        System.out.println("================================");
        System.out.println("          ADD PRINTER");
        System.out.println("===============================");
        System.out.println("Enter Id");
        vehicle.setId(scan.nextInt());
        System.out.println("Enter Color");
        vehicle.setColor(scan.next());
        System.out.println("Enter Kilometre");
        vehicle.setKilometres(scan.nextLong());
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
            long Kilometre = vehicle.getKilometres();
            System.out.println("===========================");
            System.out.println("         VEHICLE");
            System.out.println("ID-->\t" + id);
            System.out.println("COLOR-->\t" + color);
            System.out.println("KILOMETRE-->\t" + Kilometre);
        }
    }

    public static void update(ArrayList<Vehicle> vehicles, Scanner scan) {
        int Search;

        try {
            System.out.println("Insert Id");
            Search = scan.nextInt();

            int printersPosition = find(vehicles, Search);

            if (printersPosition != -1) {
                Vehicle printer;
                int id;
                String color;
                long kilometre;

                Vehicle vehicleUpdate = new Vehicle();
                vehicleUpdate = vehicles.get(printersPosition);

                System.out.println("===========================");
                System.out.println("         VEHICLE UPDATE");

                printLine(vehicleUpdate);
                System.out.println("---------------------------");
                scan.nextLine();

                System.out.print(" Enter Color\t");
                color = scan.nextLine();

                System.out.print(" Enter Kilometre\t");
                kilometre = scan.nextLong();
                System.out.println("==========successful update============");
                vehicleUpdate.setColor(color);
                vehicleUpdate.setKilometres(kilometre);

                Gson gson = new Gson();
                String json = gson.toJson(vehicles);

                try {
                    FileWriter writer = new FileWriter("VehicleList.json");
                    writer.write(json);
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }

            } else {
                System.out.println("!!!Not found enter vehicle first!!!");
            }
        } catch (Exception e) {
            System.out.println("ERROR!!");
        }
    }

    public static void printLine(Vehicle vehicle) {
        int id = vehicle.getId();
        String color = vehicle.getColor();
        long Kilometre = vehicle.getKilometres();
        System.out.println("===========================");
        System.out.println("         VEHICLE");

        System.out.println("ID-->\t" + id);
        System.out.println("COLOR-->\t" + color);
        System.out.println("KILOMETRE-->\t" + Kilometre);
    }

    public static int find(ArrayList<Vehicle> vehicles, int id) {
        Vehicle printer = new Vehicle();

        for (int i = 0; i < vehicles.size(); i++) {
            printer = vehicles.get(i);
            if (id == printer.getId()) {
                return i;
            }
        }
        return -1;
    }

    public static void findvehicle(ArrayList<Vehicle> vehicles, Scanner scan) {
        int Search;
        try {
            System.out.println("Insert Id");
            Search = scan.nextInt();

            int printersPosition = find(vehicles, Search);

            if (printersPosition != -1) {
                Vehicle printer;
                int id;
                String color;
                long kilometre;

                Vehicle vehicleUpdate = new Vehicle();
                vehicleUpdate = vehicles.get(printersPosition);
                printLine(vehicleUpdate);
                System.out.println("         ");

            } else {
                System.out.println("!!!Not found enter vehicle first!!!");
            }
        } catch (Exception e) {
            System.out.println("ERROR!!");
        }
    }

    public static void deleteVehicle(ArrayList<Vehicle> vehicles, Scanner scan) {
        int search;

        try {
            System.out.print("Insert Id vehicle: ");
            search = scan.nextInt();

            int vehiclePosition = find(vehicles, search);

            if (vehiclePosition != -1) {

                vehicles.remove(vehiclePosition);
                System.out.println("----Printer deleted successfully------- ");

                Gson gson = new Gson();
                String json = gson.toJson(vehicles);

                try {
                    FileWriter writer = new FileWriter("VehicleList.json");
                    writer.write(json);
                    writer.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }

            } else {
                System.out.println(" First enter data ");
            }

        } catch (Exception e) {
            System.out.println("!!ERROR!!");
        }
    }

    public static void deletAllJson() {
        File file = new File("VehicleList.json");
        if (file.delete()) {
            System.out.println("-----The file has been successfully deleted----");
        } else {
            System.out.println("The file cannot be deleted");
        }
    }
}
