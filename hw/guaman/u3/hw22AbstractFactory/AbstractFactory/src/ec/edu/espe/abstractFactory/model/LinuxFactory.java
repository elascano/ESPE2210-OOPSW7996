package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
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
