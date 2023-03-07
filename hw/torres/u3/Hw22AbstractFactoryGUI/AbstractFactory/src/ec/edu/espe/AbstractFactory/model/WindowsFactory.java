
package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class WindowsFactory extends GUIFactory {

    public Button createButton() {
        return (new WindowsButton());
    }

    public Menu createMenu() {
        return (new WindowsMenu());
    }

}

