package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
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

