
package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class WindowsFactory extends GUIFactory {

    public Button createButton() {
        return (new WindowsButton());
    }

    public Menu createMenu() {
        return (new WindowsMenu());
    }

}

