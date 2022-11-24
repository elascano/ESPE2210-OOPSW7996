/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.FileManagement;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFamrSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listName = new ArrayList();
        int opcion = 0;
        do{
        System.out.println("*******Choose the option******");
        System.out.println("1 Create File");
        System.out.println("2 Enter Data");
        System.out.println("3 Read data");
        System.out.println("4 Delete file");
        System.out.println("5 Leave");
        
        System.out.println("Please type the option: ");
       
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1 -> {
                    System.out.println("*********File creation*********");
                    FileManagement.createFile("Chicken.json");
                }
                case 2 -> {
                    System.out.println("**********Enter Data********");
                    
                    System.out.println("Chicken id:");
                    String id = sc.next();
                    System.out.println("Chicken name:");
                    String name = sc.next();
                    System.out.println("Chicken age:");
                    String  age = sc.next();
                    System.out.println("Chicken color:");
                    String color = sc.next();
                    System.out.println("Chicken id molting:");
                    String  setIsMolting = sc.next();
                    
                    listName.add("ID: "+ id);
                    listName.add("NAME: "+ name);
                    listName.add("Age: "+ age);
                    listName.add("Color: "+color);
                    listName.add("setIsMolting: "+setIsMolting);
             
                    
                    System.out.println("\n\t\t======================\n\t\t");
                    FileManagement.writeFile("Chicken.json", color);
                    FileManagement.writeFile("Chicken.json", "\n\t\t======================\n\t\t");
                    FileManagement.writeFile("Chicken.json", "\t\t=      New Chicken    =");
                    FileManagement.writeFile("Chicken.json", "\n\t\t======================\n\t\t");
                    
                    
                    for(int i=0; i<listName.size(); i++){
                        FileManagement.writeFile("Chicken.json",listName.get(i));
                    }
                    
                    listName.remove(id);
                    listName.remove(name);
                    listName.remove(age);
                    listName.remove(color);
                    listName.remove(setIsMolting);
                }
                
                case 3 -> {
                    System.out.println("*******Read Data******");
                    FileManagement.readFile("Chicken.json");
                }
                case 4 -> {
                    System.out.println("******** Delete File *******");
                    FileManagement.deletefile("Chicken.json");
                }
                case 5 -> {
                }
        }
            
        }while(opcion!=5);
    }
    }

