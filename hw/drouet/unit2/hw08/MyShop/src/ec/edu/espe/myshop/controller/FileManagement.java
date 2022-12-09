package ec.edu.espe.myshop.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.myshop.model.Stand;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class FileManagement {

    public void saveStands(ArrayList<Stand> stands, String fileName) {
        Gson gson = new Gson();

        String pathName = "./" + fileName + ".json";
        String json = gson.toJson(stands);

        File file = new File(pathName);
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("----------File was saved----------");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        }
    }

    public ArrayList<Stand> loadStands(String fileName) {
        Gson gson = new Gson();
        Collection<Stand> newStands = new ArrayList<>();

        String pathName = "./" + fileName + ".json";
        String jsonFile = "";

        try ( Scanner scFile = new Scanner(new File(pathName));) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            newStands = gson.fromJson(jsonFile, new TypeToken<List<Stand>>() {
            }.getType());

            System.out.println("----------File was loaded----------");
            scFile.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return new ArrayList<>(newStands);
    }

    public void deleteStands(String fileName) {
        String pathName = "./" + fileName + ".json";

        File file = new File(pathName);

        try {
            if (file.canRead()) {
                file.delete();
                System.out.println("----------File was deleted----------");
            } else {
                System.out.println("Error: File not deleted or found");
            }

        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
        }
    }
}
