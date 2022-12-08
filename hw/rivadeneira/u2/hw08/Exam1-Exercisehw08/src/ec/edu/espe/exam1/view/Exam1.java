
package ec.edu.espe.exam1.view;

import com.google.gson.Gson;
import ec.edu.espe.exam1.model.Screen;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Exam1 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     ArrayList <Screen> screens = new ArrayList<Screen>(); 
     Screen screen = new Screen();
     int option;
     int position[] = new int[1];
     position[0] = 0;
     boolean exit = false;

        while (!exit) {
            System.out.println("==========Menu==========");
            System.out.println("1.Enter a screen");
            System.out.println("2.Exit");
            try {
                System.out.println("Choose an option");
                option = scan.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        dataScreen(screens, screen, position);
                        saveJsonData(screens.get(position[0]));
                        position[0]++;
                        break;
                    case 2:
                        System.out.println("JSON file created successfully");
                        System.out.println("Good bye! :)");
                        exit = true;
                        break;
                    default:
                        System.out.println("the option doesn't exist, please try again");
                        break;

                }
            } catch (InputMismatchException exepcion) {
                exepcion.printStackTrace (System.out);
                scan.next();
            }
        }
}
    
 private static void dataScreen(ArrayList <Screen> screens,Screen screen ,int position[] ){
        int id;
        String brand = "";
        int price;
        boolean equal_id;
        Scanner scan = new Scanner(System.in);
        do{
        equal_id=false;
        System.out.println("------NEW DATA------");
        System.out.print("screen id -->");
        id = scan.nextInt();
        scan.nextLine();
            for (int i = 0; i < screens.size(); i++) {
                if(screens.get(i).getId()==id){
            System.out.println("This id was already registered");
            equal_id=true;
                }
            }
        }while(equal_id == true );
        System.out.print("brand of screen -->");
        brand = scan.next();
        System.out.print("price of screen-->");
        price = scan.nextInt();
        
        screen = new Screen(id, brand, price);
        screens.add(position[0], screen);
        
        try {
            Thread.sleep(5*20*10);
            System.out.println("=============================");
        
            System.out.println("Data saved successfully!");
        
            System.out.println("=============================");
            Thread.sleep(5*20*10);
            System.out.println("");
        } catch (InterruptedException exepcion) {
            exepcion.printStackTrace (System.out);
        }
        
    }  
    
    

private static void saveJsonData(Screen screen) {
    File screenList = new File("screen.json");
    String json = new Gson().toJson(screen);
        
    try {
        PrintWriter writer = new PrintWriter(new FileWriter(screenList, true)); 
        writer.print(json);
        writer.close();
    } catch (FileNotFoundException exepcion) {
            exepcion.printStackTrace (System.out); 
    } catch (IOException exepcion) {
            exepcion.printStackTrace (System.out);
        }
    }
}
