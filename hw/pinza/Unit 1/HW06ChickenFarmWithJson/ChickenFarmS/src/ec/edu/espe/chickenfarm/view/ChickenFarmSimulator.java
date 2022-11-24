package ec.edu.espe.chickenfarm.view;

//import static ec.edu.espe.chickenfarm.controller.FilesControl.*;
import ec.edu.espe.chickenfarm.model.Chicken;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        //2 TYPES OF DATA: PRIMITIVE DATATYPES : int, long, bool ... (Only contain one value)
        //User Defined DATA TYPES (Abstract DATA TYPES): String, System, Math, Chicken, ChickenFarm, Egg, Poop... (It has more methods)
        // You know that is an object because it has UpperCammelCase: Math.abs ...
        // You know that println, abs is a method because is followed by the parenthesis
        //declaration
        //ADT variableName
        Chicken chicken;
        ArrayList<Chicken> chickenList = new ArrayList<>();

        //WS13 GETTING INFO FROM THE KEYBOARD:
        Scanner scan = new Scanner(System.in);

        System.out.println("\t==Juan Pablo Pinza Armijos==");
        System.out.println("\t  ==HW 06 FILES WITH JSON==");
        System.out.println("\t============================");
        /*
        System.out.println("=====CASTING======");
        int numberOfWheels = 0;
        float height = 179.5F;
        System.out.println("The number of Wheels is -> " + numberOfWheels);
        System.out.println("The height is -> " + height);
        numberOfWheels = (int) height;

        System.out.println("The height casted to int is -> " + numberOfWheels);
         */
        var fileName = "chickens.json";
        var loadedFileName = "chickensLoad.json";
        int id;

        //CREATION OF AN OPTION MENU FOR THE HOMEWORK
        int chickenMenu;
        try {
            do {
                System.out.println("\n== ChickenFarm Menu ==");
                System.out.println("1) Add a chicken");
                System.out.println("2) Print actual chickens");
                System.out.println("0) Exit");
                System.out.print("Please, Choose an option: ");

                chickenMenu = scan.nextInt();

                switch (chickenMenu) {

                    case 1 -> {
                        chicken = addChicken();
                        System.out.println(chicken);
                        if (chicken != null) {
                            System.out.println(chicken);
                            chickenList.add(chicken);

                            Collections.sort(chickenList, new Comparator<Chicken>() {
                                @Override
                                public int compare(Chicken ch1, Chicken ch2) {
                                    return Integer.valueOf(ch1.getId()).compareTo(ch2.getId());
                                }
                            });
                            System.out.println(chicken);
                            System.out.println("\nThe Chicken was successfully added :)");
                            writeJsonFile(chickenList, fileName);
                        }
                    }
                    case 2 ->
                        readFile(fileName);
                    case 0 ->
                        System.out.println("\n =SEE YOU NEXT TIME!= \n");
                    default ->
                        System.out.println("\n The option selected isn't available \n");
                }
            } while (chickenMenu != 0);

        } catch (Exception exception) {
            exception.printStackTrace(System.out);
            System.out.println("\tSomething with the data went wrong... Try Again :(");
        }

    }

    static Chicken addChicken() {
        Scanner scan = new Scanner(System.in);
        var fileName = "chickens.json";

        Chicken newChicken = new Chicken();

        int id;
        String name = new String("");
        int age;
        String color = new String("");
        String readMolting = new String("");
        boolean molting = false;

        try {
            System.out.print("..:: Enter chicken id: ");
            id = scan.nextInt();
            System.out.print("..:: Enter chicken name: ");
            name = scan.next();
            System.out.print("..:: Enter chicken color: ");
            color = scan.next();
            System.out.print("..:: Enter chicken age: ");
            age = scan.nextInt();
            System.out.print("..:: Enter chicken molting (yes/no): ");
            readMolting = scan.next();
            if ("yes".equals(readMolting.toLowerCase())) {
                molting = true;
            } else if ("no".equals(readMolting.toLowerCase())) {
                molting = false;
            }
            newChicken = new Chicken(id, name, color, age, molting);

            printChicken(newChicken);

        } catch (Exception e) {
            System.out.println("An exception has occurred since the data type is incorrect");
            return null;
        }
        return newChicken;
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("  ==Chicken== " + chicken.getId() + " Information");
        System.out.println("chicken id -> " + chicken.getId());
        System.out.println("chicken name -> " + chicken.getName());
        System.out.println("chicken color -> " + chicken.getColor());
        System.out.println("chicken age -> " + chicken.getAge());
        System.out.println("chicken molting -> " + chicken.isIsMolting());
    }

    public static void writeJsonFile(ArrayList<Chicken> chickens, String fileName) throws IOException {
        File file = new File(fileName);
        file.delete();

        File fileOverwritten = new File(fileName);

        Gson gson = new Gson();
        String dataJson = gson.toJson(chickens);

        try {
            FileWriter output = new FileWriter(fileOverwritten);
            output.write(dataJson);

            output.close();
            System.out.println("\n\t The File was successfully saved!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void printLine(String[] data) {
        for (String fact : data) {
            if ("true".equals(fact)) {
                fact = "Yes";
            } else if ("false".equals(fact)) {
                fact = "No";
            }
            System.out.print(fact + "\t|");
        }
        System.out.println();
    }

    private static String contructionOfLines(String line) {
        line = line.replace("[{", "");
        line = line.replace("}]", "");
        line = line.replace("},{", "\n");
        line = line.replace("\"id\":", "");
        line = line.replace("\"Name\":", "");
        line = line.replace("\"Color\":", "");
        line = line.replace("\"Age\":", "");
        line = line.replace("\"isMolting?\":", "");
        line = line.replace("\"", "");
        return line;
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);

        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();

            System.out.println("Id\n|Name\n|Colot\n|Age\n|isMolting?\n|");

            while (line != null) {
                line = contructionOfLines(line);
                data = line.split(",");
                printLine(data);
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

}

//Ya que está encapsulado debemos tener otros medios para acceder.
