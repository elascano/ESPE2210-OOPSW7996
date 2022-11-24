
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
     // throws IOException, InterruptedException (it is for can call clear screen)
    public static void main(String[] args) {
        int option = 0;
        int chickenInd;
        int chickenId;

        //declaration
        //ADT variableName
        Scanner sc;
        Chicken chicken;
        ArrayList<Chicken> chickens;

        //initializing the chiken
        //creating the instance
        sc = new Scanner(System.in);
        
        chickens = loadJson();

        while (option != 7) {
            System.out.println("Diego Pilataxi");
            System.out.println("-----------------------------------------");
            System.out.println("                  MENU"                   );
            System.out.println("-----------------------------------------");
            System.out.println("1. Add new Chicken");
            System.out.println("2. Print Chicken");
            System.out.println("3. Save File");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("----------Add INFO----------");
                    chicken = addChicken();
                    if (chicken != null) {
                        chickens.add(chicken);
                    }
                }


                case 2 -> {
                    System.out.println("----------Chicken info----------");
                    System.out.print("Enter the chicken: ");
                    chickenId = sc.nextInt();
                    sc.nextLine();
                    chickenInd = findChickenInd(chickens, chickenId);
                    if (chickenInd >= 0) {
                        printChicken(chickens.get(chickenInd));
                    } else {
                        System.out.println("Chicken not found");
                    }
                }

                case 3 -> {
                    System.out.println("----------File----------");
                    //saveFile(chickens);
                    SaveJson(chickens);
                }

                case 4 ->
                    System.out.println("The application finished");

                default ->
                    System.out.println("Invalid Option");
            }
            sc.nextLine();
        }
    }

    
    private static ArrayList<Chicken> loadJson() {
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
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FILE NOT FOUND");
        }

        return chickens;
    }
    
    private static void SaveJson(ArrayList<Chicken> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);
        
        File file = new File("./chickens.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("FILE SAVED");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        } 
    }

    static Chicken addChicken() {
        Chicken newChicken = new Chicken();

        int id;
        int age;
        String name;
        String color;
        String isMolting;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter chicken Name: ");
            name = sc.nextLine();
            System.out.print("Enter chicken ID: ");
            id = sc.nextInt();
            System.out.print("Enter chicken age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter chicken color: ");
            color = sc.nextLine();
            System.out.print("Chicken is Molting?: ");
            isMolting = sc.nextLine();

            newChicken.setId(id);
            newChicken.setName(name);
            newChicken.setAge(age);
            newChicken.setColor(color);


        } catch (Exception e) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("INCORRECT DATA");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            return null;
        }

        return newChicken;
    }
    
    static void printChicken(Chicken chicken) {
        System.out.println("-----------------------------------------");
        System.out.println("chicken --> id: " + chicken.getId());
        System.out.println("-----------------------------------------");

        if (chicken.getName() != null) {
            System.out.println("Chicken name --> " + chicken.getName());
            System.out.println("Chicken age --> " + chicken.getAge());
            System.out.println("Chicken color --> " + chicken.getColor());
            System.out.println("Chicken is molting --> " + chicken.isIsMolting());
        } else {
            System.out.println("Chicken info empty");
        }
    }

    static int findChickenInd(List<Chicken> chickens, int id) {
        int index = 0;

        for (Chicken chicken : chickens) {
            if (chicken.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }

}

