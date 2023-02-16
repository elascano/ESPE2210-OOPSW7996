package ec.edu.espe.template.model;

import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Tea extends CaffeineBeverage {
    
    @Override
    public void brew(){
        System.out.println("Steep the tea");
    }
    @Override
    public void addCondiments(){
        System.out.println("Adding lemon");
    }
    @Override
    public boolean wantsCondiments(){
        // a hook operation
        String answer=getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }
     private String getUserInput(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Would you like lemon with your tea(y/n)?");
         String answer=sc.nextLine();
         return answer;
     }   
    }
       