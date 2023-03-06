
package ec.edu.espe.clientapp.view;

import ec.edu.espe.clientapp.model.Button;
import ec.edu.espe.clientapp.model.GUIFactory;
import ec.edu.espe.clientapp.model.Menu;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
