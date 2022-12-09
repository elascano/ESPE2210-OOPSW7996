/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws21CompactDisc.controller;

import com.google.gson.*;
import ec.edu.espe.ws21CompactDisc.model.CompactDisc;
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
    public static void addCompactDisc(ArrayList<CompactDisc> compactDiscList) {
        File compactDiscListFile = new File("compactDiscList.json");
        Gson gson = new Gson();
        JsonArray compactDiscListJsArray = new JsonArray();
        for (int i = 0; i < compactDiscList.size(); i++) {
            compactDiscListJsArray.add(gson.toJsonTree(compactDiscList.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(compactDiscListFile, false));
            writer.print(compactDiscListJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<CompactDisc> loadCompactDisc() {
        ArrayList<CompactDisc> compactDiscList = new ArrayList<CompactDisc>();
        Gson gson = new Gson();
        JsonArray compactDiscListJsArray = new JsonArray();
        File compactDiscJson = new File("compactDiscList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("compactDiscList.json"));
            String lineOfTheFile = "";
            String json = "";
            while ((lineOfTheFile = reader.readLine()) != null) {
                json += lineOfTheFile;
            }

            compactDiscListJsArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < compactDiscListJsArray.size(); i++) {
                compactDiscList.add(i, gson.fromJson(compactDiscListJsArray.get(i), CompactDisc.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return compactDiscList;
    }
public static void updateCompactDisc(ArrayList<CompactDisc> compactDiscList) {
        Boolean backOption = false;
        int idCDForUpdate = findCompactDisc(compactDiscList);
        if (idCDForUpdate != -1) {
            do {
                System.out.println("******Uptade Menu******");
                System.out.println("1.The Id of Compact Disc (CD)");
                System.out.println("2.The type Of The Compact Disc (CD)");
                System.out.println("3.The size of memory the Compact Disc (CD)");
                System.out.println("4.Back to the menu");
                System.out.println("Imput, what do you change: ");
                switch (imputEscan.nextInt()) {

                    case 1:
                        System.out.print("Imput the Id of Compact Disc (CD): ");
                        compactDiscList.get(idCDForUpdate).setId(imputEscan.nextInt());
                        break;
                    case 2:
                        System.out.print("Imput the type Of The Compact Disc (CD): ");
                        compactDiscList.get(idCDForUpdate).setTypeOfCompactDisc(imputEscan.next());                   
                        break;
                    case 3:
                        System.out.print("Imput the size of memory the Compact Disc (CD): ");
                        compactDiscList.get(idCDForUpdate).setMemoryOfCompactDisc(imputEscan.nextFloat());                    
                        break;
                    case 4:
                        backOption = true;
                        break;
                    default:
                        System.out.println("Wrong option");
                        break;
                }
            } while (!backOption);
        }
    }
    
    
    public static void readCompactDisc(ArrayList<CompactDisc> compactDiscList) {
        if (compactDiscList.size() != 0) {
            System.out.println("-----------compact Disc List---------");
            for (int i = 0; i < compactDiscList.size(); i++) {

                System.out.println(compactDiscList.get(i));
            }
        } else {
            System.out.println("No CD's");
        }
    }
    public static int findCompactDisc(ArrayList<CompactDisc> compactDiscList) {
        int id;
        int idSimilitudesCD = -1;
        if (compactDiscList.size() != 0) {
            System.out.println("Imput the ID number of the CD: ");
            id = imputEscan.nextInt();
            for (int i = 0; i < compactDiscList.size(); i++) {
                if (compactDiscList.get(i).getId() == id) {
                    idSimilitudesCD = i;
                }
            }
            if (idSimilitudesCD == -1) {
                System.out.println("--------CD not found--------");
            }
        } else {
            System.out.println("--------Don't have CD--------");
        }
        return idSimilitudesCD;
    }

    public static void deleteCompactDisc(ArrayList<CompactDisc> compactDiscList) {
        int idCompactDisc = findCompactDisc(compactDiscList);
        int choice; 
                if(idCompactDisc!=-1){
                    System.out.println("Do to remove this CD?");
                    System.out.println("1.Yes , 2.No");
                    choice = imputEscan.nextInt();
                    if(choice!=2){
                        compactDiscList.remove(idCompactDisc);
                        System.out.println("The CD has been removed 100%");
                    }
                }
    }
    
    
}
