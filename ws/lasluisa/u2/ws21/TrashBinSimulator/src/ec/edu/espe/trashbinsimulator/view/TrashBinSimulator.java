package ec.edu.espe.trashbinsimulator.view;

import ec.edu.espe.trashbinsimulator.controller.FileManager;
import ec.edu.espe.trashbinsimulator.model.TrashBin;
import java.util.*;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class TrashBinSimulator {

    public static void main(String[] args) {
        System.out.println("Erick Lasluisa");
        System.out.println("Exam U1");
        System.out.println("===============");

        Scanner console = new Scanner(System.in);
        int option;
        ArrayList<TrashBin> trashBins = new ArrayList<TrashBin>();
        trashBins = FileManager.readFile(trashBins);

        do {
            System.out.println("1. Enter a new Trash Bin");
            System.out.println("2. Edit Trash Bin");
            System.out.println("3. Delete Trash Bin");
            System.out.println("4. Print an specific Trash Bin");
            System.out.println("5. Print all Trash Bin");
            System.out.println("6. Exit");
            System.out.println("Enter the option: ");
            option = console.nextInt();
            while (option > 6) {
                System.out.println("Option invalid, Enter an option: ");
                option = console.nextInt();
            }
            switch (option) {
                case 1 -> {
                    addTrashBin(trashBins);
                }
                case 2 -> {
                    FileManager.editTrashBinsCard(trashBins);
                }
                case 3 -> {
                    FileManager.deleteTrashBinsCard(trashBins);
                }
                case 4 -> {
                    FileManager.printTrashBins(trashBins);
                }
                case 5 -> {
                    FileManager.printAllTrashBins(trashBins);
                }

            }
        } while (option < 6);

    }

    private static void addTrashBin(ArrayList<TrashBin> trashBin) {
        int id, capacity;
        String material = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the id:");
        id = console.nextInt();
        System.out.println("Enter the material:");
        material = console.next();
        System.out.println("Enter the capacity in liters:");
        capacity = console.nextInt();
        trashBin.add(new TrashBin(id, material, capacity));
        FileManager.exportJsonFile(trashBin);
    }
}
