package ec.edu.espe.SportClub.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import ec.edu.espe.SportClub.model.Stadium;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FileManager {

    private static Scanner input = new Scanner(System.in);

    public static void addStadiumsToJson(ArrayList<Stadium> stadiums) {
        File stadiumListFile = new File("stadiumList.json");

        Gson gson = new Gson();

        JsonArray stadiumJsArray = new JsonArray();
        for (int i = 0; i < stadiums.size(); i++) {
            stadiumJsArray.add(gson.toJsonTree(stadiums.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(stadiumListFile, false));
            writer.print(stadiumJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<Stadium> readStadiumsFromJsonFile() {
        ArrayList<Stadium> stadiums = new ArrayList<Stadium>();
        Gson gson = new Gson();
        JsonArray stadiumsJsArray = new JsonArray();
        File stadiumListJson = new File("stadiumList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(stadiumListJson));
            String lineOfTheFile = "";
            String json = "";
            while ((lineOfTheFile = reader.readLine()) != null) {
                json += lineOfTheFile;
            }

            stadiumsJsArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < stadiumsJsArray.size(); i++) {
                stadiums.add(i, gson.fromJson(stadiumsJsArray.get(i), Stadium.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return stadiums;
    }

    public static void printAllStadiums(ArrayList<Stadium> stadiums) {
        if (stadiums.size() != 0) {
            System.out.println("=========Stadiums==========");
            for (int i = 0; i < stadiums.size(); i++) {

                printStadium(stadiums.get(i));
            }
        } else {
            System.out.println("No stadiums entered yet");
        }
    }

    public static int findStadium(ArrayList<Stadium> stadiums) {
        int id;
        int idCoincidence = -1;
        if (stadiums.size() != 0) {
            System.out.println("What is the ID number of the stadium?");
            id = input.nextInt();
            for (int i = 0; i < stadiums.size(); i++) {
                if (stadiums.get(i).getId() == id) {
                    idCoincidence = i;
                }
            }
            if (idCoincidence == -1) {
                System.out.println("Stadium not found");
            }
        } else {
            System.out.println("No stadiums entered yet");
        }
        return idCoincidence;
    }

    public static void updateStadium(ArrayList<Stadium> stadiums) {
        int idCoincidence;
        Boolean exit = false;
        idCoincidence = findStadium(stadiums);
        if (idCoincidence != -1) {
            do {
                System.out.println("******Uptade Menu******");
                System.out.println("1.Id");
                System.out.println("2.Width");
                System.out.println("3.Lenght");
                System.out.println("4.Back <---");
                System.out.println("What do you want to change?");
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("What is the new Id?");
                        stadiums.get(idCoincidence).setId(input.nextInt());
                        input.nextLine();
                        break;
                    case 2:
                        System.out.println("What is the new Width?");
                        stadiums.get(idCoincidence).setWidth(input.nextFloat());
                        input.nextLine();
                        break;
                    case 3:
                         System.out.println("What is the new Lenght?");
                         stadiums.get(idCoincidence).setLenght(input.nextFloat());
                         input.nextLine();
                        break;
                    case 4:
                        exit = true;
                        break;

                }

            } while (!exit);
        }
    }

    public static void printStadium(Stadium stadium) {
        System.out.println(stadium);
    }

    public static void deleteStadium(ArrayList<Stadium> stadiums) {
        int idCoincidence = findStadium(stadiums);
        int option; 
                if(idCoincidence!=-1){
                    System.out.println("Are you sure to remove this stadium?");
                    System.out.println("1.Yes , 2.No");
                    option = input.nextInt();
                    if(option!=2){
                        stadiums.remove(idCoincidence);
                        System.out.println("The stadium has been successfully removed");
                    }
                }
    }

}
