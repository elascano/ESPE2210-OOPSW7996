package ec.edu.espe.AbstractFactory.view;
/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
import ec.edu.espe.AbstractFactory.model.Button;
import ec.edu.espe.AbstractFactory.model.GUIFactory;
import ec.edu.espe.AbstractFactory.model.Menu;

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
