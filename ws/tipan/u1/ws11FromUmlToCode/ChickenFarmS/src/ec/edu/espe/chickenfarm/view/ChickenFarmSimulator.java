
package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


//import java.io.PrintWriter;
//Provides a variety of methods by which data can be recorded
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) throws IOException{
        
        //variables with skins suggested by the Clean Code
        int id;
        String name;
        int age;
        String color;
        boolean isMolting;
        int caseOption=0;
        ArrayList<Chicken> chickenList=new ArrayList();
        
        //read data by keyboard
        Scanner keyboard =new Scanner(System.in);
        
        do{
            printMenu();
            caseOption=keyboard.nextInt();
            switch(caseOption){
                case 1 ->{
                    System.out.println("Insert chicken ID:\t");
                    id=keyboard.nextInt();
                    System.out.println("Insert chicken name:\t");
                    name=keyboard.next();
                    System.out.println("Insert the age of the chicken:\t");
                    age=keyboard.nextInt();
                    System.out.println("Insert the colors of te chicken:\t");
                    color=keyboard.next();
                    System.out.println("Is chicken molting? (true/false):\t");
                    isMolting=keyboard.nextBoolean();
                    chickenList.add(new Chicken(id,name,color,age,isMolting));
                break;
                }
                case 2 ->{
                    SaveDataJson(chickenList);
                    caseOption=3;
                break;
                }
                case 3 ->{
                break;
                }
                default ->{
                    System.out.println("ERROR!! Invalid option");
                break;
                }
                
            }
        }while(caseOption!=3);
    }
    
    private static void printMenu(){
        System.out.println("*********WELCOME*********");
        System.out.println("     Reishel's System    \t");
        System.out.println("You want to do?\t");
        System.out.println("1.Insert a chicken\t");
        System.out.println("2.Create cvs File\t");
        System.out.println("3.Exit");
        System.out.print("Select-->");
    }
    
    private static void SaveDataJson(ArrayList<Chicken> chickens){
        Gson gson=new Gson();
        String json=gson.toJson(chickens);
        File file=new File("./chickens.json");
        try(FileWriter writt=new FileWriter(file);){
            writt.write(json);
            System.out.println("¡File converted to Json!");
        }catch(Exception err){
            System.out.println("ERROR!! Problems saving the file");
        }
    }
       
}

// INVESTIGATION:
// https://www.programarya.com/Cursos/Java/Entrada-de-datos
// https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=81&codigo=161&inicio=80
// 