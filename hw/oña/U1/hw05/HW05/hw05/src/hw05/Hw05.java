/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw05;
import ec.edu.espe.File.FileManagement;
import java.util.Scanner;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Hw05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion =0;
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
                case 1:
                    System.out.println("*********File creation*********");
                    FileManagement.createFile("Chicken.txt");
                    break;
                case 2:
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
                    
                    
                    FileManagement.writeFile("Chicken.txt","ID "+ id);
                    FileManagement.writeFile("Chicken.txt", "Name: "+name);
                    FileManagement.writeFile("Chicken.txt", "Age: "+age);
                    FileManagement.writeFile("Chicken.txt", "Color: "+color);
                    FileManagement.writeFile("Chicken.txt", "setIsMolting: "+setIsMolting);
                    FileManagement.writeFile("Chicken.txt", "******************************************");
                    break;
                case 3:
                    System.out.println("*******Read Data******");
                    FileManagement.readFile("Chicken.txt");
                    break;
                case 4:
                    System.out.println("******** Delete File *******");
                    FileManagement.deletefile("Chicken.txt");
                    break;
                case 5:
                    break;
        }
            
        }while(opcion!=5);
    }
    
}
