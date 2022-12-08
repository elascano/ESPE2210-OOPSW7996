/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirportTaxiScheduling.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class TaxiDriver {
    private String Drivername;
    private String plateNumber;
    private long  phoneNumber;
    private String email;
    
    public TaxiDriver() {
        this.Drivername = "";
        this.plateNumber = "";
        this.phoneNumber = 0;
        this.email = "";
    }
    
    public TaxiDriver(String Drivername, String plateNumber, long phoneNumber, String email) {
        this.Drivername = Drivername;
        this.plateNumber = plateNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * @return the Drivername
     */
    public String getDrivername() {
        return Drivername;
    }

    /**
     * @param Drivername the Drivername to set
     */
    public void setDrivername(String Drivername) {
        this.Drivername = Drivername;
    }

    /**
     * @return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public static ArrayList<TaxiDriver> readFileJsonTaxiDriver() {
        ArrayList<TaxiDriver> taxiDriver = new ArrayList<TaxiDriver>();
        Gson gson = new Gson();
        JsonArray taxiDriverJsArray = new JsonArray();
        File taxiDriverInfo = new File("taxiDriverInfo.json");
        if(isFileEmpty(taxiDriverInfo) == false){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(taxiDriverInfo));
                String line = "";
                String json = "";
                while ((line = reader.readLine()) != null) {
                    json += line;
                }

                taxiDriverJsArray = gson.fromJson(json, JsonArray.class);

                for (int i = 0; i < taxiDriverJsArray.size(); i++) {
                    taxiDriver.add(i, gson.fromJson(taxiDriverJsArray.get(i), TaxiDriver.class));
                }
                reader.close();
            } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            } catch (IOException ex) {
            ex.printStackTrace(System.out);
            }
        }    
        return taxiDriver;
    }
    
    public static boolean isFileEmpty(File file) {
        return file.length() == 0;
    }
    
    public static void enterTaxiDriverData(ArrayList<TaxiDriver> taxiDriverInfo, TaxiDriver taxiDriver, int position[]) {
        String name;
        String plateNumber;
        long phoneNumber;
        String numberOfPhone;
        String email;
        boolean repeatTraveler;
        String gmail = "@gmail.com";
        System.out.println("===============================");
        System.out.println("      ENTER TAXI DRIVER DATA      ");
        System.out.println("===============================");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name");
        name = input.nextLine();

        System.out.println("");
        
        System.out.println("Enter the planeNumber");
        plateNumber = input.nextLine();

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
            for (int i = 0; i < taxiDriverInfo.size(); i++) {
                if (taxiDriverInfo.get(i).getPhoneNumber() == phoneNumber) {
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


        taxiDriver = new TaxiDriver(name, plateNumber, phoneNumber, email);
        taxiDriverInfo.add(taxiDriverInfo.size(), taxiDriver);
    }
    
    public static void saveTaxiDriverFileJson(ArrayList<TaxiDriver> taxiDriver) {

        File taxiDriverFile = new File("taxiDriverInfo.json");
        Gson gson = new Gson();
        JsonArray taxiDriverInfo = new JsonArray();

        for (int i = 0; i < taxiDriver.size(); i++) {
            gson.toJsonTree(taxiDriver.get(i));
            taxiDriverInfo.add(gson.toJsonTree(taxiDriver.get(i)));
        }
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(taxiDriverFile, false));
            writer.print(taxiDriverInfo);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void cleanTaxiDriverJson() throws IOException, FileNotFoundException {
        String fileName = "taxiDriverInfo.json";
 
        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
