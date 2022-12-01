/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam1CodingSkills.view;

import com.google.gson.Gson;
import ec.edu.espe.exam1CodingSkills.model.Coin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Augusto Salazar");
        System.out.println("Coding Skills");
        System.out.println("-------------------");
        
        Scanner read = new Scanner(System.in);
        ArrayList<Coin> coins = new ArrayList<Coin>();
        int option;
        boolean end = false, correctOption;
        File coinData = new File("CoinData.json");
        FileWriter writer;
        PrintWriter write;
        Gson gson = new Gson();
        
        readArchive(coinData,coins);
        
        while (!end) {
            
            System.out.println("-------Menu-------");
            System.out.println("1.Add a new coin");
            System.out.println("2.Exit and save information");
            do{
                try{
                    correctOption = false;
                    System.out.print("Enter a option: ");
                    option = read.nextInt();
                    switch(option){
                        case 1 ->{
                            addANewCoin(coins);
                        }
                        case 2->{
                            end = true;
                            coinData.delete();
                            try {
                                coinData.createNewFile();
                            }catch(IOException ex){
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try{
                                writer = new FileWriter(coinData, true);
                                write = new PrintWriter(writer);
                                write.println("[");
                                for (int i = 0; i < coins.size(); i++) {
                                    if (i==coins.size()-1){
                                        String line = gson.toJson(coins.get(i));
                                        write.println(line);
                                    }else{
                                        String line = gson.toJson(coins.get(i))+",";
                                        write.println(line);
                                    }
                                    write.println("]");
                                    write.close();
                                    writer.close();
                                }
                            }catch(FileNotFoundException e){
                                e.printStackTrace(System.out);
                            }catch(IOException e){
                                e.printStackTrace(System.out);
                            }
                        }
                        default->{
                            System.out.println("Please enter a opcion [1,2]");
                        }
                    }
                }catch(InputMismatchException ex){
                    correctOption = true;
                    System.out.println("Please enter a whole number");
                    read.next();
                }
            }while(correctOption);

        }
        
        
    }
    
    private static void addANewCoin(ArrayList<Coin> coins) {
        Scanner read = new Scanner(System.in);
        int id;
        String currency;
        float value;
        Coin coin;
        System.out.println("-------Coin Data-------");
        id = readOfId();
        System.out.print("Enter the currency of the coin: ");
        currency = read.nextLine();
        value = readOfValue();
        coin = new Coin(id, currency, value);
        coins.add(coin);
    }
    
    private static int readOfId() {
        Scanner read = new Scanner(System.in);
        int id = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print("Enter the id of the coin: ");
                id = read.nextInt();
                if (id <= 0) {
                    System.out.println("Please enter a positive number");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a whole number");
                read.next();
                correctReading = true;
            }
        } while (correctReading || id <= 0);
        return id;
    }
    
    private static float readOfValue() {
        Scanner read = new Scanner(System.in);
        float value = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print("Enter the value of the coin: ");
                value = read.nextFloat();
                if (value <= 0) {
                    System.out.println("Please enter a positive number");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a number");
                read.next();
                correctReading = true;
            }
        } while (correctReading || value <= 0);
        return value;
    }
    
    public static void readArchive( File coinData, ArrayList<Coin> coins) {
        Gson gson = new Gson();
        coins.clear();
        BufferedReader reader;
        if (coinData.exists()) {
            try {
                reader = new BufferedReader(new FileReader(coinData));
                String data = reader.readLine();
                while(data != null){
                    data = reader.readLine();
                    if(data != null && !data.equals("]")){
                        if (data.endsWith(",")){
                            data = data.substring(0, data.length()-1);
                        }
                        Coin coinRead = gson.fromJson(data, Coin.class);
                        coins.add(coinRead);
                    }
                }
                reader.close();
            }catch(IOException e){
                e.printStackTrace(System.out);
            }
        }
    }
}
