
package ec.edu.espe.abstractfactory;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class WinFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }
    
    
    
}
