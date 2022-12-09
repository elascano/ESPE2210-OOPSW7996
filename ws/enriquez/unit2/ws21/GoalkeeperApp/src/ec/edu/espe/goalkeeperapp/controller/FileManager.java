package ec.edu.espe.goalkeeperapp.controller;

import com.google.gson.Gson;
import ec.edu.espe.goalkeeperapp.model.Goalkeeper;
import ec.edu.espe.goalkeeperapp.view.GoalkeeperAppS;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class FileManager {

    public static void saveData(ArrayList<Goalkeeper> goalkeepers) {
        Gson gson = new Gson();
        String json = gson.toJson(goalkeepers);
        File file = new File("./goalkeepers.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

    public static ArrayList<Goalkeeper> loadData() {
        Gson gson = new Gson();

        ArrayList<Goalkeeper> goalkeepers = new ArrayList<>();
        String jsonFile = "";
        String[] jsonGoalkeepers;

        try ( Scanner scFile = new Scanner(new File("./goalkeepers.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonGoalkeepers = jsonFile.split("},");

            for (int i = 0; i < jsonGoalkeepers.length; i++) {
                if (i < jsonGoalkeepers.length - 1) {
                    goalkeepers.add(gson.fromJson(jsonGoalkeepers[i] + "}", Goalkeeper.class));
                } else {
                    goalkeepers.add(gson.fromJson(jsonGoalkeepers[i], Goalkeeper.class));
                }
            }

            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return goalkeepers;
    }

    public static void removeGoalkeeper(ArrayList<Goalkeeper> goalkeepers) {

        int goalkeeperNumber;
        System.out.println("Which goalkeeper do you want to remove?: ");
        goalkeeperNumber = GoalkeeperAppS.askOption() - 1;
        try {
            goalkeepers.remove(goalkeeperNumber);
            System.out.println("The goalkeeper was remove successfully");
            FileManager.saveData(goalkeepers);
        } catch (Exception e) {
            System.out.println("The goalkeeper was not remove");
        }
    }

    public static void addNewGoalkeeper(ArrayList<Goalkeeper> goalkeepers) {
        String id;
        String name;
        float height;
        Scanner scan = new Scanner(System.in);
        String addOtherGoalkeeper = "";
        do {
            try {

                System.out.println("\n\tNEW GOALKEEPER");
                System.out.print("Type goalkeeper id: ");
                id = scan.nextLine();
                System.out.print("Type goalkeeper name: ");
                name = scan.nextLine();
                System.out.print("Type goalkeeper height: ");
                height = scan.nextFloat();
                goalkeepers.add(new Goalkeeper(id, name, height));

                System.out.print("Do you want to add a new goalkeeper: (y/n) ");
                addOtherGoalkeeper = scan.next();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid data entered");
            }

        } while ("y".equals(addOtherGoalkeeper.toLowerCase()));
        FileManager.saveData(goalkeepers);
    }

    public static void showGoalkeeper(ArrayList<Goalkeeper> goalkeepers) {
        for (int goalkeeperNumber = 0; goalkeeperNumber < goalkeepers.size(); goalkeeperNumber++) {
            System.out.println((goalkeeperNumber + 1) + ". " + goalkeepers.get(goalkeeperNumber));
        }

    }

    public static void findGoalkeeper(ArrayList<Goalkeeper> goalkeepers) {
        Scanner scan = new Scanner(System.in);
        String goalkeeperToFind;
        boolean exists = false;
        System.out.print("Type the goalkeeper's id to find: ");
        goalkeeperToFind = scan.nextLine();

        try {
            int goalkeeperNumber = 0;
            while (exists == false) {
                exists = goalkeepers.get(goalkeeperNumber).getId().contains(goalkeeperToFind);
                goalkeeperNumber++;
            }
            if (exists) {
                System.out.println("The goalkeeper's id " + goalkeeperToFind + " exists in the list ");
                for (int numberGoalkeeper = 0; numberGoalkeeper < goalkeepers.size(); numberGoalkeeper++) {
                    if (goalkeeperToFind.equals(goalkeepers.get(numberGoalkeeper).getId())) {
                        System.out.println("\n\tGoalkeeper Info");
                        System.out.println("Id: " + goalkeepers.get(numberGoalkeeper).getId());
                        System.out.println("Name: " + goalkeepers.get(numberGoalkeeper).getName());
                        System.out.println("Height: " + goalkeepers.get(numberGoalkeeper).getHeight());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("The goalkeeper's id " + goalkeeperToFind + " not exists in the list ");
        }

    }

    public static void updateGoalkeeper(ArrayList<Goalkeeper> goalkeepers) {
        Scanner scan = new Scanner(System.in);
        int goalkeeperNumber;
        String goalkeeperIdModify;
        String goalkeeperNameModify;
        float goalkeeperHeightModify;

        System.out.println("Which goalkeeper do you want to update?: ");
        goalkeeperNumber = GoalkeeperAppS.askOption() - 1;

        if (goalkeepers.size() > goalkeeperNumber) {
            int option = 0;
            while (option != 4) {
                System.out.println("What attribute do you want to update?");
                System.out.println("1. Id");
                System.out.println("2. Name");
                System.out.println("3. Height");
                System.out.println("4. Return");

                option = GoalkeeperAppS.askOption();

                switch (option) {
                    case 1 -> {
                        System.out.print("type the new Id: ");
                        goalkeeperIdModify = scan.nextLine();
                        try {
                            goalkeepers.get(goalkeeperNumber).setId(goalkeeperIdModify);
                            System.out.println("The goalkeeper was update successfully");
                            FileManager.saveData(goalkeepers);
                        } catch (Exception e) {
                            System.out.println("The goalkeeper was not update");
                        }
                    }

                    case 2 -> {
                        System.out.print("type the new Name: ");
                        goalkeeperNameModify = scan.nextLine();
                        try {
                            goalkeepers.get(goalkeeperNumber).setName(goalkeeperNameModify);
                            System.out.println("The goalkeeper was update successfully");
                            FileManager.saveData(goalkeepers);
                        } catch (Exception e) {
                            System.out.println("The goalkeeper was not update");
                        }
                    }

                    case 3 -> {
                        System.out.print("type the new Height: ");
                        goalkeeperHeightModify = scan.nextFloat();
                        try {
                            goalkeepers.get(goalkeeperNumber).setHeight(goalkeeperHeightModify);
                            System.out.println("The goalkeeper was update successfully");
                            FileManager.saveData(goalkeepers);
                        } catch (Exception e) {
                            System.out.println("The goalkeeper was not update");
                        }
                    }

                    case 4 ->
                        System.out.println("Operation canceled...");

                    default ->
                        System.out.println("Error: Invalid option try again.");
                }

            }
        }else{
            System.out.println("ERROR : the goalkeeper you wanted to modify could not be found.");
        }

    }
}
