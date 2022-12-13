package ec.edu.espe.ws21.controller;

import com.google.gson.Gson;
import ec.edu.espe.ws21.model.Ws21Screen;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class FileManager {

    public static void saveJson(ArrayList<Ws21Screen> screens) {
        Gson gson = new Gson();
        String json = gson.toJson(screens);

        File file = new File("./screenInformation.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("FILE SAVED");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }
    }

    public static ArrayList<Ws21Screen> loadJson() {
        Gson gson = new Gson();

        ArrayList<Ws21Screen> screens = new ArrayList<>();
        String jsonFile = "";
        String[] jsonScreens;

        try ( Scanner scFile = new Scanner(new File("./screenInformation.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonScreens = jsonFile.split("},");

            for (int i = 0; i < jsonScreens.length; i++) {
                if (i < jsonScreens.length - 1) {
                    screens.add(gson.fromJson(jsonScreens[i] + "}", Ws21Screen.class));
                } else {
                    screens.add(gson.fromJson(jsonScreens[i], Ws21Screen.class));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FILE NOT FOUND");
        }

        return screens;
    }

    public static Ws21Screen addWs21Screen() {
        Ws21Screen newWs21Screen = new Ws21Screen();

        int id;
        String name;
        String price;

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter screen Name: ");
            name = scan.nextLine();
            System.out.print("Enter screen ID: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter screen price : ");
            price = scan.nextLine();

            newWs21Screen.setId(id);
            newWs21Screen.setName(name);
            newWs21Screen.setPrice(price);

        } catch (Exception e) {
            System.out.println("==============");
            System.out.println("INCORRECT DATA");
            System.out.println("==============");
            return null;
        }

        return newWs21Screen;
    }

    public static void deleteFile() {
        File file = new File("./screenInformation.json");
        try {
            file.delete();
            System.out.println("=======File was deleted=======");
        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
        }
    }

    public static int findWs21ScreenIndex(List<Ws21Screen> screens, int id) {
        int index = 0;

        for (Ws21Screen ws21screen : screens) {
            if (ws21screen.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void printWs21Screen(Ws21Screen ws21screen) {
        System.out.println("=====================================");
        System.out.println("screen --> id: " + ws21screen.getId());
        System.out.println("=====================================");

        if (ws21screen.getName() != null) {
            System.out.println("screen name --> " + ws21screen.getName());
            System.out.println("screen price --> " + ws21screen.getPrice());
        } else {
            System.out.println("Screen info is empty");
        }
    }
}
