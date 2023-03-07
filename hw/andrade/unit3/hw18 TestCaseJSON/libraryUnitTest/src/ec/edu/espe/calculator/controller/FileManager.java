package ec.edu.espe.calculator.controller;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.calculator.model.Operation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FileManager {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

 
    public static void editJson(Operation operation, String jsonName) {
        File fileJson = new File(jsonName);
        ArrayList<Operation> operations = new ArrayList<>();
        operations = readJson(operations, jsonName);
        operations.add(operation);
        String json = gson.toJson(operations);

        try ( FileWriter writer = new FileWriter(fileJson)) {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static ArrayList<Operation> readJson(ArrayList<Operation> operations, String fileJson) {
        Gson gson = new Gson();
        File file = new File(fileJson);
        if (file.length() == 0) {
            try ( FileWriter writer = new FileWriter(fileJson)) {
                writer.write("[]");
            } catch (IOException ex1) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } else {
            try {
                Reader reader = Files.newBufferedReader(Paths.get(fileJson));
                TypeToken<ArrayList<Operation>> type = new TypeToken<ArrayList<Operation>>() {
                };
                operations = gson.fromJson(reader, type.getType());
                reader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("File not Found");
            } catch (IOException ex) {
                System.out.println("IOException");
            }
        }

        return operations;
    }

}
