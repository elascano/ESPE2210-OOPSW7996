package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
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
