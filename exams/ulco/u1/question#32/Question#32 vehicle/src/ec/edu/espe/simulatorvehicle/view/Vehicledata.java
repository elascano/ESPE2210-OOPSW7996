/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.simulatorvehicle.view;

import com.google.gson.Gson;
import ec.edu.espe.simulatorvehicle.model.Vehicle;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Vehicledata {

    public static void main(String[] args) {
        //  ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();

        Scanner scann = new Scanner(System.in);
        boolean exit = false;
        int opcio;

        while (!exit) {
            System.out.println("================================");
            System.out.println("          jefferson ulco");
            System.out.println("===============================");
            System.out.println("1. ENTER VEHICLE");
            System.out.println("2. EXIT");
            System.out.println("write opcion");
            opcio = scann.nextInt();

            switch (opcio) {
                case 1:
                    vehicleenter(scann);
                    break;

                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("ERROR");
            }

        }

    }

    private static void vehicleenter(Scanner scann) {
        int id;
        String color;
        long Kilometres;
        System.out.println("================================");
        System.out.println("          VEHICLE");
        System.out.println("===============================");
        
        System.out.println("ENTER ID");
        id = scann.nextInt();
        System.out.println("ENTER COLOR");
        color = scann.next();
        System.out.println("ENTER KILOMETRES");
        Kilometres = scann.nextLong();
        
        Gson gson = new Gson();
        
        Vehicle vehicle = new Vehicle(id, color, Kilometres);
        
        String json = gson.toJson(vehicle);
        
        System.out.println(json);
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter("Vehicledata.json"))) {
            bw.write(json);
            System.out.println(".JSON SUCESFULL");
        } catch (IOException ex) {
            
        }
    }

}
