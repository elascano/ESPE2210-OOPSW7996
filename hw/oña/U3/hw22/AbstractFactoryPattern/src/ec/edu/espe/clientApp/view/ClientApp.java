
package ec.edu.espe.clientApp.view;
import ec.edu.espe.clientApp.model.Button;
import ec.edu.espe.clientApp.model.GUIFactory;
import ec.edu.espe.clientApp.model.Menu;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
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
