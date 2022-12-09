
package ec.edu.espe.exercise.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exercise_riverajoel.model.Coin;
import ec.edu.espe.exercise_otherthing_riverajoel.view.BankOfCoin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class FileManager {
    private static final Scanner sc = new Scanner(System.in);

    public static void enterPayment(ArrayList<Coin> coin) {

        Coin paymentEnter = new Coin();
        System.out.println("Enter the payment ID:");
        paymentEnter.setId(sc.nextInt());
        System.out.println("Enter the value: ");
        paymentEnter.setValue(sc.nextFloat());
        sc.nextLine();
        System.out.println("Enter the type of Currency: ");
        paymentEnter.setTypeOfCurrency(sc.nextLine());
        coin.add(paymentEnter);
    }

    public static void sendJson(ArrayList<Coin> coin) {

        String json = new Gson().toJson(coin);
        try {
            FileWriter orderRecord = new FileWriter("BankList.json");
            orderRecord.write(json);
            orderRecord.close();
        } catch (IOException ex) {
            Logger.getLogger(BankOfCoin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Coin> readJson(ArrayList<Coin> coin) {

        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get("BankList.json"));
            TypeToken<ArrayList<Coin>> type = new TypeToken<ArrayList<Coin>>() {
            };
            coin = gson.fromJson(reader, type.getType());
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found :c");
        } catch (IOException ex) {
            System.out.println("File Without Data");
        }
        return coin;

    }

    public static void findPayment() {

        ArrayList<Coin> coin = new ArrayList<>();
        boolean idNotFound = true;

        coin = readJson(coin);
        System.out.print("Enter the payment id: ");
        int match = sc.nextInt();

        for (int i = 0; i < coin.size(); i++) {
            if (match == coin.get(i).getId() && match != 0) {
                printPayment(coin.get(i));
                idNotFound = false;
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }

    }

    public static void printPayment(Coin coin) {

        System.out.println("");
        System.out.println("| Id : " + coin.getId());
        System.out.println("| Type of currency : " + coin.getTypeOfCurrency());
        System.out.println("| Value : " + coin.getValue());
        System.out.println("");

    }

    public static void printAllPayment() {

        ArrayList<Coin> coin = new ArrayList<>();
        Coin coinEnter = new Coin();
        coin = readJson(coin);
        boolean paymentsInLibrary = true;

        if (coin.isEmpty()) {
            System.out.println("There are no Payments");
            paymentsInLibrary = false;
        }

        if (paymentsInLibrary) {
            for (int i = 0; i < coin.size(); i++) {
                coinEnter = coin.get(i);
                System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                System.out.println("| ID: " + coinEnter.getId());
                System.out.println("| Type of Currency: " + coinEnter.getTypeOfCurrency());
                System.out.println("| Value: " + coinEnter.getValue());
                System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                System.out.println("");
            }
        }
    }

    public static void changePaymentData() {

        ArrayList<Coin> coin = new ArrayList<>();
        boolean idNotFound = true;

        coin = readJson(coin);
        System.out.print("Enter the payment id to change: ");
        int match = sc.nextInt();

        for (int i = 0; i < coin.size(); i++) {

            if (match == coin.get(i).getId()) {
                changePaymentInfo(coin, i);
                idNotFound = false;
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }
    }

    private static void changePaymentInfo(ArrayList<Coin> coin, int position) {

        int optionToChange = 0;

        System.out.println("1. ID");
        System.out.println("2. Value");
        System.out.println("3. Type of Currency");
        System.out.println("What do you want change?");
        optionToChange = sc.nextInt();
        
        while(optionToChange < 1 || optionToChange > 3){
            System.out.println("Wrong option re-enter option: ");
            optionToChange = sc.nextInt();
        }
        
        if (optionToChange == 1) {
            System.out.println("Enter the new payment ID: ");
            coin.get(position).setId(sc.nextInt());
        }
        if (optionToChange == 2) {
            System.out.println("Enter the new value: ");
            coin.get(position).setValue(sc.nextFloat());
        }
        sc.nextLine();
        if (optionToChange == 3) {
            System.out.println("Enter the type of Currency: ");
            coin.get(position).setTypeOfCurrency(sc.nextLine());
        }

        editJson(coin);
        System.out.println("The payment information has been changed");

    }

    public static void editJson(ArrayList<Coin> coin) {

        File fileJson = new File("BankList.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(coin);

        try ( FileWriter writer = new FileWriter(fileJson)) {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void deletePayment() {
        
        ArrayList<Coin> coin = new ArrayList<>();
        boolean idNotFound = true;

        coin = readJson(coin);
        System.out.print("Enter the payment ID to delete: ");
        int match = sc.nextInt();

        for (int i = 0; i < coin.size(); i++) {
            if (match == coin.get(i).getId()) {
                coin.remove(i);
                editJson(coin);
                idNotFound = false;
                System.out.println("Value Deleted");
            }
        }

        if (idNotFound) {
            System.out.println("ID not found");
        }

    }
}
