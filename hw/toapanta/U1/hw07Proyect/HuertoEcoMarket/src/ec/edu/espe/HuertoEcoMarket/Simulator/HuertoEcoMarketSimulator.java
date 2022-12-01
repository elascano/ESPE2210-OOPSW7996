package ec.edu.espe.HuertoEcoMarket.Simulator;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.HuertoEcoMarket.model.Inventory;
import ec.edu.espe.HuertoEcoMarket.model.RegisterProduct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class HuertoEcoMarketSimulator {

    public static void main(String[] args) {

        int option = 0;
        String name;
        int amount;
        double unitPrice;
        Boolean exit = false;
        int position = 0;
        String products = "";

        int registrationOfIncomingProducts = 0;
        ArrayList<Inventory> stock = new ArrayList<>();
        RegisterProduct register = new RegisterProduct();
        Scanner console = new Scanner(System.in);

        while (!exit) {
            HeaderOfThePresentation(registrationOfIncomingProducts);

            try {
                System.out.println("Enter the option:");
                option = console.nextInt();

                switch (option) {
                    case 1 -> {
                        int followAction = 1;
                        while (followAction == 1) {

                            saveProduct(registrationOfIncomingProducts, register, stock);

                            System.out.println("=======================================================");
                            System.out.println("Would you like to enter another product? \n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                            followAction = console.nextInt();
                            System.out.println("=======================================================");

                            registrationOfIncomingProducts++;

                        }
                    }

                    case 2 -> {

                        int submenuOptions = 0;
                        while (submenuOptions != 3) {
                            submenu();
                            submenuOptions = console.nextInt();

                            switch (submenuOptions) {
                                case 1 -> {

                                    int confirmation = 1;
                                    boolean validationName = true;
                                    int search = 2;
                                    int answer;
                                    int eliminateQuantity;
                                    int increaseTheQuantity;
                                    int existingAmount;
                                    int amounts;

                                    if (registrationOfIncomingProducts != 0) {
                                        while (confirmation == 1) {
                                            printList(registrationOfIncomingProducts, stock);

                                            System.out.print("Enter the number of the product you wish to modify the stock:\t");
                                            search = console.nextInt();

                                            while (search <= 0 || search > stock.size()) {
                                                System.out.println("Not registered");
                                                System.out.println("Enter again:");
                                                search = console.nextInt();
                                            }
