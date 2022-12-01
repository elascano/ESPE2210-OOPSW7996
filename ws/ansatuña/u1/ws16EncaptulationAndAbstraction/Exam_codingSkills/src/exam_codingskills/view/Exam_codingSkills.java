/*

 */
package exam_codingskills.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import exam_codingskills.model.FlashDrive;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.jfr.consumer.EventStream.openFile;

/**
 *
 * @author Karla Ansatuña
 */
public class Exam_codingSkills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int option;
        boolean leave;
        Scanner sc = new Scanner(System.in);
        ArrayList<FlashDrive> flashdrivers = new ArrayList<FlashDrive>();
        FlashDrive flashdrive = new FlashDrive();
        do {
            leave = false;
            System.out.println("\t======== Welcome ==========");
            System.out.println("\t..................................");
            System.out.println("\n1) Enter a new flash drive in the Inventory >");
            System.out.println("2) Exit the program >");
            option = sc.nextInt();
            switch (option) {

                case 1 -> {
                    flashdrivers = openFile(flashdrivers);
                    insertFlashDriver(sc, flashdrivers);
                    writeJSON(flashdrivers);
                }

                case 2 -> {
                    leave = true;
                }
                default ->
                    System.out.println("Invalid option");
            }
        } while (option !=2);

    }

    private static ArrayList<FlashDrive> openFile(ArrayList<FlashDrive> flashdrivers) throws FileNotFoundException, IOException {
        int flag[];
        String json = "";
        Gson gson = new Gson();
        FlashDrive product = new FlashDrive();
        Scanner scan = new Scanner(System.in);
        java.lang.reflect.Type type = new TypeToken<ArrayList<FlashDrive>>() {
        }.getType();

        BufferedReader read = new BufferedReader(new FileReader("FlashDrive.json"));
        String line = "";
        while ((line = read.readLine()) != null) {
            json = line;
            flashdrivers = new Gson().fromJson(json, type);
        }
        return flashdrivers;
    }

    private static void insertFlashDriver(Scanner scan, ArrayList<FlashDrive> flashdrivers) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        String color;
        int quantity;
        String admissionDate;
        FlashDrive product = new FlashDrive();
        System.out.println("=============================");
        System.out.println("Enter the Id of the Product: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the Color of the Product: ");
        color = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the Quantity of the Product: ");
        quantity = scan.nextInt();
        scan.nextLine();
        product.setId(id);
        product.setColor(color);
        product.setQuantity(quantity);
    }

    private static void writeJSON(ArrayList<FlashDrive> flashdrivers) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(flashdrivers);
        try {
            FileWriter file = new FileWriter("flashdrivers.json");

            file.write(jsonStructure);

            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
