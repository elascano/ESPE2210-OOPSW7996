package ec.esu.espe.abstractFactory.view;

import ec.esu.espe.abstractFactory.model.Button;
import ec.esu.espe.abstractFactory.model.GUIFactory;
import ec.esu.espe.abstractFactory.model.Menu;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory;
        Menu aMenu;
        Button aButton;
        
        aFactory = GUIFactory.getFactory();
         
        aButton = aFactory.createButton();
        System.out.println("====================================================");
        aButton.caption = "Play";
        aButton.paint();
        System.out.println(aButton.getClass().getSimpleName());        
        
        aMenu = aFactory.createMenu();
        aMenu.caption = "File";
        aMenu.paint();        
        
        System.out.println(aMenu.getClass().getSimpleName());
         System.out.println("====================================================");
    }
}
