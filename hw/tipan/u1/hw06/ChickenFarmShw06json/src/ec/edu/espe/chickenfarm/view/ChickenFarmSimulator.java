
package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) throws IOException {
    
        Scanner keyboard =new Scanner(System.in);
        int id;
        String name;
        int age;
        String color;
        boolean isMolting;
        int option=0;
        ArrayList<Chicken> chickenList=new ArrayList();
        
        do{
            printMenu();
            option=keyboard.nextInt();
            switch(option){
                case 1->{
                    System.out.println("Insert chicken ID:\t");
                    id=keyboard.nextInt();
                    System.out.println("Insert name the chicken:\t");
                    name=keyboard.next();
                    System.out.println("Insert age the chicken:\t");
                    age=keyboard.nextInt();
                    System.out.println("Insert color the chicken:\t");
                    color=keyboard.next();
                    System.out.println("The chicken is molting? (true/false)\t");
                    isMolting=keyboard.nextBoolean();
                    
                    chickenList.add(new Chicken(id,name,color,age,isMolting));
                    break;
                }
                case 2->{
                    SaveDataJson(chickenList);
                    option=3;
                    break;
                }
                case 3->{
                    break;
                }
                default->{
                    System.out.println("ERROR!! Invalid option");
                    break;
                }
            }
        }while(option!=3);
       
    }
    
    private static void printMenu(){
        System.out.println("******************");
        System.out.println("      WELCOME!    ");
        System.out.println("******************");
        System.out.println(" Reishel's System\t");
        System.out.println("You want to do?\t");
        System.out.println("1.Insert a chicken\t");
        System.out.println("2.Create JSON File\t");
        System.out.println("3.Exit\t");
        System.out.println("******************");
 
    }
    
    private static void SaveDataJson(ArrayList<Chicken> chickens){
        Gson gson=new Gson();
        String json= gson.toJson(chickens);
        File file=new File("./chickensjson");
        try(FileWriter writter = new FileWriter(file);){
            writter.write(json);
            System.out.println("******Goog,now you have a JSON file*****");
         
        }catch(Exception e){
            System.out.println("******ERROR!! File******");
        }
    }
}