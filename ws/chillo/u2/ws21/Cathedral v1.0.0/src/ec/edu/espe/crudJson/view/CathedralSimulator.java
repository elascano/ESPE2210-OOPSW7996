package ec.edu.espe.crudJson.view;

import static ec.edu.espe.crudJson.controller.FileCathedral.openFile;
import static ec.edu.espe.crudJson.controller.FileCathedral.printData;
import static ec.edu.espe.crudJson.controller.FileCathedral.recoverJsonData;
import static ec.edu.espe.crudJson.controller.FileCathedral.save;
import ec.edu.espe.crudJson.model.Cathedral;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class CathedralSimulator {
    public static void main(String[] args) {
        ArrayList<Cathedral> cathedrals;
        int op;
        String option;
        Scanner sc;
        File cathedralJson;
        
        cathedrals = new ArrayList<>();
        op = 0;
        sc = new Scanner(System.in);
        cathedralJson = null;
        
        cathedralJson = openFile();
        
        recoverJsonData(cathedrals,cathedralJson);
        
        while(op !=3){
            menu();
            op = sc.nextInt();
            System.out.println();
            switch(op){
                case 1:{
                    do{
                        save(cathedrals,cathedralJson);
                        System.out.println("You want to enter a new Cathedral (Yes/No)?");
                        option = sc.next();
                        System.out.println();
                    }while(option.equals("Yes")||option.equals("yes"));
                    break;
                }
                case 2:{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Name" + "\t\t Year of Build" + "\t\t City Where if Find");
                    System.out.println("-----------------------------------------------------");
                    printData(cathedrals);
                    System.out.println("-----------------------------------------------------");
                    break;
                }
                case 3:{
                    System.out.println("Close");
                    break;
                }
            }
        }
    }
    
   public static void menu(){
       System.out.println("Menu");
       System.out.println("1: Enter data of cathedral");
       System.out.println("2. Read file");
       System.out.println("3. Leave");
       System.out.println("Chosen option");
   }
}
