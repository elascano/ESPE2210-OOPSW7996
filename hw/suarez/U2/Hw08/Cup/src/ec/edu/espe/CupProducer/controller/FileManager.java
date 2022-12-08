
package ec.edu.espe.CupProducer.controller;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import ec.edu.espe.CupProducer.model.Cup;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class FileManager {

    public static boolean openFile(boolean confirmation) {
        File file = new File("CupData.json");
        if (file.exists()) {

            confirmation = (true);

        }
        System.out.println("File creation -->" + confirmation);

        return confirmation;
    }

    public static void saveJson(String jsonCup, ArrayList<Cup> cups) {

        Gson gson = new Gson();
        jsonCup = gson.toJson(cups);

        try ( FileWriter file = new FileWriter("CupData.json")) {

            file.write(jsonCup);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readJson(ArrayList<Cup> cups, String jsonCup) {

        Gson gson = new Gson();
        jsonCup = gson.toJson(cups);

        System.out.println("Gson-->" + jsonCup);
    }

    public static void deleteForks(ArrayList<Cup> cups, Cup cup, String json, Scanner sc) {
        Gson gson = new Gson();
        boolean idNotFound = true;
        System.out.print("Enter the cup id to delete: ");
        int match = sc.nextInt();

        for (int i = 0; i < cups.size(); i++) {
            if (match == cups.get(i).getId()) {
                cups.remove(i);
                idNotFound = false;
                System.out.println("||Deleteted information||");
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }

        json = gson.toJson(cups);
        try ( FileWriter file = new FileWriter("CupData.json")) {

            file.write(json);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void updateJson(ArrayList<Cup> cups, Cup cup, String json, Scanner sc) {

        Gson gson = new Gson();
        boolean idNotFound = true;

        System.out.print("Enter the cup id to update: ");
        int match = sc.nextInt();

        for (int i = 0; i < cups.size(); i++) {
            if (match == cups.get(i).getId()) {
                changeInfo(cups, i, sc);
                idNotFound = false;
                System.out.println("||The information changed||");
            }
        }

        if (idNotFound) {
            System.out.println("ID not found");
        }

        json = gson.toJson(cups);
        try ( FileWriter file = new FileWriter("CupData.json")) {

            file.write(json);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void findDataCup(ArrayList<Cup> cups, Cup cup, String json, Scanner sc) {
        Gson gson = new Gson();
        boolean idNotFound = true;
        System.out.print("Enter the cup id to search: ");
        int match = sc.nextInt();

        for (int i = 0; i < cups.size(); i++) {
            if (match == cups.get(i).getId()) {
                json = gson.toJson(cups.get(i));
                idNotFound = false;
                System.out.println("||The cup information||-->" + json);
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }
    }

    private static void changeInfo(ArrayList<Cup> cups, int position, Scanner sc) {

        System.out.print("Enter the new fork material:");
        cups.get(position).setMaterial(sc.next());
        System.out.print("Enter the new fork color:");
        cups.get(position).setColor(sc.next());

    }

}
