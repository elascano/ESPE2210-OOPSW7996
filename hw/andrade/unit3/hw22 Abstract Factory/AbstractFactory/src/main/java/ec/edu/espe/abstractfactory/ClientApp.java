
package ec.edu.espe.abstractfactory;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE 
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIFactory xFactory = GUIFactory.getFactory();
        Button xButton = xFactory.createButton();
        Menu xMenu = xFactory.createMenu();
        
        xButton.caption = "xButton";
        xButton.paint();
        
        xMenu.caption = "xMenu";
        xMenu.paint();
        
    }
}
