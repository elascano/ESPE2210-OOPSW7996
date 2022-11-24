/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.Chickenfarm.model.Chicken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("    Jefferson Ulco");
        System.out.println(" CHICKEN_FARM_SIMULATOR");
        System.out.println("=======================");
        Scanner scan = new Scanner(System.in);
        ArrayList Chickenslist = new ArrayList();
        Chicken chicken = new Chicken();

        boolean exit = false;
        int opcion;
        while (!exit) {
            System.out.println("=============================");
            System.out.println("        CHICKEN MENU");
            System.out.println("=============================");
            System.out.println("1. Enter Chicken");
            System.out.println("2. Print Chickens");
            System.out.println("3. Salir");

            try {

                System.out.println("Write one of the options");
                opcion = scan.nextInt();

                switch (opcion) {
                    case 1:
                        EnterChicken(scan, Chickenslist);
                        readJson(Chickenslist);
                        break;
                    case 2: 
                        readjson();
                    break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Select a valid option!!");
                }
            } catch (Exception e) {
                System.out.println("ERROR!!");
                scan.next();
            }
        }
    }

    private static void readjson() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File("chickendata.json");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
        } finally {
        }
    }

    private static void EnterChicken(Scanner scan, ArrayList Chickenslist) {
        int id;
        String name = "";
        int age;
        String color = "";
        boolean molting;
        System.out.println("=============================");
        System.out.println("          CHICKEN ");
        System.out.println("=============================");
        System.out.print("~Enter the Id of the chicken: ");
        id = scan.nextInt();
        System.out.print("~Enter the name of the chicken:");
        name = scan.next();
        System.out.print("~Enter the Age of the chicken:");
        age = scan.nextInt();
        System.out.print("~Enter the Color of the chicken:");
        color = scan.next();
        System.out.print("~Enter (true or false) if the is molting the chicken:");
        molting = scan.nextBoolean();

        Chicken chicken = new Chicken(id, name, color, age, molting);

        Chickenslist.add(chicken);
        System.out.print("       ADD SUCCESSFUL:)\n");

    }

    private static void readJson(ArrayList Chickenslist) {
        Chicken chicken = new Chicken();
        File file = new File("chickendata.json");
        Gson gson = new Gson();

        String chickenjson = gson.toJson(Chickenslist);

        try {
            FileWriter filew = new FileWriter(file, true);
            filew.write(chickenjson);
            filew.flush();
            filew.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.toString());
        }

    }
}
