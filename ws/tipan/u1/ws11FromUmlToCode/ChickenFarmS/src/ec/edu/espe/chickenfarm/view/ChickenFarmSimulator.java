
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        File fileRecord;
        FileWriter writer;
        PrintWriter printOut;
        
        //read data by keyboard
        Scanner keyboard =new Scanner(System.in);
        
        while (caseOption !=4){
            System.out.println("*********************");
            System.out.println(" Welcome to the menu ");
            System.out.println("  Reishel's Systems  ");
            System.out.println("*********************");
            System.out.println("1.Upload a new chicken");
            System.out.println("2.Exit");
            
            try {
                caseOption = keyboard.nextInt();
            } catch(NullPointerException e!)/
                caseOption=0;
            }
            
            keyboard.nextLine();
            
            switch (caseOption){  
                case 1 -> {
                    fileRecord=new File("Chicken.cvs");
                        if (!fileRecord.exists()) {
                            try {
                                fileRecord.createNewFile();
                                do{
                                    try{
                                        for(int i=1;i<1;i++){
                                            System.out.println("*****NEW CHICKEN*****");
                                            System.out.println("Insert chicken ID:");
                                            id = Integer.parseInt(keyboard.nextLine());
                                            System.out.println("Insert chicken name:");
                                            name = keyboard.nextLine();
                                            System.out.println("Insert the age of the chicken:");
                                            age = Integer.parseInt(keyboard.nextLine());
                                            System.out.println("Insert the colors of the chicken:");
                                            color = keyboard.nextLine();
                                            System.out.println("Is chicken molting?: (true/false)\t");
                                            isMolting = Boolean.parseBoolean(keyboard.nextLine());
                                            
                                            //initializing the chicken
                                            //creating the instance
                                            Chicken chicken=new Chicken();
                                            
                                            chicken.setId(id);
                                            chicken.setName(name);
                                            chicken.setAge(age);
                                            chicken.setColor(color);
                                            chicken.setIsMolting(isMolting);
                                            
                                            writer= new FileWriter(fileRecord,true);
                                            printOut=new PrintWriter(writer);
                                            
                                            System.out.println("******DATA CHICKEN******");
                                            printOut.println("Chicken ID:"+ chicken.getId());
                                            printOut.println("Chicken Name:"+ chicken.getName());
                                            printOut.println("Chicken Age:"+ chicken.getAge());
                                            printOut.println("Chicken Color:"+ chicken.getColor());
                                            printOut.println("Chicken is molting:"+ chicken.isIsMolting());
                                            System.out.println("************************");
                                            
                                            printOut.println(chicken);
                                            printOut.close();
                                            writer.close();
                                        }
                                    } catch(NullPointerException e!){
                                        System.out.println("ERROR!! Try again:");
                                            }
                                    
                                System.out.println("Do you want to continue, yes(1) or no(0)?");
                                caseOption=Integer.parseInt(keyboard.nextLine());
                                    
                                }while(caseOption=1);
                                   
                            }
                }
                case 2 -> {
                    System.out.println("¡Thanks for using this system!");
                }
                default ->
                    System.out.println("ERROR!! Null option:");
            }    
    }
}

// INVESTIGATION:
// https://www.programarya.com/Cursos/Java/Entrada-de-datos
// https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=81&codigo=161&inicio=80
// 