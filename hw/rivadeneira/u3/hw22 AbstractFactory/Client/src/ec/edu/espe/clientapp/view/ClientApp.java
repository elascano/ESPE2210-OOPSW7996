
package ec.edu.espe.clientapp.view;

import ec.edu.espe.clientapp.controller.*;
import ec.edu.espe.clientapp.model.Button;
import ec.edu.espe.clientapp.model.Menu;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {

        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
        
        Menu aMenu= aFactory.createMenu();
        aMenu.caption = "File";
        aMenu.paint();
        
        
}
} 