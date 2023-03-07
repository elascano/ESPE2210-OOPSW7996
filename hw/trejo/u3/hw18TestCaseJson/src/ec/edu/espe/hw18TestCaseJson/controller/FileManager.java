/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw18TestCaseJson.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.hw18TestCaseJson.model.TestValue;
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
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class FileManager {

    public static ArrayList<TestValue> readJson(ArrayList<TestValue> testValues, String fileName) {
        Gson gson = new Gson();
        File file = new File(fileName);
        if (file.length() == 0) {
            System.out.println("empty");
            try ( FileWriter writer = new FileWriter(fileName)) {
                writer.write("[]");
            } catch (IOException ex1) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } else {
            try {
                Reader reader = Files.newBufferedReader(Paths.get(fileName));
                TypeToken<ArrayList<TestValue>> type = new TypeToken<ArrayList<TestValue>>() {
                };
                testValues = gson.fromJson(reader, type.getType());
                reader.close();

                

            } catch (FileNotFoundException ex) {
                System.out.println("File not Found");
            } catch (IOException ex) {
                System.out.println("IOException");
            }
        }

        return testValues;
    }
}
