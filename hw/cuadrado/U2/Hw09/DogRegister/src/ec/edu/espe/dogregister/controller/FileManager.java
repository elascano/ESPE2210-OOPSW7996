package ec.edu.espe.dogregister.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dogregister.model.*;
import ec.edu.espe.dogregister.utils.DataNotFoundException;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado
 */
public class FileManager {

    public static ArrayList<Dog> read(ArrayList<Dog> dogs, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Dog>> type = new TypeToken<ArrayList<Dog>>() {
                };
                dogs = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("\n++ The request file does not exist, please wait because it will be created:\n");
        } catch (IOException ex) {
            System.out.println("++ The file could not be read:");
        }
        return dogs;
    }

    public static void create(ArrayList<Dog> dogs, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(dogs);
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    public static int find(ArrayList<Dog> dogs, int id) throws DataNotFoundException {
        Dog dog = new Dog();

        for (int i = 0; i < dogs.size(); i++) {
            dog = dogs.get(i);
            if (id == dog.getId()) {
                return i;
            }
        }
        throw new DataNotFoundException("++ The id: {" + id + "} Does not exist:");
    }
    public static void printList(ArrayList<Dog> dogs) {
        Dog dog = new Dog();
        System.out.println("\nID\t|Name\t|Age|");
        for (int i = 0; i < dogs.size(); i++) {
            dog = dogs.get(i);
            printLine(dog);
        }
    }
    public static void printLine(Dog dog) {
        int id = dog.getId();
        String name = dog.getName();
        float mAge = dog.getAge();
        System.out.println(id + "\t|" + name + "\t|" + mAge + "\t|");
    }    
}
