package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Augusto Salazar");
        System.out.println("Chicken Farm Simulator");
        System.out.println("-------------------");

        //declaration
        Scanner read = new Scanner(System.in);
        ArrayList<Chicken> chickens = new ArrayList<Chicken>(); //ADT variabeName
        boolean end = false, correctOption;
        int option, id;
        File chickenData = new File("ChickenData.json");
        FileWriter writer;
        PrintWriter write;
        BufferedReader reader;
        Gson gson = new Gson();
        
        loadData(chickenData, gson, chickens);

        while (!end) {
            
            System.out.println("-------Menu-------");
            System.out.println("1.Add a new chicken");
            System.out.println("2.Delete a chicken");
            System.out.println("3.Print Chickens");
            System.out.println("4.Exit and save information");
            do{
                try{
                    correctOption = false;
                    System.out.print("Enter a option: ");
                    option = read.nextInt();
                    switch(option){
                        case 1 ->{
                            addANewChicken(chickens);
                        }
                        case 2->{
                            id = readOfInt("Enter the id of the chicken: ");
                            for (int i = 0; i < chickens.size(); i++) {
                                if (id == chickens.get(i).getId()) {
                                    chickens.remove(i);
                                }
                            }
                        }
                        case 3->{
                            Iterator<Chicken> chickenIterator = chickens.iterator();
                            while(chickenIterator.hasNext()){
                                Chicken chicken = chickenIterator.next();
                                printChicken(chicken);
                            }
                        }
                        case 4->{
                            end = true;
                            chickenData.delete();
                            try {
                                chickenData.createNewFile();
                            }catch(IOException ex){
                                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try{
                                writer = new FileWriter(chickenData, true);
                                write = new PrintWriter(writer);
                                for (int i = 0; i < chickens.size(); i++) {
                                    String line = gson.toJson(chickens.get(i));
                                    write.println(line);
                                }
                                write.close();
                                writer.close();
                            }catch(FileNotFoundException e){
                                e.printStackTrace(System.out);
                            }catch(IOException e){
                                e.printStackTrace(System.out);
                            }
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

    private static void loadData(File chickenData, Gson gson, ArrayList<Chicken> chickens) throws JsonSyntaxException {
        chickens.clear();
        BufferedReader reader;
        if (chickenData.exists()) {
            try {
                reader = new BufferedReader(new FileReader(chickenData));
                String data = reader.readLine();
                Chicken chickenRead = gson.fromJson(data, Chicken.class);
                chickens.add(chickenRead);
                while(data != null){
                    data = reader.readLine();
                    if(data != null){
                        chickenRead = gson.fromJson(data, Chicken.class);
                        chickens.add(chickenRead);
                    }
                }
                reader.close();
            }catch(IOException e){
                e.printStackTrace(System.out);
            }
        }
    }

    private static void addANewChicken(ArrayList<Chicken> chickens) {
        Scanner read = new Scanner(System.in);
        int id, age;
        String name, color;
        boolean correctMolting, isMolting = false;
        Chicken chicken;
        String continueWhithChickens;
        do {
            System.out.println("-------Chicken Data-------");
            
            id = readOfInt("Enter the id of the chicken: ");
            System.out.print("Enter the name of the chicken: ");
            name = read.nextLine();
            age = readOfInt("Enter the age of the chicken: ");
            System.out.print("Enter the color of the chicken: ");
            color = read.nextLine();
            do {
                try {
                    correctMolting = false;
                    System.out.print("Enter if the chicken is molting: ");
                    isMolting = read.nextBoolean();
                } catch (InputMismatchException ex) {
                    System.out.println("Please enter true or false");
                    read.next();
                    correctMolting = true;
                }
            } while (correctMolting);
            
            chicken = new Chicken(id, name, color, age, isMolting);
            chickens.add(chicken);
            
            System.out.println("Do you want to add more chickens? [yes]");
            continueWhithChickens = read.next();
            
        } while (continueWhithChickens.equals("yes"));
    }

    private static int readOfInt(String readMessage) {
        Scanner read = new Scanner(System.in);
        int auxiliar = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print(readMessage);
                auxiliar = read.nextInt();
                if (auxiliar <= 0) {
                    System.out.println("Please enter a positive number");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a whole number");
                read.next();
                correctReading = true;
            }
        } while (correctReading || auxiliar <= 0);
        return auxiliar;
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("--------------------------------------");
        System.out.println("------Chicken "+chicken.getId()+"------");
        System.out.println("Chicken id \t-->\t " + chicken.getId());
        System.out.println("Chicken name \t-->\t " + chicken.getName());
        System.out.println("Chicken age \t-->\t " + chicken.getAge());
        System.out.println("Chicken color \t-->\t " + chicken.getColor());
        System.out.println("Chicken is molting \t-->\t " + chicken.isIsMolting());
        System.out.println("--------------------------------------");
    }
}
