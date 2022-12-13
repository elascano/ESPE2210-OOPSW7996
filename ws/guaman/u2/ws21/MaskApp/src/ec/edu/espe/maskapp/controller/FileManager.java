package ec.edu.espe.maskapp.controller;

import com.google.gson.Gson;
import ec.edu.espe.maskapp.model.Mask;
import ec.edu.espe.maskapp.view.MaskAppS;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class FileManager {
    
    public static void saveData(ArrayList<Mask> masks) {
        Gson gson = new Gson();
        String json = gson.toJson(masks);
        File file = new File("./masks.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

    public static ArrayList<Mask> loadData() {
        Gson gson = new Gson();

        ArrayList<Mask> masks = new ArrayList<>();
        String jsonFile = "";
        String[] jsonGoalkeepers;

        try ( Scanner scFile = new Scanner(new File("./masks.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonGoalkeepers = jsonFile.split("},");

            for (int i = 0; i < jsonGoalkeepers.length; i++) {
                if (i < jsonGoalkeepers.length - 1) {
                    masks.add(gson.fromJson(jsonGoalkeepers[i] + "}", Mask.class));
                } else {
                    masks.add(gson.fromJson(jsonGoalkeepers[i], Mask.class));
                }
            }

            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return masks;
    }

    public static void removeMask(ArrayList<Mask> goalkeepers) {

        int goalkeeperNumber;
        System.out.println("Which goalkeeper do you want to remove?: ");
        goalkeeperNumber = MaskAppS.askOption() - 1;
        try {
            goalkeepers.remove(goalkeeperNumber);
            System.out.println("The goalkeeper was remove successfully");
            FileManager.saveData(goalkeepers);
        } catch (Exception e) {
            System.out.println("The goalkeeper was not remove");
        }
    }

    public static void addNewMask(ArrayList<Mask> goalkeepers) {
        String id;
        String color;
        String kind;
        
        Scanner scan = new Scanner(System.in);
        String addOtherMask = "";
        do {
            try {

                System.out.println("\n\tNEW GOALKEEPER");
                System.out.print("Type mask id: ");
                id = scan.nextLine();
                System.out.print("Type maks color: ");
                color = scan.nextLine();
                System.out.print("Type mask kind: ");
                kind = scan.nextLine();
                goalkeepers.add(new Mask(id, color, kind));

                System.out.print("Do you want to add a new goalkeeper: (y/n) ");
                addOtherMask = scan.next();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid data entered");
            }

        } while ("y".equals(addOtherMask.toLowerCase()));
        FileManager.saveData(goalkeepers);
    }

    public static void showMask(ArrayList<Mask> masks) {
        for (int maskNumber = 0; maskNumber < masks.size(); maskNumber++) {
            System.out.println((maskNumber + 1) + ". " + masks.get(maskNumber));
        }

    }

    public static void findMask(ArrayList<Mask> masks) {
        Scanner scan = new Scanner(System.in);
        String maskToFind;
        boolean exists = false;
        System.out.print("Type the mask's id to find: ");
        maskToFind = scan.nextLine();

        try {
            int maskNumber = 0;
            while (exists == false) {
                exists = masks.get(maskNumber).getId().contains(maskToFind);
                maskNumber++;
            }
            if (exists) {
                System.out.println("The masks's id " + maskToFind + " exists in the list ");
                for (int numberGoalkeeper = 0; numberGoalkeeper < masks.size(); numberGoalkeeper++) {
                    if (maskToFind.equals(masks.get(numberGoalkeeper).getId())) {
                        System.out.println("\n\tMask Info");
                        System.out.println("Id: " + masks.get(numberGoalkeeper).getId());
                        System.out.println("Color: " + masks.get(numberGoalkeeper).getColor());
                        System.out.println("Kind: " + masks.get(numberGoalkeeper).getKind());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("The mask's id " + maskToFind + " not exists in the list ");
        }

    }

    public static void updateMask(ArrayList<Mask> masks) {
        Scanner scan = new Scanner(System.in);
        int maskNumber;
        String maskIdModify;
        String maskNameModify;
        String maskKindModify;

        System.out.println("Which mask do you want to update?: ");
        maskNumber = MaskAppS.askOption() - 1;

        if (masks.size() > maskNumber) {
            int option = 0;
            while (option != 4) {
                System.out.println("What attribute do you want to update?");
                System.out.println("1. Id");
                System.out.println("2. Color");
                System.out.println("3. Kind");
                System.out.println("4. Return");

                option = MaskAppS.askOption();

                switch (option) {
                    case 1 -> {
                        System.out.print("type the new Id: ");
                        maskIdModify = scan.nextLine();
                        try {
                            masks.get(maskNumber).setId(maskIdModify);
                            System.out.println("The mask was update successfully");
                            FileManager.saveData(masks);
                        } catch (Exception e) {
                            System.out.println("The mask was not update");
                        }
                    }

                    case 2 -> {
                        System.out.print("type the new Color: ");
                        maskNameModify = scan.nextLine();
                        try {
                            masks.get(maskNumber).setColor(maskNameModify);
                            System.out.println("The mask was update successfully");
                            FileManager.saveData(masks);
                        } catch (Exception e) {
                            System.out.println("The mask was not update");
                        }
                    }

                    case 3 -> {
                        System.out.print("type the new Kind: ");
                        maskKindModify = scan.nextLine();
                        try {
                            masks.get(maskNumber).setKind(maskKindModify);
                            System.out.println("The mask was update successfully");
                            FileManager.saveData(masks);
                        } catch (Exception e) {
                            System.out.println("The mask was not update");
                        }
                    }

                    case 4 ->
                        System.out.println("Operation canceled...");

                    default ->
                        System.out.println("Error: Invalid option try again.");
                }

            }
        }else{
            System.out.println("ERROR : the mask you wanted to modify could not be found.");
        }

    }
}
