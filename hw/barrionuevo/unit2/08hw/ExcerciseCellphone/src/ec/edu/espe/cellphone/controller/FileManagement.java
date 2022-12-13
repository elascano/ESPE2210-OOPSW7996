package ec.edu.espe.cellphone.controller;

import ec.edu.espe.cellphone.model.Cellphone;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class FileManagement {

    public void saveStands(ArrayList<Cellphone> stands, String fileName) {
        Gson gson = new Gson();

        String pathName = "./" + fileName + ".json";
        String json = gson.toJson(stands);

        File file = new File(pathName);
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("-----------------------------");
            System.out.println("            Save File");
            System.out.println("-----------------------------");
            
            fw.close();
        } catch (Exception e) {
            System.out.println("   File not open or found!!!");
        }
    }

    public ArrayList<Cellphone> loadStands(String fileName) {
        Gson gson = new Gson();
        Collection<Cellphone> newStands = new ArrayList<>();

        String pathName = "./" + fileName + ".json";
        String jsonFile = "";

        try ( Scanner scFile = new Scanner(new File(pathName));) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            newStands = gson.fromJson(jsonFile, new TypeToken<List<Cellphone>>() {
            }.getType());

            System.out.println("--------------------------");
            System.out.println("          Load file");
            System.out.println("--------------------------");
            scFile.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("  File not open or found!!!");
        }

        return new ArrayList<>(newStands);
    }

    public void deleteStands(String fileName) {
        String pathName = "./" + fileName + ".json";

        File file = new File(pathName);

        try {
            if (file.canRead()) {
                file.delete();
                System.out.println("--------------------------");
                System.out.println("       Delete File");
                System.out.println("--------------------------");
            } else {
                System.out.println("  File not deleted or found!!!");
            }

        } catch (Exception e) {
            System.out.println("  File not deleted or found!!!");
        }
    }
}
