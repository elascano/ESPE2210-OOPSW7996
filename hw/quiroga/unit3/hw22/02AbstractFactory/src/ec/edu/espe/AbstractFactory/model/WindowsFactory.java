package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class WindowsFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return (new WindowsButton());
    }

    @Override
    public Menu createMenu() {
        return (new WindowsMenu());
    }

}
