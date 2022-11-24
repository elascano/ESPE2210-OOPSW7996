package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

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

    public static void main(String[] args) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("------------------Justin Villarroel----------------------");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        //datatype variable
        Scanner scan = new Scanner(System.in);
        int id;
        String name;
        int age;
        String color;
        boolean molting;

        //Chicken chicken = new Chicken();
        ArrayList<Chicken> chickens = new ArrayList();
        chickens = storeFileJason();
        int valid = 1;
        do {
            valid = menuOptions();
            switch (valid) {
                case 1: 
                        try {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.print("Enter chicken id: ");
                    id = scan.nextInt();
                    System.out.print("Enter chicken name: ");
                    name = scan.next();
                    System.out.print("Enter chicken age: ");
                    age = scan.nextInt();
                    System.out.print("Enter chicken color: ");
                    color = scan.next();
                    System.out.print("Is chicken molting?(true/false): ");
                    molting = scan.nextBoolean();
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                    chickens.add(new Chicken(id, name, color, age, molting));
                    saveData(chickens);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                }
                    break;
                case 2:

                    for (Chicken chicken : chickens) {
                        printChicken(chicken);
                        }
                    break;

                    
            
            case 3:
                
                    exit(1);
                  break;
                    
            }
        } while (valid > 0 && valid < 3);

    }
       

    private static void printChicken(Chicken chicken) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(" Chicken " + chicken.getId() + " Information");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("[*] chicken id --> " + chicken.getId());
        System.out.println("[*] chicken name --> " + chicken.getName());
        System.out.println("[*] chicken age --> " + chicken.getAge());
        System.out.println("[*] chicken color --> " + chicken.getColor());
        System.out.println("[*] chicken molting --> " + chicken.isIsMolting());
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }

    public static Integer menuOptions() {
        Integer optionMenu;

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("--------------------------MENU---------------------------");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("1. Add new Chicken");
        System.out.println("2. View all chickens");
        System.out.println("3. Exit");
        System.out.print("please select an option, write the number: ");
        Scanner scan = new Scanner(System.in);
        optionMenu = scan.nextInt();
        while (optionMenu < 1 || optionMenu > 3) {
            System.out.println("Option not validate. Please try again");
            optionMenu = scan.nextInt();
        }
        return optionMenu;
    }

    public static ArrayList<Chicken> storeFileJason() {
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
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return chickens;
    }

}
