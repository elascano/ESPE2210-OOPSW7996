package ec.edu.espe.city.view;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.city.model.City;
import ec.edu.espe.city.controller.FileManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class CodingSkills {

    private static ArrayList<City> theList;
    FileManager fileManager = new FileManager();

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();

        Scanner scan = new Scanner(System.in);
        int optionMenu;

        String nameFile = "";
        do {
            System.out.println("\t====WELCOME=====");
            System.out.println("\t==JUAN PINZA==");
            System.out.println("\t==  HW 08  ==");
            System.out.println("\t==26. CITY==");
            System.out.println("\n1) READ AN OBJECT IN THE Json FORMAT");
            System.out.println("2) CREATE A NEW Json OBJECT");
            System.out.println("3) UPDATE THE Json DATA");
            System.out.println("4) DELETE AN Json OBJECT");
            System.out.println("5) EXIT");
            System.out.println("Please, select an option: ");
            optionMenu = scan.nextInt();
            scan.nextLine();
            switch (optionMenu) {
                case 1:
                    System.out.println("Enter the name of your Json File");
                    fileManager.readMyJsonObject(scan);
                    break;
                case 2:
                    fileManager.writeMyJsonObject(scan);
                    break;
                case 3:
                    fileManager.updateMyJsonObject(scan);
                    break;
                case 4:
                    fileManager.deleteMyJsonFile(scan);
                    break;
                case 5:
                    System.out.println("Exit...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR!!");
                    System.out.println("Please, enter a valid option");
                    break;
            }
        } while (optionMenu != 5);
    }
}
