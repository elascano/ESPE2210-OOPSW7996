package ec.edu.espe.AbstractFactory.view;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.GUIFactory;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class ClientApp {

    public static void main(String[] args) {
        
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        
        aButton.caption = "from Factory";
        aButton.paint();
        
        Menu aMenu = aFactory.createMenu();
        aMenu.caption = "from Factory";
        aMenu.paint();
    }
    
}
