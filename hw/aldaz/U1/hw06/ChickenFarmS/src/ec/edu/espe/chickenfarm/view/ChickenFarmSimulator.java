package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernardo Aldaz, Scriptal , DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        boolean leave = false;
        int option;
        int position[] = new int[1];
        Chicken chicken = new Chicken();
        position[0] = 0;
        
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        readJSON(chickens, position);
        
        while (!leave) {

            System.out.println("><><><><><><><><><><><><><><><><");
            System.out.println(">      Chicken Coop Info       <");
            System.out.println("><><><><><><><><><><><><><><><><");
            System.out.println("1. -> \tAdd Chicken.");
            System.out.println("2. -> \tShow your chiken");
            System.out.println("3. -> \tShow saved Chickens");
            System.out.println("0. -> \tExit\n");

            try {

                System.out.println("====Select just one option====");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {

                        enterChicken(scan, chickens);
                        addChickenToCSV(chickens, position[0]);
                        addChickenToJSON(chickens, position[0]);
                        position[0]++;
                    }
                    case 2 -> {
                        searchChicken(scan, chickens);
                    }
                    case 3 -> {
                        for (int i = 1; i < chickens.size(); i++) {
                            chicken = chickens.get(i);
                            printChicken(chicken);
                        }
                    }
                    case 4 -> {
                        leave = true;
                        System.out.println("\nYOU SUCCESFULLY EXITED THE PROGRAM :D\n");
                    }
                    default ->
                        System.out.println("ENTER CORRECT INFO PLEASE :|");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n INVALID OPTION - TRY AGAIN\n");
                scan.next();
            }
        }

    }

    private static void searchChicken(Scanner scan, ArrayList<Chicken> chickens) {
        int id;
        int j = -1;
        Chicken chicken;
        System.out.println("Enter the id of your chicken here -> ");
        id = scan.nextInt();
        for (int i = 1; i < chickens.size(); i++) {
            chicken = chickens.get(i);
            if (id == chicken.getId()) {
                j = i;
                printChicken(chicken);
            }
        }

        if (j == -1) {
            System.out.println("Sorry that chicken is not found with that ID :c");
        }
    }

    private static void enterChicken(Scanner scan, ArrayList<Chicken> chickens) {
        int id;
        String name;
        int age;
        String color;
        boolean IsMolting;
        
        Chicken chicken = new Chicken();
        
        System.out.println("Enter the id of your chicken here ->");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the name of your chicken here ->");
        name = scan.nextLine();
        System.out.println("Enter the age of your chicken here ->");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the color of your chicken here ->");
        color = scan.nextLine();
        System.out.println("Is your chicken molting?(Y/N) ->");
        IsMolting = scan.nextBoolean();

        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(IsMolting);

        chickens.add(chicken);
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("================================================");
        System.out.println("           Chicken " + chicken.getId() + " Info");
        System.out.println("================================================");
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
        System.out.println("================================================");
        System.out.println("\n");
    }

    private static void addChickenToCSV(ArrayList<Chicken> chickens, int position) {
        File file = new File("Chicken File.csv");
        int id = chickens.get(position).getId();
        int age = chickens.get(position).getAge();
        String name = chickens.get(position).getName();
        String color = chickens.get(position).getColor();
        boolean isMolting = chickens.get(position).isIsMolting();

        try {
            PrintWriter printFile = new PrintWriter(new FileWriter(file, true));
            printFile.print(id + ";" + name + ";" + age + ";" + color + ";" + isMolting);
            printFile.println("");
            printFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

    
    private static void addChickenToJSON(ArrayList<Chicken> chickens, int position) {
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

    
    private static void readJSON(ArrayList<Chicken> chickens, int position[]) {
        String json = ""; 
        Gson gson = new Gson();
        Chicken chicken = new Chicken();
        try {
           BufferedReader read = new BufferedReader(new FileReader("Chicken_File.json"));
           String line = "";
        while ((line = read.readLine())!= null){
            json = line;
            chicken = new Gson().fromJson(json ,Chicken.class);
            chickens.add(position[0], chicken);
            position[0]++;
        }
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

}
