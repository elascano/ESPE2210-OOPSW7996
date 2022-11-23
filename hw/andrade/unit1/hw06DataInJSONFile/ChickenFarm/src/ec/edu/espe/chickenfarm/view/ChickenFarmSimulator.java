package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.io.*;
import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class ChickenFarmSimulator {

    ArrayList<Chicken> chickens = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int option, position;
        boolean exitMenu = false;
        position = 0;

        ArrayList<Chicken> chickens;
        chickens = new ArrayList<>();

        Chicken chicken = new Chicken();

        while (!exitMenu)
        {

            printMenu();

            try
            {

                System.out.println("Choose any option: ");
                option = sc.nextInt();

                switch (option)
                {
                    case 1:
                        newChicken(chickens);
                        writeInFile(chickens);
                        System.out.println("Chicken have been aggregated\n");
                        position++;
                        break;
                    case 2:
                        
                        if (!chickens.isEmpty())
                        {
                            System.out.println("|\tID\t|\tName\t|\tAge\t|\tColor\t|  Is Molting\t|");
                        } else{
                            System.out.println("No chickens have been admitted yet");
                        }
                        
                        for (int i = 0; i < chickens.size(); i++)
                        {
                            chicken = chickens.get(i);
                            printChicken(chicken);                    
                        }
                        break;
                    case 3:
                        int match;
                        boolean idNotFound = true;
                        
                        //readFile(chickens);

                        System.out.println("Enter the chicken's id to view");
                        match = sc.nextInt();

                        for (int i = 0; i < chickens.size(); i++)
                        {
                            chicken = chickens.get(i);
                            if (match == chicken.getId())
                            {
                                printChicken(chicken);
                                idNotFound = false;
                            }
                        }

                        if (idNotFound)
                        {
                            System.out.println("ID not found");
                        }

                        break;
                    case 4:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 and 4 are accepted");
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Incorrect value");
                sc.next();
            }
        }

    }

    private static void printMenu() {
        System.out.println("1. Enter new chicken");
        System.out.println("2. Print Chickens");
        System.out.println("3. Print One Chicken");
        System.out.println("4. Exit");
    }

    private static void newChicken(ArrayList<Chicken> chickens) {

        Chicken chicken = new Chicken();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the chicken id");
        chicken.setId(sc.nextInt());
        System.out.println("Enter the chicken name");
        chicken.setName(sc.next());
        System.out.println("Enter the chicken age");
        chicken.setAge(sc.nextInt());
        System.out.println("Enter the chicken color");
        chicken.setColor(sc.next());
        System.out.println("Enter true or false if the chicken is molting");
        chicken.setIsMolting(sc.nextBoolean());

        chickens.add(chicken);

    }

    private static void printChicken(Chicken chicken) {

        int id = chicken.getId();
        int age = chicken.getAge();
        String name = chicken.getName();
        String color = chicken.getColor();
        boolean isMolting = chicken.isIsMolting();

        System.out.print("|\t" + id + "\t|\t" + name + "\t|\t" + age + "\t|\t" + color + "\t|\t" + isMolting + "\t|\n");
    }

    private static void addToCSV(ArrayList<Chicken> chickens, int position) {
        File fileCSV = new File("Chicken List.csv");

        int id = chickens.get(position).getId();
        int age = chickens.get(position).getAge();
        String name = chickens.get(position).getName();
        String color = chickens.get(position).getColor();
        boolean isMolting = chickens.get(position).isIsMolting();

        try
        {
            PrintWriter writeLine = new PrintWriter(new FileWriter(fileCSV, true));

            writeLine.print(id + ";" + name + ";" + age + ";" + color + ";" + isMolting);
            writeLine.println("");
            writeLine.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }

    }

    private static void addToJSON(ArrayList<Chicken> chickens) {
        File fileJson = new File("Chicken List.json");
        Gson gson = new Gson();

        String json = gson.toJson(chickens);

        try
        {
            PrintWriter writeLine = new PrintWriter(new FileWriter(fileJson, true));
            writeLine.print(json);
            writeLine.print("\n");
            writeLine.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }
    
    private static void writeInFile(ArrayList<Chicken> chickens){
        File fileJson = new File("Chicken List.json");
        
        if (!chickens.isEmpty())
        {
            readFile(chickens);
            JSONObject chickensJSON = new JSONObject();
            JSONArray list = new JSONArray();
            
            for (int i = 0; i < chickens.size(); i++)
            {
                JSONObject chickenJSON = new JSONObject();
                
                chickenJSON.put("id", chickens.get(i).getId());
                chickenJSON.put("name", chickens.get(i).getName());
                chickenJSON.put("age", chickens.get(i).getAge());
                chickenJSON.put("color", chickens.get(i).getColor());
                chickenJSON.put("isMolting", chickens.get(i).isIsMolting());
                
                list.add(chickenJSON);
                
            }
            
            chickensJSON.put("list", list);
            
            try(FileWriter file =new FileWriter(fileJson))
            {
                file.write(chickensJSON.toString());
                file.flush();
            } catch (IOException e)
            {
                System.out.println("Error writing file");
            }
            
        }
    }

    private static void readFile(ArrayList<Chicken> chickens) {

        JSONParser parser = new JSONParser();
        try
        {
            Object object = parser.parse(new FileReader("Chicken List.json"));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray chickensArray = (JSONArray) jsonObject.get("list");

            for (int i = 0; i < chickensArray.size(); i++)
            {
                Chicken chicken = new Chicken();
                Object objectChicken = chickensArray.get(i);
                JSONObject objectChickenJSON = (JSONObject) objectChicken;

                chicken.setName(objectChickenJSON.get("name").toString());
                chicken.setAge(Integer.parseInt(objectChickenJSON.get("age").toString()));
                chicken.setId(Integer.parseInt(objectChickenJSON.get("id").toString()));
                chicken.setColor(objectChickenJSON.get("color").toString());
                chicken.setIsMolting(Boolean.parseBoolean(objectChickenJSON.get("isMolting").toString()));

                chickens.add(chicken);
            }
            
            
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Error reading file (FNF): " + ex);
        } catch (IOException ex)
        {
            System.out.println("Error reading file (IOE): " + ex);
        } catch (ParseException ex)
        {
            System.out.println("There are no chickens yet, it will be added if you selected option 1 ");
        }

    }
}
