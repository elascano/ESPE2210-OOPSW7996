
package ec.edu.espe.ws21PairOfShoes.view;

import ec.edu.espe.ws21PairOfShoes.model.PairOfShoes;
import static ec.edu.espe.ws21PairOfShoes.controller.FileManager.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ArrayShoes {
    public static void main(String[]args){
        
        Scanner keyboard=new Scanner(System.in);
        ArrayList<PairOfShoes> shoesData=new ArrayList<>();
        
        int choice;
        String fileName="ShoesData.json";
        
        do{
            shoesData=read(shoesData,"ShoesData.json");
            System.out.println("*******************");
            System.out.println("      WELCOME!     ");
            System.out.println("*******************");
            System.out.println("        MENU       ");
            System.out.println("  Reishel's System ");
            System.out.println("*******************");
            System.out.println("You want to do?");
            System.out.println("1.Create a pair of shoes");
            System.out.println("2.Show a pair of shoes");
            System.out.println("3.Updade a pair of shoes");
            System.out.println("4.Print a pair of shoes");
            System.out.println("5.Delete a pair of shoes");
            System.out.println("6.Exit");
            System.out.println("Choice-->");
            choice=keyboard.nextInt();
            
            switch(choice){
                case 1->{
                    addPairOfShoes(shoesData);
                    create(shoesData,fileName);
                    System.out.println("CREATED PAIR OF SHOES IN THE DATABASE!");
                }
                case 2->showPairOfShoes(shoesData);
                
                case 3->update(shoesData);
                
                case 4->printList(shoesData);
                
                case 5->delete(shoesData);
                
                case 6->System.out.println("THANKS FOR VISITING THE PROGRAM!!");
                
                default->System.out.println("ERROR! Invalid option");
               
            }
            
        }while(choice !=6);     
    }
    
    private static void showPairOfShoes(ArrayList<PairOfShoes> shoesData){
        int idLook;
        Scanner keyboard=new Scanner(System.in);
        try{
            System.out.println("Enter ID the pair of shoes:");
            idLook=keyboard.nextInt();
            int shoesLocated=show(shoesData, idLook);
            if(shoesLocated !=-1){
                System.out.println("[ID]\t[Brand]\t[Size]");
                printLine(shoesData.get(shoesLocated));
            }else{
                System.out.println("ID not Found");
            }
        }catch (Exception e){
            System.out.println("ERROR! Incorrect, try again:");
        }
    }
    
    public static void addPairOfShoes(ArrayList<PairOfShoes> shoes){
        Scanner keyboard=new Scanner(System.in);
        PairOfShoes pairOfShoes;
        int id,size;
        String brand;
        
        try{
            System.out.println("*****SUBMIT INFORMATION****");
            System.out.println("      Reishel's System     ");
            System.out.println("Insert shoe ID:");
            id=keyboard.nextInt();
            while(checkId(id)){
                System.out.println("ERROR! ID exists, insert other: ");
                id=keyboard.nextInt();
            }
            keyboard.nextLine();
            System.out.println("Insert shoe brand:");
            brand=keyboard.nextLine();
            System.out.println("Insert shoe size:");
            size=keyboard.nextInt();
            
            pairOfShoes=new PairOfShoes(id,brand,size);
            System.out.println("********************");
            shoes.add(pairOfShoes);
        }catch(Exception e){
            System.out.println("ERROR! Incorrect, insert other choice:");
        }
    }
    
    public static boolean checkId(int id){
        ArrayList<PairOfShoes> shoes=new ArrayList<>();
        shoes=read(shoes,"ShoesData.json");
        PairOfShoes pairOfShoes=new PairOfShoes();
        
        for(int i=0;i<shoes.size();i++){
            pairOfShoes=shoes.get(i);
            if(id==pairOfShoes.getId()){
                return true;
            }
        }
        return false;
    }   
}
