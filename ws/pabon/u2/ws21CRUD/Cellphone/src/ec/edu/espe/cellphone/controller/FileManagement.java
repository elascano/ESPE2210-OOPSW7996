package ec.edu.espe.cellphone.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.cellphone.model.Cellphone;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */

public class FileManagement {

    public void saveCellphones(ArrayList<Cellphone> stands, String fileName) {
        Gson gson = new Gson();

        String pathName = "./" + fileName + ".json";
        String json = gson.toJson(stands);

        File file = new File(pathName);
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("== SAVED ==");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        }
    }

    public ArrayList<Cellphone> loadCellphones(String fileName) {
        Gson gson = new Gson();
        Collection<Cellphone> newCellphones = new ArrayList<>();

        String pathName = "./" + fileName + ".json";
        String jsonFile = "";

        try ( Scanner scFile = new Scanner(new File(pathName));) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            newCellphones = gson.fromJson(jsonFile, new TypeToken<List<Cellphone>>() {
            }.getType());

            System.out.println("== Loaded ==");
            scFile.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return new ArrayList<>(newCellphones);
    }

    public void deleteCellphones(String fileName) {
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
