package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class saveChickenRegister {

    public static void main(String[] args) {

        Boolean exit = false;
        int option;
        int registrationOfIncomingChickens = 0;
        Chicken listReader;
        Chicken chicken = new Chicken();
        int position = 0;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Chicken> chickenEntered = new ArrayList<>();
        int chickens = 0;
        chickenEntered.ensureCapacity(100);

        while (!exit) {
            showMainMenu(registrationOfIncomingChickens);

            try {
                System.out.println("Enter the option:");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        int addChickens = 1;
                        while (addChickens == 1) {

                            chickenIncome(chickenEntered, registrationOfIncomingChickens);
                            System.out.println("=======================================================");
                            System.out.println("Would you like to enter another chicken? \n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                            addChickens = scanner.nextInt();
                            System.out.println("=======================================================");
                            registrationOfIncomingChickens++;
                        }

                    }
                    case 2 -> {

                        int search, confirmation = 1;
                        boolean validationId = true;
                        while (confirmation == 1) {
                            if (registrationOfIncomingChickens != 0) {
                                while (confirmation == 1) {
                                    System.out.println("=======================================================");
                                    System.out.println("--------List of incoming chickens:---------");

                                    for (int i = 0; i < registrationOfIncomingChickens; i++) {
                                        chickens = chickenEntered.get(i).getId();
                                        System.out.println("-chicken " + chickens);
                                    }

                                    System.out.println("Enter the chicken you want to display:");
                                    search = scanner.nextInt();

                                    for (int i = 0; i < chickenEntered.size(); i++) {
                                        if (search == chickenEntered.get(i).getId()) {
                                            System.out.println("One result was found");
                                            System.out.println("Chicken " + search);

                                            printChicken(chickenEntered.get(i), registrationOfIncomingChickens);
                                            validationId = false;
                                            confirmation = 2;

                                        }

                                    }
                                    if (validationId) {
                                        System.out.println("\n");
                                        System.out.println("=======================================================");
                                        System.out.println("Not registered");
                                        System.out.println("Would you like to try again?\n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                                        confirmation = scanner.nextInt();
                                        System.out.println("============================================================");

                                    }
                                }
                            } else {
                                System.out.println("No chickens have been registered yet");

                            }
                            System.out.println("========================================================================================");
                            System.out.println("Do you want to return to the main menu?\nEnter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                            confirmation = scanner.nextInt();
                            System.out.println("=======================================================================================");
                            if (confirmation == 1) {
                                confirmation = 0;
                            } else {
                                confirmation = 1;
                            }
                        }

                    }
                    case 3 -> {
                        int search, confirmation = 1;
                        boolean validationId = true;

                        if (registrationOfIncomingChickens != 0) {
                            while (confirmation == 1) {
                                System.out.println("=======================================================");
                                System.out.println("--------List of incoming chickens:---------");

                                for (int i = 0; i < chickenEntered.size(); i++) {

                                    printChickenAll(chickenEntered.get(i), position);
                                    position++;
                                }
                                validationId = false;
                                confirmation = 2;

                            }
                            if (validationId) {
                                System.out.println("=======================================================");
                                System.out.println("Not registered");
                                System.out.println("Would you like to try again?\n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                                confirmation = scanner.nextInt();
                                System.out.println("============================================================");

                            }

                        } else {
                            System.out.println("No chickens have been registered yet");

                        }
                    }
                    case 4 ->
                        exit = true;
                    default ->
                        System.out.println("The options are from 1 to 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You only have to enter numbers");
                scanner.next();

            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
        System.out.println("_______End of menu_________");

    }

    private static void showMainMenu(int registrationOfIncomingChickens) {
        System.out.println("=================================================================");
        System.out.println("--------------Chicken Farm Registration System----------");
        if (registrationOfIncomingChickens == 0) {
            System.out.println("Alex Trejo");
            System.out.println("Hw06 DataInJSONFile");
        }
        System.out.println(" ________________________Menu_______________________");
        System.out.println("1.Register chicken");
        System.out.println("2.See chicken register");
        System.out.println("3.Show complete list of chickens");
        System.out.println("4.Log out");
    }

    private static void chickenIncome(ArrayList<Chicken> chickenEntered, int registrationOfIncomingChickens) {
        System.out.println("--------Chicken Farm Registration System-------");
        System.out.println("--------Chicken " + (registrationOfIncomingChickens + 1) + "---------- ");

        saveChickenRegister(chickenEntered);
        Scanner scanner = new Scanner(System.in);
        Chicken chicken = new Chicken();
        System.out.print("Enter the chicken id:\t\t");
        chicken.setId(scanner.nextInt());
        System.out.print("Enter the name of the chicken:\t");
        chicken.setName(scanner.next());
        System.out.print("Enter the age of the chicken:\t");
        chicken.setAge(scanner.nextInt());
        System.out.print("Enter the color of the chicken:\t");
        chicken.setColor(scanner.next());
        System.out.print("Is molting(true/false):\t\t");
        chicken.setIsMolting(scanner.nextBoolean());

        chickenEntered.add(chicken);
    }

    private static void printChicken(Chicken chickenEntered, int registrationOfIncomingChickens) {
        System.out.println("==========================================================================================");
        System.out.println("ID                 Name               Age                   Color             IsMolting");

        System.out.printf("%2d             %5s             %5d                   %5s                 %5s\n", chickenEntered.getId(), chickenEntered.getName(), chickenEntered.getAge(), chickenEntered.getColor(), chickenEntered.isIsMolting());

    }

    private static void printChickenAll(Chicken chickenEntered, int position) {
        if (position == 0) {
            System.out.println("==========================================================================================");
            System.out.println("ID                 Name               Age                   Color             IsMolting");
        }
        System.out.printf("%2d             %5s             %5d                   %5s                 %5s\n", chickenEntered.getId(), chickenEntered.getName(), chickenEntered.getAge(), chickenEntered.getColor(), chickenEntered.isIsMolting());

    }

    private static void readFile(ArrayList<Chicken> chickens) throws org.json.simple.parser.ParseException {

        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(new FileReader("chicken.json"));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray chickensArray = (JSONArray) jsonObject.get("list");

            for (int i = 0; i < chickensArray.size(); i++) {
                Chicken chicken = new Chicken();
                Object objectChicken = chickensArray.get(i);
                JSONObject objectChickenJSON = (JSONObject) objectChicken;

                chicken.setName(objectChickenJSON.get("name").toString());
                chicken.setAge(Integer.parseInt(objectChickenJSON.get("age").toString()));
                chicken.setId(Integer.parseInt(objectChickenJSON.get("id").toString()));
                chicken.setColor(objectChickenJSON.get("color").toString());
                chicken.setIsMolting(Boolean.parseBoolean(objectChickenJSON.get("isMolting").toString()));

                chickens.add(chicken);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error reading file (FNF): " + ex);
        } catch (IOException ex) {
            System.out.println("Error reading file (IOE): " + ex);
        }

    }

    private static void saveChickenRegister(ArrayList<Chicken> chickenEntered) {
        File fileJson = new File("chicken.json");

        if (!chickenEntered.isEmpty()) {
            try {
                readFile(chickenEntered);
                JSONObject chickensJSON = new JSONObject();
                JSONArray list = new JSONArray();

                for (int i = 0; i < chickenEntered.size(); i++) {
                    JSONObject chickenJSON = new JSONObject();

                    chickenJSON.put("id", chickenEntered.get(i).getId());
                    chickenJSON.put("name", chickenEntered.get(i).getName());
                    chickenJSON.put("age", chickenEntered.get(i).getAge());
                    chickenJSON.put("color", chickenEntered.get(i).getColor());
                    chickenJSON.put("isMolting", chickenEntered.get(i).isIsMolting());

                    list.add(chickenJSON);

                }

                chickensJSON.put("list", list);

                try ( FileWriter file = new FileWriter(fileJson)) {
                    file.write(chickensJSON.toString());
                    file.flush();
                } catch (IOException e) {
                    System.out.println("Error writing file");
                }

            } catch (org.json.simple.parser.ParseException ex) {
                Logger.getLogger(saveChickenRegister.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
