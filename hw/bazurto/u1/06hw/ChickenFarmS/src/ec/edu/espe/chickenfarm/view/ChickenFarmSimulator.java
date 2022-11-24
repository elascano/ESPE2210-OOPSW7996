package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) throws IOException{
        Scanner imputEscan = new Scanner (System.in);
        // data type variable
        //declaration
        // ADT variableName
        int id;
        int age;
        String name;
        String color;
        boolean isMolting;
        int choiceOfTheMenu=0;
        ArrayList<Chicken> chickenList = new ArrayList();

        do{
            printMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch(choiceOfTheMenu){
                case 1:{
                    System.out.println("chicken Name: " );
                    name = imputEscan.next();

                    System.out.println("chicken Id: " );
                    id = imputEscan.nextInt();

                    System.out.println("chicken Age: " );
                    age = imputEscan.nextInt();

                    System.out.println("chicken Color: ");
                    color = imputEscan.next();

                    System.out.println("chicken is Molting: ");
                    isMolting = imputEscan.nextBoolean();

                    chickenList.add(new Chicken(id,name,color,age,isMolting));
                    break;    
                }
                
                case 2:{
                    SaveDataJson(chickenList);
                    choiceOfTheMenu =3;
                    break;
                }
                case 3:{
                    break;
                }
                default:{
                    System.out.println("Wrong option");
                    break;
                }
            }
        }while(choiceOfTheMenu!=3);
        
        //chicken2 = new Chicken(2,"lolita","black",23,true);  
    }

    private static void printMenu(){
        System.out.println("---------Menu Chicken Farm Simulator---------");
        System.out.println("1. Imput Chicken");
        System.out.println("2. Create csv Chicken and exit");
        System.out.println("3. Exit and don't save");
        System.out.print("Choice: ");
    }
    
    private static void SaveDataJson(ArrayList<Chicken> chickens){
        Gson gson = new Gson();
        String json = gson.toJson(chickens);
        File file = new File("./chickens.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("***********File in Json was saved 100%***********");
        } catch (Exception e){
          System.out.println("***********Error: Could not save file :c***********");  
        }
    }
   
}
