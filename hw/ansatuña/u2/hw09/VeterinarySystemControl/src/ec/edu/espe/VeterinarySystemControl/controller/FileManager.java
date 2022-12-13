package ec.edu.espe.VeterinarySystemControl.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.VeterinarySystemControl.model.Pet;
import ec.edu.espe.VeterinarySystemControl.utils.UserDefineExcception;
import ec.edu.espe.VeterinarySystemControl.view.VeterinarySystemControl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class FileManager {

    public static ArrayList<Pet> readJSON(ArrayList<Pet> pets) {
        Gson gson = new Gson();

        try {
            Reader reader = Files.newBufferedReader(Paths.get("Pets List.json"));
            TypeToken<ArrayList<Pet>> type = new TypeToken<ArrayList<Pet>>() {
            };
            pets = gson.fromJson(reader, type.getType());

            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("===== Write the Data please =====");
        } catch (IOException ex) {

        }
        return pets;
    }

    public static void saveIntoJSON(ArrayList<Pet> flashDrivers) {
        File fileJson = new File("Pets List.json");
        Gson gson = new Gson();
        String json = gson.toJson(flashDrivers);

        try {
            FileWriter writer = new FileWriter(fileJson);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void findPet(ArrayList<Pet> pets) throws UserDefineExcception {
        String json = "";
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();
        boolean idNotExist = true;
        System.out.print("Please enter the id of the Pet you wanna find > ");
        int match = sc.nextInt();

        for (int i = 0; i < pets.size(); i++) {
            if (match == pets.get(i).getId()) {
                json = gson.toJson(pets.get(i));
                idNotExist = false;
            }
        }
        if (idNotExist) {
            throw new UserDefineExcception("..:: Id > {" + match + "} < doesn't exist ::..");
        }
    }

    public static void printPet(Pet pet) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets = readJSON(pets);
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }
    }

    public static void updateFile() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        pets = readJSON(pets);
        System.out.print("Please enter the id of the Pet to change > ");
        int match = sc.nextInt();

        for (int i = 0; i < pets.size(); i++) {
            if (match == pets.get(i).getId()) {
                changeInfo(pets, i);

            }
        }

    }

    private static void changeInfo(ArrayList<Pet> pets, int position) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t    |\\__/,|   (`\\");
        System.out.println("\t  _.|o o  |_   ) )");
        System.out.println("\t-(((---(((--------");
        System.out.println("====== Update Data System ======");
        System.out.println("..:: Please enter the data needed ::..");
        System.out.println("New pet's Id >");
        pets.get(position).setId(sc.nextInt());
        System.out.println("New pet's Name >");
        pets.get(position).setName(sc.next());
        System.out.println("New pet's Species (canine or feline) >");
        pets.get(position).setSpecies(sc.next());
        System.out.println("New pet's Gender (male or female) >");
        pets.get(position).setGender(sc.next());
        System.out.println("New pet's Age >");
        pets.get(position).setAge(sc.nextInt());
        System.out.println("New Owner's phone number >");
        pets.get(position).setOwnerTelephone(sc.nextInt());
        editJSON(pets);
        System.out.println("..:: Updated Done ::..");
        System.out.println("==============================");
    }

    public static void editJSON(ArrayList<Pet> pets) {
        File fileJson = new File("Pets List.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(pets);

        try ( FileWriter writer = new FileWriter(fileJson)) {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void removeData(ArrayList<Pet> pets, Pet pet)  {
        Scanner sc = new Scanner(System.in);
        pets = readJSON(pets);
        boolean idNotFound = true;
        System.out.print("Enter the pet's id to delete >");
        int match = sc.nextInt();

        for (int i = 0; i < pets.size(); i++) {

            if (match == pets.get(i).getId()) {
                pets.remove(i);
                editJSON(pets);
                idNotFound = false;
                System.out.println("..:: This pet's data has been deleted ::..");
            }
        }
        if (idNotFound) {
            System.out.println("Id not found");
        }
    }

    public static void printLine(ArrayList<Pet> pets) {
        System.out.println(pets);
    }
}
