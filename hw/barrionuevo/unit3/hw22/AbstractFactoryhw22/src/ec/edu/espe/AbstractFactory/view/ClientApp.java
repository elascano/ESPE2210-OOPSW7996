package ec.edu.espe.AbstractFactory.view;

import ec.edu.espe.AbstractFactory.model.Button;
import ec.edu.espe.AbstractFactory.model.GUIFactory;
import ec.edu.espe.AbstractFactory.model.Menu;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
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
