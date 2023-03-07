/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws39unittest.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.ws39unittest.model.TestValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class FileManager {
    
    Gson gson = new Gson();
    
    public ArrayList<TestValue> readJson(ArrayList<TestValue> testValues, String fileName) {
        try{
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            TypeToken<ArrayList<TestValue>> type = new TypeToken<ArrayList<TestValue>>() {};
            testValues = gson.fromJson(reader, type.getType());
            reader.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return testValues;
    }
}
