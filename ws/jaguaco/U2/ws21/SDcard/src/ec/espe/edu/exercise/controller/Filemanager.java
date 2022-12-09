package ec.espe.edu.exercise.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exercise.model.SDcard;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Filemanager {
    public static ArrayList<SDcard> read(ArrayList<SDcard> sdcards, String fileName) {
        String fromJson = ("");
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<SDcard>> type = new TypeToken<ArrayList<SDcard>>() {
                };
                sdcards = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No reading");
        } catch (IOException ex) {
        }
        return sdcards;
    }
    public static void create(ArrayList<SDcard> sdcards, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(sdcards);

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    public static int findSDcard(ArrayList<SDcard> sdcards, int memory) {
        SDcard sdcard = new SDcard();

        for (int i = 0; i < sdcards.size(); i++) {
            sdcard = sdcards.get(i);
            if (memory == sdcard.getNumberofserie()) {
                return i;
            }
        }
        return -1;
    }
    
    public static void deleteSDcard(ArrayList<SDcard> sdcards) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Insert the number of serie to deleted:");
            idToSearch = sc.nextInt();

            int sdcardFoundPosition = findSDcard(sdcards, idToSearch);

            if (sdcardFoundPosition != -1) {

                sdcards.remove(sdcardFoundPosition);
                create(sdcards, "SDcards.json");
                System.out.println("Deleted¡¡¡");
            } else {
            }
        } catch (Exception e) {
        }
    }
    public static void updateSDcard(ArrayList<SDcard> sdcards) {
        Scanner sc = new Scanner(System.in);
        int idToSearch;

        try {
            System.out.print("Insert the Number of serie: ");
            idToSearch = sc.nextInt();

            int sdcardFoundPosition = findSDcard(sdcards, idToSearch);

            if (sdcardFoundPosition != -1) {
                SDcard sdcard;
                int numberofserie;
                int memory;
                String tradermark;
                int pins;

                SDcard sdcardToUpdate = new SDcard();
                sdcardToUpdate = sdcards.get(sdcardFoundPosition);
                printLine(sdcardToUpdate);
                sc.nextLine();
                System.out.print(" Enter the new number of serie of the SD card ");
                tradermark = sc.nextLine();
                System.out.print("New number of the pins ");
                pins = sc.nextInt();
                sdcardToUpdate.setTrademark(tradermark);
                sdcardToUpdate.setPins(pins);
                create(sdcards, "SDcard.json");
                System.out.println("Update¡¡¡");
            } else {
                System.out.println("the number of serie dont exist");
            }

        } catch (Exception e) {
            System.out.println("No update");
        }
    }
        public static void printList(ArrayList<SDcard> sdcards) {
        SDcard sdcard = new SDcard();
        System.out.println("");
        for (int i = 0; i < sdcards.size(); i++) {
            sdcard = sdcards.get(i);
            printLine(sdcard);
        }
    }

    public static void printLine(SDcard sdcard) {
        int memory = sdcard.getMemory();
        int numberofserie = sdcard.getNumberofserie();
        String trademark = sdcard.getTrademark();
        int pins = sdcard.getPins();
        System.out.println(memory + "\t|" + trademark + "\t|" + pins + "\t|");

    }

    public static void deleteSDcard(String fileName) {

        Scanner sc = new Scanner(System.in);
        String confirmation;
        try {
            System.out.print("Delete all information? Yes/No ");
            confirmation = sc.nextLine();

            if (confirmation.equals("yes")) {

                File file = new File(fileName);
                if (file.delete()) {
                    System.out.println("Information is deleted");
                } else {
                    System.out.println("No deleted");
                }
            }
        } catch (Exception e) {
            System.out.println("error :c");
        }
    }
}
