package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class WinFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return (new WinButton());
    }

    @Override
    public Menu createMenu() {
        return (new WinMenu());
    }

}
