package ec.edu.espe.chickenfarm.view;

import com.csvreader.CsvWriter;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
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
        //Chicken chicken;
        int id;
        int age;
        String name;
        String color;
        boolean isMolting;
        int choiceOfTheMenu=0;
        ArrayList<Chicken> chickenList = new ArrayList();
        //String [] dataChicken= new String();
        
        //initializing the chicken
        //creating the instance;
        //chicken = new Chicken();
        //initializing the csv Writer
        //creating the instance;
        CsvWriter csvWriter = new CsvWriter("chicken.csv");
        do{
            printMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch(choiceOfTheMenu){
                case 1:{
                    System.out.println("chicken Name: " );
                    name = imputEscan.next();
                    //chicken.setName(name);
        
                    System.out.println("chicken Id: " );
                    id = imputEscan.nextInt();
                   // chicken.setId(id);
        
                    System.out.println("chicken Age: " );
                    age = imputEscan.nextInt();
                    //chicken.setAge(age);
                    
                    System.out.println("chicken Color: ");
                    color = imputEscan.next();
                    //chicken.setColor(color);
                    System.out.println("chicken is Molting: ");
                    isMolting = imputEscan.nextBoolean();
                    //chicken.setColor(color);
                    chickenList.add(new Chicken(id,name,color,age,isMolting));
                    break;    
                }
                
                case 2:{
                    
                    //;
                    String[] titleChicken={"Id","Name","Color","Age"," Molsting"};
                    csvWriter.writeRecord(titleChicken);
                    for(Chicken chicken : chickenList){
                       String [] dataChicken = chicken.getArray();
                        csvWriter.writeRecord(dataChicken);
                    }
                    csvWriter.close();
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
    private static void printChicken(Chicken chicken){
        System.out.println("chicken Name -->" + chicken.getName());
        System.out.println("chicken ID -->" + chicken.getId());
        System.out.println("chicken Age -->" + chicken.getAge());
        System.out.println("chicken Color -->" + chicken.getColor());
        System.out.println("chicken is Molting -->" + chicken.isIsMolting());
    }
    private static void printMenu(){
        System.out.println("---------Menu Chicken Farm Simulator---------");
        System.out.println("1. Imput Chicken");
        System.out.println("2. Create csv Chicken and exit");
        System.out.println("3. Exit and don't save");
        System.out.print("Choice: ");
    }
   
}
