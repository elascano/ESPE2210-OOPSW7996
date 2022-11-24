package ec.edu.espe.chickenfarmhomework.view;

import ec.edu.espe.chickenfarmhomework.model.Chicken;
import java.io.*;
import java.util.*;
import com.google.gson.Gson;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFarmHomework {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Allan Panchi");
        System.out.println("Homework 06");
        System.out.println("Menu options");
        int option;
        int position = 0;
        
        /*Chicken[] chicken = new Chicken[100];
        for (int i = 0; i < 100; i++) {
            chicken[i] = new Chicken();
        }*/
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        Chicken chicken = new Chicken();
        
        do{
            System.out.println("============================");
            System.out.println("Read and choose and option");
            System.out.println("1. Enter a chicken");
            System.out.println("2. Print the chicken");
            System.out.println("3. Save chicken data in a file");
            System.out.println("4. Exit");
            System.out.println("Please, enter a number:");
            option = sc.nextInt();
             
            while(option < 1 ^ option > 4) {
                System.out.println("Please enter a valid number");
                option = sc.nextInt();
            }
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
                    
                    //chickenFile(position, chickens);
                    chickenJson(position, chickens);
                    
                    break;
                }
                case 4 -> {
                    break;
                }
            }
        }while(option!=4);
    }

  /*private static void chickenFile(int i, Chicken[] chicken) {
        try
        {
            FileWriter file = new FileWriter("Chickenlist.csv");
            file.write("Id;Name;Age;Color;Molting");
            for (int j = 0; j < i; j++)
            {
                String id = String.valueOf(chicken[j].getId());
                String age = String.valueOf(chicken[j].getAge());
                String isMolting = String.valueOf(chicken[j].isIsMolting());
                
                file.write("\n");
                file.write(id);
                file.write(";");
                file.write(chicken[j].getName());
                file.write(";");
                file.write(age);
                file.write(";");
                file.write(chicken[j].getColor());
                file.write(";");
                file.write(isMolting);
            }
            file.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }*/
    
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

    private static void chickenJson(int position, ArrayList<Chicken> chickens) {
       File file = new File ("Chickenlist.json");
       int id = chickens.get(position).getId();
       int age = chickens.get(position).getAge();
       String name = chickens.get(position).getName();
       String color = chickens.get(position).getColor();
       boolean isMolting = chickens.get(position).isIsMolting();
       
       String jsonStructure = " {\"id\":" + id + ",\"name\":\"" + name + "\",\"age\":" + age + ",\"color\":\"" + color + "\",\"IsMolting\":" + isMolting + "},";
        try {
            try ( PrintWriter printFile = new PrintWriter(new FileWriter(file, true))) {
                printFile.print(jsonStructure);
                printFile.println("");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }  
    }
}
