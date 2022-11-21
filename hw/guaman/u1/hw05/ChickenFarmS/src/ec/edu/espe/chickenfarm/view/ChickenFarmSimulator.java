package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("\t====================");
        System.out.println("\tAlexander Guaman");
        System.out.println("\tSetters and getters");
        System.out.println("\t====================");
        //datatype variable
        int numberOfFeathers;
        int id;
        String name = new String("");
        int age;
        String color = new String("");
        boolean molting;
        //Declaration
        //ADT vaiableName
        Chicken chicken;
        scanDataChicken();

        numberOfFeathers = 5;
        System.out.println("The number of feathers is --> " + numberOfFeathers);

        chicken = new Chicken();
        System.out.println("Chicken is of class --> " + chicken.getClass().getSimpleName());
        System.out.println("Chicken --> " + chicken);
        //Printnig whithout data
        printChicken(chicken);

        //Using setters
        chicken.setId(1);
        chicken.setName("Maruja");
        chicken.setAge(5);
        chicken.setColor("Brown");
        chicken.setIsMolting(true);

        printChicken(chicken);
        //Using data from Keyboard
        Scanner scan = new Scanner(System.in);

        System.out.print("Type chicken id: ");
        id = scan.nextInt();
        id = validateInt(id);
        System.out.print("Type chicken name: ");
        name = scan.next();
        name = validateString(name);
        System.out.print("Type chicken age: ");
        age = scan.nextInt();
        age = validateInt(age);
        System.out.print("Type chicken color: ");
        color = scan.next();
        color = validateString(color);
        System.out.print("Type chicken molting: ");
        molting = scan.nextBoolean();

        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(molting);

        printChicken(chicken);
        saveChicken(chicken);
        //Using constructors
        chicken = new Chicken(3, "Lolita", "Black", 7, true);

        printChicken(chicken);
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

    private static void saveChicken(Chicken chicken) {
        File f = new File("./students.csv");
        try ( FileWriter fw = new FileWriter(f);) {
            fw.write(chicken.toCSV() + "\n");
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        }
    }

    private static void scanDataChicken() {
        Chicken chicken;
        String[] data;
        try ( Scanner scFile = new Scanner(new File("./students.csv"))) {
            while (scFile.hasNextLine()) {
                data = scFile.nextLine().split(",");
                chicken = new Chicken(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), Boolean.parseBoolean(data[4]));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static int validateInt(int ChickenId) {
        Scanner scan = new Scanner(System.in);
        while (ChickenId == 0) {
            System.out.print("dato no valido, vuelva a intentarlo:");
            ChickenId = scan.nextInt();
        }
        return ChickenId;
    }

    private static String validateString(String ChickenName) {
        Scanner scan = new Scanner(System.in);
        while (ChickenName.equals("")) {
            System.out.print("dato no valido, vuelva a intentarlo: ");
            ChickenName = scan.nextLine();
        }
        return ChickenName;
    }

}
