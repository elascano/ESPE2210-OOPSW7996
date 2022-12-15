package ec.edu.espe.VeterinarySystemControl.view;

/**
 *
 * @author Karla Ansatuña
 */
import ec.edu.espe.VeterinarySystemControl.model.Pet;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.VeterinarySystemControl.controller.FileManager;
import static ec.edu.espe.VeterinarySystemControl.controller.FileManager.printLine;
import ec.edu.espe.VeterinarySystemControl.utils.UserDefineExcception;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class VeterinarySystemControl {

    public static void main(String[] args) throws UserDefineExcception {
        Pet pet = new Pet();
        FileManager jsonFile = new FileManager();
        ArrayList<Pet> petsToWrite = new ArrayList<>();
        int choice = 0;
        String json = "";
        boolean option = false;
        Gson gson = new Gson();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {

                case 1 -> {
                    petsToWrite = jsonFile.readJSON(petsToWrite);
                    enterPet(petsToWrite);
                    jsonFile.saveIntoJSON(petsToWrite);

                }
                case 2 -> {
                    jsonFile.printPet(pet);

                }
                case 3 -> {
                    jsonFile.updateFile();
                }
                case 4 -> {
                    findOnePet(petsToWrite);

                }
                case 5 -> {
                    jsonFile.removeData(petsToWrite, pet);
                }
                case 6 -> {
                    option = true;
                }
            }
        } while (!option);
    }

    public static void menu() {
        System.out.println("===================");
        System.out.println(" /\\_/\\   /\\_/\\   /\\_/\\");
        System.out.println("/ o o \\ / o o \\ / o o \\");
        System.out.println("=====Welcome User======");
        System.out.println("Please choose an option");
        System.out.println("1. Register a Pet >");
        System.out.println("2. Read Data of a Pet >");
        System.out.println("3. Update the Data of a Pet with the id >");
        System.out.println("4. Find a Pet's data >");
        System.out.println("5. Delete a Pet's data >");
        System.out.println("6. Exit the program >");
        System.out.println("==========>");
    }

    public static void enterPet(ArrayList<Pet> pets) {
        Scanner sc = new Scanner(System.in);
        Pet pet = new Pet();

        System.out.println("  / \\__");
        System.out.println(" (    @\\___");
        System.out.println(" /         O");
        System.out.println(" /   (_____/");
        System.out.println("/_____/   U");

        System.out.println("Write the Id of the Pet >");
        pet.setId(sc.nextInt());
        System.out.println("Write the Pet's Name >");
        pet.setName(sc.next());
        System.out.println("Write the Species of the Pet (canine or feline) >");
        pet.setSpecies(sc.next());
        System.out.println("Write the Gender of the Pet (male or female) >");
        pet.setGender(sc.next());
        System.out.println("Write the Pet's Age >");
        pet.setAge(sc.nextInt());
        int age = pet.getAge();
        age = validateAge(age);
        System.out.println("Write the Owner's phone number of the Pet >");
        pet.setOwnerTelephone(sc.nextInt());
        pets.add(pet);
    }

    private static int validateAge(int age) {
        Scanner sc = new Scanner(System.in);
        while (age < 1 || age > 20) {
            System.out.print("Age invalid, enter age again >");
            age = sc.nextInt();
        }
        return age;
    }

    private static void findOnePet(ArrayList<Pet> pets) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);
        try {

            try {
                FileManager.findPet(pets);
                printLine(pets);
            } catch (UserDefineExcception ex) {
                System.out.println("Error >");
                System.out.println(ex.getMessage());
            }

        } catch (Exception e) {
            System.out.println("=== Data incorrect, please try again ===");
        }
    }
}
