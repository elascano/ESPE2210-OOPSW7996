package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        
        int id;
        String name;
        int age;
        String color;
        boolean molting;
        boolean newChickenInformation;
        
        newChickenInformation = true;     
        Scanner scan = new Scanner(System.in);
       
        Chicken chicken;
        chicken = new Chicken();
        
        while(newChickenInformation == true){ 
            System.out.println("---------------------------------");
            System.out.println("        |Chicken Data|        ");
            System.out.println("---------------------------------");
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
            System.out.println("---------------------------------");            
            System.out.println("You want to enter information about a new chicken");
            newChickenInformation = scan.nextBoolean();
           
            chicken.setId(id);
            chicken.setName(name); 
            chicken.setAge(age);
            chicken.setColor(color);
            chicken.setIsMolting(molting);
        }          
            printChicken(chicken);      
    }
       
    private static void printChicken(Chicken chicken) {
        System.out.println("---------------------------------");
        System.out.println("        |Chicken Data|        ");
        System.out.println("---------------------------------");        
        System.out.println("chicken Id \t-->" + chicken.getId());
        System.out.println("chicken Name \t-->" + chicken.getName());
        System.out.println("chicken Age \t-->" + chicken.getAge());
        System.out.println("chicken Color \t-->" + chicken.getColor());
        System.out.println("chicken is Molting -->" + chicken.isIsMolting());
    }
}


public class CreateFile {
       try{
           String route;
           String contents;
           route = "C:\\Users\\PERSONAL\\Nicolay Chillo\\ESPE\\Segundo Semestre\\OOP\\ESPE2210-OOPSW7996\\hw\\chillo\\u1\\hw05\\ChickenInformation.cvs";
           contents = "Example contents";
           File file = new File(route);
           if(!file.exists()){
               file.createNewFile();
           }
           FileWriter fw = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write(contents);
           bw.close();
        }catch (Exception e) {
            e.printStackTrance();
        }

}