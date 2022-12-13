package ec.edu.espe.restaurant.view;

import ec.edu.espe.restaurant.model.Menu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class appRestaurant {
    
    public static void main(String[] args) throws IOException {
        Menu menu;
        menu = new Menu();
        
        Scanner scanner = new Scanner(System.in);
          
        int option;
        int option1;
        
        createFile("Restaurant.csv");
        System.out.println("=============================");
        System.out.println("|       W E L C O M E       |");
        System.out.println("| Please, Login to continue |");
        System.out.println("=============================\n");
        userAndPasswordValidate();
        showMenu();            
        option = scanner.nextInt(); 
        writeFile("Restaurant.csv","===== ORDER =====");
        switch(option){
                case 1:
                    System.out.println("You select =>  Lasagna");
                    System.out.println("Do you want to order something else? ( yes (1) / no (2) )");
                    option1 = scanner.nextInt(); 
                    if (option1 > 6 ){
                        throw new IOException("Type only number from 1 to 6");
                        
                    }
                    if (option1 == 2 ){
                        System.out.println("NO");
                    }                    
                break;
                
                case 2:
                    System.out.println("You select =>  Milanesa");
                    System.out.println("Do you want to order something else? ( yes (1) / no (2) )");
                    option1 = scanner.nextInt();
                    if (option1 == 1 ){
                        System.out.println("YES");

                    }
                    if (option1 == 2 ){
                        System.out.println("NO");
                    }
                break;
                
                case 3:
                   System.out.println("You select =>  Rabioles");
                   System.out.println("Do you want to order something else? ( yes (1) / no (2) )");
                   option1 = scanner.nextInt();
                   if (option1 == 1 ){
                        System.out.println("YES");

                    }
                    if (option1 == 2 ){
                        System.out.println("NO");
                    }
                break;
                
                case 4:
                   System.out.println("You select =>  Tortellini");
                   System.out.println("Do you want to order something else? ( yes (1) / no (2) )");
                   option1 = scanner.nextInt();
                   if (option1 == 1 ){
                        System.out.println("YES");

                    }
                    if (option1 == 2 ){
                        System.out.println("NO");
                    }
                break;
                
                case 5:
                    System.out.println("You select =>  Pizza");
                    System.out.println("Do you want to order something else? ( yes (1) / no (2) )");
                    option1 = scanner.nextInt();
                    if (option1 == 1 ){
                        System.out.println("YES");

                    }
                    if (option1 == 2 ){
                        System.out.println("NO");
                    }
                break;
                
                case 6:
                    System.out.println("You select =>  Panini");
                    System.out.println("Do you want to order something else? ( yes (1) / no (2) ) ");
                    option1 = scanner.nextInt();
                    if (option1 == 1 ){
                        System.out.println("YES");

                    }
                    if (option1 == 2 ){
                        System.out.println("NO");
                    }
                break;
                
                case 7:
                    throw new IOException("Type only number from 1 to 6");
                
        }   
}

    public static void showMenu() {
        
        System.out.println("============== MENU ================");
        System.out.println("|  Select the food you want:       |" );
        System.out.println("|    1. Lasagna    $6.00           |");
        System.out.println("|    2. Milanesa   $2.00           |");
        System.out.println("|    3. Rabioles   $7.00           |");
        System.out.println("|      (Parmesan, spinach)         |");
        System.out.println("|    4. Tortellini $7.00           |");
        System.out.println("|      (Mozarrella, alfredo sauce) |");
        System.out.println("|    5. Pizza      $6.00           |");
        System.out.println("|    6. Panini     $6.00           |");
        System.out.println("====================================");
    }
        
    public static void userAndPasswordValidate() throws IOException {
       
        Scanner scanner = new Scanner(System.in);        
        String userName1;
        String password1;
        String userName = "ElkinPabon";
        String password = "POO7996";
          
        System.out.println("-Type the username: ");
        userName1 = scanner.nextLine();
        System.out.println("-Type the password: ");
        password1 = scanner.nextLine();
        
        if (userName1.equals(userName)&& password1.equals(password)){
            System.out.println("|  Welcome to the System |");  
        } while(password1.equals(password)==false){
            throw new IOException("ERROR, INCORRECT DATA");

            }         
        }   
      
    public static void createFile(String fileName) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(archive);
            exit.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }      
    } 

public static void writeFile(String fileName , String contents) throws IOException {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(new FileWriter(archive, true));
            exit.println(contents);
            exit.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
     }

public static void readFile(String fileName) {
        File archive = new File(fileName);
        try {
            BufferedReader entry = new BufferedReader(new FileReader(archive));
            String lectura = entry.readLine();
            while(lectura!=null){
                System.out.println(lectura);
                lectura = entry.readLine();
            }
            entry.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }   
    }   
}

