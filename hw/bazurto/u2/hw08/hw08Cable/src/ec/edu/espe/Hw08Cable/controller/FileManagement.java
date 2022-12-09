/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Hw08Cable.controller;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import ec.edu.espe.Hw08Cable.model.Cable;
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
    public static void addCable(ArrayList<Cable> cableList) {
        File cableListFile = new File("cableList.json");
        Gson gson = new Gson();
        JsonArray cableListJsArray = new JsonArray();
        for (int i = 0; i < cableList.size(); i++) {
            cableListJsArray.add(gson.toJsonTree(cableList.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(cableListFile, false));
            writer.print(cableListJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<Cable> loadCable() {
        ArrayList<Cable> cableList = new ArrayList<Cable>();
        Gson gson = new Gson();
        JsonArray cableListJsArray = new JsonArray();
        File cableJson = new File("cableList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("cableList.json"));
            String lineOfTheFile = "";
            String json = "";
            while ((lineOfTheFile = reader.readLine()) != null) {
                json += lineOfTheFile;
            }

            cableListJsArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < cableListJsArray.size(); i++) {
                cableList.add(i, gson.fromJson(cableListJsArray.get(i), Cable.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return cableList;
    }
public static void updateCable(ArrayList<Cable> cableList) {
        Boolean backOption = false;
        int idCableForUpdate = findCable(cableList);
        if (idCableForUpdate != -1) {
            do {
                System.out.println("******Uptade Menu******");
                System.out.println("1.The Id of Cable");
                System.out.println("2.The number Of meter");
                System.out.println("3.The type Of Cable");
                System.out.println("4.The type Of Conductor");
                System.out.println("5.Back to menu");
                System.out.println("Imput, what do you change: ");
                switch (imputEscan.nextInt()) {

                    case 1:
                        System.out.print("Imput Id of Cable: ");
                        cableList.get(idCableForUpdate).setIdCable(imputEscan.nextInt());
                        break;
                    case 2:
                        System.out.print("Imput the number Of meter: ");
                        cableList.get(idCableForUpdate).setNumberOfmeter(imputEscan.nextFloat());                   
                        break;
                    case 3:
                        System.out.print("Imput the type Of Cable: ");
                        cableList.get(idCableForUpdate).setTypeOfCable(imputEscan.next());                    
                        break;
                    case 4:
                        System.out.print("Imput the type Of Conductor: ");
                        cableList.get(idCableForUpdate).setTypeOfConductor(imputEscan.next()); 
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
    
    
    public static void readCable(ArrayList<Cable> cableList) {
        if (cableList.size() != 0) {
            System.out.println("-----------Cable List---------");
            for (int i = 0; i < cableList.size(); i++) {

                System.out.println(cableList.get(i));
            }
        } else {
            System.out.println("No Cable");
        }
    }
    public static int findCable(ArrayList<Cable> cableList) {
        int id;
        int idSimilitudecable = -1;
        if (cableList.size() != 0) {
            System.out.println("Imput the ID number of cable: ");
            id = imputEscan.nextInt();
            for (int i = 0; i < cableList.size(); i++) {
                if (cableList.get(i).getIdCable()== id) {
                    idSimilitudecable = i;
                }
            }
            if (idSimilitudecable == -1) {
                System.out.println("--------Cable not found--------");
            }
        } else {
            System.out.println("--------Don't have Cable--------");
        }
        return idSimilitudecable;
    }

    public static void deleteCable(ArrayList<Cable> cableList) {
        int idCable = findCable(cableList);
        int choice; 
                if(idCable!=-1){
                    System.out.println("Do to remove this Cable?");
                    System.out.println("1.Yes , 2.No");
                    choice = imputEscan.nextInt();
                    if(choice!=2){
                        cableList.remove(idCable);
                        System.out.println("The Cable has been removed 100%");
                    }
                }
    }
    
}
