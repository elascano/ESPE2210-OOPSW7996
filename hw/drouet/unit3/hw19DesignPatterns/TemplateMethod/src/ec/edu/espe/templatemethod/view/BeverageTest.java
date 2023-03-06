package ec.edu.espe.templatemethod.view;

import ec.edu.espe.templatemethod.controller.Tea;
import ec.edu.espe.templatemethod.controller.Coffee;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class BeverageTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
