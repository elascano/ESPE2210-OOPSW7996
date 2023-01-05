
package ec.edu.espe.LibrarySimulatorWithMayben.controller;

import com.google.gson.*;
import ec.edu.espe.LibrarySimulatorWithMayben.model.Travel;
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
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FileManager {

    private static Scanner scan = new Scanner(System.in);
    private static Gson gson = new Gson();
    
    public static void addTravelsToJson(ArrayList<Travel> travels) {
                   
        File travelsListFile = new File("travelsList.json"); 

        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < travels.size(); i++) {
            jsonArray.add(gson.toJsonTree(travels.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(travelsListFile, false));
            writer.print(jsonArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<Travel> loadFromJsonFile() {
        ArrayList<Travel> travels = new ArrayList<Travel>();
        Gson gson = new Gson();
        JsonArray jsonArray = new JsonArray();
        File travelsListJson = new File("travelsList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(travelsListJson));
            String lineOfTheFile = "";
            String json = "";
            while ((lineOfTheFile = reader.readLine()) != null) {
                json += lineOfTheFile;
            }

            jsonArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < jsonArray.size(); i++) {
                travels.add(i, gson.fromJson(jsonArray.get(i), Travel.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return travels;
    }  
    
    public static void printTravel(Travel object) {
        System.out.println(object);
    }

}
