package ec.esu.espe.abstractFactory.model;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{
    @Override
    public Button createButton() {
        return (new LinuxButton());
    }

    @Override
    public Menu createMenu() {
        return (new LinuxMenu());
    }
}
