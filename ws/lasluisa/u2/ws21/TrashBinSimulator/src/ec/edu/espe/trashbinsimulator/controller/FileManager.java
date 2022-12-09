package ec.edu.espe.trashbinsimulator.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.trashbinsimulator.model.TrashBin;
import ec.edu.espe.trashbinsimulator.view.TrashBinSimulator;
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

    public static ArrayList<TrashBin> readFile(ArrayList<TrashBin> trashBins) throws JsonSyntaxException {
        //Using librarie Gson V 2.10
        String json = "";
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("trashBins.json"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<TrashBin>> type = new TypeToken<ArrayList<TrashBin>>() {
                };
                trashBins = gson.fromJson(json, type);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrashBinSimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrashBinSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trashBins;
    }

    public static void exportJsonFile(ArrayList<TrashBin> trashBins) {
        String json = new Gson().toJson(trashBins);
        try {
            FileWriter trashBinsRecord = new FileWriter("trashBins.json");
            trashBinsRecord.write(json);
            trashBinsRecord.close();
        } catch (IOException ex) { //Exception
            Logger.getLogger(TrashBinSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int searchId(ArrayList<TrashBin> trashBins, int idFinder) {
        boolean validator = true;
        int trashBinsPosition = -1;
        for (int i = 0; i < trashBins.size(); i++) {
            if (idFinder == trashBins.get(i).getId()) {
                validator = false;
                trashBinsPosition = i;
            }
        }
        if (validator) {
            System.out.println("Id entered does not exist.");
        }
        return trashBinsPosition;
    }

    public static int findTrashBinsPosition(ArrayList<TrashBin> trashBins, String action) {
        int idFinder;
        int trashBinsPosition = -1;
        do {
            System.out.println("Enter the id of the Trash Bin you want to " + action);
            idFinder = scan.nextInt();
            trashBinsPosition = searchId(trashBins, idFinder);
        } while (trashBinsPosition == -1);
        System.out.println(trashBins.get(trashBinsPosition));
        return trashBinsPosition;
    }

    public static void deleteTrashBinsCard(ArrayList<TrashBin> trashBins) {
        int option, trashBinsPosition;
        String action = "delete";
        trashBinsPosition = findTrashBinsPosition(trashBins, action);

        System.out.println(trashBins.get(trashBinsPosition));
        System.out.println("Are you sure you want to delete this Trash Bin?\n1. YES\n2. NO");
        System.out.println("Choose an option (type 1 or 2)");
        option = scan.nextInt();
        while (option > 2) {
            System.out.println("Option invalid, Enter an option: ");
            option = scan.nextInt();
        }
        if (option == 1) {
            trashBins.remove(trashBinsPosition);
            System.out.println("Trash Bin removed");
        }
        exportJsonFile(trashBins);
    }

    public static void editTrashBinsCard(ArrayList<TrashBin> trashBins) {
        int trashBinsPosition, option, id, capacity;
        String material = "";
        String action = "edit";
        trashBinsPosition = findTrashBinsPosition(trashBins, action);
        TrashBin trashBinsEdited = trashBins.get(trashBinsPosition);
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
                    trashBinsEdited.setId(id);
                    trashBins.set(trashBinsPosition, trashBinsEdited);
                }
                case 2 -> {
                    System.out.println("Enter the Material");
                    material = scan.next();
                    trashBinsEdited.setMaterial(material);
                    trashBins.set(trashBinsPosition, trashBinsEdited);
                }
                case 3 -> {
                    System.out.println("Enter the Capacity in liters:");
                    capacity = scan.nextInt();
                    trashBinsEdited.setCapacity(capacity);
                    trashBins.set(trashBinsPosition, trashBinsEdited);
                }
                case 4 -> {
                    System.out.println(trashBins.get(trashBinsPosition));
                }
            }
        } while (option < 5);

        exportJsonFile(trashBins);
    }

    public static int printEditMenu() {
        int option;
        System.out.println("===================================");
        System.out.println("===\tEdit Trash Bin\t===");
        System.out.println("1. Edit ID");
        System.out.println("2. Edit Material");
        System.out.println("3. Edit Capacity");
        System.out.println("4. Review Changes");
        System.out.println("5. Exit");
        System.out.println("Enter an option:");
        option = scan.nextInt();
        return option;
    }

    public static void printTrashBins(ArrayList<TrashBin> trashBins) {
        int position;
        String action = "edit";
        position = findTrashBinsPosition(trashBins, action);
        System.out.println("\n===============================================");
        System.out.println("Id\tMaterial\tCapacity (lt)");
        System.out.print(trashBins.get(position).getId() + "\t");
        System.out.print(trashBins.get(position).getMaterial() + "\t\t");
        System.out.print(trashBins.get(position).getCapacity() + "\n");
        System.out.println("===============================================\n");
    }

    public static void printAllTrashBins(ArrayList<TrashBin> trashBins) {
        System.out.println("\n===============================================");
        System.out.println("Id\tMaterial\tCapacity (lt)");
        for (int i = 0; i < trashBins.size(); i++) {
            System.out.print(trashBins.get(i).getId() + "\t");
            System.out.print(trashBins.get(i).getMaterial() + "\t\t");
            System.out.print(trashBins.get(i).getCapacity() + "\n");
        }
        System.out.println("===============================================\n");
    }
}
