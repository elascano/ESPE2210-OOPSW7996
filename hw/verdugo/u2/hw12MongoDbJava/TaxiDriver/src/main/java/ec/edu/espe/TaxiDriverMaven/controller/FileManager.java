
package ec.edu.espe.TaxiDriverMaven.controller;
import com.google.gson.*;
import ec.edu.espe.TaxiDriverMaven.model.TaxiDriver;
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
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class FileManager {
    private static Scanner scan = new Scanner(System.in);
    private static Gson gson = new Gson();

    public static void addTaxiDriversToJson(ArrayList<TaxiDriver> taxiDrivers) {

        File taxiDriversListFile = new File("taxiDriversList.json"); 

        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < taxiDrivers.size(); i++) {
            jsonArray.add(gson.toJsonTree(taxiDrivers.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(taxiDriversListFile, false));
            writer.print(jsonArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<TaxiDriver> loadJsonFile() {
        ArrayList<TaxiDriver> taxiDrivers = new ArrayList<TaxiDriver>();
        Gson gson = new Gson();
        JsonArray jsonArray = new JsonArray();
        File taxiDriversListJson = new File("taxiDriversList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(taxiDriversListJson));
            String lineOfTheFile = "";
            String json = "";
            while ((lineOfTheFile = reader.readLine()) != null) {
                json += lineOfTheFile;
            }

            jsonArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < jsonArray.size(); i++) {
                taxiDrivers.add(i, gson.fromJson(jsonArray.get(i), TaxiDriver.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return taxiDrivers;
    }  

    public static void printTaxiDriver(TaxiDriver object) {
        System.out.println(object);
    }

}
