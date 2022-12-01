/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercise.pkg28;

import excercise.pkg28.model.Printer;
import com.google.gson.Gson;
import static excercise.pkg28.model.Printer.enterPrinterData;
import static excercise.pkg28.model.Printer.savePrinterFileJson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Excercise28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Printer> printers = new ArrayList<Printer>();

        Printer printer = new Printer();

        ArrayList<Printer> printerInfo = new ArrayList<Printer>();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;
        
        while (!exit) {
            System.out.println("          Menu Options         ");
            System.out.println("1.Insert data of the print");
            System.out.println("2.EXIT");

            try {
                System.out.println("Digit an option: ");
                option = input.nextInt();
                position[0] = printerInfo.size();

                switch (option) {
                    case 1:
                                        if (printerInfo.isEmpty()) {

                                            enterPrinterData(printerInfo, printer, position);
                                            savePrinterFileJson(printerInfo);
                                        } else {
                                            System.out.println("A printer is registred");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("You exit was success");
                                        exit = true;
                                        
                                        break;
                                        
                                    default:
                        System.out.println("Nonexistent option");
                        break;
    }
            } catch (InputMismatchException e) {
                                System.out.println("Incorrect dataType");
                                System.out.println("If you don't see the menu again");
                                System.out.println("Write any character and press enter");
                                input.next();
                            }
                        } 
    }
}
