package ec.edu.espe.AbstractFactory.view;

import ec.edu.espe.AbstractFactory.model.Button;
import ec.edu.espe.AbstractFactory.model.GUIFactory;
import ec.edu.espe.AbstractFactory.model.Menu;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */

public class Client {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        
        aButton.caption = "fromFactory";
        aButton.paint();
        
        Menu aMenu = aFactory.createMenu();
        aMenu.caption = "fromFactory";
        aMenu.paint();
    }
}
