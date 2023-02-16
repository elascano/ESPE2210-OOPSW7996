package ec.edu.espe.template.view;

import ec.edu.espe.template.model.Coffee;
import ec.edu.espe.template.model.Tea;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class BeverageTest {
    //Client
    public static void main(String[]args){
        
        Tea tea=new Tea();
        Coffee coffee=new Coffee();
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
                
        
    }
}
