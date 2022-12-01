/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.POOExam1PCable.view;

import com.google.gson.Gson;
import ec.edu.espe.POOExam1PCable.model.Cable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class POOExam1PCable {
    public static void main(String[] args){
        
        int idCable;
        float numberOfmeter;
        String typeOfCable;
        String typeOfConductor;
        int choiceOfTheMenu=0;
        Scanner imputEscan = new Scanner (System.in);
        
        ArrayList<Cable> cableList = new ArrayList();
        
        
        
        do{
            printMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch(choiceOfTheMenu){
                case 1:{
                    System.out.println("Type of cable: " );
                    typeOfCable = imputEscan.next();
        
                    System.out.println("Id Cable: " );
                    idCable = imputEscan.nextInt();
        
                    System.out.println("Type of conductor: " );
                    typeOfConductor = imputEscan.next();
        
                    System.out.println("Number of meter: " );
                    numberOfmeter = imputEscan.nextFloat();

                    cableList.add(new Cable(idCable,  numberOfmeter, typeOfCable,  typeOfConductor));
                    break;    
                }
                
                case 2:{
                    SaveDataJson(cableList);
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
        
        
       

        
        
    }
      private static void printMenu(){
        System.out.println("---------Menu Cable---------");
        System.out.println("1. Imput Cable");
        System.out.println("2. Create Json Cable and exit");
        System.out.println("3. Exit and don't save");
        System.out.print("Choice: ");
    }
    
        private static void SaveDataJson(ArrayList<Cable> cables){
        Gson gson = new Gson();
        String json = gson.toJson(cables);
        File file = new File("./cables.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("***********File in Json was saved 100%***********");
        } catch (Exception e){
          System.out.println("***********Error: Could not save file :c***********");  
        }
    }

}
