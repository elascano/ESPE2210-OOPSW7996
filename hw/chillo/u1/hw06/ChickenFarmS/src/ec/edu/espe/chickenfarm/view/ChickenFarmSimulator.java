package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Chicken chicken;
        int id;
        String name;
        int age;
        String color;
        boolean molting;
        boolean newChickenInformation;
        
        chicken = new Chicken();
        newChickenInformation = true;
        ArrayList<Chicken> chickens;
        chickens = new ArrayList<>();
            while(newChickenInformation == true ){
                try{           
                System.out.println("------------------------------");
                System.out.println("         |Chicken Data|        ");
                System.out.println("      |Enter Infotmation|      ");
                System.out.println("------------------------------");
                System.out.println("What is the ID of the chicken?");
                id = scan.nextInt();
                System.out.println("What is the Name of the chicken?");
                name = scan.next();
                System.out.println("What is the Age of the chicken?");
                age = scan.nextInt();
                System.out.println("What is the Color of the chicken?");
                color = scan.next();
                System.out.println("Is chicken Molting? (true/false)");
                molting = scan.nextBoolean();
                            
                chicken.setId(id);
                chicken.setName(name);
                chicken.setAge(age);
                chicken.setColor(color);
                chicken.setIsMolting(molting);
                         
                chickens.add(chicken);
                           
                try{
                    System.out.println("You want to enter new information about a chicken? (true/false)");
                        newChickenInformation = scan.nextBoolean();
                }catch(Exception e){
                    System.out.println("---Could not process---");
                }                                
                }catch(Exception e){
                    System.out.println("---We Had a Mistake---");
                } 
            }
            System.out.println("------------------------");
            System.out.println("   ArrayList chickens  ");
            System.out.println("------------------------");
            for(Chicken chicken1 : chickens){
                System.out.println(chicken);
            }
            Gson gson = new Gson();
            String json ="";
            json = gson.toJson(chickens);
            System.out.println("------------------------");
            System.out.println("          json          ");
            System.out.println("------------------------");            
            System.out.println(json);
            
            
            
    }               
private static ArrayList<Chicken> loadFileJson() {
        Gson gson = new Gson();
        
        ArrayList<Chicken> chickens = new ArrayList<>();
        String jsonFile = "";
        String[] jsonChickens;
        
        try ( Scanner scFile = new Scanner(new File("./chickens.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }
            
            jsonFile = jsonFile.replace("[","");
            jsonFile = jsonFile.replace("]","");
            
            jsonChickens = jsonFile.split("},");
            
            for (int i = 0; i < jsonChickens.length; i++) {
                if (i < jsonChickens.length - 1) {
                    chickens.add(gson.fromJson(jsonChickens[i] + "}", Chicken.class));
                } else {
                    chickens.add(gson.fromJson(jsonChickens[i], Chicken.class));
                }
            }  
            
            System.out.println("----------File was loaded----------");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return chickens;
    }
    
    private static void SaveFileJson(ArrayList<Chicken> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);
        
        File file = new File("./chickens.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("----------File was saved----------");
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        } 
    }
}    