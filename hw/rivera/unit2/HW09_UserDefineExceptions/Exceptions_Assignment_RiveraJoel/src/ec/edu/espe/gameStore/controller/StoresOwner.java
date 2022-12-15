package ec.edu.espe.gameStore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.gamer.model.Gamer;
import ec.edu.espe.hw09_Exceptions_GameStore.util.*;
import ec.edu.espe.hw09_Exceptions_GameStore.view.VideogameStore;
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
public class StoresOwner {

    private static final Scanner sc = new Scanner(System.in);

    public static void enterGamer(ArrayList<Gamer> gamer) throws InvalidIdException, InvalidAgeException {

        Gamer gamerEnter = new Gamer();
        System.out.println("Enter the gamer ID: ");
        gamerEnter.setId(sc.nextInt());
        try{
            if(gamerEnter.getId() < 1){
                throw new InvalidIdException(gamerEnter.getId());
            }
        } catch (InvalidIdException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            while(gamerEnter.getId() < 1){
                System.out.println("Please, Renter the Id (not number greater than 0): ");
                gamerEnter.setId(sc.nextInt());
            }
        }
        System.out.println("Enter the gamer age: ");
        gamerEnter.setAge(sc.nextInt());
        try{
            if(gamerEnter.getAge() < 15){
                throw new InvalidAgeException(gamerEnter.getAge());
            }
        } catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            while(gamerEnter.getAge() < 15){
                System.out.println("Please, Renter the Age (age must be over 15) : ");
                gamerEnter.setAge(sc.nextInt());
            }
        }
        sc.nextLine();
        System.out.println("Enter the Name: ");
        gamerEnter.setName(sc.nextLine());
        System.out.println("--------------------------------------------");
        System.out.println("Now Enter the game Information");
        System.out.println("--------------------------------------------");
        System.out.println("Enter the game ID: ");
        gamerEnter.setIdGame(sc.nextInt());
        System.out.println("Enter the game value: ");
        gamerEnter.setValue(sc.nextFloat());
        sc.nextLine();
        System.out.println("Enter the game name: ");
        gamerEnter.setGameName(sc.nextLine());
        gamer.add(gamerEnter);

    }

    public static void sendJson(ArrayList<Gamer> gamer) {

        String json = new Gson().toJson(gamer);
        try {
            FileWriter orderRecord = new FileWriter("VideogameStore.json");
            orderRecord.write(json);
            orderRecord.close();
        } catch (IOException ex) {
            Logger.getLogger(VideogameStore.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Gamer> readJson(ArrayList<Gamer> gamer) {

        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get("VideogameStore.json"));
            TypeToken<ArrayList<Gamer>> type = new TypeToken<ArrayList<Gamer>>() {
            };
            gamer = gson.fromJson(reader, type.getType());
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
        } catch (IOException ex) {
            System.out.println("File Without Data");
        }
        return gamer;

    }

    public static void findGamer() {

        ArrayList<Gamer> gamer = new ArrayList<>();
        boolean idNotFound = true;

        gamer = readJson(gamer);
        System.out.print("Enter the Gamer id: ");
        int match = sc.nextInt();

        for (int i = 0; i < gamer.size(); i++) {
            if (match == gamer.get(i).getId() && match != 0) {
                printGamerInformation(gamer.get(i));
                idNotFound = false;
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }

    }

    public static void printGamerInformation(Gamer gamer) {

        System.out.println("");
        System.out.println("| Id : " + gamer.getId());
        System.out.println("| Name of the Gamer : " + gamer.getName());
        System.out.println("| Value : " + gamer.getAge());
        System.out.println("");

    }

    public static void printAllGameStore() {

        ArrayList<Gamer> gamer = new ArrayList<>();
        Gamer gamerEnters = new Gamer();
        int printGamesOrGamers;
        gamer = readJson(gamer);
        boolean paymentsInLibrary = true;

        if (gamer.isEmpty()) {
            System.out.println("There are no Gamers");
            paymentsInLibrary = false;
        }

       if (paymentsInLibrary) {
            
            System.out.println("What do you want print?");
            System.out.println("1. Gamers");
            System.out.println("2. Games");
            System.out.println("Enter the option: ");
            printGamesOrGamers = sc.nextInt();
            
            if (printGamesOrGamers == 1) {
                for (int i = 0; i < gamer.size(); i++) {
                    gamerEnters = gamer.get(i);
                    System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                    System.out.println("| ID: " + gamerEnters.getId());
                    System.out.println("| Gamer Name: " + gamerEnters.getName());
                    System.out.println("| Gamer Age: " + gamerEnters.getAge());
                    System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                    System.out.println("");
                }
            }
            else if (printGamesOrGamers == 0){
                for (int i = 0; i < gamer.size(); i++) {
                    gamerEnters = gamer.get(i);
                    System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                    System.out.println("| ID: " + gamerEnters.getIdGame());
                    System.out.println("| Game Name: " + gamerEnters.getGameName());
                    System.out.println("| Game Value: " + gamerEnters.getValue());
                    System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                    System.out.println("");
                }
            }
        }
    }

}
