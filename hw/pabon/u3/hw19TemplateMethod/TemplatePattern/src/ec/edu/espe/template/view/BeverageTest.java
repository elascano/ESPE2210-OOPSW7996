package ec.edu.espe.template.view;

import ec.edu.espe.template.model.Coffee;
import ec.edu.espe.template.model.Tea;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class BeverageTest {
    
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println( "\nMaking tea..." );
        tea.prepareRecipe();
        System.out.println( "\nMaking coffe..." );
        coffee.prepareRecipe();
    }
    
}
