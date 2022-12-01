
package ec.edu.espe.managmentsoftware.model;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Registration {

    public static int getChosenRegistrationMenuOption(Scanner sc){
        int chosenRegistrationMenuOption; 
            try{
                System.out.println("""
                                  ______________________________________________________
                                 /                                                     / 
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                 (      "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE      (
                                  )                   REGISTRATION                      )
                                 (      ----------------          ----------------      (
                                  )    |   1. Sign In   |        |    2. Log In   |      )
                                        ----------------          ----------------      (                                                      (
                                 (                                                      (
                                 / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /______________________________________________________/
                                                  WHAT DO YOU WANT TO DO? 
                           """);
                chosenRegistrationMenuOption = sc.nextInt();
                }catch(InputMismatchException error){
                    return 5;
                }
        return chosenRegistrationMenuOption; 
    }
    
    public static boolean logIn(Scanner sc){
        File userDataBase = new File ("./userDataBase.json");
        String loginUserName;
        String loginPassword;
        User userFromFile;
        boolean end;
        boolean loginConfirmation;
        int exit;
        loginConfirmation = false;
        do{
            end = false;
            try{
                System.out.println("""
                                  ______________________________________________________
                                 /                                                     / 
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                 (      "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE      (
                                  )                       LOGIN                          )
                                 (                                                      ( """);
          System.out.print("     )               User Name ->"); 
                loginUserName = sc.next();
          System.out.print("    (                Password -> "); 
                loginPassword = sc.next();
                System.out.println( """
                                  )                                                      )
                                 / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /______________________________________________________/""");
                
                userFromFile = readUserFromFile(userDataBase);
                if(loginUserName.equals(userFromFile.getUserName())&& loginPassword.equals(userFromFile.getPassword()) ){
                    loginConfirmation = true;
                    end = true;
                }else{
                    System.err.println("""
                                   \n  ------------  DEAR USER  ------------
                                         ENTER VALID USERNAME AND PASSWORD
                                       -------------------------------------
                                   """);
                    System.out.println("- ENTER 1 TO TRY AGAIN / ENTER 2 TO EXIT -   ");
                    exit = sc.nextInt();
                    end = exit != 1;
                    
                }
            }catch(InputMismatchException error){
                System.err.println("""
                                   \n     ---------  DEAR USER  ---------
                                              ENTER VALID INFORMATION
                                          -------------------------------
                                   """);
                }
        }while(end == false);
        return loginConfirmation;
    }
        
    
    private static User readUserFromFile(File userDataBase){
        Scanner scUserDataBase;
        try {
            scUserDataBase = new Scanner(userDataBase);
            User userFromFile;
            Gson gson = new Gson();
            userFromFile = gson.fromJson(scUserDataBase.nextLine(), User.class);
            return userFromFile;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void signIn(){
     File userDataBase = new File ("./userDataBase.json");
     Scanner scUserDataBase;
        try {
            scUserDataBase = new Scanner(userDataBase);       
            if(!scUserDataBase.hasNext()){
               try(FileWriter fileWriter = new FileWriter(userDataBase);){
                    User newUser;
                    Gson gson = new Gson();
                    String userToFile;
                    newUser = createUser();
                    userToFile = gson.toJson(newUser);
                    fileWriter.write(userToFile + "\n");

                    System.out.println(userToFile);
               } catch (IOException ex) {
                   Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
               } 
            }else{
                System.out.println("""
                                   \n     ---------------------  DEAR USER  ----------------------
                                              YOU HAVE ALREADY CREATED AN ACCOUNT, PLEASE LOGIN
                                          --------------------------------------------------------
                                   """);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private static User createUser(){
        Scanner sc = new Scanner(System.in);
        String name;
        String email;
        String password;
        float currentSalary;
        User newUser;
        try{
                System.out.println(" =^..^=   =^..^=   =^..^=    =^..^=    =^..^=   ");
                System.out.print("""             
                                                 Enter User Name 
                                 Ex -> UserName:  
                                 """); 
                name = sc.next();
                System.out.print("""            
                                                  Enter email
                                 Ex -> exam@gmail.com: 
                                 """);
                email = sc.next();
                System.out.print("""           
                                                Enter password 
                                 Ex -> password1234:  
                                 """);
                password = sc.next();
                System.out.print("""            
                                           Enter Your Current Salary 
                                 Ex -> 450,00:  
                                 """);
                currentSalary = sc.nextFloat();
                System.out.println(" =^..^=   =^..^=   =^..^=    =^..^=    =^..^=   ");
                newUser = new User(name, email, password, currentSalary); 
                return newUser;
            }catch(InputMismatchException error){
                System.err.println("""
                                   \n     ---------  DEAR USER  ---------
                                              ENTER VALID INFORMATION
                                          -------------------------------
                                   """);
                }
        return null;
    }
    

    public static boolean showUserProfile(Scanner sc){
        File userDataBase = new File ("./userDataBase.json");
        Scanner scUserDataBase;
        boolean wantToUpdate = false;
        try { 
            scUserDataBase = new Scanner(userDataBase);
            Gson gson = new Gson();
            User userForUserProfile;
            userForUserProfile = gson.fromJson(scUserDataBase.nextLine(), User.class);
            System.out.println(userForUserProfile);
            System.out.format("""
                                  ______________________________________________________
                                 /                                                     / 
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                 (      "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE      (
                                  )                   USER PROFILE                       )
                                 (      //|\\   User Name:      %10s               
                                  )      c_"/  Password:       %10s                
                                 (     __/\\__  Email:          %10s                                                                     (
                                  )     /  \\   Current Salary: %10s                
                                 (     /____\\                                          (
                                  )       11                                             )
                                 / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /______________________________________________________/
                           """, userForUserProfile.getUserName(), userForUserProfile.getPassword(), userForUserProfile.getEmail(), userForUserProfile.getCurrentSalary());
            System.out.println("Do you want to update your information? true/false");
            wantToUpdate = sc.nextBoolean();
            if(wantToUpdate == false){
                return wantToUpdate;
            }else{
                updateUserInformation();
                return wantToUpdate;
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return wantToUpdate;
    } 
    
    private static void updateUserInformation(){
        System.out.println("We are working on Update User Profile Option :)");
    }
    
    
}



