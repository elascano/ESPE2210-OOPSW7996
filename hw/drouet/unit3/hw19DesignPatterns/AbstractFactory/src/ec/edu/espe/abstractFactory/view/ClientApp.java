package ec.edu.espe.abstractFactory.view;

import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.GUIFactory;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
