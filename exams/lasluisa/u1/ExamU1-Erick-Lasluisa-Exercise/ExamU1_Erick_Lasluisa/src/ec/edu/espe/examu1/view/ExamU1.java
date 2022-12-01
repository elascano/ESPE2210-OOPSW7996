package ec.edu.espe.examu1.view;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.examu1.model.SdCard;
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
public class ExamU1 {

    public static void main(String[] args) {
        System.out.println("Erick Lasluisa");
        System.out.println("Exam U1");
        System.out.println("===============");

        Scanner console = new Scanner(System.in);
        int option;
        ArrayList<SdCard> sdCards = new ArrayList<SdCard>();
        sdCards = readFile(sdCards);

        do {
            System.out.println("1. Enter Sd Card");
            System.out.println("2. Exit");
            System.out.println("Enter the option: ");
            option = console.nextInt();
            while (option > 2) {
                System.out.println("Option invalid, Enter an option: ");
                option = console.nextInt();
            }

            if (option == 1) {
                addSdCard(sdCards);
                exportJsonFile(sdCards);
            }
        } while (option < 2);

    }

    private static ArrayList<SdCard> readFile(ArrayList<SdCard> sdCards) throws JsonSyntaxException {
        //Using librarie Gson V 2.10
        String json = "";
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sdCards.json"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<SdCard>> type = new TypeToken<ArrayList<SdCard>>() {
                };
                sdCards = gson.fromJson(json, type);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sdCards;
    }

    private static void exportJsonFile(ArrayList<SdCard> sdCards) {
        String json = new Gson().toJson(sdCards);
        try {
            FileWriter orderRecord = new FileWriter("sdCards.json");
            orderRecord.write(json);
            orderRecord.close();
        } catch (IOException ex) { //Exception
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    }
}
