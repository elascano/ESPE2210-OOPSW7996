/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Chickenfarm.view;

import ec.edu.espe.Chickenfarm.model.Chicken;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;
        System.out.println("====================");
        System.out.println("Jefferson Ulco");
        System.out.println("ChickenFarm");
        System.out.println("====================");

        while (!exit) {
            System.out.println("MENU");
            System.out.println("1.Insert the chicken");
            System.out.println("2.View the chickens");
            System.out.println("3.Inicializar  .csv");
            System.out.println("4.Exit");
            System.out.println("Write one of the options");
            try {
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        addchicken();
                        break;
                    case 2:
                        read();
                        break;
                    case 3:
                        createcsv();
                        break;
                    case 4:
                        exit = true;
                        break;

                    default:
                        System.out.println("!!ERROR!!INVALID OPTION ");
                }
            } catch (IOException e) {
                System.out.println("Uoop! Error!");
                scan.next();
            }
        }
    }

    private static void createcsv() throws IOException {
        File List = new File("ChickenList.csv");
        PrintWriter writer = new PrintWriter(new FileWriter(List, true));
        writer.println("ID;NAME;AGE;COLOR;MOLTING");
        writer.close();
    }

    private static void read() throws FileNotFoundException, IOException {
        
        FileReader chickenread = null;
        String linea;
        System.out.println("==========================");
        System.out.println("      CHICKEN DATA        ");
        System.out.println("==========================");
        File file = new File("ChickenList.csv");
        chickenread = new FileReader(file);
        BufferedReader BR = new BufferedReader(chickenread);
        while ((linea = BR.readLine()) != null) {
            System.out.println(linea);

        }
    }

    private static void addchicken() throws IOException {
        Scanner scan = new Scanner(System.in);

        Chicken chicken;

        chicken = new Chicken();
        int id;
        String name = "";
        int age;
        String color = "";
        boolean molting;

        System.out.println("====================");
        System.out.println("      CHICKEN        ");
        System.out.println("====================");

        System.out.print("~Enter the Id:");
        id = scan.nextInt();
        System.out.print("~Enter the Name:");
        name = scan.next();
        System.out.print("~Enter the Age:");
        age = scan.nextInt();
        System.out.print("~Enter the Color:");
        color = scan.next();
        System.out.print("~Enter (true or false) if the is molting:");
        molting = scan.nextBoolean();

        chicken = new Chicken(id, name, color, age, molting);

        File List = new File("ChickenList.csv");
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(List, true));
            writer.println(id + ";" + name + ";" + age + ";" + color + ";" + molting);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        System.out.println("==============================");
        System.out.println("***CHICKEN REGISTERED SUCCESSFULLY***");
        System.out.println(">Chicken id \t--> " + chicken.getId());
        System.out.println(">Chicken name \t--> " + chicken.getName());
        System.out.println(">Chicken age \t--> " + chicken.getAge());
        System.out.println(">Chicken color \t--> " + chicken.getColor());
        System.out.println(">Chicken molting --> " + chicken.isIsMolting());
        System.out.println("==============================");

    }
}
