package ec.edu.espe.AirportTaxiScheduling.view;

import ec.edu.espe.AirportTaxiScheduling.model.Traveler;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class AirportTaxiScheduling {

    public static void main(String[] args) {
        Traveler traveler[] = new Traveler[100];
        Scanner scan = new Scanner(System.in);
        int arrayPosition = 0;
        boolean exit = false;
        int option;
           
        //To initialice each traveler
         /*for (int i = 0; i < 100; i++) {
            traveler[i] = new Traveler();
        }*/ 
         
        while (!exit) {
            System.out.println("ProgressTeam");
            System.out.println("Menu");
            System.out.println("Options:");
            System.out.println("1.Enter traveler");
            System.out.println("2.Search traveler");
            System.out.println("3.Print all travelers");
            System.out.println("4.Exit");
            System.out.println("Digit an option: ");

            try {
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        
                        enterTraveler(traveler, arrayPosition);                
                        saveTraveler(traveler,arrayPosition);
                        arrayPosition++;
                        break;
                    case 2:
                        long phoneNumber;
                        int found = 0;
                        System.out.println("What is the phone number of the traveler?");
                        phoneNumber = scan.nextLong();
                        for (int i = 0; i < 100; i++) {
                            if (traveler[i].getPhoneNumber() == phoneNumber) {
                                printTraveler(traveler[i]);
                                found++;
                            }
                        }
                        if (found == 0) {
                            System.out.println("Unregistered traveler");
                        }
                        break;
                    case 3:
                        for (int i = 0; i < arrayPosition; i++) {
                            printTraveler(traveler[i]);
                        }
                        break;
                    case 4:
                        System.out.println("Exit was success");
                        exit = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                scan.next();
            }
        }

    }
    
    private static void printTraveler(Traveler traveler) {
        System.out.println(traveler);
    }
    
    private static void enterTraveler(Traveler traveler[], int arrayPosition) {
        String name ;
        String adress;
        long phoneNumber;
        String email;
        String birthDate;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name");
        name = scan.nextLine();

        System.out.println("Write the adress");
        adress = scan.nextLine();

        System.out.println("Enter the phone number");
        phoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Write the email");
        email = scan.nextLine();

        System.out.println("Enter the birth date");
        birthDate = scan.nextLine();

        traveler[arrayPosition] = new Traveler(name, adress, phoneNumber, email, birthDate);
    }

    private static void saveTraveler(Traveler traveler[],int arrayPosition) {
       File travelerList = new File("travelerList.csv");
        String name = traveler[arrayPosition].getName();
        String adress = traveler[arrayPosition].getAdress();
        long phoneNumber = traveler[arrayPosition].getPhoneNumber();
        String email = traveler[arrayPosition].getEmail();
        String birthDate = traveler[arrayPosition].getBirthDate();
        try {          
            PrintWriter writer = new PrintWriter(new FileWriter(travelerList, true));
            writer.println("");      
            //writer.print(Id + ";");
            writer.print(name + ";");
            writer.print(adress + ";");
            writer.print(phoneNumber+ ";");
            writer.print(email+ ";");
            writer.print(birthDate + ";");
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } 
    }

   

}
