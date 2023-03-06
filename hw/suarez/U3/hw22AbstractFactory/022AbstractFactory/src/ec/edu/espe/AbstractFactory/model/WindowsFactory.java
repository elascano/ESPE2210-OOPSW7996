package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
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
