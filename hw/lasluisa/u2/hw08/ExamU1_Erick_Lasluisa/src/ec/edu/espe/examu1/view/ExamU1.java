package ec.edu.espe.examu1.view;

import ec.edu.espe.examu1.controller.FileManager;
import ec.edu.espe.examu1.model.SdCard;
import java.util.*;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class ExamU1 {

    public static void main(String[] args) {
        System.out.println("Erick Lasluisa");
        System.out.println("Exam U1");
        System.out.println("===============");

        Scanner console = new Scanner(System.in);
        int option;
        ArrayList<SdCard> sdCards = new ArrayList<SdCard>();
        sdCards = FileManager.readFile(sdCards);

        do {
            System.out.println("1. Enter Sd Card");
            System.out.println("2. Edit Sd Card");
            System.out.println("3. Delete Sd Card");
            System.out.println("4. Print an specific Sd Card");
            System.out.println("5. Print all Sd Cards");
            System.out.println("6. Exit");
            System.out.println("Enter the option: ");
            option = console.nextInt();
            while (option > 6) {
                System.out.println("Option invalid, Enter an option: ");
                option = console.nextInt();
            }
            switch (option) {
                case 1 -> {
                    addSdCard(sdCards);
                }
                case 2 -> {
                    FileManager.editSdCard(sdCards);
                }
                case 3 -> {
                    FileManager.deleteSdCard(sdCards);
                }
                case 4 -> {
                    FileManager.printSdCard(sdCards);
                }
                case 5 -> {
                    FileManager.printAllSdCards(sdCards);
                }
            }
        } while (option < 6);

    }

    private static void addSdCard(ArrayList<SdCard> sdCards) {
        int id, capacity;
        String brand = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the id:");
        id = console.nextInt();
        System.out.println("Enter the brand:");
        brand = console.next();
        System.out.println("Enter the capacity:");
        capacity = console.nextInt();
        sdCards.add(new SdCard(id, brand, capacity));
        FileManager.exportJsonFile(sdCards);
    }
}
