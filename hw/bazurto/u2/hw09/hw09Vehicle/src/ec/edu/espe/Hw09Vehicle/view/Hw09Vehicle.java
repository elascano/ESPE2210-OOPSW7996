/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Hw09Vehicle.view;

import ec.edu.espe.Hw09Vehicle.controller.FileManagement;
import ec.edu.espe.Hw09Vehicle.model.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Hw09Vehicle {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        Vehicle vehicle = new  Vehicle();
        Scanner imputEscan = new Scanner(System.in);
        int[] ubicationNumber = new int[1];
        boolean exit = false;
 
        ubicationNumber[0] = 0;
        int choiceOfTheMenu=0;
        vehicleList = FileManagement.loadVehicle();
        ubicationNumber[0] = vehicleList.size();
        do{
            printMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch(choiceOfTheMenu){
                case 1:{
                    addCompatDisc(vehicleList, vehicle, ubicationNumber);
                    FileManagement.addVehicle(vehicleList);
                    ubicationNumber[0]++;
                    break;  
                }  
                case 2:{
                    FileManagement.readVehicle(vehicleList);
                    break;
                }
                case 3:{
                    FileManagement.updateVehicle(vehicleList);
                    break; 
                }
                case 4:{
                    FileManagement.deleteVehicle(vehicleList);
                    break;
                }
                        
                case 5:
                    FileManagement.addVehicle(vehicleList);
                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Wrong option");
                     break;
            }
        }while(choiceOfTheMenu!=6);
    }
      private static void printMenu(){
        System.out.println("****************************************");
        System.out.println("        Menu of The Vehicle    ");
        System.out.println("****************************************");
        System.out.println("1. Imput Vehicle");
        System.out.println("2. View Vehicle");
        System.out.println("3. Update Vehicle");
        System.out.println("4. Delete Vehicle");
        System.out.println("5. Save Vehicle");
        System.out.println("6. Exit");
        System.out.print("Choice: ");
    }
    private static void addCompatDisc(ArrayList<Vehicle> vehicleList, Vehicle vehicle, int[] ubicationNumber) {
        int id;
        String make;
        String model;
        float cc;
        Scanner imputEscan = new Scanner(System.in);
        
        System.out.print("Imput Id of Cable: ");
        id = imputEscan.nextInt();
       
        System.out.print("Imput the make Of Vehicle: ");
        make = imputEscan.next();
        
        System.out.print("Imput the Model of Vehicle: ");
        model = imputEscan.next();
        
        System.out.print("Imput the Cc of Vehicle: ");
        cc = imputEscan.nextFloat();  
        
        
        vehicle = new Vehicle( id,  make,  model,  cc);
        vehicleList.add(ubicationNumber[0], vehicle);

    }
}
