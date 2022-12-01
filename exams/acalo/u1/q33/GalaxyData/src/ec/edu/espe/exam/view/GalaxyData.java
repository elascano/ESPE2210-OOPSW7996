/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Galaxy;
import java.io.*;
import java.util.*;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class GalaxyData {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<Galaxy> actualGalaxiesData = new ArrayList<>();
        
        do {
            System.out.println("******************************");            
            System.out.println("* Welcome to the Galaxy Data *");
            System.out.println("******************************");
            System.out.println("1.Insert new Galaxy \t");
            System.out.println("2.Exit  \t");
            System.out.println("******************************");

            option = sc.nextInt();

            switch (option) {
                case 1->{
                    actualGalaxiesData = readJSON(actualGalaxiesData, "Galaxies.json");
                    addGalaxy(actualGalaxiesData);
                    writeJson(actualGalaxiesData, "Galaxies.json");
                    System.out.println("\n*** GALAXY ADDED SUCCESSFULLY ***\n");
                }

                case 2->{
                    System.out.println("*** YOU HAVE EXITED SUCCESSFULLY ***");
                }

                default->{
                    System.out.println("*** INVALID OPTION ***");
                }
            }
        } while (option!=2);
        
        
    }
    
    private static ArrayList<Galaxy> readJSON(ArrayList<Galaxy> galaxies, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null)
            {
                fromJson = line;
                TypeToken<ArrayList<Galaxy>> type = new TypeToken<ArrayList<Galaxy>>() {
                };
                galaxies = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex){
            System.out.println("*** THE FILE DOESN'T EXIST, IT WILL BE CREATED ***");
        } catch (IOException ex){
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }
        return galaxies;
    }
    
    private static void addGalaxy(ArrayList<Galaxy> galaxies) {
        
        Scanner sc = new Scanner(System.in);
        Galaxy galaxy;
        int id;
        String name;
        String type;
        
        try {
            System.out.println("\n************************************");
        
            System.out.println("Enter the id of the Galaxy: ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of the Galaxy: ");
            name=sc.nextLine();

            System.out.println("Enter the type of Galaxy: ");
            type=sc.nextLine();

            galaxy = new Galaxy(id,name,type);

            System.out.println("************************************");
            galaxies.add(galaxy);
        } catch (Exception e) {
            System.out.println("*** INVALID DATA, PLEASE INSERT AGAIN ***");
        }
    }
    
    private static void writeJson(ArrayList<Galaxy> galaxies, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(galaxies);

        try
        {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }
}
