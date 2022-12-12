package ec.edu.espe.Stand.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.Stand.model.Stand;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejandro Cuadrado
 */
public class FileManager {
    public static ArrayList<Stand> read(ArrayList<Stand> stand, String fileName) throws IOException {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Stand>> type = new TypeToken<ArrayList<Stand>>() {
                };
                stand = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("\n---- the file dont exis ----\n");
        } catch (IOException ex) {
            System.out.println("------ the file cant´t read ------");
        }
        return stand;
    }
       public static void addprinter(ArrayList<Stand> stands,Scanner scan, String fileName) {
        System.out.println("select option 1");
        Stand printer = new Stand();
        System.out.println("***---------------------------***");
        System.out.println("          Stand");
        System.out.println("***---------------------------***");
        System.out.println("- please enter id:");
        printer.setId(scan.nextInt());
        System.out.println("- please enter name:");
        printer.setname(scan.next());
        System.out.println("- please enter owner");
        printer.setType(scan.next());
        stands.add(printer);
        Gson gson = new Gson();
        String json = gson.toJson(stands);
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
        public static void readPrinters(ArrayList<Stand> stands) {
        Gson gson = new Gson();
        String fichero = "";

        Stand printer = new Stand();
        for (int i = 0; i < stands.size(); i++) {
            printer = stands.get(i);
            int id = printer.getId();
            String name = printer.getStand();
            String owner = printer.getname();
            System.out.println(" Stand");
            System.out.println("ID\t" + id);
            System.out.println("name\t" + name);
            System.out.println("owner\t" + owner);
            System.out.println("***------------------***");

        } 
}}