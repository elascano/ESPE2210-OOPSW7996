package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class LinuxFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return (new LinuxButton());
    }

    /**
     *
     * @return
     */
    @Override
    public Menu createMenu() {
        return (new LinuxMenu());
    }
}
