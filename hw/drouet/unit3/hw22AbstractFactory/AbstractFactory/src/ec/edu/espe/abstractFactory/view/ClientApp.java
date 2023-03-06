package ec.edu.espe.abstractFactory.view;

import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.GUIFactory;
import ec.edu.espe.abstractFactory.model.Menu;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIFactory aFactory;
        Menu aMenu;
        Button aButton;
        
        aFactory = GUIFactory.getFactory();
         
        aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
        System.out.println(aButton.getClass().getSimpleName());        
        
        aMenu = aFactory.createMenu();
        aMenu.caption = "File";
        aMenu.paint();        
        System.out.println(aMenu.getClass().getSimpleName());
    }
}
