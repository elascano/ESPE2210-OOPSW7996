package ec.edu.espe.ChickenFarmSimulatorJsonFiles.view;

import ec.edu.espe.ChickenFarmSimulatorJsonFiles.model.Chicken;
import java.io.*;
import java.util.*;
import com.google.gson.Gson;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class chickenfarmJsonfiles {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Allan Panchi");
        System.out.println("Homework 06");
        System.out.println("Menu options");
        int option;
        int position = 0;
        boolean leave = false;
        
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        Chicken chicken = new Chicken();
        
        while (!leave){
            
            System.out.println("============================");
            System.out.println("Read and choose and option");
            System.out.println("1. Enter a chicken");
            System.out.println("2. Print the chicken");
            System.out.println("3. Save chicken data in a file");
            System.out.println("4. Exit");
            
            try{
            
            System.out.println("Please, enter a number:");
            option = sc.nextInt();

            
                switch(option){
                    case 1 -> {
                    
                        enterChicken(chickens);
                        position++;
                    
                    break;
                    }
                    case 2 -> {        
                    
                        for (int i = 0; i < chickens.size(); i++) {
                    
                          chicken = chickens.get(i); 
                          printChicken(chicken);
                        }
                    break;
                    }
                    case 3 -> {
                    
                        addChickenToJSON(position, chickens);
                        break;
                    }
                    case 4 -> {
                        leave = true;
                        System.out.println("Arrivederchi");
                        break;
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("You have to enter a number");
                sc.next();
            }
        }
    }
    private static void enterChicken(ArrayList<Chicken> chickens) {
        Chicken chicken = new Chicken();
        int id;
        String name = new String("");
        int age;
        String color = "";    
        boolean Ismolting;
        System.out.print("Chicken's Id:");
        id = sc.nextInt();
        System.out.print("Chicken's name:");
        name = sc.next();
        System.out.print("Chicken's age:");
        age = sc.nextInt();
        System.out.print("Chicken's color:");
        color = sc.next();                
        System.out.print("Chicken's molting:");
        Ismolting = sc.nextBoolean();
        chicken.setId(id);                
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(Ismolting);
        chickens.add(chicken);
    }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("================================");
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());
    }
    
    private static void addChickenToJSON(int position, ArrayList<Chicken> chickens) {
        File file = new File("Chicken_File.json");
        Gson gson = new Gson();
        Chicken chicken = new Chicken();
        
        chicken = chickens.get(position);
        String jsonStructure = new Gson().toJson(chicken);
         try {
            PrintWriter write = new PrintWriter(new FileWriter(file, true)); 
            write.println("");
            write.print(jsonStructure);
            write.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}