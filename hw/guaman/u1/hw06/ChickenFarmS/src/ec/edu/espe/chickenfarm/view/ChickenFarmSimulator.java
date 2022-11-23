package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Alexander Guaman");
        System.out.println("Chicken Farm Simulator");
        System.out.println("====================\n");
        //datatype variable
        Scanner scan = new Scanner(System.in);
        int id;
        String name;
        int age;
        String color;
        boolean molting;
        int optionMenu;
        //Chicken chicken = new Chicken();
        ArrayList<Chicken> chickens = new ArrayList();
        chickens = loadFileJson();
        do {
            optionMenu = menu();
            switch (optionMenu) {
                case 1 -> {
                    String addOtherChicken = null;
                    do {
                        try {
                            System.out.print("Type chicken id: ");
                            id = scan.nextInt();
                            System.out.print("Type chicken name: ");
                            name = scan.next();
                            System.out.print("Type chicken age: ");
                            age = scan.nextInt();
                            System.out.print("Type chicken color: ");
                            color = scan.next();
                            System.out.print("Type chicken molting: ");
                            molting = scan.nextBoolean();
                            chickens.add(new Chicken(id, name, color, age, molting));
                            System.out.print("Do you want to add a new chicken: (yes/no) ");
                            addOtherChicken = scan.next();
                        } catch (Exception e) {
                            System.out.println("Invalid data entered");
                        }

                    } while ("yes".equals(addOtherChicken) || "YES".equals(addOtherChicken));
                    saveData(chickens);
                }
                case 2 -> {

                    for (Chicken chicken : chickens) {
                        printChicken(chicken);
                    }
                }
                case 3 -> {
                }
                case 4 ->
                    exit(0);
            }
        } while (optionMenu > 0 && optionMenu < 3);

    }

    public static void saveData(ArrayList<Chicken> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);;
        File file = new File("./chickens.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

    private static ArrayList<Chicken> loadFileJson() {
        Gson gson = new Gson();

        ArrayList<Chicken> chickens = new ArrayList<>();
        String jsonFile = "";
        String[] jsonChickens;

        try ( Scanner scFile = new Scanner(new File("./chickens.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonChickens = jsonFile.split("},");

            for (int i = 0; i < jsonChickens.length; i++) {
                if (i < jsonChickens.length - 1) {
                    chickens.add(gson.fromJson(jsonChickens[i] + "}", Chicken.class));
                } else {
                    chickens.add(gson.fromJson(jsonChickens[i], Chicken.class));
                }
            }

            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return chickens;
    }

    public static void exit(int status) {
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("===================");
        System.out.println("           Chicken " + chicken.getId() + " Information");
        System.out.println("*****************");
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken molting \t--> " + chicken.isIsMolting());
        System.out.println("===================");
    }

    private static Integer menu() {
        Integer optionMenu;

        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("X           MENU DE OPCIONES            X");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\t 1. Add new Chicken");
        System.out.println("\t 2. View all chickens");
        System.out.println("\t 3. Exit");
        System.out.print("\t Type the option: ");
        Scanner scan = new Scanner(System.in);
        optionMenu = scan.nextInt();
        while (optionMenu < 1 || optionMenu > 3) {
            System.out.println("Option not validate\nPlease try again");
            optionMenu = scan.nextInt();
        }
        return optionMenu;
    }

}
