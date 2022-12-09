package ec.edu.espe.examu1.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.examu1.model.SdCard;
import ec.edu.espe.examu1.view.ExamU1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class FileManager {

    private static Scanner scan = new Scanner(System.in);

    public static ArrayList<SdCard> readFile(ArrayList<SdCard> sdCards) throws JsonSyntaxException {
        //Using librarie Gson V 2.10
        String json = "";
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sdCards.json"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<SdCard>> type = new TypeToken<ArrayList<SdCard>>() {
                };
                sdCards = gson.fromJson(json, type);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sdCards;
    }

    public static void exportJsonFile(ArrayList<SdCard> sdCards) {
        String json = new Gson().toJson(sdCards);
        try {
            FileWriter sdCardsRecord = new FileWriter("sdCards.json");
            sdCardsRecord.write(json);
            sdCardsRecord.close();
        } catch (IOException ex) { //Exception
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int searchId(ArrayList<SdCard> sdCards, int idFinder) {
        boolean validator = true;
        int SdCardsPosition = -1;
        for (int i = 0; i < sdCards.size(); i++) {
            if (idFinder == sdCards.get(i).getId()) {
                validator = false;
                SdCardsPosition = i;
            }
        }
        if (validator) {
            System.out.println("Id entered does not exist.");
        }
        return SdCardsPosition;
    }

    public static int findSdCardsPosition(ArrayList<SdCard> sdCards, String action) {
        int idFinder;
        int sdCardsPosition = -1;
        do {
            System.out.println("Enter the id of the SD Card you want to " + action);
            idFinder = scan.nextInt();
            sdCardsPosition = searchId(sdCards, idFinder);
        } while (sdCardsPosition == -1);
        System.out.println(sdCards.get(sdCardsPosition));
        return sdCardsPosition;
    }

    public static void deleteSdCard(ArrayList<SdCard> sdCards) {
        int option, sdCardsPosition;
        String action = "delete";
        sdCardsPosition = findSdCardsPosition(sdCards, action);

        System.out.println(sdCards.get(sdCardsPosition));
        System.out.println("Are you sure you want to delete this Sd Card?\n1. YES\n2. NO");
        System.out.println("Choose an option (type 1 or 2)");
        option = scan.nextInt();
        while (option > 2) {
            System.out.println("Option invalid, Enter an option: ");
            option = scan.nextInt();
        }
        if (option == 1) {
            sdCards.remove(sdCardsPosition);
            System.out.println("SD Card removed");
        }
        exportJsonFile(sdCards);
    }

    public static void editSdCard(ArrayList<SdCard> sdCards) {
        int sdCardsPosition, option, id, capacity;
        String brand = "";
        String action = "edit";
        sdCardsPosition = findSdCardsPosition(sdCards, action);
        SdCard sdCardEdited = sdCards.get(sdCardsPosition);
        do {
            option = printEditMenu();
            while (option > 5) {
                System.out.println("Option invalid, Enter an option: ");
                option = scan.nextInt();
            }
            switch (option) {
                case 1 -> {
                    System.out.println("Enter the ID:");
                    id = scan.nextInt();
                    sdCardEdited.setId(id);
                    sdCards.set(sdCardsPosition, sdCardEdited);
                }
                case 2 -> {
                    System.out.println("Enter the Brand");
                    brand = scan.next();
                    sdCardEdited.setBrand(brand);
                    sdCards.set(sdCardsPosition, sdCardEdited);
                }
                case 3 -> {
                    System.out.println("Enter the Capacity:");
                    capacity = scan.nextInt();
                    sdCardEdited.setCapacity(capacity);
                    sdCards.set(sdCardsPosition, sdCardEdited);
                }
                case 4 -> {
                    System.out.println(sdCards.get(sdCardsPosition));
                }
            }
        } while (option < 5);

        exportJsonFile(sdCards);
    }

    public static int printEditMenu() {
        int option;
        System.out.println("===================================");
        System.out.println("===\tEdit Sd Cards\t===");
        System.out.println("1. Edit ID");
        System.out.println("2. Edit Brand");
        System.out.println("3. Edit Capacity");
        System.out.println("4. Review Changes");
        System.out.println("5. Exit");
        System.out.println("Enter an option:");
        option = scan.nextInt();
        return option;
    }

    public static void printSdCard(ArrayList<SdCard> sdCards) {
        int position;
        String action = "edit";
        position = findSdCardsPosition(sdCards, action);
        System.out.println("\n===============================================");
        System.out.println("Id\tBrand\t\tCapacity");
        System.out.print(sdCards.get(position).getId() + "\t");
        System.out.print(sdCards.get(position).getBrand() + "\t\t");
        System.out.print(sdCards.get(position).getCapacity() + "\n");
        System.out.println("===============================================\n");
    }

    public static void printAllSdCards(ArrayList<SdCard> sdCards) {
        System.out.println("\n===============================================");
        System.out.println("Id\tBrand\t\tCapacity");
        for (int i = 0; i < sdCards.size(); i++) {
            System.out.print(sdCards.get(i).getId() + "\t");
            System.out.print(sdCards.get(i).getBrand() + "\t\t");
            System.out.print(sdCards.get(i).getCapacity() + "\n");
        }
        System.out.println("===============================================\n");
    }
}
