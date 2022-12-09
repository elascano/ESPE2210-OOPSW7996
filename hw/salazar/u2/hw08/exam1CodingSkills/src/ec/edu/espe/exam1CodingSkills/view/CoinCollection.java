package ec.edu.espe.exam1CodingSkills.view;

import ec.edu.espe.exam1CodingSkills.controller.FileManager;
import ec.edu.espe.exam1CodingSkills.model.Coin;
import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class CoinCollection {
    public static void main(String[] args) {
        System.out.println("Augusto Salazar");
        System.out.println("Coding Skills");
        System.out.println("-------------------");
        
        Scanner read = new Scanner(System.in);
        ArrayList<Coin> coins = new ArrayList<Coin>();
        Coin coin;
        FileManager fileManager = new FileManager();
        String currency;
        float value;
        int option, id, counter, numberOfCoins=0;
        boolean end = false, correctOption;
        File coinData = new File("CoinData.json");
        
        fileManager.readArchive(coinData, coins);
        
        while (!end) {
            
            System.out.println("-------Menu-------");
            System.out.println("1.Add a new coin");
            System.out.println("2.Delete a coin");
            System.out.println("3.Edite a coin");
            System.out.println("4.Print coins");
            System.out.println("5.Exit and save information");
            do{
                try{
                    correctOption = false;
                    System.out.print("Enter a option: ");
                    option = read.nextInt();
                    switch(option){
                        case 1 ->{
                            coin = readOfCoin();
                            coins.add(coin);
                        }
                        case 2->{
                            id = readOfId();
                            counter=0;
                            numberOfCoins=coins.size();
                            for (int i = 0; i < coins.size(); i++) {
                                if (id == coins.get(i).getId()) {
                                    coins.remove(i);
                                }else{
                                    counter++;
                                }
                            }
                            if (counter == numberOfCoins) {
                                System.out.println("This coin doesn't exist, it can't be removed");
                            }else{
                                System.out.println("======================================");
                                System.out.println("The coin has been removed successfully");
                                System.out.println("======================================");
                            }
                        }
                        case 3->{
                            id = readOfId();
                            counter=0;
                            for (int i = 0; i < coins.size(); i++) {
                                if (id == coins.get(i).getId()) {
                                    coin=coins.get(i);
                                    System.out.print("Enter the currency of the coin: ");
                                    currency = read.nextLine();
                                    currency = read.nextLine();
                                    coin.setCurrency(currency);
                                    value=readOfValue();
                                    coin.setValue(value);
                                }else{
                                    counter++;
                                }
                            }
                            if (counter == coins.size()) {
                                System.out.println("This coin doesn't exist, it can't be edit");
                            }else{
                                System.out.println("======================================");
                                System.out.println("The coin has been edited successfully");
                                System.out.println("======================================");
                            }
                        }
                        case 4->{
                            System.out.println("================COINS================");
                            System.out.println("ID\t|\tCURRENCY\t|\tVALUE");
                            for (int i = 0; i < coins.size(); i++) {
                                coin = coins.get(i);
                                System.out.println(coin.getId()+"\t|\t"+coin.getCurrency()+"\t|\t"+coin.getValue());
                            }
                        }
                        case 5->{
                            end = true;
                            fileManager.archiveCoins(coinData, coins);
                        }
                        default->{
                            System.out.println("Please enter a opcion [1,5]");
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
    
    private static Coin readOfCoin() {
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
        return coin;
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
}
