package ec.edu.espe.hw08TvSet.view;

import com.google.gson.Gson;
import ec.edu.espe.hw08TvSet.controller.FileManager;
import ec.edu.espe.hw08TvSet.model.hw08TvSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class hw08TvSetSimulation {
    public static void main(String[] args) {
        int option = 0;
        int hw08TvSetIndex;
        int hw08TvSetId;
        
        Scanner scan;
        hw08TvSet hw08tvset;
        ArrayList<hw08TvSet> tvsets;
        
        
        scan = new Scanner(System.in);
        
        tvsets = FileManager.loadJson();
                
        while (option != 5) {
            System.out.println("Jerly Reinoso");
            System.out.println("==============");
            System.out.println("     MENU     ");
            System.out.println("==============");
            System.out.println("1. Create new TvSet");
            System.out.println("2. Read the TvSet");
            System.out.println("3. Update information .json");
            System.out.println("4. Delete TvSet");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            try {
                option = scan.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            scan.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("==== Add Information ====");
                    hw08tvset = FileManager.addhw08TvSet();
                    if (hw08tvset != null) {
                        tvsets.add(hw08tvset);
                    }
                }
                case 2 -> {
                    System.out.println("==== TvSet information ====");
                    System.out.print("Enter TvSet ID: ");
                    hw08TvSetId = scan.nextInt();
                    scan.nextLine();
                    hw08TvSetIndex = FileManager.findhw08TvSetIndex(tvsets, hw08TvSetId);
                    if (hw08TvSetIndex >= 0) {
                        FileManager.printhw08TvSet(tvsets.get(hw08TvSetIndex));
                    } else {
                        System.out.println("TvSet ID not found");
                    }
                }
                case 3 -> {
                    System.out.println("==== SAVED ====");
                    
                    FileManager.saveJson(tvsets);
                }
                
                case 4 -> {
                    System.out.println("==== File ====");
                    FileManager.deleteFile();
                } 

                case 5 ->
                    System.out.println("Good Bye");

                default ->
                    System.out.println("OPTION NOT VALID");
            }
            scan.nextLine();
        }
    }
}
