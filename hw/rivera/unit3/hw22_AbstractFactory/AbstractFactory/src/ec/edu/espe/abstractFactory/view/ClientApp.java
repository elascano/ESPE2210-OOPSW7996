package ec.edu.espe.abstractFactory.view;

import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.GUIFactory;
import ec.edu.espe.abstractFactory.model.Menu;

/**
 *
 * @author Joel Rivera, WebMasterTeam, DCCO-ESPE
 */

public class ClientApp {

    public static void main(String[] args) {
        
        GUIFactory gUIFactory = GUIFactory.getFactory("Windows");

        Button redButton = gUIFactory.createButton();
        redButton.caption = "Press";

        redButton.paint();

        Menu blueMenu = gUIFactory.createMenu();
        blueMenu.caption = "Show";

        blueMenu.paint();
    }
}
