package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
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
