/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.exam.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Galaxy;
import java.io.*;
import java.util.*;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class FileManager {

    public static ArrayList<Galaxy> read(ArrayList<Galaxy> galaxies, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Galaxy>> type = new TypeToken<ArrayList<Galaxy>>() {
                };
                galaxies = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("*** THE FILE DOESN'T EXIST, IT WILL BE CREATED ***");
        } catch (IOException ex) {
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }
        return galaxies;
    }

    public static void save(ArrayList<Galaxy> galaxies, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(galaxies);

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

    public static int find(ArrayList<Galaxy> galaxies, int id, String fileName) {

        Galaxy galaxyIterated = new Galaxy();

        for (int i = 0; i < galaxies.size(); i++) {
            galaxyIterated = galaxies.get(i);
            if (id == galaxyIterated.getId()) {
                return i;
            }
        }
        return -1;
    }

    public static void delete(ArrayList<Galaxy> galaxies) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("..:: Insert the id of the Galaxy to delete: ");
            idToSearch = sc.nextInt();

            int galaxyFoundPosition = find(galaxies, idToSearch, "Galaxies.json");

            if (galaxyFoundPosition != -1) {
                
                galaxies.remove(galaxyFoundPosition);
                save(galaxies, "Galaxies.json");
                System.out.println("\n\n*** GALAXY DELETED SUCCESSFULLY ***\n");
                
            } else {
                System.out.println("..:: THE ID ENTERED DOESN'T EXIST ::..");
            }
            
        } catch (Exception e) {
            System.out.println("..:: THE GALAXY DIDN'T CAN BE DELETED ::..");
        }
    }

    public static void update(ArrayList<Galaxy> galaxies) {
        Scanner sc = new Scanner(System.in);
        int idToSearch;

        try {
            System.out.print("..:: Insert the id of the Galaxy to update: ");
            idToSearch = sc.nextInt();

            int galaxyFoundPosition = find(galaxies, idToSearch, "Galaxies.json");

            if (galaxyFoundPosition != -1) {
                Galaxy galaxy;
                int id;
                String name;
                String type;

                Galaxy galaxyToUpdate = new Galaxy();
                galaxyToUpdate = galaxies.get(galaxyFoundPosition);

                System.out.println("***********************************************");
                System.out.println("*                  ACTUAL DATA                 *");
                System.out.println("************************************************");
                System.out.println("ID\t|NAME\t\t|TYPE\t\t|");
                printLine(galaxyToUpdate);
                System.out.println("************************************************");

                System.out.println("\n************************************************");
                System.out.println("*");
                sc.nextLine();
                System.out.print("* ..:: Enter the new name of the Galaxy: ");
                name = sc.nextLine();

                System.out.print("* ..:: Enter the new type of Galaxy: ");
                type = sc.nextLine();

                galaxyToUpdate.setName(name);
                galaxyToUpdate.setType(type);
                
                System.out.println("*");
                System.out.println("************************************************");
                save(galaxies, "Galaxies.json");
                System.out.println("\n\n*** GALAXY UPDATED SUCCESSFULLY ***\n");
            } else {
                System.out.println("..:: THE ID ENTERED DOESN'T EXIST ::..");
            }

        } catch (Exception e) {
            System.out.println("..:: THE GALAXY DIDN'T CAN BE UPDATED ::..");
        }
    }

    public static void printList(ArrayList<Galaxy> galaxies) {
        Galaxy galaxyIterated = new Galaxy();
        System.out.println("\nID\t|NAME\t\t|TYPE\t\t|");
        for (int i = 0; i < galaxies.size(); i++) {
            galaxyIterated = galaxies.get(i);
            printLine(galaxyIterated);
        }
    }

    public static void printLine(Galaxy galaxy) {
        int id = galaxy.getId();
        String name = galaxy.getName();
        String type = galaxy.getType();
        System.out.println(id + "\t|" + name + "\t|" + type + "\t|");

    }

}
