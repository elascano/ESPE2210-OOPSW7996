package ec.edu.espe.template.model;

import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew(){ 
        System.out.println( "Dripping coffee through filter" );
    } 
    
    @Override
    public void addCondiments(){ 
        System.out.println( "Adding sugar and milk" );
    }

    @Override
    public boolean wantsCondiments() { 

        String answer = getUserInput();
        if( answer.toLowerCase().startsWith( "y" )) { 
            return true;
        } else { 
            return false;
        } 
    }

    private String getUserInput() {

        System.out.println ( "Would you like milk and sugar with your coffee (y/n)? ");
        Scanner sc = new Scanner(System.in);     
        String answer = sc.nextLine();
        return answer;
    }
}