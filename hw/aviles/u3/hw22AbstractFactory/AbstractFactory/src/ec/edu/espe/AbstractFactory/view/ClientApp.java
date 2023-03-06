package ec.edu.espe.AbstractFactory.view;

import ec.edu.espe.AbstractFactory.model.Button;
import ec.edu.espe.AbstractFactory.model.GUIFactory;

public class ClientApp {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "play";
        aButton.paint();
    }
    
}
