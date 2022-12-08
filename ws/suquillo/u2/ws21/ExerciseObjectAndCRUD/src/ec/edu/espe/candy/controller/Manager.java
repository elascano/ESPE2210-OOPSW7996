package ec.edu.espe.candy.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.candy.model.Candy;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Suquillo Martín, WebMasterTeam , DCCO-ESPE
 */
public class Manager {
    public static void noteJson(ArrayList<Candy> candys, String fileName) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(candys);
        try {
            FileWriter file = new FileWriter(fileName + ".json");
            file.write(jsonStructure);
            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void deleteJson(String fileName){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name your file: ");
        fileName = scan.next();
        try {
            FileWriter file = new FileWriter(fileName + ".json");

            file.write("[]");

            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println("It has been successfully removed");
    }
    
    public static int searchCandy(Scanner scan, ArrayList<Candy> continents) {
        int id;
        int j = -1;
        Candy continent;
        System.out.println("Enter the ID of the candy do you search: ");
        id = scan.nextInt();
        for (int i = 0; i < continents.size(); i++) {
            continent = continents.get(i);
            if (id == continent.getId()) {
                j = i;
                printCandy(continent);
            }
        }

        if (j == -1) {
            System.out.println("Id Not Found");
        }
        
        return j;
    }
    
    public static void updateCandy(int box, ArrayList<Candy> candys, String fileName){
        int id;
        String name;
        String type;
        Scanner scan = new Scanner(System.in);
        Candy continent = new Candy();
        continent = candys.get(box);
        
        
        System.out.println("////////////////////////////");
        System.out.println("Enter Id of the Candy: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Name of your Candy: ");
        name = scan.nextLine();
        System.out.println("Enter the type of your Candy: ");
        type = scan.nextLine();
        System.out.println("////////////////////////////");
        continent.setId(id);
        continent.setName(name);
        continent.setType(type);

        
        noteJson(candys, fileName);
    }
   
        public static void enterCandy(Scanner scan, ArrayList<Candy> candys) {
        int id;
        String name;
        String type;
        Candy candy = new Candy();
        
        System.out.println("////////////////////////////");
        System.out.println("Enter Id of the Candy: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Name of your Candy: ");
        name = scan.nextLine();
        System.out.println("Enter the type of your candy: ");
        type = scan.nextLine();
        System.out.println("////////////////////////////");
        candy.setId(id);
        candy.setName(name);
        candy.setType(type);
        
        candys.add(candy);
    }
        
    public static void printCandy(Candy candy) {
        System.out.println("////////////////////////////////////");
        System.out.println("The ID of your candy is:    \t" + candy.getId());
        System.out.println("The candy is called:        \t" + candy.getName());
        System.out.println("The candy is a:             \t" + candy.getType());
        System.out.println("////////////////////////////////////");
    }
    
        public static void printCandys(ArrayList<Candy> candys){
        Candy candy = new Candy();
        for (int i = 0; i < candys.size(); i++) {
            candy = candys.get(i);
            printCandy(candy);
        }
    }
    
    public static ArrayList<Candy> openFile(ArrayList<Candy> candys, String fileName) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
        
        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(fileName + ".json"));
            TypeToken<ArrayList<Candy>> type = new TypeToken<ArrayList<Candy>>() {};
            candys = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Sorry, File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return candys;
    }
}