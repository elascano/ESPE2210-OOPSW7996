
package exercise.view;

import com.google.gson.Gson;
import exercise.controller.FileManager;
import exercise.model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pencil pencil;
        pencil= new Pencil();
        FileManager jsonFile = new FileManager();
        ArrayList<Pencil> pencilsToWrite = new ArrayList<>();
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
                    pencilsToWrite = jsonFile.readJSON(pencilsToWrite);
                    enterPencil(pencilsToWrite);
                    jsonFile.saveIntoJSON(pencilsToWrite);

                }
                case 2 -> {          
                    jsonFile.printPencil();

                }
                case 3 -> {
                    jsonFile.updateFile();
                }
                case 4 -> {
                    jsonFile.removeData(pencilsToWrite, pencil);
                }
                case 5 -> {
                    option=true;
                }
            }
        } while (!option);
    }

    public static void menu() {
        System.out.println("===================");
        System.out.println("=====Welcome User=====");
        System.out.println("Please choose an option");
        System.out.println("1. Enter a Pencil >");
        System.out.println("2. Read Data of a Pencil >");
        System.out.println("3. Update the Data of a pencil by id >");
        System.out.println("4. Delete a Pencil's data >");
        System.out.println("5. Exit the program >");
        System.out.println("==========>");
    }

    public static void enterPencil(ArrayList<Pencil> pencils) {
        Scanner sc = new Scanner(System.in);
        Pencil pencil = new Pencil();
        System.out.println("Write the Id of the Pencil >");
        pencil.setId(sc.nextInt());
        System.out.println("Write the color of the Pencil >");
        pencil.setColor(sc.next());
        System.out.println("Write the Quantity of this kind of Pencil >");
        pencil.setQuantity(sc.nextInt());
        pencils.add(pencil);
    }
}
