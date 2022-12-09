/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirportTaxiScheduling.model;

import com.google.gson.*;
import ec.edu.espe.AirportTaxiScheduling.model.DateBirth;
import ec.edu.espe.AirportTaxiScheduling.model.Traveler;
import ec.edu.espe.AirportTaxiScheduling.model.TravelerPayments;
import static ec.edu.espe.AirportTaxiScheduling.model.TravelerPayments.registerFilePayment;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class DataBase {
    private int id;
    private ArrayList<Traveler> travelers;
    
    public DataBase() {
        this.id = 0;
        this.travelers = travelers;
    }

    public DataBase(int id, ArrayList<Traveler> travelers) {
        this.id = id;
        this.travelers = travelers;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the travelers
     */
    public ArrayList<Traveler> getTravelers() {
        return travelers;
    }

    /**
     * @param travelers the travelers to set
     */
    public void setTravelers(ArrayList<Traveler> travelers) {
        this.travelers = travelers;
    }
    
        
  public static void enterTravelerData(ArrayList<Traveler> travelers, Traveler traveler, int position[]) {
        String name;
        String adress;
        long phoneNumber;
        String numberOfPhone;
        String email;
        String birthDate;
        boolean repeatTraveler;
        int day;
        int month;
        int year;
        float payment;
        String gmail = "@gmail.com";
        System.out.println("===============================");
        System.out.println("      ENTER TRAVELER DATA      ");
        System.out.println("===============================");

        boolean validDate = false;
        Scanner scan = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name");
        name = input.nextLine();

        System.out.println("");
        
        System.out.println("Write the adress");
        adress = input.nextLine();

        System.out.println("");
        
        do {
            repeatTraveler = false;
            System.out.println("Enter the phone number");
            numberOfPhone = input.nextLine();
            input.nextLine();

            String regex = "\\d{10}";

            while (numberOfPhone.matches(regex) == false) {
                System.out.println("The number is: " + numberOfPhone);
                System.out.println("Is the above phone number valid? " + numberOfPhone.matches(regex));
                System.out.println("");
                System.out.println("Enter the phone number");
                numberOfPhone = input.nextLine();
                input.nextLine();
            }

            phoneNumber = Long.parseLong(numberOfPhone);
            for (int i = 0; i < travelers.size(); i++) {
                if (travelers.get(i).getPhoneNumber() == phoneNumber) {
                    System.out.println("This Traveler was already registered");
                    System.out.println("Use other");
                    repeatTraveler = true;
                }
            }
        } while (repeatTraveler == true);

        System.out.println("Write the email (@ gmail.com)");

        email = input.nextLine();
        email = (email + gmail);
        System.out.println("Email-->>" + email);
        do {
            System.out.println("Enter the birth date");
            System.out.print("day: ");
            day = scan.nextInt();
            System.out.print("month: ");
            month = scan.nextInt();
            System.out.print("year: ");
            year = scan.nextInt();

            if ((day > 0 && day < 32) && (month > 0 && month < 13) && (year > 1921 && year < 2023)) {
                validDate = true;
            }
            if (validDate == true) {
                System.out.println("Date is correct");

            } else {
                System.out.println("Date is not correct");
                System.out.println("Reenter the date");
            }
        } while (validDate == false);

        DateBirth date = new DateBirth(day, month, year);
        System.out.println("Write the payment");
        payment = input.nextFloat();
        TravelerPayments payments = new TravelerPayments(name, adress, payment);
        birthDate = (date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        traveler = new Traveler(name, adress, phoneNumber, email, birthDate);
        travelers.add(position[0], traveler);

        registerFilePayment(payments);
    }
  
   
   public static void saveFileTravelerCsv(Traveler traveler) {
        File travelerList = new File("travelerList.csv");
        String name = traveler.getName();
        String adress = traveler.getAdress();
        long phoneNumber = traveler.getPhoneNumber();
        String email = traveler.getEmail();
        String birthDate = traveler.getBirthDate();
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(travelerList, true));
            writer.println("");
            writer.print(name + ";");
            writer.print(adress + ";");
            writer.print(phoneNumber + ";");
            writer.print(email + ";");
            writer.print(birthDate + ";");
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
   
    public static void searchTraveler(ArrayList<Traveler> travelers, Scanner input) throws IOException {
        long phoneNumber;
        int found = 0;
        System.out.println("===============================");
        System.out.println("      SEARCH TRAVELER          ");
        System.out.println("===============================");
        if (travelers.size() != 0) {
            System.out.println("What is the phone number of the traveler?");
            phoneNumber = input.nextLong();
            String phoneNumberS = String.valueOf(phoneNumber);
            FileReader travelerread = null;
            String dataLine;
            File file = new File("travelerList.csv");
            travelerread = new FileReader(file);
            BufferedReader BR = new BufferedReader(travelerread);
            while ((dataLine = BR.readLine()) != null) {
                if (dataLine.contains(phoneNumberS) == true) {
                    System.out.println("===============================");
                    System.out.println(dataLine);
                    found++;
                }
            }
            if (found == 0) {
                System.out.println("Unregistered traveler");
            }
        } else {
            System.out.println("No travelers registered yet");
        }
    }
   
   public static void readFileTravelerList() throws IOException, FileNotFoundException {
        FileReader travelerread = null;
        String dataLine;
        System.out.println("===============================");
        System.out.println("      TRAVELERS DATA        ");
        System.out.println("===============================");
        System.out.println("NAME ; ADRESS ; PHONE NUMBER ; E-MAIL ; BIRTH DATE");
        File file = new File("travelerList.csv");
        travelerread = new FileReader(file);
        BufferedReader BR = new BufferedReader(travelerread);
        while ((dataLine = BR.readLine()) != null) {
            System.out.println(dataLine);

        }
    }
   
   public static void readFilePayments() throws IOException, FileNotFoundException {
        FileReader travelerread = null;
        String dataLine;
        System.out.println("===============================");
        System.out.println("              PAYMENTS        ");
        System.out.println("===============================");
        File file = new File("payments.csv");
        travelerread = new FileReader(file);
        BufferedReader BR = new BufferedReader(travelerread);
        while ((dataLine = BR.readLine()) != null) {
            System.out.println(dataLine);

        }
    }
   
   public static void saveFileJson(ArrayList<Traveler> travelers) {

        File travelerListFile = new File("travelerList.json");
        Gson gson = new Gson();
        JsonArray travelersJsArray = new JsonArray();

        for (int i = 0; i < travelers.size(); i++) {
            gson.toJsonTree(travelers.get(i));
            travelersJsArray.add(gson.toJsonTree(travelers.get(i)));
        }
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(travelerListFile, false));
            writer.print(travelersJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
   
   public static ArrayList<Traveler> readFileJson() {
        ArrayList<Traveler> travelers = new ArrayList<Traveler>();
        Gson gson = new Gson();
        JsonArray travelersJsArray = new JsonArray();
        File travelerList = new File("travelerList.json");
        if(isFileEmpty(travelerList)==false){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(travelerList));
            String line = "";
            String json = "";
            while ((line = reader.readLine()) != null) {
                json += line;
            }

            travelersJsArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < travelersJsArray.size(); i++) {
                travelers.add(i, gson.fromJson(travelersJsArray.get(i), Traveler.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }}
        return travelers;
    }
  
   public static boolean isFileEmpty(File file) {
        return file.length() == 0;
    }
  } 