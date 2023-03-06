package ec.espe.edu.AbstractFactory.view;

import ec.espe.edu.AbstractFactory.model.Button;
import ec.espe.edu.AbstractFactory.model.GUIFactory;
import ec.espe.edu.AbstractFactory.model.Menu;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        Menu aMenu = aFactory.createMenu();
        
        aButton.caption = "aButton";
        aButton.paint();
        
        aMenu.caption = "aMenu";
        aMenu.paint();
    }
}
