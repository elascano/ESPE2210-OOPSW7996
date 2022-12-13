
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) throws IOException {       
        
        //ADT variableName
        Chicken chicken;
        
        int id;
        String name;
        int age;
        String color;
        boolean isMolting=false;
        boolean correctMolting;
        File archive;
        FileWriter writte;
        PrintWriter line;
       
        Scanner keyboard = new Scanner(System.in);

        int z=1;
        String option="";
        
        archive=new File("Chicken.csv");
        try{
            archive.createNewFile();
            
            do{
                try{
                    for(int i=1;i<=z;i++){
                        System.out.println("****************");
                        System.out.println("    WELCOME!    ");
                        System.out.println("Reishel's System");
                        System.out.println("****************");
                        System.out.println("Insert the following data:");
                        System.out.println("Insert chicken id -->");
                        id = keyboard.nextInt();
                        System.out.println("Insert chicken name -->");
                        name = keyboard.next();
                        System.out.println("Insert the age of the chicken -->");
                        age = keyboard.nextInt();
                        System.out.println("Insert the colors of the chicken -->");
                        color = keyboard.next();
                        do{
                            try{
                                correctMolting=false;
                                System.out.println("Is chicken molting?(true/false)-->\t");
                                isMolting = keyboard.nextBoolean();
                            }catch(InputMismatchException ex){
                                System.out.println("Insert true or false -->");
                                keyboard.next();
                                correctMolting=true;
                            }
                        }while(correctMolting);
                        
                        chicken=new Chicken(id,name,color,age,isMolting);
                        
                        writte=new FileWriter(archive,true);
                        line=new PrintWriter(writte);
                        
                        line.println("Chicken  Data");
                        line.println("ID-->" + chicken.getId());
                        line.println("Name-->" + chicken.getName());
                        line.println("Age-->" + chicken.getAge());
                        line.println("Color-->" + chicken.getColor());
                        line.println("Is molting-->" + chicken.isIsMolting());
                        line.println(chicken);
                        
                        line.close();
                        writte.close();
                       
                    }
                }catch(IOException | NumberFormatException er){
                        System.out.println("ERROR!! Try again:");
                        }
                System.out.println("you want to insert a new chicken? (yes/no)");
                option=keyboard.next();
                
            }while(option.equals("yes"));
                
        }catch(IOException ex){
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE,null,ex);
                }
    }
    
    private static int keyboard(String readMessage,String errorMessage){
        Scanner keyboard=new Scanner(System.in);
        int auxiliar=0;
        boolean correctReading;
        do{
            try{
                correctReading=false;
                System.out.println(readMessage);
                auxiliar=keyboard.nextInt();
                if(auxiliar<=0){
                    System.out.println("Insert the number-->");
                }
            }catch(InputMismatchException ex){
                System.out.println(errorMessage);
                keyboard.next();
                correctReading=true;
            }
        }while(correctReading || auxiliar<=0);
        return auxiliar;
    }
    
    
    private static void printChicken(Chicken chicken) {
        System.out.println("************************");
        System.out.println("   Chicken Information  ");
        System.out.println("Chicken id:  \t" + chicken.getId());
        System.out.println("Chicken name:  \t" + chicken.getName());
        System.out.println("Chicken age:  \t" + chicken.getAge());
        System.out.println("Chicken color:  \t" + chicken.getColor());
        System.out.println("Chicken is Molting:  \t" + chicken.isIsMolting());
        System.out.println("************************");
}
}